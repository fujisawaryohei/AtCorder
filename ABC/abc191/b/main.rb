n, x = gets.split(" ").map(&:to_i)
a = gets.split(" ").map(&:to_i)
ans = ""
for stri in a do
  next if x == stri
  ans << "#{stri} "
end
puts ans.rstrip!