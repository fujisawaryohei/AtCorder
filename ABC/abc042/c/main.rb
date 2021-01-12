n = gets.split(' ').map(&:to_i)
d = gets.split(' ').map(&:to_i)
notd = []
bool = []
ans = []
i = 0
length = n[0].to_s.split('').length
0..10.times do |i|
  if !d.include?(i)
    notd.push(i)
  end
end
while n[0] <= 9999 do
  while i <= length-1 do
    str = n[0].to_s.split('').map(&:to_i)
    bool[i] = true if notd.include?(str[i])
    bool[i] = false if !notd.include?(str[i])
    if !bool.include?(false)
      ans.push(n[0])
      break
    end
    i += 1
  end
  i = 0; bool=[];
  n[0] += 1
end
puts ans.min