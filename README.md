# springSpelScroll
a simple language that relies on Spel for all expressions

## example 
```
DECLARE 
  bob String; 
begin
  bob := SPEL_START 'foo' SPEL_END ;
  bo2 := SPEL_START 'foo' bob SPEL_END;
end;
DECLARE FOO string; begin foo := 1; end;
```
Parses like:

![image](https://github.com/scottccote/spel_scroll/assets/4732892/a6d9bd7a-da65-4764-ae31-f68694435bb0)
