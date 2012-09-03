# Grails clickstart

This clickstart sets up a database, build service, repository and a 
basic Grails ORM application. 

Note: You will need to have the Grails plugin installed on Jenkins before being able to use this ClickStart project.

<a 
href="https://grandcentral.cloudbees.com/?CB_clickstart=https://raw.github.com/CloudBees-Community/grails_template/master/clickstart.json"><img 
src="https://s3.amazonaws.com/cloudbees-downloads/clickstart/clickstart-now.png"/></a>

Launch this clickstart and glory could be yours too ! Use it as a 
building block if you like.

You can launch this on Cloudbees via a clickstart automatically, or 
follow the instructions below. 

# Deploying manually:

## To deploy this on CloudBees, follow those steps:

Create application:

    bees app:create MYAPP_ID

In the configuration tab of your application on cloudbees.com, choose Java EE 6 as your application container.

Create database:

    bees db:create -u DB_USER -p DB_PASSWORD DBNAME

Bind database as datasource:

    bees app:bind -db DBNAME -a MYAPP_ID -as GrailsDB

Add 'Jenkins Grails plugin' to your Jenkins plugins

Create a new software project in Jenkins, changing the following:

* Add this git repository (or yours with this code) on Jenkins
* In build, Add build step -> Build with Grails with:

        Grails Installation: Grails 2.0.4
        Targets: war

* Also check "Deploy to CloudBees" with those parameters:

        Applications: First Match
        Application Id: MYAPP_ID
        Filename Pattern: target/*.war

## To build this locally:

In the project directory, open a command line and, with Grails 2.0.4 installed, type "grails war" to build the war file, deploy it on cloudbees typing:

    bees app:deploy -t jboss -a MYAPP_ID target/*.war

## To run this locally:

Once you have Grails 2.0.4 installed, open a command line in the project directory and type "grails run-app". You can then browse to localhost:8080/grails_template and see your project up and running.
