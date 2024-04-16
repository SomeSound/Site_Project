CREATE TABLE CART (
    ID BIGINT NOT NULL,
	ARTIST BIGINT NOT NULL,
    TOTAL_PRICE DECIMAL(4,2) NOT NULL,
    TOTAL_ITEMS INTEGER NOT NULL,
    CREATED_DATE TIMESTAMP WITH TIME ZONE,
    LAST_MODIFIED_DATE TIMESTAMP WITH TIME ZONE
);

CREATE SEQUENCE CART_SEQ START WITH 1;

ALTER TABLE CART ADD PRIMARY KEY (ID);
ALTER TABLE CART ADD CONSTRAINT CART_ARTIST_ID_FK FOREIGN KEY (ARTIST) REFERENCES ARTIST(ID);