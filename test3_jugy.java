public class test3_jugy {
	public static void main(String[] args) {
		String inStr = "something";
		System.out.println(inStr); //�׳� ��������� = ����
		
		String reversStr = reversStr(inStr, inStr.length()-1);
		// ������ revStr�� = �޼ҵ� revStr�� inStr�� �ְ� �迭�� ũ�� i �� inStr�� ���� = length�� �մϴ�
		//length�� -1�� �� ������ �迭�� 0������ ���� ������ ���̴� 1���� ī��Ʈ �ϱ� ������
		System.out.println(reversStr);
		
	
	
	}
	
	static String reversStr(String inStr, int i) {		//reverStr�� inStr�� �迭ī���� i ���
		
		//Ż������
		if(i <= 0) {
			return inStr.charAt(0)+"" ;	//���� �ε��� ī��Ʈ(i)�� 0���� ������� 0��° �迭�� ����ϰ� Ż��
			}
		//���� �ε��� ī����(i)�� 0���� Ŭ���
		char word = inStr.charAt(i);  //ù �����-word���ٰ� inStr�� i��°=inStr�� length �� ����մϴ�
		return word + reversStr(inStr, i-1);	//�� �� �������� �ٽ� ���������� 1���� i-1�� �迭�� word�� �ִ� �ڵ�
		
	}
}
