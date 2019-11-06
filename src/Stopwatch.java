import java.util.ArrayList;

public class Stopwatch {
	
	//======================================================= Properties
	
	private ArrayList<Long> splits = new ArrayList<Long>();
	private long totalTime, startTime, stopTime;
	private boolean isRunning;
	private String units;
	
	//======================================================= Constructor(s)
	
	public Stopwatch() {
		reset();
	}
	
	//======================================================= Methods
	
	public void start() {
		if(isRunning) return;
		isRunning = true;
		startTime = System.nanoTime();
		
	}
	
	public void stop() {
		if(!isRunning) return;
		stopTime = System.nanoTime();
		isRunning = false;
		totalTime += stopTime - startTime;
	}
	
	public long getTotalTime() {
		if(!isRunning) return totalTime;
		return totalTime + (System.nanoTime()- startTime);
	}
	
	public void reset() {
		isRunning = false;
		totalTime = startTime = stopTime = 0;
	}
	
	public void split() {
		if(!isRunning) return;
		splits.add(System.nanoTime()-startTime);
		
	}

	
	//======================================================= Getter(s)
	public ArrayList<Long> getSplits() {
		return splits;
	}
	
	public String setUnits(String s) {
		return "Functionality Not Available yet.";
	}
	
	
}
