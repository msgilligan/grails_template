package org.template

class User {

	String name
	String email

    static constraints = {
    	name(blank: false)
    }
}
