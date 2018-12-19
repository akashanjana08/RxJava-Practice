package subject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/*
 * It emits the most recently emitted item and all the subsequent items of the source Observable when an observer subscribes to it.

Here, if a student entered late into the classroom, he wants to listen the most recent things(not from the beginning) being taught by the professor so that he gets the idea of the context. So, here we will use Behavior
 * */

public class BehaviorSubject {

	public static void main(String[] args) {
		
		io.reactivex.subjects.BehaviorSubject<Integer> source = io.reactivex.subjects.BehaviorSubject.create();
		source.subscribe(getFirstObserver());
		source.onNext(1);
		source.onNext(2);
		source.onNext(3);
		source.onNext(4);
		source.subscribe(getSecondObserver());
		source.onNext(5);
		source.onNext(6);
		source.onNext(7);
	}
	
	static Observer<Integer> getFirstObserver() {
		return new Observer<Integer>() {

			@Override
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onNext(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("First Observer Enter   " + t);
			}

			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onComplete() {
				// TODO Auto-generated method stub

			}
		};
	}

	static Observer<Integer> getSecondObserver() {
		return new Observer<Integer>() {

			@Override
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onNext(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("Second Observer Enter   " + t);
			}

			@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onComplete() {
				// TODO Auto-generated method stub

			}
		};
	}
}
