input = gets.chomp!.split(' ').map{|s| s.to_i }
alc_info = []
ml = 0
i = 0
while line = gets
  alc_info << line.chomp.split(' ')
end
while i < input[0] do
  ml += alc_info[i][0].to_i * alc_info[i][1].to_i
  if ml > input[1] * 100
    puts i+1
    exit
  end
  i += 1
end
puts -1