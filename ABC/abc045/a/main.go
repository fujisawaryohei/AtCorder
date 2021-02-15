package main

import (
	"fmt"
	"strconv"
)

func main() {
	var a string
	var inputArr []int
	for i := 0; i < 3; i++ {
		fmt.Scan(&a)
		inputi, _ := strconv.Atoi(a)
		inputArr = append(inputArr, inputi)
	}
	ans := (inputArr[0] + inputArr[1]) * inputArr[2] / 2
	fmt.Println(ans)
}
