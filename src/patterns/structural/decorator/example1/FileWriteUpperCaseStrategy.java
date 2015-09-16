package patterns.structural.decorator.example1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Implementation for FileWriteStrategy. This implementation is write text in
 * the file in Upper Case <br>
 * This class used decorator (UpperCaseOutputStreamDecorator) object for writing into the
 * file
 * 
 * @author rgederin
 * 
 */
public class FileWriteUpperCaseStrategy implements FileWriteStrategy {

	private OutputStream outputStream;

	@Override
	public void write(String text, String fileName) {
		try {
			this.outputStream = new UpperCaseOutputStreamDecorator(
					new BufferedOutputStream(new FileOutputStream(fileName)));
			this.outputStream.write(text.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
