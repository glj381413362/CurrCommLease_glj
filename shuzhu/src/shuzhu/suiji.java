package shuzhu;



public class suiji {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] suiji=new int[20];
		int a;
		boolean result=true;
		while(result)
		{
			if((int)(Math.random()*100+1)%2==0)
			{
		suiji[0]=(int)(Math.random()*100+1);
		      result=false;
			}else{
				result=true;
			}
		}
		int count=0;
		while(count<20)
		{
		a=(int)(Math.random()*100+1);
		while(a%2==0)
		 {
			for(int i=0;i<20;i++)
			{
			if(a!=suiji[i])
			 {
				suiji[i+1]=a;
				count+=count;
				System.out.println(suiji[i]);
			 }
			}
		  }
		 }
		

			
	}

}
