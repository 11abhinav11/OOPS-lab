/*215890102
  static counter to count number of objects*/
class Counter{
	static int count=0;
	Counter(){count++;}
	static void showCount(){
		System.out.println("number of objects:"+count);
	}
}
class main{
	public static void main(String args[]){
		Counter ob1=new Counter();
		Counter ob2=new Counter();
		Counter ob3=new Counter();
		Counter.showCount();}
}
