plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // lombok 설정 maven lombok 검색해서 gradle.kotlin 가져옴
    compileOnly("org.projectlombok:lombok:1.18.34")
    implementation("mysql:mysql-connector-java:8.0.33")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}