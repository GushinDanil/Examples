package test2

import "fmt"

func printSecret(p *Person) {
	fmt.Println(p.secret)
}
func GetSecret(p *Person) string {
	return p.secret
}
func NewPerson() *Person {
	return &Person{
		Id:     1,
		Name:   "name",
		secret: "secret",
	}
}
