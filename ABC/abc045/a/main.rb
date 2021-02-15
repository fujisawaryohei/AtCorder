input_count = 0
input_arr = []
while input_count < 3
  input_arr.push(gets.chomp!.to_i)
  input_count += 1
end
ans = (input_arr[0] + input_arr[1]) * input_arr[2] / 2
puts ans