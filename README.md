
# API Versioning in Spring Boot

This project is to determine the difficulty of initial implementation and upkeep for both individual and multiple simultaneous versioning schemes. Using Spring Boot.

Being evaluated are:
* imperative (ccontrollers/services)
* functional (routes/handlers)





## Background

There are several ways to version your API and, [according to Troy Hunt, they're all wrong](https://www.troyhunt.com/your-api-versioning-is-wrong-which-is). It's been the better part of a decade since I read his article as a newbie software developer and in that time I haven't found any cause to disagree.

We have a variety of options when looking at some large names in the tech world.

* GitHub    - "accept header"
* Microsoft - custom headers
* Twitter   - URI versioning
* Amazon    - request parameter


