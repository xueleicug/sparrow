CREATE TABLE `book` (
	`id` 	 INTEGER	UNSIGNED	auto_increment PRIMARY KEY,
	`name` VARCHAR(200) NOT NULL,
	`author`	VARCHAR(200) NOT NULL,
	`translator`	VARCHAR(200)	DEFAULT NULL,
	`description`	VARCHAR(500)	DEFAULT NULL,
	`press`	VARCHAR(200)	NOT NULL,
	`category`	VARCHAR(100)	NOT NULL,
	`press_time`	datetime	DEFAULT NULL,
	`buy_time`	datetime	DEFAULT NULL,
	`isbn`	VARCHAR(20),
	`word_count`	INTEGER UNSIGNED,
	`price`	FLOAT
) DEFAULT CHARACTER SET=utf8;

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "SQL必知必会（第4版）", 
    "Ben Forta", 
    "钟鸣,刘晓霞", 
    "sql语言教程", 
    "人民邮电出版社",
    "数据库", 
    "2013-05-01", 
    "2017-10-21", 
    "978-7-115-31398-0", 
    "191000", 
    29.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "Head First 设计模式（中文版）", 
    "Eric Freeman,Elisabeth Freeman,Kathy Sierra,Bert Bates", "O'Relliy", 
    "设计模式基础教程", 
    "中国电力出版社", 
    "设计模式", 
    "2007-09-01", 
    "2016-11-12", 
    "978-7-5083-5393-7", 
    "928000", 
    98.0
);

INSERT INTO book 
(name, author, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "Core Java Volume I Fundamentals 1", 
    "Cay S. Horstmann", 
    "java核心技术基础知识上卷", 
    "人民邮电出版社", 
    "Java", 
    "2016-06-01", 
    "2017-09-24", 
    "978-7-115-42011-4", 
    "1172000", 
    109.0
);

INSERT INTO book 
(name, author, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "Core Java Volume I Fundamentals 2", 
    "Cay S. Horstmann",
    "java核心技术基础知识下卷", 
    "人民邮电出版社",
    "Java", 
    "2016-06-01", 
    "2017-09-24", 
    "978-7-115-42011-4", 
    "1172000", 
    109.0
);

INSERT INTO book 
(name, author, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "Core Java Volume II Advanced Feature 1", 
    "Cay S. Horstmann",
    "java核心技术高级特性上卷", 
    "人民邮电出版社",
    "Java", 
    "2016-07-01", 
    "2017-09-24", 
    "978-7-115-45886-4", 
    "1227000", 
    109.0
);

INSERT INTO book 
(name, author, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "Core Java Volume II Advanced Feature 2", 
    "Cay S. Horstmann",
    "java核心技术高级特性下卷", 
    "人民邮电出版社",
    "Java", 
    "2016-07-01", 
    "2017-09-24", 
    "978-7-115-45886-4", 
    "1227000", 
    109.0
);

INSERT INTO book 
(name, author, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "红楼梦脂砚斋批评本（上）", 
    "曹雪芹,脂砚斋",
    "红楼梦脂砚斋批评本", 
    "岳麓书社",
    "古典名著", 
    "2015-09-01", 
    "2017-11-16", 
    "978-7-5538-0364-7", 
    "870000", 
    78.0
);

INSERT INTO book 
(name, author, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "红楼梦脂砚斋批评本（下）", 
    "曹雪芹,脂砚斋",
    "红楼梦脂砚斋批评本", 
    "岳麓书社",
    "古典名著", 
    "2015-09-01", 
    "2017-11-16", 
    "978-7-5538-0364-7", 
    "870000", 
    78.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "Hadoop权威指南", 
    "Tom White",
    "华东师范大学数据科学与工程学院", 
    "hadoop权威指南", 
    "清华大学出版社",
    "大数据", 
    "2015-03-01", 
    "2015-11-13", 
    "978-7-302-37085-7", 
    792000, 
    99.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "HBase权威指南", 
    "Lars George",
    "代志远,刘佳,蒋杰", 
    "hbase权威指南", 
    "人民邮电出版社",
    "非关系型数据库", 
    "2015-09-01", 
    "2015-11-13", 
    "978-7-115-31889-3", 
    646000, 
    89.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, price) 
VALUES (
    "设计模式-可复用面向对象软件的基础", 
    "Erich Gamma,Richard Helm,Ralph Johnson,John Vlissides",
    "李英军,马晓星,蔡敏,刘建中", 
    "四人组设计模式经典", 
    "机械工业出版社",
    "设计模式", 
    "2016-11-01", 
    "2017-08-13", 
    "978-7-111-07575-2",
    35.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "UML用户指南（第2版）", 
    "Grady Booch,James Rumbaugh,Ivar Jacobson",
    "邵维忠,麻志毅,马浩海,刘辉", 
    "uml入门教程", 
    "人民邮电出版社",
    "UML", 
    "2017-04-01", 
    "2017-10-21", 
    "978-7-115-29644-3", 
    535000, 
    59.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "鸟哥的Linux私房菜（第三版）", 
    "鸟哥",
    "王世江", 
    "Linux基础教程", 
    "人民邮电出版社",
    "Linux", 
    "2017-08-01", 
    "2017-10-21", 
    "978-7-115-22626-6", 
    1506000, 
    88.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "重构-改善既有代码的设计", 
    "Martin Fowler",
    "熊节", 
    "代码重构教程", 
    "人民邮电出版社",
    "软件设计与规范", 
    "2017-06-01", 
    "2017-08-13", 
    "978-7-115-36909-3", 
    490000, 
    69.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, price) 
VALUES (
    "Effective Java(第二版)", 
    "Joshua Bloch",
    "杨春华,余黎敏", 
    "Java开发性能提升", 
    "机械工业出版社",
    "Java", 
    "2016-10-01", 
    "2016-11-13", 
    "978-7-111-25583-3", 
    52.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "动物知道生命的答案", 
    "泰德.安德鲁斯",
    "仪玟兰,尧俊芳", 
    "一本充满灵性美的动物之书，一部理解生命的动物图腾大全", 
    "吉林文史出版社",
    "社会科学", 
    "2017-06-01", 
    "2017-08-13", 
    "978-7-5472-3947-6", 
    400000, 
    48.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "代码整洁之道", 
    "Robert C. Martin",
    "韩磊", 
    "代码整洁之道", 
    "人民邮电出版社",
    "软件设计与规范", 
    "2017-07-01", 
    "2017-08-13", 
    "978-7-115-21687-8", 
    554000, 
    59.0
);

INSERT INTO book 
(name, author, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "Spring Cloud 微服务实战",
    "翟永超", 
    "快速构建为服务架构体系", 
    "电子工业出版社",
    "Java微服务,Spring", 
    "2017-05-01", 
    "2017-07-18", 
    "978-7-121-31301-1", 
    586000, 
    89.0
);

INSERT INTO book 
(name, author, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "Spring Boot 实战",
    "汪云飞", 
    "J2EE 开发的颠覆者", 
    "电子工业出版社",
    "Java微服务,Spring", 
    "2017-06-01", 
    "2017-07-18", 
    "978-7-121-28208-9", 
    675000, 
    89.0
);

INSERT INTO book 
(name, author, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "Spring Cloud 与 Docker 微服务架构实战", 
    "周立",
    "微服务架构", 
    "电子工业出版社",
    "Java为服务,Spring", 
    "2017-06-01", 
    "2017-07-17", 
    "978-7-121-31271-7", 
    342180, 
    69.0
);

INSERT INTO book 
(name, author, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "Spring源码深度解析", 
    "郝佳",
    "Spring源码分析", 
    "人民邮电出版社",
    "Spring", 
    "2017-07-01", 
    "2017-09-24", 
    "978-7-115-32568-6", 
    545000, 
    69.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "Spring实战", 
    "Craig Walls",
    "张卫滨", 
    "Spring 4.0", 
    "人民邮电出版社",
    "Spring", 
    "2016-06-01", 
    "2016-11-15", 
    "978-7-115-41730-5", 
    811000, 
    89.0
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "红楼梦（上）", 
    "曹雪芹",
    "高鹗,程伟元",
    "红楼梦庚辰版高鹗续本第一至六十回", 
    "人民文学出版社",
    "古典名著", 
    "2017-09-01", 
    "2017-11-20", 
    "978-7-02-000220-7", 
    1137000, 
    59.70
);

INSERT INTO book 
(name, author, translator, description, press, category, press_time, buy_time, isbn, word_count, price) 
VALUES (
    "红楼梦（下）", 
    "曹雪芹",
    "高鹗,程伟元",
    "红楼梦庚辰版高鹗续本第六十一至一百二十回", 
    "人民文学出版社",
    "古典名著", 
    "2017-09-01", 
    "2017-11-20", 
    "978-7-02-000220-7", 
    1137000, 
    59.70
);
