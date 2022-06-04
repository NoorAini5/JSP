package id.ac.uns.vokasi.jdbc;

public class MahasiswaModel {
	String nim,nama,gender,tgl_lahir,alamat,prodi;
	
	public void setNim(String nim ) {
		this.nim=nim;
	}
	public void setNama(String nama) {
		this.nama=nama;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setTglLahir(String tgl_lahir) {
		this.tgl_lahir=tgl_lahir;
	}
	public void setAlamat(String alamat) {
		this.alamat=alamat;
	}
	public void setProdi(String prodi) {
		this.prodi=prodi;
	}
	
	public String getNim() {
		return nim;
	}
	public String getNama() {
		return nama;
	}
	public String getGender() {
		return gender;
	}
	public String getTglLahir() {
		return tgl_lahir;
	}
	public String getAlamat() {
		return alamat;
	}
	public String getProdi() {
		return prodi;
	}
}
