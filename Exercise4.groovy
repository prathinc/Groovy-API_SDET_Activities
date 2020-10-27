package sdetActivities

class Exercise4 {
	static void main(def args) {
		def str = "This is a Groovy Language"
		println "Our string is :"+str
		println "Reverse string is :"+str.reverse()
		println "Substring is :"+str.substring(10);
		println "Words from string are :"+str.split(" ")
		println"new string after removing words :"+str.minus("Groovy")
		println"upper case string printing :"+str.toUpperCase()
		println"lower case string printing :"+str.toLowerCase()
		
		if(str.matches("This is")) {
			println"String matches"
		}
		else 
			println"Strings dont match"
		println "Replaced string is :"+str.replaceAll(str, "This is java language")
	}
}
