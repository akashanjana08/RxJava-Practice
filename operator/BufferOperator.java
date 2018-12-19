package operator;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/*
 * Buffer gathers items emitted by an Observable into batches and emit the batch instead of emitting one item at a time.

Below, we have an Observable that emits integers from 1-9. When buffer(3) is used, it emits 3 integers at a time.
 * */


public class BufferOperator {

	public static void main(String[] args) {
		
		Observable<List<Integer>> buffObservable = Observable.just(1,2,3,4,5,6,7,8).buffer(3);
		
		buffObservable
		.subscribe(new Observer<List<Integer>>() {

			@Override
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNext(List<Integer> t) {
				// TODO Auto-generated method stub
				System.out.println(t.size());
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
