package sdetActivities

class Exercise1 {
	static void main(def args) {
		def x 
		int y
		def arr = [1, 2.0, "Saahil", true, x, y]
		arr.each { println"Value is:"+it+" Data type is :"+it.getClass() }
	}
}
