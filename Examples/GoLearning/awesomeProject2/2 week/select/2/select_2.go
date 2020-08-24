package main

import "fmt"

func main() {
	ch1 := make(chan int, 2)
	ch1 <- 1
	ch1 <- 2

	ch2 := make(chan int, 3)
	ch2 <- 3

Loop:
	for {

		select {
		case val := <-ch1:
			fmt.Println("ch1 val :", val)
		case val := <-ch2:
			fmt.Println("ch2 val", val)
		default:
			break Loop
		}
	}

}
