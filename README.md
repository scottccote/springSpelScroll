# springSpelScroll
a simple language that relies on Spel for all expressions

## example 
### example 1
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

### example 2
```
DECLARE
  foo STRING;
  bob STRING;
  bar INTEGER;
  barfloat FLOAT;
BEGIN
  barfloat := 1.1;
  bar := 1;
  foo := 'BAR';
  bob := SPEL_START 'fooobarrr' foo SPEL_END;
END;
```
Parses like:
![image](https://github.com/scottccote/spel_scroll/assets/4732892/e6befaac-a26b-4b63-a9d4-d24184c31a4f)
