To deploy this on CloudBees, follow those steps:

Create application:
	bees app:create MYAPP_ID

Create database:
	bees db:create -u DB_USER -p DB_PASSWORD DBNAME

Bind database as datasource:
	bees app:bind -db DBNAME -a MYAPP_ID -as PlayDB

Add 'Jenkins Grails plugin' to your Jenkins plugins

Create a new software project in Jenkins, changing the following:
	- Add this git repository (or yours with this code) on Jenkins
	- In build, Add build step -> Build with Grails with:
		Grails Installation: Grails 2.0.3
		Targets: war
	- Also check "Deploy to CloudBees" with those parameters:
		Application Id: MYAPP_ID
		Filename Pattern: target/*.war