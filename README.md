# healenium-example-maven
Java + Maven + Junit5 project with healenium usage example 

## How to start
### 1.Start Healenium backend from infra folder

```cd infra```

```docker-compose up -d```

Verify that images ```healenium/hlm-backend:latest``` and ```postgres:11-alpine``` are up and running


### 2.Run test in terminal with maven

```mvn clean test```

### 3.After test execution you should see generated report link in command line logs

![img.png](img.png)

Report contains only healed locators with old-new values and a button that tells if healing was successful for further algorithm corrections

![img_1.png](img_1.png)