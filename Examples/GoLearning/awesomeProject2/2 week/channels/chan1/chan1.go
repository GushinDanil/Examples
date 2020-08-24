package main

import "fmt"

func main() {
	ch1 := make(chan int)

	go func(in chan int) {
		val := <-in
		fmt.Println("Our channel value is", val)
		fmt.Println("After work")

	}(ch1)

	ch1 <- 42

	fmt.Scanln("Finished")
}
