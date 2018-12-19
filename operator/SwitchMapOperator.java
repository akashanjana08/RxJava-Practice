package operator;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;

public class SwitchMapOperator {
 public static void main(String[] args) {

	 Observable.fromArray(new Integer[]{1, 2 ,3 ,4})
	 .switchMap(new Function<Integer, ObservableSource<Integer>>() {
         @Override
         public ObservableSource<Integer> apply(Integer integer) throws Exception {
             return Observable.just(integer);
         }
     })
	 .subscribe(new Observer<Integer>() {

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
