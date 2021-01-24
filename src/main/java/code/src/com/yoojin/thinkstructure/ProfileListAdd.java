package code.src.com.yoojin.thinkstructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.jfree.data.xy.XYSeries;

import code.src.com.yoojin.thinkstructure.Profiler.Timeable;

public class ProfileListAdd {
	
	public static void main(String[] args) {
		//profileArrayListAddBeginning();
		//profileArrayListAddEnd();
		//profileLinkedListAddBeginning();
		profileLinkedListAddEnd();
	}
	
	public static void profileArrayListAddEnd() {
	
		Timeable timeable = new Timeable() {	
			
			List<String> list;
			
			@Override
			public void setup(int n) {
				list = new ArrayList<String>();
			}
			
			@Override
			public void timeMe(int n) {
				for(int i=0;i<n;i++) {
					list.add("a string");
				}
			}
			
		};
		
		String title = "ArrayList add end";
		Profiler profiler = new Profiler(title, timeable);
		
		int startN = 4000;
		int emdMillis = 1000;
		XYSeries series = profiler.timingLoop(startN, emdMillis);
		profiler.plotResults(series);
		
	}
	
	/**
	 * Characterize the run time of adding to the beginning of an ArrayList
	 */
	public static void profileArrayListAddBeginning() {
		// TODO: FILL THIS IN!
		//항상 새로운 요소를 리스트 시작에 추가하는 ArrayList.add 메서드를 테스트하는 코드를 작성하라.
		Timeable timeable = new Timeable() {	
			
			List<String> list;
			
			@Override
			public void setup(int n) {
				list = new ArrayList<String>();
			}
			
			@Override
			public void timeMe(int n) {
				for(int i=0;i<n;i++) {
					list.add(0,"a string");
				}
			}
			
		};
		
		int startN = 4000;
		int emdMillis = 10000;
		runProfiler("ArrayList add beginnig", timeable, startN, emdMillis);
		
	}

	/**
	 * Characterize the run time of adding to the beginning of a LinkedList
	 */
	public static void profileLinkedListAddBeginning() {
		// TODO: FILL THIS IN!
		Timeable timeable = new Timeable() {	
			
			List<String> list;
			
			@Override
			public void setup(int n) {
				list = new LinkedList<String>();
			}
			
			@Override
			public void timeMe(int n) {
				for(int i=0;i<n;i++) {
					list.add(0,"a string");
				}
			}
			
		};
		
		int startN = 128000;
		int emdMillis = 2000;
		runProfiler("LinkedList add beginning", timeable, startN, emdMillis);
		
	}

	/**
	 * Characterize the run time of adding to the end of a LinkedList
	 */
	public static void profileLinkedListAddEnd() {
		// TODO: FILL THIS IN!
		Timeable timeable = new Timeable() {	
			
			List<String> list;
			
			@Override
			public void setup(int n) {
				list = new LinkedList<String>();
			}
			
			@Override
			public void timeMe(int n) {
				for(int i=0;i<n;i++) {
					list.add("a string");
				}
			}
			
		};
		
		int startN = 64000;
		int emdMillis = 1000;
		runProfiler("LinkedList add end", timeable, startN, emdMillis);
	}

	/**
	 * Runs the profiles and displays results.
	 * 
	 * @param timeable
	 * @param startN
	 * @param endMillis
	 */
	private static void runProfiler(String title, Timeable timeable, int startN, int endMillis) {
		Profiler profiler = new Profiler(title, timeable);
		XYSeries series = profiler.timingLoop(startN, endMillis);
		profiler.plotResults(series);
	}
	
	
}
