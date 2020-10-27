package sdetActivities

class Exercise3 {
	static void main(def args) {
		int n1=0,n2=1,n3,i,count=10
		print n1+" "+n2
		for(i=2; i<=count;i++) {
			n3=n1+n2
			print " "+n3
			(n1,n2) =[n2,n3]
		}
	}
}
