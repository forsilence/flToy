#include "flvmToy.h"
#include<iostream>
#include "jni.h"

JNIEXPORT 
jint
JNICALL  
Java_com_fsilence_flToy_Main_run(JNIEnv *env, jobject obj)
{
  std::cout << "hello, cpp native " << std::endl;
  return 0;
}
