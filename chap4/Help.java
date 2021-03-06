// Convert the help system from Try This 3-1 into a Help class
class Help {
	void helpOn(int what) {
		switch(what) {
			case '1':
				System.out.println("The if:\n");
				System.out.println("if(condition) statement;");
				System.out.println("else statement;");
				System.out.println();
				break;
			case '2':
				System.out.println("The switch:\n");
				System.out.println("switch(expression) {");
				System.out.println("   case constant:");
				System.out.println("      statement sequence");
				System.out.println("      break;");
				System.out.println("   // ...");
				System.out.println("}");
				System.out.println();
				break;
			case '3':
				System.out.println("The for:\n");
				System.out.print("for(init; condition; iteration)");
				System.out.println(" statement;");
				System.out.println();
				break;
			case '4':
				System.out.println("The while:\n");
				System.out.println("while(condition) statement;");
				break;
			case '5':
				System.out.println("The do-while:\n");
				System.out.println("do {");
				System.out.println("   statement;");
				System.out.println("}  while (condition);");
				System.out.println();
				break;
			case '6':
				System.out.println("The break:\n");
				System.out.println("break; or break label;");
				System.out.println();
				break;
			case '7':
				System.out.println("The continue:\n");
				System.out.println("continue; or continue label;");
				System.out.println();
				break;
			default:
				System.out.print("Selection not found.");
		}
		System.out.println();
	}

	void showMenu() {
		System.out.println("Help on:");
		System.out.println("   1. if");
		System.out.println("   2. switch");
		System.out.println("   3. for");
		System.out.println("   4. while");
		System.out.println("   5. do-while");
		System.out.println("   6. break");
		System.out.println("   7. continue\n");
		System.out.print("Choose one (q to quit): ");
	}

	boolean isValid(int ch) {
		if(ch < '1' | ch > '7' & ch != 'q') return false;
		else return true;
	}
}