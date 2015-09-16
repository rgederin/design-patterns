package patterns.structural.decorator.example1;

public interface FileWriteStrategy {
	public void write(String text, String fileName);
}
