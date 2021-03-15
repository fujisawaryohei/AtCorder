package main

import (
	"fmt"
	"strconv"
)

func main() {
	var a string
	var b string
	var c string
	fmt.Scan(&a, &b, &c)

	abc := make([]int, 3)
	arr := []string{a, b, c}

	for i, el := range arr {
		toi, _ := strconv.Atoi(el)
		abc[i] = toi
	}

	for i := 0; i < len(abc); i++ {
		for j := i + 1; j < len(abc); j++ {
			if abc[i] > abc[j] {
				abc[i], abc[j] = abc[j], abc[i]
			}
		}
	}

	if abc[0]+abc[1] == abc[2] {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}
}
