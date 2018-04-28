public class Army {
private String countryName;
private Soldier so[];
private int np ;
private Soldier[] Soldier;

public Army(int size,String countryName)
{
	so = new Soldier[size];
	countryName = null;
	np = 0 ;
}
public boolean addSoldier(Soldier s)
{
if(np<so.length)
{
	 so[np++]=s;
	return  true;

}
else

	return false;

}
public int countSoldiers(String r)
{ 
	 	int count=0; 
	 	for(int i=0; i<np; i++)  	 	 	
	 		if(so[i].getRank().equals(r)) 
	 	 	 	count++; 
	      
	 	   return count; 
}
public Soldier getBravestSoldier()
{
	Soldier aword=so[0]; 
	 
 	for(int i=1; i<np; i++)  	 	 	
 		if(so[i].getAwards()>aword.getAwards())  	 	 	 	
 			aword=so[i]; 
 	 
 	return aword; 
 	 
 	 
} 
public Soldier[] getActiveSoldiers()
{
	
	Soldier gu[]=new Soldier[np]; 
 	int j=0; 
	for(int i=0;i<np;i++) 
 	 
		if(so[i].getAwards()>so[j].getAwards()) 
 	 	{ 
 	 	 	so[j]=so[i]; 
 	 	 	j++; 
 	 	} 
 	 
 	return Soldier; 
 	 
} 
 public int splitSoldiers(Soldier[] highRank , Soldier[] lowRank)
 {
	 { 
		 	int j=0;
		 	int k=0; 
		 	for(int i=0;i<np;i++) 
		 	{
		 	 	if(so[i].getClass().equals("lowRank"))
		 	 		lowRank[j++]=so[i]; 
		 	 	else 
		 	 		highRank[k++]=so[i]; 
		 	 	 	 
		 	 	} 	 
		 	 
		 	return k;  	 	 
		 	 
	}
 }
}
