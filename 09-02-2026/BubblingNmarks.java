public class BubblingNmarks {
	static boolean bubble(int[] a,int[] b) {
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<b[i]) return true;
			if(a[i]>b[i]) return false;
			
		}
	 return false;
	}

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{1,3,2},{2,1,3},{2,3,1}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(bubble(arr[j],arr[j+1]))
				{
					int[] temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}