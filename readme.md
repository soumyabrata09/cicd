##This repository is consisting the CI/CD Jenkins resources

**Pre-Requisite**
 - Gradle in local
 - JDK / Groovy
 - Docker in local
 
**TO Run the Jenkins**
````
./gradlew docler dockerRun
````

> **[Video guide to initial Jenkins Setup](https://www.youtube.com/watch?v=s7dw0ahriQY)**

_Docker troubleshooting commands_
> $ docker ps [ To list containers ]

> $ docker images [ To list down the images ]

> $ docker image rm --force IMAGE_ID [ To delete the image forcefully ]

> port forwarded from default 8080 to 8101

> [To find the PID running on a specific port to forcefully stop them] 

> netstat -ano | findstr < Port Number >

> taskkill /F /PID < Process Id > { prepend an extra '/' if using unix filesystem} 

[Guidance to write well formatted readme file](https://docs.github.com/en/github/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)