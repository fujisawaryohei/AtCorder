input_a = gets.chomp!.split('')
input_b = gets.chomp!.split('')
input_c = gets.chomp!.split('')
target = input_a[0]
def game(a, b, c, target)
  if target == "a"
    if a.count == 0
      puts "A"
      exit
    end
    target = a.shift()
    game(a,b,c,target)
  end
  if target == "b"
    if b.count == 0
      puts "B"
      exit
    end
    target = b.shift()
    game(a,b,c,target)
  end
  if target == "c"
    if c.count == 0
      puts "C"
      exit
    end
    target = c.shift()
    game(a,b,c,target)
  end
end
game(input_a, input_b, input_c, target)