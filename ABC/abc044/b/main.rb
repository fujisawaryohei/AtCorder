input = gets.chomp!.split('')
str = input.uniq
ans_arr = []
str.each do |i|
  count = 0
  input.each do |j|
    if i == j
      count += 1
    end
  end
  ans_arr.push(count)
end
ans = ans_arr.select{|i| i % 2 == 0 }
puts "Yes" if str.count == ans.count
puts "No" if str.count != ans.count