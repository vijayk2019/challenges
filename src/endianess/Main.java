package endianess;

import java.io.*;
import java.util.*;
import java.nio.ByteOrder;

public class Main {

	public static void main(String[] args) {
		ByteOrder SystemByteOrder = ByteOrder.nativeOrder();
		if (SystemByteOrder.equals(ByteOrder.BIG_ENDIAN)) {
			System.out.println("BigEndian");
		} else {
			System.out.println("LittleEndian");
		}
	}
}
