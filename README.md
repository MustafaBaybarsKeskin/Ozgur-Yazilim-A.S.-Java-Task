# Ozgur Yazilim A.S. Java Task
Bu repository, Ozgur Yazilim A.S. staj kabulu için Java programlama dilinin Spring framework'ü ile ilgili çalışmalar içerir.

## Başlarken
Oluşturulan bu projede basit bir laboratuvar raporlama uygulaması geliştirilmeye çalışılmıştır. Bu projede olması gerekenler ve bazı özellikler şunlardır:

• Hastalara ait raporlar bulunmaktadır. Rapor Tanımı (Dosya numarası (id), Hasta Ad ve Soyad, Hasta Kimlik Numarası (TC), Koyulan Tanı Başlığı, Tanı Detayları, Raporun Verildiği Tarih, Fiziksel Rapora Ait .png/.jpg Formatında Bir Adet Fotoğraf)
• Hasta adı/soyadı, Hasta kimlik numarası, Laborant, adı/soyadı bilgileri ile arama yapılabilmektedir.
• Var olan bir rapor üzerinde değişiklik yapılabilmektedir.
• Var olan tüm raporların detayları incelenebilmektedir.
• Var olan bir rapor silinebilmektedir.

Bu projeyi hazırlamak için Java dilinin Spring framework'ünü kullanacağız.

## Gereksinimler
```
Java
Maven
Spring Boot
JPA
Thymeleaf
Bootstrap
H2 Database
```

### Maven
Maven genellikle Java platformunda yer alan komutların derlenmesi sırasında kullanılan otomasyon ve inşa aracıdır.

Java programlama dili ile uygulama geliştirirken çeşitli kütüphaneler kullanamak isteyebiliriz. Örneğin; Java ile PDF dosyası oluşturmak için Apache PDFBox, iText, JPOD gibi çeşitli kütüphaneleri kullanabiliriz. Her kütüphane için gerekli olan JAR dosyalarını indirmek ve projeye uygun olarak yerleştirmek (classpath) gerekir. Ancak sadece kütüphanelerin indirilmesi ve projeye dahil edilmesi yetmeyecektir. Ayrıca her yeni güncelleme sonrası güncel dosyaların takip edilmesi gerekecektir. Maven proje dosyasına eklenen bağımlılıklar ile kolay bir şekilde indirmeyi ve proje yerleştirmeyi sağlar. Kullanılan kütüphaneler proje dosyasında yer aldığından taşınabilirlik sağlanmış olur. Sunmuş olduğu dizin yapısı sayesinde diğer geliştiricilerin projeyi takibini kolaylaşır.

### Spring Boot
Spring Boot Java programlama dilinde geliştirilen ve Java dilinde güçlü MicroService yazılmasına olanak tanıyan bir frameworktür. Springboot sayesinde backend uygulama geliştirirken veritabanı işlemlerimizi Java ile Language Integrated olarak yazabiliriz ve Springboot tarafından bu işlemler gerçekleştirilir. Aynı zamanda client tarafındaki uygulamalar içinde servis uçları sağlayarak veri girdi-çıktısı oluşturabiliriz.

Springboot ile:
• Daha az veritabanı kodu yazarak daha az vakit kaybı ile daha hızlı geliştirme yapabiliriz.
• Springboot mimarisini anlamak daha kolaydır. Bu sayede daha verimli uygulamalar geliştirilebilmektedir.
• Java programlama dili ile Language Integrated veritabanı komutları yazabilmekteyiz.
• Servis uçları için REST kullanımı sunar ve güçlü bir REST yapılandırmasına sahiptir.
• Birçok yapılandırma otomatik olarak yapılmış durumdadır. İstediğiniz takdirde değiştirebilirsiniz.
• Anotasyonlar kullanarak uygulama ve uygulama içi mimari değişiklikler yapılabilmektedir.
• Kendisine ait bir servlet container bulunur. Bu sayede servis uçlarına gelen istekleri alır işler ve ilgili komutlara yönlendirir.
• Java Bean yönetimi kolaydır. Aynı zamanda istenilen veritabanı yönetimine uygun olarak çalışır..

Springboot nasıl çalışır?
Bir SpringBoot uygulamasının çalışması için 3 temel anotasyon bulunmaktadır:
•@SpringBootApplication
•@EnableAutoConfiguration
•@ComponentScan

@SpringBootApplication anotasyonu uygulamanın giriş metodunu belirtir. Yani halk arasındaki tabir ile main fonksiyondur. Uygulama bu metod ile başlar.

@EnableAutoConfiguration anotasyonu ile uygulama bağlılıkları (dependencies) içerisinde belirtilen yapılandırmaları otomatik olarak çalıştırır. Örnek olarak veritabanı ayarlamasını yapar, REST yapılandırmasını hazırlar ve gerekli olan herşey uygulama için hazır hale gelir.

@ComponentScan anotasyonu ise proje içerisinde tanımlanan bütün komponentleri tarar. Bu sayede modeller, repositoryler servisler, controllerlar vs. hepsi kullanıma hazır hale getirilir.

### JPA (Java Persistance API)
JPA, Java programlama dilinde Java sınıfları ile ilişkisel veritabanı tablolarını ilişkilendirmek için ortaya çıkmış bir standarttır. Burada amaç sınıf değişkenleri ile tablonun kolonlarını eşleştirmek ve SQL yazmadan nesneler üzerinden doğrudan veritabanı işlemlerini yapmaktır. Bu noktada JPA sadece bir standart ortaya koyar ve veri üzerinde kendisi bir işlem yapmaz. Bunun için bu standartları implemente eden ayrı bir araca ihtiyaç vardır, JPA implementasyonu yapan başlıca araçlar olarak Hibernate, TopLink, EclipseLink ve OpenJPA sayılabilir.

JPA spesifikasyonunda obje-tablo ilişkisini yönetmek için iki tane araç bulunur; anotasyonlar ve XML konfigürasyon dosyaları. Bu iki araçtan birini kullanarak JPA için gerekli olan meta bilgisini oluşturabiliriz. İkisini birden kullanmak da mümkün bu durumda XML konfigürasyonu anotasyonları ezer.

### Thymeleaf
Thymeleaf; açık kaynak kodlu, eklentiler (dialects) ile özelleştirilebilen, Spring Boot ve diğer Spring Framework projeleriyle tam uyumlu bir şablon motorudur. XML ad uzayları ile direkt HTML etiketine uygulanması, dolayısıyla da sunum tarafındaki gereksiz kalabalıktan arındırmaktadır.

### Bootstrap
Bootstrap, kullanılabilir kod parçalarından oluşan açık kaynaklı ve ücretsiz bir web uygulaması geliştirme araç takımıdır. Sahip olduğu CSS ve JavaScript taslakları, web sitelerinin ve mobil uygulamaların kullanıcılara görünen bileşenleri için kullanılır. HTML, CSS, Less, Sass ve JavaScript ile yazılmış olan Bootstrap, tamamen etkileşimli ve duyarlı web uygulamaları geliştirmek için kullanılabilecek öğrenmesi kolay bir alternatiftir.

### H2 Database
H2; bellekte çalışan bir SQL veritabanıdır. Performansından ve diğer SQL veritabanlarını taklit edebilmesinden dolayı, yazulım geliştirme aşamasında sıkça kullanılır.

## Kurulum
Projemizi komut istemcisinden çalıştırabilmek için izlemeniz gereken adımlar şöyledir (Eclipse IDE için hazırlanmıştır):
1. Adım: Projemizi cihazımıza klonlayalım (git clone https://github.com/MustafaBaybarsKeskin/Ozgur-Yazilim-A.S.-Java-Task.git). Git istemcisini kullanmak istemezseniz sağ üst kısımdan code seçeneğini tıklayınız ardından Download ZIP'i seçerek projeyi cihazınıza .zip formatında indrirmiş olursunuz.
2. Adım: İndirmiş olduğumuz .zip uzantılı arşivi ayıklayalım.
3. Adım: Eclipse IDE'mizi açalım ardından sol üstte bulunan File seçeneğine tıklayalım ve projemizi IDE'de görüntüleyebilmek için Open Projets from File System seçeneğini seçelim ve indirmiş olduğumuz proje klsasörünü seçelim.
4. Adım: Projemizi IDE'ye ekledikten sonra proje adının solunda minik bir ok buluncakatır buna tıklayalım ve klasörümüzün içeriğini görüntüleyelim akabinde pom.xml dosyasını çift tıklayarak açalım.
5. Adım: pom.xml dosayını açtığımız pencereye gelelim ve IDE'nin en üst noktasındaki bardan Run > Run As > 5 Maven install seçenklerini izleyelim bu sayede projemizi IDE gerektirmeden çalıştırmamıza olanak sağlayan .jar uzantılı dosyayı elde edeceğiz. 
6. Adım: İlgili doysa proje klasörünün içerisinde yer alan target klasörünün içerisinde oluşturulmaktadır. Dilerseniz pom.xml içerisinde yer alan '<finalName>Spring-Boot-Application-Executable-Jar</finalName>' kısmı değiştirerek dosyayı farklı bir şekilde adlandırabilirsiniz. 
7. Adım: Elde etmiş olduğumuz dosyayı herhangi bir dosya yolunda çalıştırabilirsiniz. Komut istemcimizi açalım ve .jar uzantılı dosyamızın bulunduğu konuma gelelim akabinde java -jar dosya_adi.jar komutu ile projemizi çalıştırabiliriz. Dilerseniz ilgili dosyaya [buradaki] (https://drive.google.com/file/d/1ircKeXJfkvvwurlgP7PI5OLmsVMVmGSy/view?usp=sharing) bağlantıdan da ulaşabilirsiniz.


## Yazar
* **Mustafa Baybars Keskin** - [MustafaBaybarsKeskin](https://github.com/MustafaBaybarsKeskin)
