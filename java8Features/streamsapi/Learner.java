package java8Features.streamsapi;

import java.util.Arrays;
import java.util.List;

class LearnerTemplate
		{
			
			int sId;
			String sName;
			String location;
			
			public LearnerTemplate(int sId, String sName, String location) {
				super();
				this.sId = sId;
				this.sName = sName;
				this.location = location;
			}

			public int getsId() {
				return sId;
			}

			public void setsId(int sId) {
				this.sId = sId;
			}

			public String getsName() {
				return sName;
			}

			public void setsName(String sName) {
				this.sName = sName;
			}

			public String getLocation() {
				return location;
			}

			public void setLocation(String location) {
				this.location = location;
			}
	
			
		}


public class Learner {

	public static void main(String[] args) {
				List<LearnerTemplate> learnerList = Arrays.asList(
						
						new LearnerTemplate(123, "Bharathy", "Chennai"),
						new LearnerTemplate(124, "Aswin", "Trichy"),
						new LearnerTemplate(125, "Bala", "Chennai"),
						new LearnerTemplate(126, "Karthik", "Mumbai"),
						new LearnerTemplate(123, "Ajay", "Goa")
						
						);
		
				learnerList.stream().map(l -> {
					if(l.getsName().length()<=5) {
						return l.getsName()+" Natwest";
					}
					return l.getsName();
				}).forEach(System.out::println);

		
		
		
		
	}

}
