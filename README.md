# REST API project

This project has been developed to give a simple maven archetype to build a RESTful API using Java and Play Framework.

Look how easy it is to use:

	# compilation 
	mvn clean install
    # packaging archetype
    mvn archetype:jar 
    # install archetype in local maven archetype catalog
    mvn archetype:update-local-catalog 
    # create a new project form this archetype (interactive mode)
    mvn archetype:generate 


## Features

### Functionalities
- Maven archetype
- Play Framework commands integrated in Maven lifecycle
- Multi-module application (core and RESTful API)


### Technical features
- Swagger framework to give an interactive documentation of REST API (light AJAX client)
- Using Play framework to generate an embedded web app with no dependency against OS
- Using CSS Bootstrap framework for styling
- RESTful architecture


## Archetype Installation

Compile sources from scratch:

    mvn clean install 
    # packaging archetype
    mvn archetype:jar 
    # install archetype in local maven archetype catalog
    mvn archetype:update-local-catalog 
    # create a new project form this archetype (interactive mode)
    mvn archetype:generate 

Package archetype:

    mvn archetype:jar

Deploy in local catalog:

    mvn archetype:update-local-catalog 

## Project generated from the archetype Installation

    # create a new project from this archetype (interactive mode)
    mvn archetype:generate 

Do some development :)

    # Compile all sources from scratch
    mvn clean install
    # Run locally your application (in dev mode)
    mvn play2:run -pl rest-api-generic-interface
    # Create your project artifact for deployment
    mvn deploy

Deploy your own Web User Interface application:

    unzip /path/to/<project-archive> /path/to/target/dir/.
    /path/to/target/dir/<project-name>/start -Dhttp.port=1234 -Dhttp.address=127.0.0.1 -Dconfig.file=/opt/conf/prod.conf -Dlogger.file=/opt/prod/prod-logger.xml -Dpidfile.path=/var/run/play.pid

## Contribute

- Issue Tracker: https://github.com/josanly/rest-api-archetype/issues
- Source Code: https://github.com/josanly/rest-api-archetype

## Support

If you are having issues, please let us know.

We have a mailing list located at: rest-api-project@google-groups.com

-------------------

## License

#### The project is licensed under the GPL license.

Copyright (C) 2015 Adrien JOSSO

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see http://www.gnu.org/licenses

#### The project documentations are licensed under the GFDL license.

Copyright (C)  2015  Adrien JOSSO.

Permission is granted to copy, distribute and/or modify this document
under the terms of the GNU Free Documentation License, Version 1.3
or any later version published by the Free Software Foundation;
with no Invariant Sections, no Front-Cover Texts, and no Back-Cover Texts.

A copy of the license is included in the section entitled "GNU
Free Documentation License".
