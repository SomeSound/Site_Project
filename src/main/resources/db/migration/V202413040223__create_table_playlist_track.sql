CREATE TABLE PLAYLIST_TRACKS (
    PLAYLIST BIGINT NOT NULL,
    TRACK BIGINT NOT NULL,
    CREATED_DATE TIMESTAMP WITH TIME ZONE,
    LAST_MODIFIED_DATE TIMESTAMP WITH TIME ZONE
);

CREATE SEQUENCE PLAYLIST_TRACKS_SEQ START WITH 1;

ALTER TABLE PLAYLIST_TRACKS ADD PRIMARY KEY (PLAYLIST, TRACK);
ALTER TABLE PLAYLIST_TRACKS ADD CONSTRAINT PLAYLIST_TRACKS_TRACK_ID_FK FOREIGN KEY (TRACK) REFERENCES TRACK(ID);
ALTER TABLE PLAYLIST_TRACKS ADD CONSTRAINT PLAYLIST_TRACKS_PLAYLIST_ID_FK FOREIGN KEY (PLAYLIST) REFERENCES PLAYLIST(ID);