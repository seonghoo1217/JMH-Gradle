/*
package chapter;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class Case02 {
	//Data Type vs Wrapper Class
	private long N = 100000000L;

	@Benchmark
	public long sumLongType(){
		long result=0;
		for (long i=1L;i<=N;i++){
			result+=i;
		}

		return result;
	}

	@Benchmark
	public Long sumLongWrapper(){
		Long result=0L;
		for (Long i=1L;i<=N;i++){
			result+=i;
		}

		return result;
	}
}
*/
