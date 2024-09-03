package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;
public class EmailAlertObserverImpl implements NotificationAlertObserver {

	String emailId;
	
	StocksObservable observable;
	public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendEmail(emailId, "Product is in stock hurry up!");
	}
	private void sendEmail(String emailId2, String string) {
		// TODO Auto-generated method stub
		System.out.println("mail sent to:"+emailId);
	}

}
