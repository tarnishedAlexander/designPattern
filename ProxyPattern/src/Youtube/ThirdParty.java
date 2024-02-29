package Youtube;

public class ThirdParty implements ThirdPartyLIbrary{

	@Override
	public void listVideo() {
		System.out.println("the list is");
		
	}

	@Override
	public void getVideoInfor(int id) {
		System.out.println("you catch the video" + id);		
	}

	@Override
	public void downloadVideo(int id) {
		System.out.println("LOL");
		
	}

}
