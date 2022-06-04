package id.ac.uns.vokasi.jdbc;

public class Mahasiswa {
	public static void main(String[] ar) {
		MahasiswaData mahasiswaData=new MahasiswaData();
		System.out.println("NIM      : "+mahasiswaData.getData().get(0).getNim());
		System.out.println("Nama 	 : "+mahasiswaData.getData().get(0).getNama());
		System.out.println("Gender   : "+mahasiswaData.getData().get(0).getGender());
		System.out.println("TTL      : "+mahasiswaData.getData().get(0).getTglLahir());
		System.out.println("Alamat   : "+mahasiswaData.getData().get(0).getAlamat());
		System.out.println("Prodi    : "+mahasiswaData.getData().get(0).getProdi());
	}

}
