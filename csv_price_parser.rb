require 'csv'

csv_path = ARGV[0]
no_of_books = 0
sum_price = 0.0
most_exp = "None"
least_exp = "None"
max_price = -1
min_price = 99999999        

CSV.foreach(csv_path) do |row|
  price = row[1].to_f
  no_of_books += 1
  sum_price += price

  if max_price < price
  	max_price = price
  	most_exp = row[0]
  end

  if min_price > price
  	min_price = price
  	least_exp = row[0]
  end
end

puts "Most Expensive: #{most_exp}"
puts "Least Expensive: #{least_exp}"
puts "Average Book Price: #{'%.2f' % (sum_price/no_of_books)}"