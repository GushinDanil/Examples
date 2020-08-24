package test2

var (
	//Заглавная буква значит публичный строчная значит приватный
	Public  = 1 //public
	private = 0 //private
)

type name int

type Person struct {
	Id     int
	Name   string
	secret string
}

func (p *Person) SetSecret(secret string) {
	p.secret = secret

}
