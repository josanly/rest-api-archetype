# ${artifactId} project

This project has been generated from the org.josanly.archetypes.wui-pab-archetype maven archetype to build a Web User Interface using Java, Play, AngularJS and Bootstrap Frameworks.

Look how easy it is to use:

    # Compile all sources from scratch
    mvn clean install
    # Run locally your application (in dev mode)
    mvn play2:run -pl rest-api-generic-interface
    # Deploy 
    mvn deploy

To deploy your web interface:

    unzip /path/to/<project-archive> /path/to/target/dir/.
    /path/to/target/dir/<project-name>/start -Dhttp.port=1234 -Dhttp.address=127.0.0.1 -Dconfig.file=/opt/conf/prod.conf -Dlogger.file=/opt/prod/prod-logger.xml -Dpidfile.path=/var/run/play.pid

For more details about the deployment of a play application, refer to the [Play official documentation](https://www.playframework.com/documentation/2.1.x/ProductionConfiguration)

## Features

### Functionalities

- Interactive API documentation (Swagger)
- Bootstrap 3 for layout
- Play Framework commands integrated in Maven lifecycle


### Technical features

- Swagger framework to give an interactive documentation of REST API
- Using Play framework to generate an embedded web app with no dependency against OS
- Using CSS Bootstrap framework for styling

## Project compilation

Compile sources from scratch:

    mvn clean install 

Run locally the interface (dev mode):

    mvn play2:run -pl rest-api-generic-interface

Deploy the project:

    mvn deploy

Install the Web User Interface by running:

    unzip /path/to/${artifactId}-${version}.jar /path/to/target/dir/.
    /path/to/target/dir/${artifactId}-${version}/start -Dhttp.port=1234 -Dhttp.address=127.0.0.1 -Dconfig.file=/opt/conf/prod.conf -Dlogger.file=/opt/prod/prod-logger.xml -Dpidfile.path=/var/run/play.pid

## Contribute

- Issue Tracker: https://github.com/...../${artifactId}-${version}/issues
- Source Code: https://github.com/...../${artifactId}-${version}

## Support

If you are having issues, please let us know.

We have a mailing list located at: .....

-------------------

## License

#### The project is licensed under the GPL license.

Copyright (C) 2015 <your name>

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

Copyright (C)  2015  <your name>

Permission is granted to copy, distribute and/or modify this document
under the terms of the GNU Free Documentation License, Version 1.3
or any later version published by the Free Software Foundation;
with no Invariant Sections, no Front-Cover Texts, and no Back-Cover Texts.

A copy of the license is included in the section entitled "GNU
Free Documentation License".
