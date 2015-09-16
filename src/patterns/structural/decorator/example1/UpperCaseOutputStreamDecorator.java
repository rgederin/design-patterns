package patterns.structural.decorator.example1;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Decorator for writing
 * @author rgederin
 *
 */
public class UpperCaseOutputStreamDecorator extends FilterOutputStream {

	public UpperCaseOutputStreamDecorator(OutputStream out) {
		super(out);
	}

	@Override
	public void write(byte[] bytes) throws IOException {
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) Character.toUpperCase((char) bytes[i]);
		}
		out.write(bytes);
	}
}
