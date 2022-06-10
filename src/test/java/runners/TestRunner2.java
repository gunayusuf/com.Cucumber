package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@pr2",
        dryRun = false      )



public class TestRunner2 {
    /*
    Bir framework'de bir tek Runner class'i yeterli olabilir
    Runner class'inda class body'sinde hicbir sey olmaz
    Runner class'imizi onemli yapan 2 adet annotation vardir
    @RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz

    features : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
    glue : stepDefinitions dosyalarini nerede bulacagimizi gosterir
    tags : o an hangi tag'i calistirmak istiyorsak onu belli eder
    dryRun : iki secenek var
    dryRun=true; yazdigimizda testimizi calistirmadan sadece eksik adimlari bize verir
    dryRun=false yazdigimizda testlerimizi calistirir
     */


    //  PARALEL CALİSTİRMAK İCİN DİKKAT EDİLMESİ GEREKENLER

    /*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    cucumberda paralel calistirmak icin pom xmldeki
    <artifactId>maven-surefire-plugin</artifactId>
    <artifactId>maven-failsafe-plugin</artifactId>
    taglari onemlidir
    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    ne kadar cok paralel calistirmak istedigimiz test varsa
    ona gore o kadar testrunner class'i olusturmamiz gerekir
    testrunner class'i ile pom.xml icerisinde bulunan surefire taginin altinda olan
    <threadCount> 2 </threadCount> dikkat etmek gerekir bende 2 tane testrunner classim oldugu icin
    threadCount tagini 2 olarak belirledim ne kadar cok istersem bu sayiyi classla beraber uygun olacak
    sekilde artirabilirim, !!!<threadCount>!!! İLE TestRunner Class'i uyumlu sayida olmali!!!

    Daha sonra intellij terminalden mvn clean verify kodu ile  NOTASYON TAGLARİNİ BELİRLEDİGİMİZ test
    sceneriolarimizi calistirip target altinda olusan html uzantili dosyalardan open in browser secenegi
    ile test sonuclarimizi goruntuleyebiliriz

    mvn clean verify terminalde yazip enterladigimizda hata verir ise CTRL+Enter yapmayi deneyebiliriz
    Diger bir secenek ise Sag ust tarafta bulunan Maven yazisina tiklayip daha sonra Lifecycle'in altinda
    bulunan verify secenegine tiklayabiliriz

     */


}
