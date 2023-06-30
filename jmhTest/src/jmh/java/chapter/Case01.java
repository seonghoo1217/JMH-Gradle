/*
package chapter;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class Case01 {
	//ArrayList vs Stream
	private List<Integer> list;

	@Setup
	public void initialize(){
		list=new ArrayList<>();
		for (int i=0;i<5000;i++){
			list.add(i);
		}
	}

	@Benchmark
	public void ArrayListBenchMark(Blackhole blackhole){
		blackhole.consume(ArrayListMethod(list));
	}

	@Benchmark
	public void StreamBenchMark(Blackhole blackhole){
		blackhole.consume(StreamMethod(list));
	}

	private List<Integer> ArrayListMethod(List<Integer> list) {
		List<Integer> result=new ArrayList<>();
		for (Integer val:list){
			if (val % 5==0){
				result.add(val);
			}
		}
		return result;
	}

	private List<Integer> StreamMethod(List<Integer> list){
		return list.stream().filter(val -> val % 5==0).collect(Collectors.toList());
	}

//	public static void main(String[] args) {
//		new OptionsBuilder()
//				.include(Redu)
//	}
}
*/
