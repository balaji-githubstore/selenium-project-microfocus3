package com.microfocus.oops;

interface WebDriverDemo{
    public abstract void get(String url);
    String getTitle();
}
interface JavascriptExecutor{
    void executeScript();
}
class ChromeDriver implements WebDriverDemo,JavascriptExecutor
{
    public ChromeDriver(){
        System.out.println("Chrome Launch");
    }
    @Override
    public void get(String url) {
        System.out.println("navigate in chrome");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void executeScript() {
        System.out.println("chrome js");
    }
}

class EdgeDriver implements WebDriverDemo,JavascriptExecutor{
    public EdgeDriver(){
        System.out.println("Edge Launch");
    }
    @Override
    public void get(String url) {
        System.out.println("navigate in edge");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void executeScript() {
        System.out.println("edge js");
    }
}
class DemoX
{

}

public class Demo3Test {
    public static void main(String[] args) {

        WebDriverDemo driver=new EdgeDriver();
        driver.get("j");
        driver.getTitle();

//        driver=new EdgeDriver();
//        driver.get("e");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript();

//        DemoX d= (DemoX) driver;

    }
}
