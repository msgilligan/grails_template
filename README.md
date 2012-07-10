# Grails Template for CloudBees.

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

        Grails Installation: Grails 2.0.3
        Targets: war

* Also check "Deploy to CloudBees" with those parameters:

        Applications: First Match
        Application Id: MYAPP_ID
        Filename Pattern: target/*.war


## Note about Grails 2.0.3

This template is made for grails 2.0.3, which might not be available to you anymore, with the further versions being released, if you wish to build / run this locally, you might have to change the version in application.properties to 2.0.X, with the version you currently installed locally. Note that if you wish to build this on Jenkins, you will have to set the version to 2.0.3 or earlier, if you wish to use another version available on Jenkins.

## To build this locally:

In the project directory, open a command line and, with Grails 2.0.3 installed, type "grails war" to build the war file, deploy it on cloudbees typing:

    bees app:deploy -t jboss -a MYAPP_ID target/*.war

## To run this locally:

Once you have Grails 2.0.3 installed, open a command line in the project directory and type "grails run-app". You can then browse to localhost:8000/grails_template and see your project up and running.
