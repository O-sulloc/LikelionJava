# Likelion Java


<details>
<summary>Day 3</summary>
<div markdown="1">

## 목차

### 1. [FileReader](#FileReader)

### 2. [BufferedReader](#BufferedReader)

### 3. [Files](#Files)

---


## 1. FileReader

자바의 FileReader 클래스를 사용해서 텍스트 파일을 읽을 수 있다.

FileReader 클래스는 java.io.InputStreamReader 클래스를 상속 받는다. InputStreamReader 클래스의 read() 메소드를 통해 char를 한 글자씩 불러올 수 있다.

```java
public int read()throws IOException
```

> read() 메소드는 텍스트 파일에서 한 글자씩 글자를 읽어서 하나의 char를 **int형** 으로 리턴한다. 더 이상 읽을 글자가 없으면, -1을 리턴한다.
---

## 2. BufferedReader

FileReader보다 효율적으로 파일을 읽을 수 있다.

```java
public BufferedReader(Reader in)
public BufferedReader(Reader in,int sz)
```

> 첫 번째 파라미터에는 Reader의 객체가 들어간다.
> 두 번째 파라미터로는 buffre 사이즈를 지정할 수 있다.
---

## 3. Files

static 메소드로 구성되어 있으며, 텍스트 파일 전체 내용을 List, 배열, String에 넣을 수 있다.

</div>
</details>