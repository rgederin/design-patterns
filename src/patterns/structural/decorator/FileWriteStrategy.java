package patterns.structural.decorator;

public interface FileWriteStrategy {
	public void write(String text, String fileName);
}
