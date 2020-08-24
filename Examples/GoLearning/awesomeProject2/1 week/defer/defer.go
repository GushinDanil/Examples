package main

import "fmt"

func getValue() string {
	fmt.Println("get arguments")
	return "get result"

}
func anonym() {
	fmt.Println(getValue())
}

func main() {
	//Демонстрация отложенного выполнения метода
	//defer fmt.Println("After work")
	//fmt.Println("Some useful work")
	//return
	/*
		Console:
		Some useful work
		After work
	*/
	//////////////////////////////////////////
	//В данном примере мы сталкиваемся с проблемой так как сначала работа функции откладывается частично
	//defer fmt.Println("After work")
	//defer fmt.Println( getValue())
	//fmt.Println("Some useful work")
	//return
	/*
		Console:
		get arguments
		Some useful work
		get result
		After work

	*/
	/////////////////////////////////////////////
	//Если же мы хотим сначала выполнить полезную работу а потом приступить к отложенной
	//defer fmt.Println("After work")
	//defer anonym() // Здесь можно также пихать анонимную функцию
	//fmt.Println("Some useful work")
	//return
	/*
	 Console:
	 Some useful work
	 get arguments
	 get result
	 After work
	*/
}
