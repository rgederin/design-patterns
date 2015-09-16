package patterns.structural.decorator.example1;

public class Main {
	public static void main(String[] args) {
		String test = null;
		String destination;
		FileWriter fileWriter;

		if (args.length > 1) {
			test = args[0];
			destination = args[1];
		} else {
			System.out.println("Exit! Wrong command line's arguments");
			return;
		}

		switch (destination) {
		case "1":
			fileWriter = new FileWriter(new FileWriteUpperCaseStrategy());
			fileWriter.write("This is for upper case", "upercase.txt");
			break;
		case "2":
			fileWriter = new FileWriter(new FileWriteLowerCaseStrategy());
			fileWriter.write("THis Is foR LOWER caSe", "lowercase.txt");
			break;
		default:
			break;
		}

		//System.out.println(test);
		//System.out.println(destination);
	}
}
