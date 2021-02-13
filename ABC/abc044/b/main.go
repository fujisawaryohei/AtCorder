package main

import (
	"fmt"
	"strings"
)

func main() {
	var a string
	fmt.Scan(&a)
	w := strings.Split(a, "")
	m := make(map[string]bool)
	var uniq []string
	var ansArr []int
	var ans []int

	for _, el := range w {
		_, ok := m[el]
		if !ok {
			m[el] = true
			uniq = append(uniq, el)
		}
	}

	for _, el1 := range uniq {
		count := 0
		for _, el2 := range w {
			if el1 == el2 {
				count++
			}
		}
		ansArr = append(ansArr, count)
	}

	for _, el := range ansArr {
		if el%2 == 0 {
			ans = append(ans, el)
		}
	}

	if len(ans) == len(uniq) {
		fmt.Println("Yes")
	}
	if len(ans) != len(uniq) {
		fmt.Println("No")
	}
}

func remove(arr []string, i int) []string {
	slice1 := arr[:i]
	slice2 := arr[i+1:]
	newArr := append(slice1, slice2...)
	return newArr
}
