package operator;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class CreateOperator {

	public static void main(String[] args) {
		
		Observable<Integer> observableData =  Observable.create(new ObservableOnSubscribe<Integer>() {

			@Override
			public void subscribe(ObservableEmitter<Integer> observable) throws Exception {
				// TODO Auto-generated method stub
				
				new Thread(){
					
					public void run() {
						int j=0;
						try{
							for(int i=0 ; i<40 ;i++){
								j=i;
								//Thread.sleep(40);
							}
							
						}finally{
							observable.onNext(j);
							observable.onComplete();
						}
					};
					
				}.start();
			}
		});
		
		
		observableData.subscribe(new Observer() {

			@Override
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub
				System.out.println("subscribe");
			}

			@Override
			public void onNext(Object t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}

			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("onError");
			}

			@Override
			public void onComplete() {
				// TODO Auto-generated method stub
				System.out.println("onComplete");
			}
		});
		
		System.out.println("Please wait....");
	}
}
