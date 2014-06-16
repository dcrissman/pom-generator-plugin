mvn com.github.dcrissman:pom-generator:generate -DgroupId=test -DartifactId=test -Dversion=1.0.0 -Ddependencies=groupId=g1:artifactId=a1:version=5,groupId=g2:artifactId=a2:version=3.2.1

Will produce:

<?xml version="1.0" encoding="UTF-8"?>
<project xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd" xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <groupId>test</groupId>
  <artifactId>test</artifactId>
  <version>1.0.0</version>
  <name>test</name>
  <dependencies>
    <dependency>
      <groupId>g1</groupId>
      <artifactId>a1</artifactId>
      <version>5</version>
    </dependency>
    <dependency>
      <groupId>g2</groupId>
      <artifactId>a2</artifactId>
      <version>3.2.1</version>
    </dependency>
  </dependencies>
</project>
