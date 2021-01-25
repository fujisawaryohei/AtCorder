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
	input := strings.Split(s, " ")
	var ans *[]string
	for _, str := range input {
		//https://medium.com/veltra-engineering/is-the-golang-slice-a-pointer-or-not-a-pointer-99433f2cea17
		*ans = append(*ans, str)
	}
	fmt.Println(ans)
}
