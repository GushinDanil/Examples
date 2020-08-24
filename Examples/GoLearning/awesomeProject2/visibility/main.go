package main

import (
	person "awesomeProject2/visibility/test2"
	"fmt"
)

func main() {

	p := person.Person{
		Id:   0,
		Name: "",
	}
	p2 := person.NewPerson()

	p.SetSecret("XXX")

	fmt.Println(person.GetSecret(p2))
	SetSecret(p2)
	fmt.Println(person.GetSecret(p2))

}
func SetSecret(p *person.Person) {
	// p.secret ошибка так как main.go из другого пакета
	p.SetSecret("Hello")
}
