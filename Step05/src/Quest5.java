
public class Quest5 {
	/*
	 * 문자형 배열에 저장된 내용을 전부 거꾸로 뒤집어서 저장한 후에
	 * 배열을 문자열로 만든 다음에 결과를 출력
	 */
	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		
		/*      0 1 2 3 4 5 6 7 8 9 10 
		 * 		H e l l o   W o r l d
		 * 
		 * 		d l r o W   o l l e H <-- 배열에 저장
		 */
		for(int i=0;i<arr.length / 2;i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		str = new String(arr);
		System.out.println(str);
	}

}





















