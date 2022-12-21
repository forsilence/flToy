#include "flvmToy.h"
#include<iostream>
#include "jni.h"

#ifdef __cplusplus
extern "C"{
#endif

JNIEXPORT 
jint
JNICALL  
JAVA_com_fsilence_flToy_Main_run(JNIEnv *env, jobject obj)
{
  std::cout << "hello" << std::endl;
  return 0;
}

#ifdef __cplusplus
}
#endif