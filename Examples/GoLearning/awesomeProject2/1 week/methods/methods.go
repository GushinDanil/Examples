package main

import (
	"fmt"
)

type Person struct {
	FirstName string
	LastName  string
	Adress    string
}
type Account struct {
	Id      int
	Nick    string
	Adress  string
	Cleaner func() bool
	Owner   Person
}

func (p *Person) setAdressPerson(Adress string) {
	p.Adress = Adress
}
func (p *Account) setAdress(Adress string) {
	p.Adress = Adress
}

func main() {

	var p1 Person = Person{
		FirstName: "Danil",
		LastName:  "Gushchin",
		Adress:    "",
	}

	a1 := Account{
		Id:      0,
		Nick:    "Mobydick",
		Adress:  "",
		Cleaner: nil,
		Owner:   p1, //39
	}

	//p1.setAdress("Voroshilova")
	a1.Owner.setAdressPerson("Buchma")
	p1.setAdressPerson("Buchaa") //p1 Никак не влияет на a1 и наоборот а1 никак не влияет на р1 после  строчки 39
	fmt.Println(a1)

	/////////////
	sl1 := MySlice{}
	sl1.add(1)
	sl1.add(2)
	sl1.add(3)
	sl1.add(4)
	fmt.Println(sl1.getLen())
	sl1.showSlice()

}

//methods for slices
type MySlice []int

func (sl *MySlice) add(num int) {
	*sl = append(*sl, num)
}
func (sl MySlice) getLen() int {
	return len(sl)
}
func (sl *MySlice) showSlice() {
	for key, value := range *sl {
		fmt.Println("Key : ", key, "Value : ", value)
	}
}
