package super��������;

public class SupersonicAirplane extends Airplane{
	//��� ���� => ���� ����ϴ� ���������� ����� ��������ν� �������� �����ش�.
	public static final int NORMAL = 1; //������ ���� �� ����� ������ ���� �빮�ڷ� �Ѵ�. �Ϲ� ������ �Ѵ�.
	public static final int SUPERSONIC = 2;   //������ ����

	//��� ���� ����
	public int flyMode = NORMAL;
	
	@Override //�޼ҵ� �������̵� => �������� �����ϱ� ���� ����
	public void fly() {
		if(flyMode == SUPERSONIC ) {
			System.out.println("������ �����մϴ�.");
		}else {
			super.fly(); //�θ�Ŭ������fly() �޼ҵ� ȣ���ϰڴ� �ǹ�//super�� ������ ���� �ƴ϶� �θ��� ���̴�.
		}
	}
	
	



}
