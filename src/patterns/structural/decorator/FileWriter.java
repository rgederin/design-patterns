package patterns.structural.decorator;

public class FileWriter {
	private FileWriteStrategy fileWriteStrategy;

	public FileWriter(FileWriteStrategy fileWriteStrategy) {
		this.fileWriteStrategy = fileWriteStrategy;
	}

	public void setFileWriteStrategy(FileWriteStrategy fileWriteStrategy) {
		this.fileWriteStrategy = fileWriteStrategy;
	}

	public void write(String text, String fileName) {
		this.fileWriteStrategy.write(text, fileName);
	}
}
