package this��super�ǽ�����;

class Person{
	//�Ӽ�, �������(=�ν��Ͻ�����)
	private int juminNum; //�ֹι�ȣ
	private int militaryNum; //����
	private int birthYear; //����⵵
	private int birthMonth;//�����
	private int birthDay;   //�����

	//������ => ù��° Ŭ������ ������ �ִ� ���//��ü �ڽ�
	public Person(int juminNum, int militaryNum, int bYear, int bMonth, int bDay) {
		/*
		 * 
		 */
		this.juminNum = juminNum; //������� �ʱ�ȭ
		this.militaryNum = militaryNum;
		birthYear = bYear;
		birthMonth = bMonth;
		birthDay = bDay;
	}
	
	//�ι�° Ŭ������ ������ ���� ��� ���� 0���� �ش�.
	public Person(int juminNum,int bYear, int bMonth, int bDay) { //this �Ұ�ȣ�� �� �ٸ� ��ü�� �����Ͻÿ�.
		this(juminNum, 0, bYear, bMonth, bDay);
		
		
		
		/*
		 * this.juminNum = juminNum;
		
		this.militaryNum = 0;
		birthYear = bYear;
		birthMonth = bMonth;
		birthDay = bDay; */
	}	
	
		//�ʿ��� �޼ҵ� ����
		public void showInfo() {
			System.out.println("�ֹι�ȣ: " + juminNum );
			System.out.println("���⿬��: " + birthYear+ "/"+birthMonth+ "/"+birthDay);
		
		if(militaryNum != 0) {
			System.out.println("����: "+militaryNum +'\n');
		}else {
			System.out.println("���� �������!");
		}
		
	}
	
}	
	


	



public class ThisEx {
	public static void main(String[] args) {
		Person man = new Person(951024, 880102, 1995, 10, 24);
		Person woman = new Person(991126,1999,11,26);
		man.showInfo();
		woman.showInfo();
				
	}

}
