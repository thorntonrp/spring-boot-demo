project("demo") {

    parent("org.springframework.boot:spring-boot-starter-parent:2.3.4.RELEASE") relativePath ""

    id("com.example:demo:0.0.1-SNAPSHOT:jar")

    description("Demo project for Spring Boot")

    properties {
        "java.version" to 11
    }

    dependencies {
        dependency("org.springframework.boot:spring-boot-starter")
        dependency("org.springframework.boot:spring-boot-starter-actuator")
        dependency("org.springframework.boot:spring-boot-starter-hateoas")
        dependency("org.springframework.boot:spring-boot-starter-security")
        dependency("org.springframework.boot:spring-boot-starter-web")

        test("org.springframework.boot:spring-boot-starter-test") {
            exclusions("org.junit.vintage:junit-vintage-engine")
        }
    }

    build {
        plugins {
            plugin("org.springframework.boot:spring-boot-maven-plugin")
        }
    }
}
