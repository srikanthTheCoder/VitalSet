create table if not exists  SERVICE_DETAILS (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  Application_Name VARCHAR(250) NOT NULL,
  Path VARCHAR(250) NOT NULL,
  Query VARCHAR(250) DEFAULT NULL,
  URL VARCHAR(250) NOT NULL,
  IsCacheable VARCHAR(250) NOT NULL,
  CacheExpiryTime VARCHAR(250) DEFAULT NULL,
  CacheExpiryDate VARCHAR(250) DEFAULT NULL,
  Status int default null
);



