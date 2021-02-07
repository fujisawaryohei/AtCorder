package main

func main() {
	arr := []string{"a", "b", "a", "c"}
	for i := 0; i < len(arr)-1; i++ {
		for k := 1; k < len(arr)-i; k++ {
			if arr[k] > arr[k+1] {
				arr[k], arr[k+1] = arr[k+1], arr[k]
			}
		}
	}
}
