public class Word_s {
		String mean;
		String english;
		
		public String getMean() {
			return mean;
		}
		public void setKorea(String mean) {
			this.mean = mean;
		}
		public String getEnglish() {
			return english;
		}
		public void setEnglish( String english) {
			this.english = english;
		}
		@Override
		public String toString() {
			return "�ܾ� [����=" + english + ": ��=" + mean+"]";
		}
		
		
}
