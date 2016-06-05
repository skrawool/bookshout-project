require 'rest-client'
require 'json'

book_id = ARGV[0]
tax_rate = ARGV[1].to_f

url = "https://www.bookshout.com/api/books/#{book_id}.json"
response = RestClient.get url, {:accept => :json}

current_price = ((JSON.parse(response))["current_price"][1..-1]).to_f
total_price = current_price*(1+tax_rate)

puts "Deception - $#{'%.2f' % total_price}"