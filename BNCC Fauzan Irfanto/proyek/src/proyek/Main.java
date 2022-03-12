package proyek;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	
	ArrayList<Karyawan> karyawan = new ArrayList<Karyawan>();
	Scanner scan = new Scanner (System.in);
	
	public Main()
	{
		menu();
	}
	
	void menu() 
	{
		int menu = 0;
		
		System.out.println("PT. Mentol");
		System.out.println("==============");
		System.out.println("1. Insert data");
		System.out.println("2. View data");
		System.out.println("3. Update data");
		System.out.println("4. Delete data");
		System.out.println("5. Exit");
		System.out.print(">>> ");
		
		try 
		{
			menu = scan.nextInt();scan.nextLine();
		} 
		catch (Exception e) 
		{
			System.out.println("Must be numeric!");
			scan.nextLine();
			System.out.println("");
			menu();
		}
		
		switch (menu) 
		{
			case 1: 
			{
				insertData();
				break;
			}
			case 2: 
			{
				viewData();
				break;
			}
			case 3:
			{
				updateData();
				break;
			}
			case 4:
			{
				deleteData();
				break;
			}
			case 5:
			{
				System.out.println("Exit");
				System.exit(0);
				break;
			}
		}
	}	
	
	void deleteData() 
	{
		int x;
		
		if (karyawan.size()==0)
		{
			System.out.println("Tidak ada data karyawan!");
			menu();
		}
		int n = karyawan.size();
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(karyawan.get(j).getNama().compareTo(karyawan.get(j+1).getNama())>0)
				{
					Karyawan temp = karyawan.get(j);
					karyawan.set(j, karyawan.get(j+1));
					karyawan.set(j+1, temp);
				}
			}
		}
		System.out.println("|=======|===============|===============|===============|===============|===============|");
		System.out.println("|No\t|Kode Karyawan\t|Nama Karyawan\t|Jenis Kelamin\t|Jabatan\t|Gaji Karyawan\t|");
		System.out.println("|=======|===============|===============|===============|===============|===============|");
		
		int idx = 1;
		
		for(Karyawan list:karyawan)
		{
			System.out.println("|"+idx+"\t|"+list.getId()+"\t\t|"+list.getNama()+"\t|"+list.getKelamin()+"\t|"+list.getJabatan()+"\t|"+list.getGaji());
			idx++;
		}
		System.out.println("|=======|===============|===============|===============|===============|===============|");
		System.out.print("Masukkan angka karyawan: ");
		x = scan.nextInt();scan.nextLine();
		
		karyawan.remove(x-1);
		System.out.println("Data telah dihapus!");
		System.out.println("Enter to continue");
		scan.nextLine();
		System.out.println("");
		menu();
	}

	void updateData() 
	{
		int x;
		
		if (karyawan.size()==0)
		{
			System.out.println("Tidak ada data karyawan!");
			menu();
		}
		int n = karyawan.size();
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(karyawan.get(j).getNama().compareTo(karyawan.get(j+1).getNama())>0)
				{
					Karyawan temp = karyawan.get(j);
					karyawan.set(j, karyawan.get(j+1));
					karyawan.set(j+1, temp);
				}
			}
		}
		System.out.println("|=======|===============|===============|===============|===============|===============|");
		System.out.println("|No\t|Kode Karyawan\t|Nama Karyawan\t|Jenis Kelamin\t|Jabatan\t|Gaji Karyawan\t|");
		System.out.println("|=======|===============|===============|===============|===============|===============|");
		
		int idx = 1;
		
		for(Karyawan list:karyawan)
		{
			System.out.println("|"+idx+"\t|"+list.getId()+"\t\t|"+list.getNama()+"\t|"+list.getKelamin()+"\t|"+list.getJabatan()+"\t|"+list.getGaji());
			idx++;
		}
		System.out.println("|=======|===============|===============|===============|===============|===============|");
		System.out.print("Masukkan angka karyawan: ");
		x = scan.nextInt();scan.nextLine();
		
		String id = "",nama,kelamin,jabatan;
		int gaji, random;
		
		do
		{
			System.out.print("Insert nama [>= 3]: ");
			nama = scan.nextLine();
		}
		while(nama.length()<3);
		
		do
		{
			System.out.print("Insert kelamin [Laki-Laki/Perempuan] (Case Sensitive): ");
			kelamin = scan.nextLine();
		}
		while(!(kelamin.equals("Laki-Laki") || kelamin.equals("Perempuan")));
		
		do
		{
			System.out.print("Insert jabatan [Manager/Supervisor/Admin (Case Sensitive): ");
			jabatan = scan.nextLine();
		}
		while(!(jabatan.equals("Manager") || jabatan.equals("Supervisor") || jabatan.equals("Admin")));
		
		if(jabatan.equals("Manager"))
		{
			gaji = 8000000;
		}
		else if(jabatan.equals("Supervisor"))
		{
			gaji = 6000000;
		}
		else
		{
			gaji = 4000000;
		}
		System.out.println("Gaji: "+gaji);
		
		System.out.print("Insert kode karyawan: ");
		id = scan.nextLine();
		
		karyawan.get(x-1).setId(id);
		karyawan.get(x-1).setNama(nama);
		karyawan.get(x-1).setGaji(gaji);
		karyawan.get(x-1).setJabatan(jabatan);
		karyawan.get(x-1).setKelamin(kelamin);
		
		System.out.println("Karyawan sudah diupdate!");
		System.out.println("Enter to continue");
		scan.nextLine();
		System.out.println("");
		menu();
	}

	void viewData() 
	{
		if (karyawan.size()==0)
		{
			System.out.println("Tidak ada data karyawan!");
			menu();
		}
		int n = karyawan.size();
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(karyawan.get(j).getNama().compareTo(karyawan.get(j+1).getNama())>0)
				{
					Karyawan temp = karyawan.get(j);
					karyawan.set(j, karyawan.get(j+1));
					karyawan.set(j+1, temp);
				}
			}
		}
		System.out.println("|=======|===============|===============|===============|===============|===============|");
		System.out.println("|No\t|Kode Karyawan\t|Nama Karyawan\t|Jenis Kelamin\t|Jabatan\t|Gaji Karyawan\t|");
		System.out.println("|=======|===============|===============|===============|===============|===============|");
		
		int idx = 1;
		
		for(Karyawan list:karyawan)
		{
			System.out.println("|"+idx+"\t|"+list.getId()+"\t\t|"+list.getNama()+"\t|"+list.getKelamin()+"\t|"+list.getJabatan()+"\t|"+list.getGaji());
			idx++;
		}
		System.out.println("|=======|===============|===============|===============|===============|===============|");
		System.out.println("Enter to continue");
		scan.nextLine();
		System.out.println("");
		menu();
	}

	void insertData() 
	{
		String id = "",nama,kelamin,jabatan;
		int gaji, random;
		
		do
		{
			System.out.print("Insert nama [>= 3]: ");
			nama = scan.nextLine();
		}
		while(nama.length()<3);
		
		do
		{
			System.out.print("Insert kelamin [Laki-Laki/Perempuan] (Case Sensitive): ");
			kelamin = scan.nextLine();
		}
		while(!(kelamin.equals("Laki-Laki") || kelamin.equals("Perempuan")));
		
		do
		{
			System.out.print("Insert jabatan [Manager/Supervisor/Admin (Case Sensitive): ");
			jabatan = scan.nextLine();
		}
		while(!(jabatan.equals("Manager") || jabatan.equals("Supervisor") || jabatan.equals("Admin")));
		
		if(jabatan.equals("Manager"))
		{
			gaji = 8000000;
		}
		else if(jabatan.equals("Supervisor"))
		{
			gaji = 6000000;
		}
		else
		{
			gaji = 4000000;
		}
		System.out.println("Gaji: "+gaji);
		
		for(int i=0;i<1;i++)
		{
			random = (int) (Math.random()*(90-65+1)+65);
			id += String.valueOf((char)(random));
		}
		for(int i=0;i<3;i++)
		{
			random = (int) (Math.random()*10);
			id += random;
		}
		System.out.println("Berhasil menambahkan karyawan dengan id "+id);
		
		karyawan.add(new Karyawan(id, nama, kelamin, jabatan, gaji));
		
		System.out.println("ENTER to return");
		scan.nextLine();
		menu();
	}

	public static void main(String[] args) 
	{
		new Main();
		
	}
}
