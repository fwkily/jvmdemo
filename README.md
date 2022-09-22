# JVM学习笔记

## 1、双亲委派机制优点：
1）避免类的重复加载

2）保护程序安全，防止核心api被修改(沙箱安全机制)

## 2、在JVM中表示两个class对象是否为同一个类存在两个必要条件：
1）class的完全限定名称（包名+类名）
2）加载这个类的classloader（指classloader实例对象）必须相同


## 3、栈帧包括：
1）局部变量表
2）操作数栈
3）动态链接
4）方法返回地址：存放该方法的Pc寄存器的值
5）一些附加信息
3）、4）、5）是帧数据区

栈顶缓存技术（Tos）

## 非虚方法
如果方法在编译器就确定了具体的调用版本，这个版本在运行时是不可变的，这样的方法称为非虚方法。
静态方法、私有方法、final方法、实例构造器、父类方法都是非虚方法
其他方法称为虚方法。
子类对象的多态性使用前提：1、类的继承关系，2、方法的重写

## 虚方法表
为了提高性能
虚方法表会在类加载的链接阶段被创建并开始初始化，类的变量初始值准备完毕后，虚方法表被初始化。

## 堆
现代垃圾收集器大部分都基于分代收集理论设计，对空间细分为：
java 7及之前堆内存逻辑上分为三部分，新生区 + 养老区 + 永久区
java 8及之后对内容存逻辑分为三部分，新生区 + 养老区 + 元空间

## 方法区
用于存储已被虚拟机加载的类型信息、常量、静态变量、即时编译器编译后的代码缓存等  
  
字符串常量池中是不会存储相同内容的字符串的

![avatar](src/main/java/com/fwkily/picture/string.png)  
![avatar](src/main/java/com/fwkily/picture/string2.png)  
![avatar](src/main/java/com/fwkily/picture/string3.png)  
![avatar](src/main/java/com/fwkily/picture/string4.png)  
![avatar](src/main/java/com/fwkily/picture/string5.png)  
![avatar](src/main/java/com/fwkily/picture/string6.png)  
![avatar](src/main/java/com/fwkily/picture/string7.png)  
![avatar](src/main/java/com/fwkily/picture/string8.png)  

gc

![avatar](src/main/java/com/fwkily/picture/gc/gc1.png)  
![avatar](src/main/java/com/fwkily/picture/gc/gc2.png)  
![avatar](src/main/java/com/fwkily/picture/gc/gc3.png)  
![avatar](src/main/java/com/fwkily/picture/gc/gc_collector.png)  
![avatar](src/main/java/com/fwkily/picture/gc/gc_cms.png)  
![avatar](src/main/java/com/fwkily/picture/gc/endGc.png)  



##### JVM文档
https://docs.oracle.com/javase/specs/
https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-2.html#jvms-2.5.1
##### JVM参数设置文档
https://docs.oracle.com/javase/8/docs/technotes/tools/unix/java.html
https://openjdk.org/jeps/122
https://openjdk.org/jeps/192
#### GC文档  
https://docs.oracle.com/javase/8/docs/technotes/guides/vm/gctuning/toc.html

