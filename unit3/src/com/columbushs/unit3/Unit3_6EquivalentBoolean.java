package com.columbushs.unit3;

public class Unit3_6EquivalentBoolean {

	//De Morgan's laws.
	//Boolean Expresions A and B


	//Distribute the NOT and flip the operation

	// !(A && B) is the same as (!A || !B)
	// !(A || B) is the same as (!A && !B)


	// NOT flips the relational operator and adds/removes equals.

	// !(x > 0) is the same as (x <= 0)
	// !(x < 0) is the same as (x >= 0)
	// !(x >= 0) is the same as (x < 0)
	// !(x <= 0) is the same as (x > 0)

	//NOT equals
	// !(x == 0) is the same as (x != 0)
	// !(x != 0) is the same as (x == 0)


	//What is the equivalent of !(x < 5 && x >= 34)


	//If A = true and B=false what does !(A||B)&&B evaluate to?


	boolean A = true;
	boolean B = false;

	boolean C = !(A || B) && B;
	//careful with parentheses and order of operations
	boolean D = !((A || B) && B);

}
