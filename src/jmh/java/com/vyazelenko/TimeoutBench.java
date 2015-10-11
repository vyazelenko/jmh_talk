package com.vyazelenko;

import org.openjdk.jmh.annotations.*;

@BenchmarkMode(Mode.SingleShotTime)
@State(Scope.Benchmark)
public class TimeoutBench {
    @Setup(Level.Iteration)
    public void setUp() throws Exception {
        Thread.sleep(2500);
    }

    @TearDown(Level.Iteration)
    public void tearDown() throws Exception {
        Thread.sleep(3500);
    }

    @Benchmark
    public void bench() throws Exception {
        Thread.sleep(1500);
    }
}
