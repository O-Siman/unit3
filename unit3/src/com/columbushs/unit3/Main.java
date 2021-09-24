package com.columbushs.unit3;

public class Main {
	public static void main(String[] args) {
		Unit3_1BooleanExpressions boolTest = new Unit3_1BooleanExpressions();
		//boolTest.booleanExp();
		
		Unit3_2IfStatements ifTests = new Unit3_2IfStatements();
		//ifTests.ifTesting();
		//ifTests.saySomething();
		
		Unit3_3IfElse ifElse = new Unit3_3IfElse();
		//ifElse.ifTesting();
		
		Unit3_4ElseIf elseIfs = new Unit3_4ElseIf();
		//elseIfs.saySomething();
		
		Unit3_5CompoundBooleanExp moreIfs = new Unit3_5CompoundBooleanExp();
		//moreIfs.nestedIfs();

		Unit3_6EquivalentBoolean bools = new Unit3_6EquivalentBoolean();
		//System.out.println(bools.C);

		//Object info and memory
		Unit3_7ComparingObjects person1 = new Unit3_7ComparingObjects("Bob",23,6);

		Unit3_7ComparingObjects person2 = new Unit3_7ComparingObjects("Bob",23,6);

		Unit3_7ComparingObjects person3 = person1;

		Unit3_7ComparingObjects person4;

		boolean same = person1==person2;
		System.out.println(same);

		boolean same2 = person1.equals(person2);
		System.out.println(same2);

		boolean same3 = person1.height==person2.height;
		System.out.println(same3);


		// what about the others?


	}

}
