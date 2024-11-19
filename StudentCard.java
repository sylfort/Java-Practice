class StudentCard {
	protected static int counter = 0;
    int id;
    String name;
    
    void printInfo() {
    	System.out.println("学籍番号：" + id);
    	System.out.println("氏名：" + name);
    }
    
    int counterMod(){
    	counter++;
    	return counter;
    }
    
    StudentCard() {
    	System.out.println("引数のないコンストラクタが実行されました");
		this.id = 0;
		this.name = "未定";
		counter++;
	}
   
    StudentCard(String name) {
    	System.out.println("引数が１つのコンストラクタが実行されました");
		this.id = 0;
		this.name = name;
		counter++;
	}
    
    StudentCard(int i, String n) {
//    	System.out.println("引数が２つのコンストラクタが実行されました");
    	
		id = i;
		name = n;
		counter++;
	}
}
