package sdetActivities

class Activity5 {
	static void main(def args) {
		
		def List = [11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		
		def strList = List.minus([11,2,19,5])
		def intList = List.minus(["Mango", "Apple", "Watermelon"])
		
		println "Sorted int List is :${intList.sort()}"
		println "Sorted string List is :${strList.sort()}"
		
	}
}
