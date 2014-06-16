mvn com.github.dcrissman:pom-generator:generate -DgroupId=test -DartifactId=test -Dversion=1.0.0 -Ddependencies=groupId=g1:artifactId=a1:version=5,groupId=g2:artifactId=a2:version=3.2.1

Will produce:

<code><pre>&lt;?xml version="1.0" encoding="UTF-8"?&gt;
&lt;project xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd" xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;
  &lt;groupId&gt;test&lt;/groupId&gt;
  &lt;artifactId&gt;test&lt;/artifactId&gt;
  &lt;version&gt;1.0.0&lt;/version&gt;
  &lt;name&gt;test&lt;/name&gt;
  &lt;dependencies&gt;
    &lt;dependency&gt;
      &lt;groupId&gt;g1&lt;/groupId&gt;
      &lt;artifactId&gt;a1&lt;/artifactId&gt;
      &lt;version&gt;5&lt;/version&gt;
    &lt;/dependency&gt;
    &lt;dependency&gt;
      &lt;groupId&gt;g2&lt;/groupId&gt;
      &lt;artifactId&gt;a2&lt;/artifactId&gt;
      &lt;version&gt;3.2.1&lt;/version&gt;
    &lt;/dependency&gt;
  &lt;/dependencies&gt;
&lt;/project&gt;</pre></code>
