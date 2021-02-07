package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	stdin1 := bufio.NewScanner(os.Stdin)
	stdin2 := bufio.NewScanner(os.Stdin)
	stdin1.Scan()
	stdin2.Scan()
	s1 := stdin1.Text()
	s2 := stdin2.Text()
	input1 := strings.Split(s1, " ")
	input2 := strings.Split(s2, " ")
	ans := ""
	for i := 0; i < len(input2); i++ {
		if input1[1] == input2[i] {
			continue
		} else if len(input2)-1 == i {
			ans += input2[i]
		} else {
			ans += input2[i] + " "
		}
	}
	fmt.Println(ans)
}
