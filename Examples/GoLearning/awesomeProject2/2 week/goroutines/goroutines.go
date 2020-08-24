package main

import (
	"fmt"
	"runtime"
)

func f(n int) {
	for i := 0; i < 10; i++ {
		fmt.Println(n, ":", i)
		//amt := time.Duration(rand.Intn(250))
		//time.Sleep(time.Millisecond * amt)
		runtime.Gosched() //передаёт управление другой горутине на этом этапе

	}
}

func main() {
	for i := 0; i < 10; i++ {

		go f(i)
	}

	fmt.Scanln("Finished")
}
