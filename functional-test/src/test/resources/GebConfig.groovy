import org.openqa.selenium.firefox.FirefoxDriver

reportsDir = 'build/geb-reports/'
baseUrl = System.getProperty('geb.build.baseUrl','http://localhost:8080/')
driver = { new FirefoxDriver() }