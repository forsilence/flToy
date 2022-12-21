package com.fsilence.flToy;

public class Main {
  static {
    System.loadLibrary("flvmToy");
  }
  public native static int run();

  public static void main(String[] args) {
    System.out.println("hello, Java main");
    run();
  }
}
