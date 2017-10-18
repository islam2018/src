
public class VectorHelper {
	

	public int[] Tri(int Vect[])
	{
		int i=0,j=0,s=0;
		int ind;
		int min;
		
		for (i=0;i<Vect.length;i++)
		{
			//Recherche de min
			min=Vect[i];
			ind=i;
			for (j=i;j<Vect.length;j++)
			{
				if (Vect[j]<min) 
				{
					min=Vect[j];
					ind=j;
				}
			}
			//Permuter avec le min
			s=Vect[i];
			Vect[i]=Vect[ind];
			Vect[ind]=s;	
		}
		
		return Vect;
		
	}
	
	public int[] Inverser(int Vect[])
	{
		int inf=0;
		int sup=Vect.length-1;
		int s;
		while (inf<sup)
		{
			s=Vect[inf];
			Vect[inf]=Vect[sup];
			Vect[sup]=s;
			inf++;
			sup--;
		}
		return Vect;
		
	}
	
	public int[] Fonction(int Vect[])
	{
		int i=0;
		while (i<Vect.length)
		{
			Vect[i]=Vect[i]*2;
			i++;
		}
		return Vect;
		
	}
	
	

}
