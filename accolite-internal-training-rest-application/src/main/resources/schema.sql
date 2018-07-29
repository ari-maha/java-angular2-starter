create table youtube
(
   id INT not null,
   video_id varchar(255) not null,
   uploader_name varchar(255),
   video_age INT,
   category varchar(255),
   video_length INT,
   views INT,
   video_rate DOUBLE,
   video_ratings DOUBLE,
   number_Of_comments INT,
   primary key(id)
);