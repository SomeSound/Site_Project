CREATE TABLE ARTIST (
	ID BIGINT NOT NULL,
    CREDITS DECIMAL NOT NULL,
    DESCRIPTION VARCHAR(255),
    USERNAME VARCHAR(255) NOT NULL UNIQUE,
    CUSTOMER BIGINT NOT NULL,
    CREATED_DATE TIMESTAMP,
    LAST_MODIFIED_DATE TIMESTAMP
);

CREATE SEQUENCE ARTIST_SEQ START WITH 1;

ALTER TABLE ARTIST ADD PRIMARY KEY (ID);
ALTER TABLE ARTIST ADD CONSTRAINT ARTIST_CUSTOMER_ID_FK FOREIGN KEY (CUSTOMER) REFERENCES CUSTOMER(ID);

