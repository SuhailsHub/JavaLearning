package SpringAutowiring;

public class Application {
	private String appId;
	private ApplicationUser appUser;

	public void setAppId(String appId) {
		this.appId=appId;
	}

	public void setAppUser(ApplicationUser appUser) {
		this.appUser = appUser;
	}

	public void ref() {
		System.out.println("Application :"+appId+"\n"+appUser.autoByName());
	}
}
