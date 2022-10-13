package Objetos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream {

	public MiObjectOutputStream(OutputStream arg0) throws IOException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	protected void writeStreamHeader() throws IOException {
		
	}

}
