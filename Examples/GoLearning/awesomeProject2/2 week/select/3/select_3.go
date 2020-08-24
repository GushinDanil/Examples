package main

import "fmt"

func main() {
	chData := make(chan int)
	chCancel := make(chan struct{})

	go func(chData chan int, chCancel <-chan struct{}) {
		val := 0
		for {
			select {
			case <-chCancel:
				return
			case chData <- val:
				val++

			}

		}
	}(chData, chCancel)

	for val := range chData {
		fmt.Println("Read data :", val)
		if val > 5 {
			chCancel <- struct{}{}
			break
		}

	}

}
