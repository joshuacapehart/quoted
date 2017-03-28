package qotd

class QuoteController {
	static scaffold = true

	def quoteService

    def random() {
    	def randomQuote = quoteService.getRandomQuote()
    	[quote: randomQuote]
    }
}
