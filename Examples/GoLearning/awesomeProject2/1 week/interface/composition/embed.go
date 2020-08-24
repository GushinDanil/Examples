package main

import (
	"fmt"
	"strconv"
)

type Phone struct {
	Money   int
	AppleId string
}

func (p *Phone) String() string {
	return "Your money count :" + strconv.Itoa(p.Money) + "\nYour AppleId :" + p.AppleId
}
func (p *Phone) Pay(amount int) error {
	if p.Money >= amount {
		p.Money -= amount
		fmt.Println("Thanks for paying")
		return nil
	}
	return fmt.Errorf("No money")
}

func (p *Phone) Ring(number string) error {
	if number == "" {
		return fmt.Errorf("You didn't enter the number")
	}
	return nil
}

type Ringer interface {
	Ring(string) error
}
type Payer interface {
	Pay(int) error
}
type PhoneNFC interface {
	Payer
	Ringer
}

func PayForSubway(nfc PhoneNFC) {
	err := nfc.Pay(8)
	err2 := nfc.Ring("+380685126345")
	if err != nil || err2 != nil {
		fmt.Println("Scanning found some mistake(mistakes)", err, err2)

		return
	}
	fmt.Println("You can go to the subway station")
}

func main() {

	var nfc1 PhoneNFC = &Phone{
		Money:   10,
		AppleId: "10001000",
	}

	// Пример переопределения метода  toString()(то как он в Java называется)
	fmt.Println(nfc1)
	fmt.Println("___________________________")

	PayForSubway(nfc1)

	// Пример переопределения метода  toString()(то как он в Java называется)
	fmt.Println("___________________________")
	fmt.Println(nfc1)

}
