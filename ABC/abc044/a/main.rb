input = readlines.map{|i| i.chomp!.to_i }
price = input[2]
ans = 0
input[0].times do |i|
  price = input[3] if i == input[1]
  ans += price
end
puts ans