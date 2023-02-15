
class IPTV extends ColorTV {
	String addr;
	
	IPTV(String addr, int size, int color) {
		super(size, color);
		this.addr = addr;
	}
	public void printProperty(){
		System.out.println("나의 IPTV는 "+addr+"주소의 "
				+ size +"인치 "+color+"컬러");
	}

}
