# sk_shieldus_music_back

### 음악 정보 보관함 및 가사 검색 프로그램

## 설치 가이드
### JDK Version 22
### DataBase Mysql

### application.properties
spring.application.name=music

spring.datasource.hikari.driver-class-name=com.mysql.cj.jdbc.Driver

/*

DB에 맞게 변경 

spring.datasource.hikari.jdbc-url=jdbc:mysql://localhost:3306/springbootdb?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Seoul 

spring.datasource.hikari.username=springboot 

spring.datasource.hikari.password=p@ssw0rd 

*/

spring.datasource.hikari.connection-test-query=select 1

mybatis.configuration.map-underscore-to-camel-case=true

spring.servlet.multipart.enabled=true

// 자기 주소에 맞게 변경

// spring.servlet.multipart.location=C:/uploads

spring.servlet.multipart.max-file-size=10MB

spring.servlet.multipart.max-request-size=30MB

token.secret=+HFJp$/`c)<zisf=byu=V3sIeQs<>nU[c4VljMt|]hz9W;h@u~$?Yqi^;R[FSU]b

### Mysql Table
CREATE TABLE musics (
    music_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,      
    artist VARCHAR(255) NOT NULL,      
    lyrics TEXT,         
    release_date VARCHAR(255),         
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE music_file (
    id INT AUTO_INCREMENT PRIMARY KEY,
    music_id INT,
    original_file_name VARCHAR(255),
    stored_file_path VARCHAR(255),
file_size INT,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

CREATE TABLE user (
  NO int NOT NULL AUTO_INCREMENT,
  USER_ID varchar(100) NOT NULL,
  USER_PW varchar(200) NOT NULL,
  NAME varchar(100) NOT NULL,
  EMAIL varchar(200) DEFAULT NULL,
  REG_DATE timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  UPD_DATE timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  ENABLED int DEFAULT 1,
  PRIMARY KEY (NO)
) COMMENT='회원';

CREATE TABLE `user_auth` (
      auth_no int NOT NULL AUTO_INCREMENT       -- 권한번호
    , user_id varchar(100) NOT NULL             -- 아이디
    , auth varchar(100) NOT NULL                -- 권한 (USER, ADMIN, ...)
    , PRIMARY KEY(auth_no)                      
);

