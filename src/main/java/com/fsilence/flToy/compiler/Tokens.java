package com.fsilence.flToy.compiler;

public final class Tokens {

  public static class Token{
    private final int pos;
    private final int end;
    private final TokenKind kind;

    public Token(int pos, int end, TokenKind kind) {
      this.pos = pos;
      this.end = end;
      this.kind = kind;
    }

  }

  public static class NamedToken extends Token{
    private final String name;
    public NamedToken(int pos, int end, TokenKind kind, String name) {
      super(pos, end, kind);
      this.name = name;
    }

    public String name(){
      return name;
    }
  }

  public static class StringLiteralToken extends Token{
    private final String literal;
    public StringLiteralToken(int pos, int end, TokenKind kind, String literal) {
      super(pos, end, kind);
      this.literal = literal;
    }

    public String literal(){
      return literal;
    }
  }


  public enum TokenKind{
    EOF(),
    Identifier("", Tag.Named), // identifier
    // basic type - keyword
    BYTE("byte", Tag.Named),
    CHAR("char", Tag.Named),
    INT("int", Tag.Named),
    LONG("long", Tag.Named),
    STRING("string", Tag.Named),
    BOOLEAN("boolean", Tag.Named),
    // control flow
    IF("if"),
    ELSE("else"),
    ELIF("elif"),
    FOR("for"),
    While("while"),
    // literal
    IntLiteral(Tag.Numeric),
    LongLiteral(Tag.Numeric),
    StringLiteral(Tag.StringLiteral),
    True(Tag.Named),
    False(Tag.Named),
    ;

    public final Tag tag;
    public final String name;

    public enum Tag {
      Default,
      Named,
      StringLiteral,
      Numeric;
    }

    TokenKind(String name, Tag _tag){
      this.name = name;
      this.tag = _tag;
    }

    TokenKind(String name){
      this(name, Tag.Default);
    }

    TokenKind(){
      this("");
    }

    TokenKind(Tag tag){
      this("", tag);
    }

  }
}
