# Makefike
# Tarum Fraz
# tfraz
# pa4
# A simple Makefile for the Roots program

Roots: Roots.class
	echo Main-class: Roots > PA4
	jar cvfm Roots PA4 Roots.class
	rm PA4
	chmod u+x Roots 

Roots.class: Roots.java
	javac -Xlint Roots.java
clean:
	rm -f Roots.class Roots

submit: Makefile Roots.java
	submit cmps011-pt.s15 pa4 Makefile Roots.java

check: Makefile Roots.java
	ls  /afs/cats.ucsc.edu/class/cmps011-pt.s15/pa4/tfraz

