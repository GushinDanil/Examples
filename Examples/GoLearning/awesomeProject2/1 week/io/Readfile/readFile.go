package main

import (
	datafile "awesomeProject2/dataFile"
	"bufio"
	"fmt"
	"log"
	"os"
)

func readFile(str string) {
	file, err := os.Open(str)
	fmt.Println(file, err)
	if err != nil {
		log.Fatal(err)
	}

	scanner := bufio.NewScanner(file)
	for scanner.Scan() {

		fmt.Println(scanner.Text())
	}
	err = file.Close()
	if err != nil {
		log.Fatal(err)
	}
	if scanner.Err() != nil {
		log.Fatal(scanner.Err())
	}
}

// GetFloats читает значение float64 из каждой строки файла.

func main() {
	readFile("1 week/io/Readfile/data.txt")
	arr, err := datafile.GetFloats("1 week/io/Readfile/data.txt")
	if err != nil {
		log.Fatal(err)
	}
	for key, value := range arr {
		fmt.Println(key, value)
	}
}
