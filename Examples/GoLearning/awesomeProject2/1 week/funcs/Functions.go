package main

import "fmt"

func main() {
	func(s string) {
		fmt.Println("your name is : ", s)
	}("Danil")

	printer := func(str string) string {
		return str
	}
	//Здесь может быть исполняющийся код
	fmt.Println(printer("Hello Danil"))

	//Определяем собственный тип функции
	type strTypeFunc func(string) string //сигнатура функции должна совпадать

	worker := func(callback strTypeFunc) {
		fmt.Println("One day Technorely said me : ", callback("Hello Danil"))
	}
	worker(printer)

	prefix := func(s string) strTypeFunc {

		return func(str string) string {
			return s + str
		}

	}
	fmt.Println(prefix(" I hope that ")("always good"))
	//или разбить на 2 части
	se := prefix("I hope")
	se("that always good")
}
