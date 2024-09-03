package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;
public class MobileAlertObserverImpl implements NotificationAlertObserver{

	
	String Username;
	StocksObservable observable;
	
	public MobileAlertObserverImpl(String emailid, StocksObservable observable) {
		this.observable = observable;
		this.Username = emailid;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMsgOnMobile(Username,"Product is stock hurry up!");
	}

	private void sendMsgOnMobile(String username2, String string) {
		// TODO Auto-generated method stub
		System.out.println("msg send on mobile:" + Username);
	}

}
