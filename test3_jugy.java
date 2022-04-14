public class test3_jugy {
	public static void main(String[] args) {
		String inStr = "something";
		System.out.println(inStr); //그냥 출력할을때 = 원본
		
		String reversStr = reversStr(inStr, inStr.length()-1);
		// 믄지얄 revStr은 = 메소드 revStr에 inStr을 넣고 배열의 크기 i 는 inStr의 길이 = length로 합니다
		//length에 -1을 한 이유는 배열은 0번부터 시작 하지만 길이는 1부터 카운트 하기 때문에
		System.out.println(reversStr);
		
	
	
	}
	
	static String reversStr(String inStr, int i) {		//reverStr은 inStr과 배열카운터 i 사용
		
		//탈출조건
		if(i <= 0) {
			return inStr.charAt(0)+"" ;	//만약 인덱스 카운트(i)가 0까지 갔을경우 0번째 배열을 출력하고 탈출
			}
		//만약 인덱스 카운터(i)가 0보다 클경우
		char word = inStr.charAt(i);  //첫 실행시-word에다가 inStr의 i번째=inStr의 length 을 출력합니다
		return word + reversStr(inStr, i-1);	//위 줄 실행이후 다시 위에서보다 1작은 i-1의 배열을 word에 넣는 코드
		
	}
}
