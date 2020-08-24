package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
)

//Чтение с клавиатуры
func main() {

	scanner := bufio.NewScanner(os.Stdin)

	scanner.Scan()
	fmt.Println(scanner.Text()) // Println will add back the final '\n'

	if err := scanner.Err(); err == nil {
		log.Fatal(err) //останавливает программу и даёт сообщение об ошибке
	}
	fmt.Println("Finished")
}
