package main

import "fmt"

func main() {
	ch := make(chan int)

	go func(ch chan<- int) {
		for i := 0; i < 5; i++ {
			fmt.Println("Before", i)
			ch <- i
			fmt.Println("After", i)
		}
		close(ch)
		fmt.Println("Generator finished")

	}(ch)

	for val := range ch {
		fmt.Println("Get :", val)
	}
	fmt.Println(ch)
	fmt.Scanln("Finished")
}
