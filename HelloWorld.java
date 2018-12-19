import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class HelloWorld {
  
	public static void main(String[] args) {
		
		Observable<String> obs = Observable.just("Hello World","Hello India");
		obs.subscribe(new Observer() {

			@Override
			public void onSubscribe(Disposable d) {
				// TODO Auto-generated method stub
				System.out.println("onSubscribe");
				
			}

			@Override
			public void onNext(Object t) {
				// TODO Auto-generated method stub
				System.out.println("onNext    "+ t);
				
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
	}
}
