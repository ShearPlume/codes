package week3.ObserverDatastream;

public abstract class Observer {
	protected Subject subject;
	public abstract void notifyMe();
}