package ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneObservempl implements StocksObservable {

	public List<NotificationAlertObserver> observerList =  new ArrayList<>();
	public int sctockCount=0;
	
	@Override
	public void add(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
	} 

	@Override
	public void remove(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		observerList.remove(observer);
	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(NotificationAlertObserver observer:observerList)
			observer.update();
	}

	@Override
	public void setStockCount(int newStockAdded) {
		// TODO Auto-generated method stub
		if(sctockCount ==0 )
			notifySubscriber();
		
		sctockCount =  sctockCount+newStockAdded;
		
	}

	@Override
	public int getStockCount() {
		// TODO Auto-generated method stub
		return sctockCount ;
	}

	

}
