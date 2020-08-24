package main

import (
	"encoding/json"
	"fmt"
	"log"
	"os"
)

type ColorGroup struct {
	ID     int
	Name   string
	Colors []string
}

func main() {
	file,err:=os.Open("2 week/json/file.json")
	defer file.Close()
	if err!=nil {
		log.Fatal(err)
	}
	group := ColorGroup{
		ID:     1,
		Name:   "Reds",
		Colors: []string{"Crimson", "Red", "Ruby", "Maroon"},
	}
	b, err := json.Marshal(group)
	if err != nil {
		fmt.Println("error:", err)
	}

	file.WriteString(string(b))

}
