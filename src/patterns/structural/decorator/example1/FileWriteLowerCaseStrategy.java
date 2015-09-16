package patterns.structural.decorator.example1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriteLowerCaseStrategy implements FileWriteStrategy {
	private OutputStream outputStream;

	@Override
	public void write(String text, String fileName) {
		if (text == null || fileName == null) {
			return;
		}
		try {
			this.outputStream = new LowerCaseOutputStreamDecorator(
					new BufferedOutputStream(new FileOutputStream(fileName)));
			this.outputStream.write(text.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (this.outputStream != null) {
				try {
					this.outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
