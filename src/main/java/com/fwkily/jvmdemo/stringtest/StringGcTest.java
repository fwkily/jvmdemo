package com.fwkily.jvmdemo.stringtest;


/**
 * -Xms15m -Xmx15m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails
 *String的垃圾回收：
 * [GC (Allocation Failure) [PSYoungGen: 4096K->512K(4608K)] 4096K->528K(15872K), 0.0018195 secs] [Times: user=0.00 sys=0.01, real=0.00 secs]
 * Heap
 *  PSYoungGen      total 4608K, used 3308K [0x00000007bfb00000, 0x00000007c0000000, 0x00000007c0000000)
 *   eden space 4096K, 68% used [0x00000007bfb00000,0x00000007bfdbb130,0x00000007bff00000)
 *   from space 512K, 100% used [0x00000007bff00000,0x00000007bff80000,0x00000007bff80000)
 *   to   space 512K, 0% used [0x00000007bff80000,0x00000007bff80000,0x00000007c0000000)
 *  ParOldGen       total 11264K, used 16K [0x00000007bf000000, 0x00000007bfb00000, 0x00000007bfb00000)
 *   object space 11264K, 0% used [0x00000007bf000000,0x00000007bf004000,0x00000007bfb00000)
 *  Metaspace       used 3152K, capacity 4496K, committed 4864K, reserved 1056768K
 *   class space    used 348K, capacity 388K, committed 512K, reserved 1048576K
 * SymbolTable statistics:
 * Number of buckets       :     20011 =    160088 bytes, avg   8.000
 * Number of entries       :     12327 =    295848 bytes, avg  24.000
 * Number of literals      :     12327 =    474840 bytes, avg  38.520
 * Total footprint         :           =    930776 bytes
 * Average bucket size     :     0.616
 * Variance of bucket size :     0.618
 * Std. dev. of bucket size:     0.786
 * Maximum bucket size     :         6
 * StringTable statistics:
 * Number of buckets       :     60013 =    480104 bytes, avg   8.000
 * Number of entries       :     50143 =   1203432 bytes, avg  24.000
 * Number of literals      :     50143 =   2818416 bytes, avg  56.208
 * Total footprint         :           =   4501952 bytes
 * Average bucket size     :     0.836
 * Variance of bucket size :     0.654
 * Std. dev. of bucket size:     0.809
 * Maximum bucket size     :         5
 */
public class StringGcTest {


    public static void main(String[] args) {
//        for (int i = 0; i < 100000; i++) {
//            String.valueOf(i).intern();
//        }
        int a = 5;
        String s = null;
        s = a == 0 ? "0": a==1 ? "1" : "2";
        System.out.println(s);
    }
}
