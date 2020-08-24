package main

import (
	"fmt"
	"math/rand"
	"time"
)

func main() {
	seconds := time.Now().Unix() //текущая дата и время
	rand.Seed(seconds)           // делаем так что рандом не повторялся
	for i := 0; i < 10; i++ {

		fmt.Println(rand.Intn(100) + 1) //от 1 до 100(+1 это чтобы не от 0 до 100)
	}
}
