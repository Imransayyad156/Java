package Assignment1;
		public class Mydate {
		    int dd, mm, yy;
		    Mydate() {
		        this.dd = 1;
		        this.mm = 1;
		        this.yy = 2000;
		    }
		    Mydate(int dd, int mm, int yy) {
		        this.dd = dd;
		        this.mm = mm;
		        this.yy = yy;
		    }
		    void displayDate() {
		        System.out.println(this.dd + "-" + this.mm + "-" + this.yy);
		    }
		    public static void main(String[] args) {
		        Mydate d1 = new Mydate();
		        System.out.print("Default Date: ");
		        d1.displayDate();
		        Mydate d2 = new Mydate(21, 8, 2025);
		        System.out.print("Parameterized Date: ");
		        d2.displayDate();
		    }

	}
