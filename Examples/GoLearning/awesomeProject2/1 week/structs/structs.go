package main

import (
	"errors"
	"fmt"
	"log"
	"unicode/utf8"
)

type Test struct {
	yearsOld int
	TestEmbeded
}

type TestEmbeded struct {
	name string
}

type Person struct {
	FirstName string
	LastName  string
	Adress    string
}

func (p *Person) SetFirstName(firstName string, test int) error {

	if utf8.RuneCountInString(firstName) > 30 {
		return errors.New("invalid title")
	}

	if test < 1 || test > 31 {
		return errors.New("В месяце нету таких дней")
	}
	p.FirstName = firstName
	return nil
}

type Account struct {
	Id      int
	Nick    string
	Adress  string
	Cleaner func() bool
	Owner   Person
}

func main() {
	a1 := Person{
		FirstName: "Danil",
		LastName:  "Gushchin",
		Adress:    "Buchma 28/64",
	}
	pointer := &a1 //пример указателя на объект структуры
	fmt.Println(pointer.FirstName)
	err := pointer.SetFirstName("Danilo", 22)
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println(a1, pointer)

	b1 := Account{
		Id:      1001001,
		Nick:    "Mobydick",
		Cleaner: nil,
		Owner:   a1,
	}

	b1.Id = 100010001
	a2 := Person{
		FirstName: "Nikita",
		LastName:  "Matveev",
		Adress:    "Merefa",
	}
	b2 := Account{}
	b2.Owner = a2
	b2.Nick = "Nick"
	b2.Adress = "Khpi"

	fmt.Println(b2.Adress)
	fmt.Println(b2.Owner.Adress)

	////ТЕстируем встраивание структур
	test := Test{yearsOld: 20}
	test.TestEmbeded.name = "Hello"
	test.name = "World"
	fmt.Println(test)

}
