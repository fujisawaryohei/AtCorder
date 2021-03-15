package main

import (
	"fmt"
	"strings"
)

func main() {
	var a, b, c string
	fmt.Scan(&a, &b, &c)
	aArr := strings.Split(a, "")
	bArr := strings.Split(b, "")
	cArr := strings.Split(c, "")
	target := aArr[0]
	ans := game(aArr, bArr, cArr, target)
	fmt.Println(ans)
}

func game(a []string, b []string, c []string, target string) string {
	if target == "a" {
		if len(a) == 0 {
			return "A"
		}
		target = a[0]
		a = a[1:]
		game(a, b, c, target)
	}
	if target == "b" {
		if len(b) == 0 {
			return "B"
		}
		target = b[0]
		b = b[1:]
		game(a, b, c, target)
	}
	if target == "c" {
		if len(c) == 0 {
			return "C"
		}
		target = c[0]
		c = c[1:]
		game(a, b, c, target)
	}
	return ""
}
