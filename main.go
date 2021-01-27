package main

import "fmt"

func main() {
	primes := []int{1, 2, 3, 4, 5}
	newSlice := primes[1:3]
	primes[2] = 10
	fmt.Println(newSlice)
	fmt.Println(primes)
}
