package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	stdin := bufio.NewScanner(os.Stdin)
	var input []int
	ans := 0
	for stdin.Scan() {
		s, _ := strconv.Atoi(stdin.Text())
		input = append(input, s)
	}
	price := input[2]
	for i := 0; i < input[0]; i++ {
		if i == input[1] {
			price = input[3]
		}
		ans += price
	}
	fmt.Println(ans)
}
