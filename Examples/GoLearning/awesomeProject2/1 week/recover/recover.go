package main

import "fmt"

/*
	Пример отлова паники при помощи defer
	функция recover() хранит в себе результат(тоесть то что она возвращает)
	для корректного востановления после паники(чтобы программа не упала)
	а также получения информации нам нужно сделать следующее
*/
func deferTest() int {
	defer func() {
		if err := recover(); err != nil {
			fmt.Println("Info about panic :", err)

		}
	}()

	defer func() {
		if err := recover(); err != nil {
			fmt.Println("Info about panic :", err)

			panic("panic bad happend 2") // Случай если у нас паника произошла после восстановления после паники
			//тогда нужно создать ещё одну конструкцию которая повторно проверит (всё логично)
		}
	}()

	fmt.Println("Some useful work ")
	panic("panic bad happend 1")
	return 1_000_000
}

func main() {
	fmt.Println(deferTest()) // При таком востановлении если функция что-то и возвращает то вернётся значение по-умолчанию
	fmt.Println("After work")
	/*
	  Some useful work
	  Info about panic : panic bad happend
	  0
	  After work
	*/
}
