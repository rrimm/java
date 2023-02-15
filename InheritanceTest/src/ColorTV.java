
public class ColorTV extends TV {
		
		int color;
		
		ColorTV(int size, int color){
			super(size);
			this.color = color;
		}
	
	public void printProperty(){
		System.out.println(size+"인치 "+color+"컬러");
	}
}
