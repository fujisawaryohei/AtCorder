## How to test and submit

テスト実行コマンド（ -c [コマンド] / -d [テスト入出力データのディレクトリ] ）
```
oj t -c "ruby main.rb" -d "tests/"
```

提出 ｜ s はsubmitの省略名。内部で `oj s` を呼び出してます。

```
acc s main.rb
```

## I'm publishing AtCorder's Answer

### A - Entrance Examination with Rubyi
https://atcoder.jp/contests/abc117/tasks/abc117_a
```
input = gets.chomp
arr = input.split(' ').map{|x| x.to_i}
answer = arr[0] / arr[1].to_f #整数を返す仕様なのでここでto_f
p answer
```
## AtCoder Beginners Selection

### A - はじめてのあっとこーだー（Welcome to AtCoder) with Ruby
https://atcoder.jp/contests/abs/tasks/abc086_a
```
input = gets.chomp
input1 = gets.chomp
input3 = gets.chomp
oneLine = input.to_i
twoLine = input1.split(' ').map{|a| a.to_i}
print("#{oneLine + twoLine[0] + twoLine[1]}\s#{input3}\n")
```

### ABC086A - Product with Ruby
https://atcoder.jp/contests/abs/tasks/abc086_a
```
input = gets.chomp
arr = input.split(' ').map{|x| x.to_i}
answer = arr[0] * arr[1]
print "Even\n" if answer.even?
print "Odd\n" if answer.odd?
```

### ABC086A - Product with Scala
https://atcoder.jp/contests/abs/tasks/abc086_a
```
import java.util.Scanner

object Main {
  def main(args:Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val a,b = sc.nextInt()
    def isOdd: Boolean = (a * b) % 2 == 1
    def result: String = if (isOdd) "Odd" else "Even"
    println(result)
  }
}
```

### ABC081A - Placing Marbles with Ruby
https://atcoder.jp/contests/abs/tasks/abc081_a
```
input = gets.chomp
count = input.split(//).map{|x| x.to_i}.count(1)
answer = count != 0 ? count :  0
print answer
```

### ABC081A - Placing Marbles with Scala
https://atcoder.jp/contests/abs/tasks/abc081_a
```
import java.util.Scanner

object Main {
  def main(args:Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val list: List[String] = sc.nextInt().toString.split("").toList
    println(list.count( _ == "1"))
  }
}
```

### ABC081B - Shift only with Ruby
https://atcoder.jp/contests/abs/tasks/abc081_b
```
input1 = gets.chomp.to_i
input2 = gets.chomp
array = input2.split(" ").map{|x| x.to_i}
counter = 0
def counting(array,input,counter)
  evenCount = array.count{|arr| arr % 2 == 0}
  arr = []
  i = 0
  if evenCount == array.length
    array.each do |a|
      arr[i] = a / 2
      i += 1
    end
    counter += 1
    counting(arr,arr.length,counter)
  else
    print counter
  end
end
counting(array,input1,counter)
```

### ABC081B - Shift only with Scala
https://atcoder.jp/contests/abs/tasks/abc081_b
```
import java.util.Scanner
object Main {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val list: List[Int] = List.fill(sc.nextInt)(sc.nextInt)

    def div(src: List[Int], count: Int): Int = {
      if (src.exists( _ % 2 == 1)) count
      else div(src.map( _ / 2), count + 1)
    }
    println(div(list,0))
  }
}
```

### ABC087B - Coins with Ruby
https://atcoder.jp/contests/abs/tasks/abc087_b
```
A = gets.to_i
B = gets.to_i
C = gets.to_i
X = gets.to_i
count = 0
for a in 0..A do
  for b in 0..B do
    for c in 0..C do
      count += 1 if (a * 500) + (b * 100) + (c * 50) == X
    end
  end
end
p count
```

### ABC087B - Coins with Scala
https://atcoder.jp/contests/abs/tasks/abc087_b
```
import java.util.Scanner
object Main {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val A = sc.nextInt
    val B = sc.nextInt
    val C = sc.nextInt
    val X = sc.nextInt
    var count = 0
    (0 to A).toList.map((a) => (0 to B).map((b) => (0 to C).map((c)=> (
      if(a * 500 + b * 100 + c * 50 == X){
        count = count + 1
      }
      ))))
    println(count)
  }
}
```

### ABC083B - Some Sums with Ruby
https://atcoder.jp/contests/abs/tasks/abc083_b
```
input = gets.chomp.split(' ')
N = input[0].to_i
A = input[1].to_i
B = input[2].to_i
i = 0
array1 = (1..N).to_a.select{|x| x.to_s.length == 1}.select{|y| y >= A && y <= B}
array2 = []
(1..N).to_a.collect do |arr|
  if arr.to_s.length != 1#2けた抽出
    hitoketa = arr.to_s.split(//).map{|x| x.to_i}.reduce(0){|x,y| x + y}
    if hitoketa >= A && hitoketa <= B
      array2[i] = arr
      i += 1
    end
  end
end
array3 = array1 + array2
print array3.inject(:+)

```

### ABC083B - Some Sums with Scala
https://atcoder.jp/contests/abs/tasks/abc083_b
```
import scala.io._

object Main {
  def main(args: Array[String]): Unit = {
    val lines = Source.stdin.getLines()
    val list = lines.next().split(" ").map(_.toInt).toList
    val array1 = (1 to list(0)).filter(_.toString.length == 1).filter(x => x >= list(1) && x <= list(2))
    val arr = (1 to list(0)).filter(_.toString.length != 1).map(_.toString.split("")).map(_.toList).map(x => x.filter(_.length == 1)).map(_.map(_.toInt)).filter(x => x.sum >= list(1) && x.sum <= list(2))
    val array2 = arr.map(x => x.map(_.toString)).map(_.reduceLeft((a,b) => a + b)).map(_.toInt)
    val array3 = array1 ++ array2
    println(array3.sum)
  }
}
```

### ABC088B - Card Game for Two with Ruby
https://atcoder.jp/contests/abs/tasks/abc088_b
```
N = gets.chomp.to_i
card = gets.chomp.split(" ").map{|x| x.to_i}
aliceScore = []
bobScore = []
card.sort!{|x,y| y <=> x}
card.each_index do |i|
  if i % 2 == 0
    aliceScore.push(card[i])
  else
    bobScore.push(card[i])
  end
end
ans = aliceScore.inject(:+) - bobScore.inject(:+)
print ans
```

### ABC088B - Card Game for Two with Scala
https://atcoder.jp/contests/abs/tasks/abc088_b
```
import java.util.Scanner
object Main {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val int = sc.nextInt
    val list = List.fill(int)(sc.nextInt)
    val sortlist = list.sortWith((x,y) => x > y)
    val alice = (0 to int - 1).filter(_ % 2 == 0).map((x) => sortlist(x))
    val bob = (0 to int - 1).filter(_ % 2 != 0).map((y) => sortlist(y))
    println(alice.foldLeft(0){_ + _} - bob.foldLeft(0){_ + _})
  }
}
```

### ABC085B - Kagami Mochi with Ruby
https://atcoder.jp/contests/abs/tasks/abc085_b
```
arr = readlines.map{|x| x.chomp.to_i}
mochiLength = Array.new
(0..arr[0]-1).to_a.each_index{|idx| mochiLength[idx] = arr[idx+1]}
print mochiLength.uniq.length
```

### ABC085B - Kagami Mochi with Scala
https://atcoder.jp/contests/abs/tasks/abc085_b
```
import java.util.Scanner

object Main{
  def main(args: Array[String]): Unit ={
    val sc = new Scanner(System.in)
    val times = sc.nextInt
    val list: List[Int] = List.fill(times)(sc.nextInt)
    println(list.distinct.length)
  }
}
```

### ABC085C - Otoshidama with Ruby
https://atcoder.jp/contests/abs/tasks/abc085_c
```
input= gets.chomp.split(" ").map(&:to_i)
N = input[0]
Y = input[1]
ans = []
(0..N).each do |x|
  (0..N-x).each do |y|
    z = N - x - y
    if x*10000 + y*5000 + z*1000 == Y
      ans = [x,y,z]
    end
    if ans.empty?
      ans = [-1,-1,-1]
    end
  end
end
print("#{ans[0]}\s#{ans[1]}\s#{ans[2]}")
```

### ABC085C - Otoshidama with Scala
https://atcoder.jp/contests/abs/tasks/abc085_c
```
import java.util.Scanner

object Main{
  def main(args: Array[String]):Unit = {
    val sc = new Scanner(System.in)
    val list :List[Int]= List(sc.nextInt,sc.nextInt).map(x=>x.toInt)
    val n :Int= list(0)
    val en :Int= list(1)
    var ans :List[Int]= List(-1,-1,-1)
    for {x <- 0 to n}{
      for {y <- 0 to n-x}{
        var z :Int= n - x - y
         if(x*10000 + y*5000 + z*1000 == en){
           ans = List(x,y,z)
         }
      }
    }
    println(s"${ans(0)} ${ans(1)} ${ans(2)}")
  }
}
```

### ABC049C - 白昼夢 / Daydream with Scala
https://atcoder.jp/contests/abs/tasks/arc065_a
```
import java.util.Scanner
object Main{
  def judgeInclude(s :String,sSeq :Seq[String]): Boolean = {
    var sTemp = s
    while(true){
      sSeq.find(t => sTemp.endsWith(t)) match {
        case Some(t) =>
          if(t == sTemp){
            return true
          } else {
            sTemp = sTemp.dropRight(t.length)
          }
        case _ =>
          return false
      }
    }
    return false
  }
  def main(args :Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val s = sc.next()
    val sSeq = Seq("dreamer","eraser","dream","erase")
    if (judgeInclude(s,sSeq)) {
      println("YES")
    } else {
      println("NO")
    }
  }
}
```

