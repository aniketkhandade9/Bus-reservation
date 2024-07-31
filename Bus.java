import java.util.*;

class Bus{
	Scanner sc=new Scanner(System.in);
	int[] busno=new int[10];
	String[] pname=new String[33];
	String[] atime=new String[10];
	String[] dtime=new String[10];
	String[] drname=new String[10];
	String[] to=new String[10];
	String[] from=new String[10];
	int i=0,p=0;

	public void start(){
		System.out.println("Enter the Choice: ");
		System.out.println("1.Add Bus\n2.Bus Reservation\n3.Show reservation\n4.Show Available Buses\n5.Exit");
		int ch=sc.nextInt();
		switch (ch) {
			case 1:
				addbus();
			case 2:
				busres();
			case 3:
				showres();
			case 4:
				availbus();
			case 5:
				System.exit(0);	
			default:
				System.out.println("Invalid Choice.");
				start();
		}
	}

	public void addbus(){
		System.out.println("Enter Bus No: ");
		busno[i]=sc.nextInt();
		System.out.println("Driver Name: ");
		drname[i]=sc.next();
		System.out.println("Arrival Time: ");
		atime[i]=sc.nextLine();
		atime[i]=sc.nextLine();
		System.out.println("Departure Time: ");
		dtime[i]=sc.nextLine();
		System.out.println("From: ");
		from[i]=sc.nextLine();
		System.out.println("To: ");
		to[i]=sc.nextLine();
		System.out.println("Buss Added Succesfully.");
		++i;
		System.out.println();
		start();
	}

	public void busres(){
		System.out.println("Enter Bus No: ");
		int busno1=sc.nextInt();
		for (int j=0;j<10 ;++j ) {
			if (busno1==busno[j]) {
				System.out.println("Enter Seat No: ");
				int st1=sc.nextInt();
				if (st1<=32) {
					p=st1;
					System.out.println("Enter Name: ");
					pname[p]=sc.next();
					System.out.println();	
					System.out.println("Reservation Completed.");
					System.out.println();
					start();	
				}else {
					System.out.println("There are 32 Seats.");
					System.out.println();
					busres();
				}
			}
			else{
				System.out.println();
				System.out.println("Bus Not Found.");
				System.out.println();
				start();
			}
		}
	}

	public void showres(){
		System.out.println("Enter Bus No: ");
		int busno2=sc.nextInt();
		for (int j=0;j<10 ;++j ) {
			if (busno2==busno[j]) {
				System.out.println("*************************************************************************************************");
				System.out.println("Bus No: "+busno[j]);
				System.out.println("Driver: "+drname[j]);
				System.out.println("Arrival Time: "+atime[j]+"\t\tDeparture Time: "+dtime[j]);
				System.out.println("From: "+from[j]+"\t\tTo: "+to[j]);
				System.out.println("*************************************************************************************************");
				for (int k=1;k<=32 ;++k ) {
					System.out.println(k+"."+pname[k]);
				}
			}else {
				System.out.println("Bus Not Found.");
				System.out.println();
				start();
			}
		}
	} 

	public void availbus(){
		for (int j=0;j<10 ;++j ) {
			System.out.println("*************************************************************************************************");
			System.out.println("Bus No: "+busno[j]);
			System.out.println("Driver: "+drname[j]);
			System.out.println("Arrival Time: "+atime[j]+"\t\tDeparture Time: "+dtime[j]);
			System.out.println("From: "+from[j]+"\t\tTo: "+to[j]);
			System.out.println("*************************************************************************************************");
		}
		System.out.println();
		start();
	}
}

class BusResevation{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Bus bs=new Bus();
		String admin,admin1="Aniket",pss,pss1="1234";
		System.out.println("Enter Username: ");
		admin=in.next();
		System.out.println("Enter Passward: ");
		pss=in.next();
		if (admin.equals(admin1) && pss.equals(pss1)) {
			System.out.println();
			bs.start();
		}else {
			System.out.println("Invalid Username or Passward.");
		}
	}	
}