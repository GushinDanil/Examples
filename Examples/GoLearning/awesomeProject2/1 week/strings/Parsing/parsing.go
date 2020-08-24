package main

import (
	"fmt"
	"log"
	"strconv"
)

func main() {
	b, _ := strconv.ParseBool("true")
	f, _ := strconv.ParseFloat("3,1415", 64)
	i, err := strconv.ParseInt("42", 10, 64)
	u, _ := strconv.ParseUint("42", 10, 64)
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println(b, f, i, u)

	s := "2147483647"
	s = strconv.FormatBool(true)
	fmt.Println(s)
	s = strconv.FormatFloat(3.1415, 'E', -1, 64)
	s = strconv.FormatInt(-42, 16)
	fmt.Println(s)
	s = strconv.FormatUint(42, 16)
	fmt.Println(s)
}
