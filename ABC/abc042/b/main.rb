input = gets.split(' ').map(&:to_i)
line = readlines.map(&:chomp)
sorted_str = line.sort
ans = ''
i = 0
while i < input[0] do
  ans += sorted_str[i]
  i += 1
end
puts ans
