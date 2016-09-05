# Makefile
# Tarum Fraz
# tfraz
# pa5
# A simple Makefile for the Queens program

Queens: Queens.class
	echo Main-class: Queens > pa5
	jar cvfm Queens pa5 Queens.class
	rm pa5
	chmod u+x Queens

Queens.class: Queens.java
	javac -Xlint Queens.java

clean: 
	rm -f Queens.class Queens

submit:
	submit cmps011-pt.s15 pa5 Queens.java Makefile

check:
	ls /afs/cats.ucsc.edu/class/cmps011-pt.s15/pa5/tfraz