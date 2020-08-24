package main

import "fmt"

func main() {
	ch := make(chan int)

	close(ch)

	val := <-ch
	fmt.Println(val)
}
