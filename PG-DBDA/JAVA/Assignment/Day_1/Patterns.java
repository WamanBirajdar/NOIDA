// print following pattern 
/* ABCDDCBA
    ABC  CBA
    AB    BA
    A      A */


class Pattern_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a='A';
        for(int i=1;i<=4;i++) {
            a='A';
            for(int j=4;j>=i;j--) {
                System.out.print(a);
                a++;
            }
            for(int k=2;k<=i;k++) {
                System.out.print("  ");
            }
            char d=65;
            for(int l=4-i; l>=0; l--)
            {
                if(l!=4) 
                    System.out.print((char)(d+l));
            }
            System.out.println();
        }
