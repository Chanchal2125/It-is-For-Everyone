package main

import (
	"fmt"
	"os"
)

func main() {
	if len(os.Args) <= 1 {
		fmt.Println("Please provide a string while running this script")
		return
	}
	happyHacktoberfest := os.Args[1]
	res := 0
	for _, value := range happyHacktoberfest {
		switch value {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
			res ++
		}
	}
	switch res {
	case 0:
		fmt.Println("The provided string contains no vowels")
	case 1:
		fmt.Println("The provided string contains only one vowel")
	default:
		fmt.Printf("The provided string contains %v vowels", res)
	}
}
