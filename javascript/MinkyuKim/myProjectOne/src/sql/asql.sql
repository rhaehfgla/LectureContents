use non_jpa_db;

// 회원가입
create table purchasingMemeberSignUp(
purchasingMemeberSignUp_no int not null auto_increment,
 id varchar(200) not null,
 pw varchar(200) not null,
 name varchar(20) not null,
 dateOfBirth varchar(20) not null,
 gender varchar(20) not null,
 phoneNumber varchar(200) not null,
 email varchar(200) not null,
 address varchar(200) not null,
 primary key(purchasingMemeberSignUp_no));

// 그림구매,렌탈
 creat table DrawingPurchaseBoard(
 DrawingProduct_no int not null auto_increment,
 salePrice int not null,
 rentalPrice int not null,
 saleTitle varchar not null,
 saleContent not null,
 drawingSize not null,    --->추가필요
 DrawingProductCreatedDate timestamp not null default now(),
 primary key(DrawingProduct_no));

 saleWriter not null, 작성회원 아이디? 이름으로 자동배치
