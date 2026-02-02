package reflection.advanceLevel.customLoggingProxy;

class GreetingImpl implements Greeting {
	public void sayHello(String name) {
		System.out.println("Hello, " + name);
	}
}
