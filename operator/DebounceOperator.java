package operator;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class DebounceOperator {
 public static void main(String[] args) {
	
	 Integer intData[] = {1,2,3,4,5,6,7,8,9,10};
	 
	 Observable<Integer> bounceObservable = Observable.fromArray(intData).debounce(0, TimeUnit.MILLISECONDS);
	 
	 bounceObservable.subscribe(new Observer<Integer>() {

		@Override
		public void onSubscribe(Disposable d) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onNext(Integer t) {
			// TODO Auto-generated method stub
			System.out.println(t);
		}

		@Override
		public void onError(Throwable e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onComplete() {
			// TODO Auto-generated method stub
			
		}
	});
}
}
