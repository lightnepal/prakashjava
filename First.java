class First{
	long l;
	String s;
	public static void main(String[] args){
		Human hm=new Human(10,15);
		System.out.println("age = "+hm.getAge());
		System.out.println("heigh = "+hm.getHeight());
	}
	public static int getSum(int n){
		int res=0;
		for(int i=0;i<n;i++){
			res+=i;
		}
		return res;
	}
}
