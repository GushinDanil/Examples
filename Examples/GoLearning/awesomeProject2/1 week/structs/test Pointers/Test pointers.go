package main

import "fmt"

type str struct {
	name   string
	salary int
	int    //Анонимное поле
}

func test(s str) str { //вернёт копию объекта
	s.name = ""
	s.salary = 0
	return s
}
func test2(s *str) str { //вернёт основной объект
	s.name = ""
	s.salary = 0
	return *s
}
func test3(s *str) **str { //вернёт просто адрес

	return &s
}
func test4(s str) *str { //вернёт указатель на объект
	s.name = ""
	s.salary = 0
	return &s
}
func main() {
	//a:=str{
	// name:   "Danil",
	// salary: 10000,
	//}
	//fmt.Println( test(a))
	//
	//fmt.Println(a)//не измениться так как передали копию а не адрес на объект
	//

	a := str{
		name:   "Danil",
		salary: 10000,
	}
	a.int = 12 //объявление анонимного поля которое имеет только тип
	fmt.Println(test2(&a))

	fmt.Println(test3(&a))
	fmt.Println(test4(a))

	fmt.Println(a) // измениться так как передали указатель а не копию

}
