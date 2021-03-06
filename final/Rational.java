// Rational.java
class Rational{
    int numerator; int denominator; // Fields
    Rational(int n, int d){ // Constructor
	if(d==0) throw new RuntimeException("zero denominator");
	numerator = n; denominator = d;
    }
    Rational plus(Rational Q){
	int num, denom;
	num = (this.numerator*Q.denominator)+(this.denominator*Q.numerator);
	denom = this.denominator * Q.denominator;
	return new Rational( num, denom );
    }
    Rational times(Rational Q){
	return new Rational(this.numerator*Q.numerator, this.denominator*Q.denominator);

    }
    public String toString(){
	if( denominator > 1 ){
	    return numerator +"/"+ denominator;
	}else{
	    return numerator + "";
    }
    }
    public boolean equals(Object x){
	boolean eq  = false;
	Rational r;
	if( x instanceof Rational ){
	    r = (Rational)x;
	    eq = (r.numerator%this.numerator==0)&&(r.denominator%this.denominator==0);
	}
	return eq;
    }
} // end of class Rational