package grails_template
import main.Item

class MainController {
	def index() {
		[items: Item.list()]
	}

    def addItem(String name, String comment){
    	new Item(name: name, comment: comment).save()
        redirect(uri: "/")
    }
    def removeItem(String name){
    	Item.findByName(name).first().delete()
        redirect(uri: "/")
    }
}
