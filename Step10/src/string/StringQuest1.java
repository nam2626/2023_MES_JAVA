package string;

public class StringQuest1 {

	public static void main(String[] args) {
		String str = "농업생산성의 제고와 농지의 합리적인 이용을 위하거나 불가피한 사정으로 발생하는 농지의 임대차와 위탁경영은 법률이 정하는 바에 의하여 인정된다. 모든 국민은 거주·이전의 자유를 가진다. 대통령은 국무총리·국무위원·행정각부의 장 기타 법률이 정하는 공사의 직을 겸할 수 없다. 모든 국민은 학문과 예술의 자유를 가진다."
				+ "제1항의 탄핵소추는 국회재적의원 3분의 1 이상의 발의가 있어야 하며, 그 의결은 국회재적의원 과반수의 찬성이 있어야 한다. 다만, 대통령에 대한 탄핵소추는 국회재적의원 과반수의 발의와 국회재적의원 3분의 2 이상의 찬성이 있어야 한다. 통신·방송의 시설기준과 신문의 기능을 보장하기 위하여 필요한 사항은 법률로 정한다."
				+ "위원은 정당에 가입하거나 정치에 관여할 수 없다. 국회의원의 수는 법률로 정하되, 200인 이상으로 한다. 헌법재판소는 법관의 자격을 가진 9인의 재판관으로 구성하며, 재판관은 대통령이 임명한다. 법률이 정하는 주요방위산업체에 종사하는 근로자의 단체행동권은 법률이 정하는 바에 의하여 이를 제한하거나 인정하지 아니할 수 있다.";
		
		/*
		 * 위 문자열에서 국회라는 단어가 몇번 나오는지 구하세요. 
		 */
		int i=0, count=0;
		while((i = str.indexOf("국회", i)) != -1) {
			count++;
			i++;
		}
		System.out.println(count);
	}

}













