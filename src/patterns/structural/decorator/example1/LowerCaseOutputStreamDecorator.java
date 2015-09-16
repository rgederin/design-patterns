package patterns.structural.decorator.example1;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class LowerCaseOutputStreamDecorator extends FilterOutputStream {

	public LowerCaseOutputStreamDecorator(OutputStream out) {
		super(out);
	}

	@Override
	public void write(byte[] bytes) throws IOException {
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) Character.toLowerCase((char) bytes[i]);
		}
		out.write(bytes);
	}
}
