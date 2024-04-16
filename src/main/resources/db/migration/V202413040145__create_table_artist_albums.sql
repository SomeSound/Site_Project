CREATE TABLE ARTIST_ALBUMS (
    ARTIST BIGINT NOT NULL,
    ALBUM BIGINT NOT NULL,
    CREATED_DATE TIMESTAMP WITH TIME ZONE,
    LAST_MODIFIED_DATE TIMESTAMP WITH TIME ZONE
);

CREATE SEQUENCE ARTIST_ALBUMS_SEQ START WITH 1;

ALTER TABLE ARTIST_ALBUMS ADD PRIMARY KEY (ARTIST, ALBUM);
ALTER TABLE ARTIST_ALBUMS ADD CONSTRAINT ARTIST_ALBUMS_ARTIST_ID_FK FOREIGN KEY (ARTIST) REFERENCES ARTIST(ID);
ALTER TABLE ARTIST_ALBUMS ADD CONSTRAINT ALBUMS_ARTIST_ALBUM_ID_FK FOREIGN KEY (ALBUM) REFERENCES ALBUM(ID);