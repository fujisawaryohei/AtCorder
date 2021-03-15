input = gets.split(' ').map(&:to_i)
count = 0
i = 0
while input.count > i
  if input[i] != input[i+1]
    puts input[i]
    puts input[i+1]
    count += 1
  end
  i += 1
end
puts count