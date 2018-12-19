package subject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/*
 * It emits all the subsequent items of the source Observable at the time of subscription.

Here, if a student entered late into the classroom, he just wants to listen from that point of time when he entered the classroom. So, Publish will be the best for this use-case.

See the below example:
 * */

public class PublishSubject {

	public static void main(String[] args) {

		io.reactivex.subjects.PublishSubject<Integer> source = io.reactivex.subjects.PublishSubject.create();

		// It will get 1, 2, 3, 4 and onComplete
		source.subscribe(getFirstObserver());
		
		
		source.onNext(1);
		source.onNext(2);
		source.onNext(3);
		// It will get 4 and onComplete for second observer also.
		source.subscribe(getSecondObserver());
		source.onNext(4);
		source.onNext(5);
		source.onNext(6);
		source.onComplete();

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
				System.out.println("First Observer Enter   "  +t);
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
				System.out.println("Second Observer Enter   "  +t);
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
