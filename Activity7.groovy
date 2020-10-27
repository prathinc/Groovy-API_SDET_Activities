package sdetActivities

class Activity7 {
	static void main(def args) {
		
		File file = new File("user.dir");
		file.createNewFile();
		
		file.write("A quick brown Fox jumped over the lazy Cow\n")
		file.append("John Jimbo jingeled happily ever after\n")
		file.append("Th1\$ 1\$ v3ry c0nfus1ng")
				   
		println "Match Operations :"
		
		//print the line which matches with cow
		file.eachLine { line ->
			if(line==~/^A.*Cow$/) {
				println "Line that ends with cow is : $line"
			}
		}
				
				//Print the line that starts with "J"
				file.eachLine { line ->
					if(line ==~ /^J.*/) {
						println "Line that starts with 'J' is: $line"
					}
				}
				
				//Print the line has two number one after the other
				file.eachLine { line ->
					if(line ==~ /.*\d\d.*/) {
						println "Line that has two adjacent numbers: $line"
					}
				}
				
				//Print the string(s) that match the pattern '\S+er'
				println "\n\nFind Operations:"
				def match1 = file.getText() =~ /\S+er/
				println "String(s) matching '/\\S+er/' are: ${match1.findAll()}"
				
				def match2 = file.getText() =~ /\S*\d\W/
				println "String(s) matching '/\\S*\\d\\W/' are: ${match2.findAll()}"
			}
}
