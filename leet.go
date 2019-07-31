package main

import (
	"fmt"
	"sort"
)

func relativeSortArray(arr1 []int, arr2 []int) []int {
	a := []int{}
	result := []int{}
	b := 0

	var tmp map[int]int
	tmp = make(map[int]int)
	for i, value := range arr2 {
		tmp[value]= i
	}
	for _, value := range arr1{
		if _, ok := tmp[value];ok {
		}else {
			a = append(a, value)
			b++
		}
	}
	sort.Ints(a)
	for _, value :=range arr2  {
		for _, value2 := range arr1{
			if value == value2 {
				result = append(result, value)
			}
		}
	}
	for _, value :=range a {
		result = append(result, value)
	}
	return result
}

func main() {
	arr1 := []int{2,3,1,3,2,4,6,7,9,2,19}
	arr2 := []int{2,1,4,3,9,6}
	array := relativeSortArray(arr1, arr2)
	fmt.Print(array)
}

