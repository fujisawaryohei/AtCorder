package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	stdin := bufio.NewScanner(os.Stdin)
	stdin.Scan()
	n := stdin.Text()
	ntoi, _ := strconv.Atoi(n)
	var ans = 0
	var i = 0
	for i < ntoi {
		ans += i + 1
		i++
	}
	fmt.Println(ans)
}
