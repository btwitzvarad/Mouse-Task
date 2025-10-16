import java.util.Scanner;


public class MultiFrameColor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter How Many Frames");
		int n=sc.nextInt();
		MyFrame f[]=new MyFrame[n];
		for(int i=0;i<n;i++)
		{
			f[i]=new MyFrame(i);
			f[i].setSize(200,200);
			f[i].setLocation(100*i,100*i);
			f[i].setAlwaysOnTop(true);
			f[i].setVisible(true);
			
		}
		
		
	}

}