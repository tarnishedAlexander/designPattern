package Youtube;

public class Cached implements ThirdPartyLIbrary{
	
	private ThirdParty thirdParty;
	
	public Cached(ThirdParty thirdParty) {
		this.thirdParty = thirdParty; 
	}

	@Override
	public void listVideo() {
		thirdParty.listVideo();
	}

	@Override
	public void getVideoInfor(int id) {
		thirdParty.getVideoInfor(id);
	}

	@Override
	public void downloadVideo(int id) {
		thirdParty.downloadVideo(id);
	}
	
}
