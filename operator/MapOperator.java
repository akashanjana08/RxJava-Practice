package operator;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;


/*
 * Map operator transform each item emitted by an Observable and emits the modified item.

Let’s say we have an Observable that makes a network call (assume the network call is made) and emits the User objects with name and gender. But in our requirement we need an email address to be present for each user, which is missing in the network response. Then we can alter each User object by applying Map() operation.

getUsersObservable() : assume this method is making a network call and fetching user objects. This returns an Observable that emits User objects with name and gender.
map() operator applies Function<User, User> on each User object and adds email address and returns the modified User object.
 * 
 */

public class MapOperator {

	static List<User> userList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		userList.add(new User("Obama","55", "Male"));
		userList.add(new User("Lint","58", "Male"));
		userList.add(new User("Trunk","36", "Male"));
		userList.add(new User("Mild","12", "Male"));
		
		
		getUserObservable().map(new Function<User, User>() {
            @Override
			public User apply(User t) throws Exception {
				// TODO Auto-generated method stub
				t.email  = t.userName+"@gmail.com";
				return t;
			}
		})
		.subscribe(new Consumer<User>() {

			@Override
			public void accept(User t) throws Exception {
				// TODO Auto-generated method stub
			     System.out.println(t.userName + "  "+t.email);	
			}
		});
	}
	
	
	static Observable<User> getUserObservable(){
		
		return Observable.create(new ObservableOnSubscribe<User>() {

			@Override
			public void subscribe(ObservableEmitter<User> t) throws Exception {
				// TODO Auto-generated method stub
				if(!t.isDisposed()){
					for (User userElement : userList) {
						t.onNext(userElement);
					}
				}
				if(!t.isDisposed()){
					t.onComplete();
				}
			}
		});
	}
	
	
}

class User{
	
	String userName;
	String age;
	String gender;
	String email;
	
	
	public User(String userName, String age, String gender) {
		super();
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}
}
