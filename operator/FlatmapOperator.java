//package operator;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
//
//import io.reactivex.Observable;
//import io.reactivex.ObservableEmitter;
//import io.reactivex.ObservableOnSubscribe;
//import io.reactivex.Observer;
//import io.reactivex.disposables.Disposable;
//import io.reactivex.functions.Function;
//
/*
 * To better understand FlatMap, consider a scenario where you have a network call to fetch Users with name and gender. 
 * Then you have another network that gives you address of each user. 
 * Now the requirement is to create an Observable that emits Users with name, gender and address properties.
 *  To achieve this, you need to get the users first, then make separate network call for each user to fetch his address. 
 *  This can be done easily using FlatMap operator.
 * */


//public class FlatmapOperator {
//
//	static List<Employee> employeeList = new ArrayList<>();
//	static String locality[]={"Sec120" , "Sec 50" , "Sec 10" , "Sec 45"};
//	static String city[]={"Noida" , "Ghaziabad" , "Lucknow" , "Kanpur"};
//	
//	public static void main(String[] args) {
//		
//		employeeList.add(new Employee("Obama","55"));
//		employeeList.add(new Employee("Lint","58"));
//		employeeList.add(new Employee("Trunk","36"));
//		employeeList.add(new Employee("Mild","12"));
//		
//		getEmployeeObservable().flatMap(new Function<Employee, Observable<Employee>>() {
//
//			@Override
//			public Observable<Employee> apply(Employee t) throws Exception {
//				// TODO Auto-generated method stub
//				return getEmployeeAddress(t);
//			}
//		})
//		.subscribe(new Observer<Employee>() {
//
//			@Override
//			public void onSubscribe(Disposable d) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void onNext(Employee t) {
//				// TODO Auto-generated method stub
//				System.out.println(t.getAge() + "  "+t.getEmpName()+"  "+t.getAddress().getCity()+" "+t.getAddress().getLocality());
//			}
//
//			@Override
//			public void onError(Throwable e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void onComplete() {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		
//	}
//	static int i=0;
//	static Observable<Employee> getEmployeeAddress(Employee emp){
//		return Observable.create(new ObservableOnSubscribe<Employee>() {
//
//			@Override
//			public void subscribe(ObservableEmitter<Employee> e) throws Exception {
//				// TODO Auto-generated method stub
//				if(!e.isDisposed()){
//					Address address = new Address(locality[i] , city[i]);
//					emp.setAddress(address);
//					// Generate network latency of random duration
//                    int sleepTime = new Random().nextInt(1000) + 500;
//
//                    Thread.sleep(sleepTime);
//					e.onNext(emp);
//					e.onComplete();
//					i++;
//				}
//			}
//		});
//	}
//	
//	
//	
//	
//	
//	static Observable<Employee> getEmployeeObservable(){
//		return Observable.create(new ObservableOnSubscribe<Employee>() {
//
//			@Override
//			public void subscribe(ObservableEmitter<Employee> e) throws Exception {
//				// TODO Auto-generated method stub
//				if(!e.isDisposed()){
//					for (Employee employee : employeeList) {
//						e.onNext(employee);
//					}
//				}
//			}
//		});
//	}
//}
//
//
//
//class Employee{
//	
//  private String empName;
//  private String age;
//  Address address;
//  
//  
//  
//public String getEmpName() {
//	return empName;
//}
//
//
//
//public void setEmpName(String empName) {
//	this.empName = empName;
//}
//
//
//
//public String getAge() {
//	return age;
//}
//
//
//
//public void setAge(String age) {
//	this.age = age;
//}
//
//
//
//
//
//
//public Address getAddress() {
//	return address;
//}
//
//
//
//public void setAddress(Address address) {
//	this.address = address;
//}
//
//
//
//public Employee(String empName, String age) {
//	super();
//	this.empName = empName;
//	this.age = age;
//}
//  
//  
//}
//class Address{
//	
//	private String locality;
//	private String city;
//	public Address(String locality, String city) {
//		super();
//		this.locality = locality;
//		this.city = city;
//	}
//	public String getLocality() {
//		return locality;
//	}
//	public void setLocality(String locality) {
//		this.locality = locality;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//}