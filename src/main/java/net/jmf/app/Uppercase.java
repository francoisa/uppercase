package net.jmf.app;

import java.util.Iterator;

public class Uppercase implements Iterable<String> {
	private String[] str;
	public Uppercase(String[] str) {
		this.str = new String[str.length];
		System.arraycopy(str, 0, this.str, 0, this.str.length);
	}

	public int size() { return str.length; }

    public String get(int i) { return str[i].toUpperCase(); }

	public Iterator<String> iterator() {
		return new UppercaseIter();
	}
	
	class UppercaseIter implements Iterator<String> {
		private int index = 0;
		
		public boolean hasNext() {
			return index < size();
		}

		public String next() {
			return get(index++);
		}
		
		public void remove() {
			throw new UnsupportedOperationException("not supported");
		}
	}
}
