package sdetActivities

import groovy.util.ObjectGraphBuilder.DefaultChildPropertySetter

class Activity6 {
	static void main(def args) {
		
		def map = [:]
		//add values
		map.put(1,"Cats")
		map.put(2,"Dogs")
		map.put(3,"Wolves")
		
		//print each pair
		for(def printMap:map) {
			println printMap
		}
		
		//append new value pair
		def newMap = map.plus([5:"Horses",4:"Monkeys"])
		println newMap
		
		//print values in ascending orders
		println newMap.values().sort()
		//sort based on key
		println newMap.values().sort{it.length()}
	}
}
