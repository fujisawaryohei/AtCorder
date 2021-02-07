input = gets.split(" ").map(&:to_i)
if input[3] >= input[1]*input[0] && input[3] <= input[2]*input[0]
  puts "No"
else
  puts "Yes"
end