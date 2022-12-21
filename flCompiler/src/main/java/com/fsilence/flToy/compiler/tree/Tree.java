package com.fsilence.flToy.compiler.tree;

public interface Tree {

  <I,O> O accept(TreeVisitor<I,O> visitor, I in);

  default <T> T accept(TreeVisitor<?,T> visitor){
    return accept(visitor, null);
  }
}
