package grails_template
import main.Item

class MainController {
	def index() {
		[items: Item.list()]
	}

    def addItem(String name, String comment){
    	def item = new Item(name: name, comment: comment)
    	item.save()
    }
    def removeItem(String name){
    	Item.findByName(name).first().delete()
    }
}
