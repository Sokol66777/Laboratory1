package by.epam.tr.main;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {4,6,6,78,12};
		if(prime(array)) {
			System.out.println("array whithout prime numbers");
		}
	}
	private static boolean prime(int array[]) {
		int flag=0;
		boolean end=true;
		for(int i=0;i<array.length;i++) {
			flag=1;
			if(array[i]==2) {
				System.out.println(i);
				end=false;
				continue;
			}
			for(int j=2;j<array[i];j++) {
				if(array[i]%j==0) {
					flag=0;
				}
				if(j==array[i]-1 && flag==1) {
					System.out.println(i);
					end=false;
				}
			
			}
		}
		return end;
	}

}
