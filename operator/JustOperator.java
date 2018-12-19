package operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

public class JustOperator {
  public static void main(String[] args) {
	
	  Integer data[] = {1,2,3,4,5,6,7,8,9,9,4,5,3,23,4,4,4,4,5,5,3,3};
	  String stData[] = {"Hello" , "world"};
	  
	  Observable<String> obervable = Observable.just("Tata","Birla");
	  
	  Observable<String> obervable1 = Observable.fromArray(stData).repeat(2);
	  
	  Observable<Integer> obervablerange = Observable.range(1,100);
			  
//			  filter(new Predicate<Integer>() {
//          @Override
//          public boolean test(Integer integer) throws Exception {
//              return (integer % 2 == 0);
//          }
//      });
	  
	  obervable1.subscribe(new Observer<String>(){

		@Override
		public void onSubscribe(Disposable d) {
			// TODO Auto-generated method stub
			System.out.println("subscribe");
		}

		@Override
		public void onNext(String t) {
			// TODO Auto-generated method stub
			System.out.println("Observer  : "+ t);
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
		}} );
	 
}
  
  
}
