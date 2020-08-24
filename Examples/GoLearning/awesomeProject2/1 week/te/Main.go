package main

import (
	"fmt"
)

type Name struct {
	s string
	a int
}

func main() {
	//var sl  []int
	//sl1:=[]int{1,2,3,4}
	//sl2 := make([]int ,3,3)
	//sl3 := make([]int ,3)
	//sl4 :=[]int{21}
	//
	//fmt.Println(sl,sl1,sl2,sl3,sl4)
	//
	//buf := make([] int ,len(sl1),cap(sl1))
	//copy(buf,sl1)
	//buf[0]=5
	//fmt.Println(buf)
	//fmt.Println(sl1)
	//
	//ints := []int{1,2,3,4,5}
	//copy(ints[1:5],[]int{9,5,7,99,99})
	//fmt.Println(ints)
	//
	////someSl := sl1[:]
	////
	////fmt.Println(someSl)
	////
	////q := sl1[1:3]
	////
	////q[0]=9
	////fmt.Println(q)
	////fmt.Println(sl1)
	//
	////someSl = append(someSl,7)
	//
	////fmt.Println(someSl)
	////fmt.Println(sl1)
	//
	//var b *int
	//a:=2
	//
	//b= &a
	//a=3
	//fmt.Println(a,*b)
	//
	//var m map[string]string = map[string]string{
	//	"Gushchin ":"Danil",
	//	"Blinkov" : "Aleksandr",
	//}
	//value,found :=m["Blinkov"]
	//fmt.Println(value,found)
	//delete(m, "Blinkov")
	//
	//fmt.Println(m)

	//var sl1 []int
	//sl2 := []int{}
	sl4 := []int{1, 2, 3, 4}

	sl4 = append(sl4, 5)

	m := map[string]int{}
	m["Gushchin"] = 20
	m["Matveev"] = 19
	m["Vanya"] = 18

	a := 12
	b := 2

	if a > b && a < b {
		fmt.Println("hello")
	}
	if _, keyExist := m["Gushchin"]; keyExist {
		fmt.Println("Key Exist :", keyExist)
	}

	expr := "Liza"
Loop:
	for true {

		fmt.Println("________________________________________________________")
		switch expr {
		case "Liza":
			fmt.Println("found1")
			break Loop
		//можно и continue поставить
		case "Elia":
			fmt.Println("found2")
			break
		case "Vika":
			fmt.Println("found3")
			fallthrough
		case "Julia", "Nataly":
			fmt.Println("found4")
		default:
			fmt.Println("not found")
		}
		break
	}
	fmt.Println("________________________________________________________")

	//check :=true

	//for true {
	//
	//}
	//for check {
	//
	//}

	for idx := 0; idx < len(sl4); idx++ {
		fmt.Println(sl4[idx])
	}
	fmt.Println("______________")
	for idx, value := range sl4 {
		fmt.Println("Index : ", idx, "Value : ", value)
	}
	fmt.Println("______________")
	for key, value := range m {
		fmt.Println("key : ", key, "value : ", value)
	}
	fmt.Println("______________")
	str := "Hello World"

	for pos, char := range str {
		fmt.Println("Index : ", pos, "Char : ", char)

	}
	fmt.Println("______________")
	fmt.Println(maxInt(sl4...))

}

func f(str string) string {

	return str
}
func fu(str string, count int) (int, string) {
	return 12, "hello"
}
func maxInt(sl ...int) (max int) {
	max = sl[0]
	for _, val := range sl {
		if val > max {
			max = val
		}
	}

	return

}
