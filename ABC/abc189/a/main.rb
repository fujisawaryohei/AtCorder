input = gets.chomp!.split('')
a = input.select{|b| input[0] == b }
if a.count == 3
  puts "Won"
else
  puts "Lost"
end