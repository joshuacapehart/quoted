package qotd

import grails.transaction.Transactional

@Transactional
class QuoteService {

	def getStaticQuote() {
		return new Quote(author: "Frank", content: "I am frank")
	}
    def getRandomQuote() {
    	def allQuotes = Quote.list()
    	def randomQuote = null
    	if(allQuotes.size() > 0) {
    		def randomIndex = new Random().nextInt(allQuotes.size())
    		randomQuote = allQuotes[randomIndex]
		} else {
    		randomQuote = getStaticQuote()
    	}
    }
}
