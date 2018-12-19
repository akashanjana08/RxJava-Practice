package subject;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/*
 * It only emits the last value of the source Observable(and only the last value) only after that source Observable completes.

Here, if a student entered at any point of time into the classroom, and he wants to listen only about the last thing(and only the last thing) being taught, after class is over. So, here we will use Async.
 * */

public class AsyncSubject {
	public static void main(String[] args) {

		io.reactivex.subjects.AsyncSubject<Integer> source = io.reactivex.subjects.AsyncSubject.create();
		source.subscribe(getFirstObserver());
		source.onNext(1);
		source.onNext(2);
		source.onComplete(); 
		source.onNext(3);
		source.onNext(4);
		source.onNext(5);

		source.subscribe(getSecondObserver());
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
