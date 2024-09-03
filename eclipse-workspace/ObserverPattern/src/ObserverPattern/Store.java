package ObserverPattern;

import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observable.IphoneObservempl;
//import ObserverPattern.Observer.NotificationAlertObserver;
//import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StocksObservable iphoneStockObservable =  new IphoneObservempl();
		
		EmailAlertObserverImpl  observer1 =  new EmailAlertObserverImpl("mintu@xecurify.com",iphoneStockObservable);
		EmailAlertObserverImpl  observer2 =  new EmailAlertObserverImpl("prdp@xecurify.com",iphoneStockObservable);
		MobileAlertObserverImpl observer3 =  new MobileAlertObserverImpl("hello@xecurify.com",iphoneStockObservable);
		
		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);
		 
		iphoneStockObservable.setStockCount(0);
	}

}
