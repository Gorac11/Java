import java.util.*;
public class Brigade {
	String name;
	int number;
	String bossname;
	Brigade(String name,int number,String bossname){
		this.bossname=bossname;
		this.name=name;
		this.number=number;
	}
	void setBrigade() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ins name: ");
		name=sc.nextLine();
		System.out.println("Ins number: ");
		number=sc.nextInt();
		System.out.println("Ins bossname: ");
		bossname=sc.nextLine();
		bossname=sc.nextLine();
		
	}
	void printInfo() {
		System.out.println("Name: "+name+", workers: "+number+", boss: "+bossname);
	}
	
	
	public static void main(String[] args) {
		System.out.println("How many Brigades?");
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		List<Brigade> brigades = new ArrayList<Brigade>();
		for(int i = 0; i < count; i++) {
		    brigades.add(new Brigade("", 0, ""));
		    brigades.get(i).setBrigade();
		}
		for(int i=0;i<count;i++) {
		brigades.get(i).printInfo();
		}
	}

}
