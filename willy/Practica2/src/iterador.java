import java.util.Iterator;

public class iterador implements Iterable<int[]>{
	int n, r;
	int[] array;
	
	@Override
	public Iterator<int[]> iterator() {
		// TODO Auto-generated method stub
		return new IteradorCombn(array);
	}
	private class IteradorCombn implements Iterator<int[]>{
		
		int[] unaCombinacion;
		
		public IteradorCombn(int[] array){
			this.unaCombinacion = new int[] {1,2,3};
		}
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		public int[] next() {
			// TODO Auto-generated method stub
			return null;
		}

	}
}
