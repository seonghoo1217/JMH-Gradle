package chapter;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class Case04 {
	// String vs StringBuffer vs StringBuilder
	static int target=50001;

	@Benchmark
	public String useStringCase(){
		String fetch="";
		for (int i=1;i<target;i++){
			fetch+=String.valueOf(i);
		}
		return fetch;
	}

	@Benchmark
	public StringBuffer useStringBufferCase(){
		StringBuffer buffer=new StringBuffer();
		for (int i=1;i<target;i++){
			buffer.append(i);
		}
		return buffer;
	}

	@Benchmark
	public StringBuilder useStringBuilderCase(){
		StringBuilder sb=new StringBuilder();
		for (int i=1;i<target;i++){
			sb.append(i);
		}
		return sb;
	}
}
