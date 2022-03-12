package proyek;

public class Karyawan 
{
	String id,nama,kelamin,jabatan;
	int gaji;
	
	public Karyawan(String id, String nama, String kelamin, String jabatan, int gaji) 
	{
		super();
		this.id = id;
		this.nama = nama;
		this.kelamin = kelamin;
		this.jabatan = jabatan;
		this.gaji = gaji;
		
	
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getNama() 
	{
		return nama;
	}

	public void setNama(String nama) 
	{
		this.nama = nama;
	}

	public String getKelamin() 
	{
		return kelamin;
	}

	public void setKelamin(String kelamin) 
	{
		this.kelamin = kelamin;
	}

	public String getJabatan() 
	{
		return jabatan;
	}

	public void setJabatan(String jabatan) 
	{
		this.jabatan = jabatan;
	}

	public int getGaji() 
	{
		return gaji;
	}

	public void setGaji(int gaji) 
	{
		this.gaji = gaji;
	}
	
}
