package main

import (
	"fmt"
	"log"
)

type Payer interface {
	Pay(int) error
}

type Wallet struct {
	Cash int
}

func (w *Wallet) getCash() int {
	return w.Cash
}

func (w *Wallet) Pay(amount int) error {
	if w.Cash >= amount {
		w.Cash -= amount
		return nil
	}
	return fmt.Errorf("No money")
}

func Buy(p Payer) {
	err := p.Pay(100)
	if err != nil {
		log.Fatal(err)
	}

	fmt.Println("Thank you for cash ")
}

func main() {
	var w Payer
	w = &Wallet{Cash: 10000}
	cash := w.(*Wallet) // смотрим как работает утверждение типа

	fmt.Println(cash.Cash)
	///////////////////////////////////////
	//first variant
	w1 := Wallet{Cash: 100}
	Buy(&w1)
	//second  variant
	var w2 Payer = &Wallet{Cash: 10}
	Buy(w2)

}
