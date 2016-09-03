create database dress_shop;

use dress_shop;

create table member (
	id varchar(45) not null,
    password varchar(45) not null,
    name varchar(45) not null,
	birth date not null,
	gender varchar(10) not null,
    zipcode int not null,
    address1 varchar(45) not null,
    address2 varchar(45) not null,
    telephone varchar(20) not null,
    cellphone varchar(20) not null,
	email varchar(45) not null,
    primary key (id));
    
select * from member;

drop table category;

create table category (
	category_id int not null ,
    category_name varchar(45) not null,
    primary key(category_id)
);

create table item (
	item_id int not null,
	item_name varchar(45) not null,
    primary key(item_id)
);

create table product (
	category_id int not null,
    item_id int not null,
    product_id int not null,
    product_name varchar(45) not null,
    price int not null,
    description varchar(255) not null,
    size varchar(45) not null,
    color varchar(45) not null,
	image_address varchar(100) not null,
    primary key(product_id),
    foreign key(category_id) REFERENCES category (category_id),
    foreign key(item_id) references item (item_id)
    );

drop table product;
select * from product;


    
    insert into category values (1, 'outer');
    insert into category values (2, 'top');
	insert into category values (3, 'bottom');	
	insert into category values (4, 'dress');
    insert into category values (5, 'shoes');
    insert into category values (6, 'bag');
	insert into category values (7, 'acc');
	
    insert into item values (101, 'cardigan');
	insert into item values (102, 'jacket');
	insert into item values (103, 'knit');
    insert into item values (104, 'shirtnblouse');
    insert into item values (105, 'sleeveless');
    insert into item values (106, 'teeshirt');

     DELETE FROM `dress_shop`.`item` WHERE item_id=107;
  
    select * from category;
    drop table item;
    select * from product;

	select * from item;

    ALTER DATABASE dress_shop DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
    
    select * from product;
    
	insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (1, 102, 1001, '블루자켓', 49000, '금장단추가 돋보이는 독특한 질감의 트위드자켓', 'free', 'blue', 'jacket_0');
	insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (1, 102, 1002, '빈티지 청자켓', 37000, '빈티지한 느낌의 미니 청자켓', 'free', 'blue', 'jacket_1');
	insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (1, 102, 1003, '미니 청자켓', 52000, '라이트블루색상의 청자켓', 'free', 'light-blue', 'jacket_2');
	insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (1, 101, 1004, '섬머 롱 가디건', 19000, '얇은 여름용 가디건', 'free', 'beige', 'cardigan_0');
    insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (1, 101, 1005, '로브 가디건', 19000, '독특한 문양이 돋보이는 가디건', 'free', 'gray', 'cardigan_1');
    insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (2, 106, 1006, '오프숄더티셔츠', 17500, '올리브그린색의 오프-숄더 스타일의 티셔츠', 'free', 'olive-green', 'teeshirt_0.');
    insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (2, 106, 1007, '맨투맨티셔츠', 15000, '*모양의 맨투맨티셔츠', 'free', 'gray', 'teeshirt_1');
	insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (2, 106, 1008, 'NO ONE CARES', 12000, '반팔티셔츠', 'free', 'white', 'teeshirt_2');
    insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (2, 104, 1009, '가죽느낌의 블라우스', 27000, '가죽느낌의 블라우스', 'free', 'black', 'shirtnblouse_0');
	insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (2, 104, 1010, '레이스블라우스', 36000, '시스루느낌의레이스블라우스', 'free', 'white', 'shirtnblouse_1');
	insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (2, 104, 1011, '청셔츠', 34000, '청셔츠, 그 이상의 설명은 생략', 'free', 'blue', 'shirtnblouse_2');
	insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (2, 103, 1012, '밤하늘니트', 42000, '밤하늘에 떠있는 별같은 니트', 'free', 'blue-black', 'knit_0');
   	insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (2, 103, 1013, '벌집피자니트', 39000, '벌집피자같이 구멍이 숭숭 뚫린 니트', 'free', 'white', 'knit_1');
	insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (2, 105, 1014, '미니민소매', 17000, '시원하게 입을 수 있는 미니-민소매', 'free', 'black', 'sleeveless_0');
    insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (2, 105, 1015, '끈뷔스티에', 26000, '끈으로 엮어진 뷔스티에', 'free', 'black', 'sleeveless_1');
    insert into `dress_shop`.`product` (category_id, item_id, product_id, product_name, price, description, size, color, image_address) values (2, 105, 1016, '민소매', 10000, '라인이 살아있는 민소매', 'free', 'white', 'sleeveless_2');
	update product set category_id=2 where product_id=1002;
   
   DELETE FROM `dress_shop`.`product` WHERE product_id=1016;
   
   delete from `dress_shop`.`product`;
   
   select product.image_address, product.product_name, product.description, product.price from product, category where category.category_id = 1;
   select * from product where category.category_id;

SELECT product.image_address, product_name, description, price FROM Product INNER JOIN category where category.category_id=1;