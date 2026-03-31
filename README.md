# Selenium Framework

Project kiểm thử tự động cơ bản sử dụng:

- Java 17
- Maven
- Selenium WebDriver
- TestNG

## Cấu trúc project

- `src/test/java/com/example/drivers`: chứa DriverFactory
- `src/test/java/com/example/tests`: chứa test case
- `testng-smoke.xml`: file suite TestNG
- `.github/workflows/selenium-ci.yml`: workflow GitHub Actions

## Chạy test local

Mở terminal tại thư mục project và chạy:

```bash
mvn clean test "-Dbrowser=chrome" "-DsuiteXmlFile=testng-smoke.xml"