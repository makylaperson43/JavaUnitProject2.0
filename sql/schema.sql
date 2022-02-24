CREATE TABLE booking (
    name text NOT NULL,
    airline text NOT NULL,
    date0 text NOT NULL,
    time0 text NOT NULL,
    where0 text NOT NULL,
    tickets int NOT NULL,
    total int NOT NULL,
    FOREIGN KEY(name) REFERENCES person(name)
);

CREATE TABLE person (
    name text NOT NULL PRIMARY KEY,
    email text NOT NULL,
    phoneNum BIGINT NOT NULL
);