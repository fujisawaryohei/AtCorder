input = gets.split(' ').map(&:to_i)
ans = []
i = 0
f = 0
s = 0
input.each do |i|
  if i == 5
    f += 1
  elsif i == 7
    s += 1
  end
end
if s == 1 && f == 2
  puts 'YES'
else
  puts 'NO'
end
