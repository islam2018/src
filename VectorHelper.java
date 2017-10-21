package code;
public class VectorHelper {
	
	public int[] somme (int [] vect1 , int [] vect2)  {
		int [] vect = new int [100] ;
		
		try {
			if (vect1.length != vect2.length)
				
					throw new DifferentSizeException();
				
			else {
				for (int i=0;i<vect1.length;i++) {
					vect[i]=vect1[i]+vect2[i];
			    	}
			    }
		}
			catch (DifferentSizeException e) {
				e.getMessage();
			}
		
		return vect;
		
	}
	///////
	public int[] Tri(int Vect[])
	{
		
		
		
		return Vect;
		
	}
	
	public MinMax minEtMax(int [] vect) {
		
	  Tri(vect);
	  MinMax ob = new MinMax(vect[0], vect[vect.length-1]);
	  return ob ;
		
	}

}
