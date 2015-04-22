package sinar;

public class prktikum1 {

	/**
	 * @param args
	 */
	static String Praktikum = "Praktikum Pertama";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ini adalah laporan pertama PBO");
		test();
		biodata();
		penjumlahan();
		pengurangan();
		perkalian();
		pembagian();
		
		
	}
	public static void test()
	{
		System.out.println(Praktikum);
	}
	//pemanggilan biodata
	public static void biodata()
	
	{
		String nama ="Syamsinar";
		String nim  ="60200112079";
		String matakuliah ="PBO";
		String fakultas ="Sains dan Teknologi";
		String jurusan ="Teknik Informatika";
		System.out.println("Nama"+":" + nama + "\nNIM "+ ":" + nim + "\nPraktikum "+matakuliah + "\nFakultas :"+fakultas + "\njurusan "+":"+jurusan);
	}
	//penjumlahan
	public static void penjumlahan()
	{
		int i =19;
		int j =9;
		System.out.print("hasil penjumlahan "  +i + "+" + j + "=");
		System.out.print(i+j);
		
	}
	//pengurangan
	public static void pengurangan()
	{
		int l =45;
		int k =15;
		System.out.print("\nhasil pengurangan "  +l+ "-" +k+ "=");
		System.out.print(l-k);
		
		
	}
	//perkalian
		public static void perkalian()
		{
			int m =19;
			int n =19;
			System.out.print("\nhasil perkalian "  +m+ "*" +n+ "=");
			System.out.print(m*n);
			
			
		}
		//pembagian
		public static void pembagian()
		{
			float g =100;
			float h =5;
			System.out.print("\nhasil pembagian " +g+ "/" +h+ "=");
			System.out.print(g/h);
			
			
		}
}

