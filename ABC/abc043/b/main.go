package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	stdin := bufio.NewScanner(os.Stdin)
	stdin.Scan()
	s := stdin.Text()
	input := strings.Split(s, "")
	var ansStr string
	var ans []string
	for i := 0; i < len(input); i++ {
		if input[i] == "B" {
			if len(ans) > 0 {
				ans = ans[:len(ans)-1]
			}
		} else {
			ans = append(ans, input[i])
		}
	}
	for _, str := range ans {
		ansStr += str
	}
	fmt.Println(ansStr)
}
