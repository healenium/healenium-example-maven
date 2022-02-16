# healenium-example-maven
Java + Maven + Junit5 project with healenium usage example 

## How to start
### 1.Start Healenium backend from infra folder

```cd infra```

```docker-compose up -d```

Verify that images ```healenium/hlm-backend:3.2.0``` and ```postgres:11-alpine```  and ```healenium/hlm-selector-imitator:1``` are up and running

### 2. Project structure
```
|__pom.xml	
``` 
			   
### 3.Run test in terminal with maven

 

### 4.After test execution you should see generated report link in command line logs

![img.png](img.png)

Report contains only healed locators with old-new values and a button that tells if healing was successful for further algorithm corrections

![img_1.png](img_1.png)

### 5. Screenshots 

Also you could take a screenshots for your com.epam.healenium.tests like it implements here: BaseTest.screenshot
```
  public byte[] screenshot() {
      return ((TakesScreenshot) driver.getDelegate()).getScreenshotAs(OutputType.BYTES);
  }
```
### 6. @DisableHealing annotation

If don't want to use Healenium in some methods just use @DisableHealing annotation. 
> The example of usage you can find here: MainPageWithFindBy.checkLocatorTestButtonDontHealing 

![img_2.png](img_2.png)

### 7. Plugin Healenium for Intellij IDE

For updating broken locators you could use Plugin "Healenium" for Intellij IDE (https://plugins.jetbrains.com/plugin/14178-healenium).

With this plugin you can update your locators:
* on class level

![update_on_class_level](img_6.png)
* or on variable level

![update_on_class_level](img_5.png)

![element_update](img_4.png)
