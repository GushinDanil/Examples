package main

import (
	"fmt"
)

type Payer interface {
	Pay(int) error
}

type Wallet struct {
	Cash int
}

func (w *Wallet) Pay(amount int) error {
	if w.Cash >= amount {
		w.Cash -= amount
		return nil
	}
	return fmt.Errorf("No money")

}

type MasterCard struct {
	Balance    int
	ValidUntil string
	Cardholder string
	CVV        string
	Number     string
}

func (mc *MasterCard) Pay(amount int) error {
	if mc.Balance >= amount {
		mc.Balance -= amount
		return nil
	}
	return fmt.Errorf("No money")

}

type Test struct {
	Hello string
}

type ApplePay struct {
	Money   int
	AppleId string
}

func (a *ApplePay) Pay(amount int) error {
	if a.Money >= amount {
		a.Money -= amount
		return nil
	}
	return fmt.Errorf("No money")

}

func Buy(p Payer) {
	switch p.(type) {
	case *Wallet:
		notes := p.(*Wallet)
		fmt.Println("Do you want to pay cash so your balance", notes.Cash)
	case *MasterCard:
		card := p.(*MasterCard)
		fmt.Println("Do you want to pay card so your balance", card.Balance)
	default:
		fmt.Println("I have universal terminal for you")

	}

	err := p.Pay(90)

	if err != nil {
		fmt.Println("There is problem", err, p)

	} else {
		fmt.Printf("Thank you buying %T\n", p)
	}
}
func BuyWithEmptyInterface(in interface{}) {
	var p Payer
	var ok bool
	if p, ok = in.(Payer); !ok {
		fmt.Println(p, "This invention is not for paying")
		return
	}

	err := p.Pay(90)

	if err != nil {
		fmt.Println("There is problem", err, p)

	} else {
		fmt.Printf("Thank you buying %T\n", p)
	}
}

func main() {
	//////2 вариант метода   с пустым интерфейсом в параметре функции Buy
	//var p Payer = &Wallet{Cash: 100}
	//BuyWithEmptyInterface(p)
	//p = &ApplePay{
	//	Money:   1000,
	//	AppleId: "",
	//}
	//BuyWithEmptyInterface(p)
	//p = &MasterCard{
	//	Balance:    10,
	//	ValidUntil: "",
	//	Cardholder: "",
	//	CVV:        "",
	//	Number:     "",
	//}
	//BuyWithEmptyInterface(p)
	//
	//sl := []int{}
	//BuyWithEmptyInterface(sl)
	//var fl float64
	//BuyWithEmptyInterface(fl)

	//////1 вариант метода   с  интерфейсом Payer в параметре функции Buy сюда уже положить что угодно не выйдет

	var p Payer = &Wallet{Cash: 100}
	Buy(p)
	p = &ApplePay{
		Money:   1000,
		AppleId: "",
	}
	Buy(p)
	p = &MasterCard{
		Balance:    10,
		ValidUntil: "",
		Cardholder: "",
		CVV:        "",
		Number:     "",
	}
	Buy(p)
}
