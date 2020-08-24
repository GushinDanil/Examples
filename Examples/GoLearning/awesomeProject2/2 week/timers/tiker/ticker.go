package main

import (
	"fmt"
	"time"
)

/*
Тоесть тикер хранит в себе канал который мы можем считывать или нет
с канала постоянно выходят тики в зависимости от интервала который мы ставим
*/
func ticker() {
	ticker := time.NewTicker(time.Second)
	defer ticker.Stop()
	done := make(chan bool)
	go func() {
		time.Sleep(10 * time.Second)
		done <- true
	}()
	for {
		select {
		case <-done:
			fmt.Println("Done!")
			return
		case t := <-ticker.C:
			fmt.Println("Current time: ", t)
		}
	}
}
func ticker2() { //Пример тикера который невозможно остановить
	ticker := time.Tick(time.Second)
	i := 0

	for tick := range ticker {
		i++
		fmt.Println("Count", i, "   ", tick)
		if i > 10 {
			break //но не смотря на это тикер работает и его можно использовать дальше до завершения программы
		}
	}
}
func main() {
	timer := time.AfterFunc(time.Second*3, ticker2) //откладывает выполнение функции на какое-то время
	fmt.Scanln()
	timer.Stop()
	fmt.Scanln()
}
