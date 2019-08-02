package main

import (
	"fmt"
	"sort"
	"strings"
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

//冒泡
func Bubble(arr []int) []int{
	for i := 0; i< len(arr);i++ {
		for j := i+1; j< len(arr); j++  {
			if arr[i] > arr[j]{
				temp := arr[i]
				arr[i] = arr[j]
				arr[j] = temp
			}
		}
	}
	return arr
}

func SelectMax(arr []int) int{
	maxValue := arr[0]
	for i := 0; i<len(arr); i++  {
		if arr[i] > maxValue{
			maxValue = arr[i]
		}
	}
	return maxValue
}

func defangIPaddr(address string) string {
	return strings.ReplaceAll(address, ".", "[.]")
}


func sortedSquares(A []int) []int {
	for i ,_ := range A {
		A[i] *= A[i]
	}
	sort.Ints(A)
	return A
}


func main() {
	//arr1 := []int{2,3,1,3,2,4,6,7,9,2,19}
	//arr2 := []int{2,1,4,3,9,6}
	address := "1.1.1.1"
	//array := relativeSortArray(arr1, arr2)
	fmt.Print(defangIPaddr(address))
}

