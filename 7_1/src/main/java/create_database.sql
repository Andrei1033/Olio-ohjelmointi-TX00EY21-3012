-- luodan se
DROP DATABASE IF EXISTS currencydb;
CREATE DATABASE currencydb;
USE currencydb;

--luodan taulukoja
CREATE TABLE currencyyy (
    id INT NOT NULL AUTO_INCREMENT,
    code VARCHAR(3) NOT NULL,
    name VARCHAR(50) NOT NULL,
    rate DECIMAL(10,4) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (code)
);

-- lisätän sinne tietoja
INSERT INTO currency (code, name, rate) VALUES
    ('EUR', 'Euro', 1.0000),
    ('USD', 'US Dollar', 1.0800),
    ('GBP', 'British Pound', 0.8600),
    ('JPY', 'Japanese Yen', 160.0000),
    ('SEK', 'Swedish Krona', 11.2000),
    ('NOK', 'Norwegian Krone', 11.5000),
    ('CHF', 'Swiss Franc', 0.9500),
    ('CAD', 'Canadian Dollar', 1.4700);

-- poistetan vanha käytäjä jos se on olemassa
DROP USER IF EXISTS 'appuser'@'localhost';

-- luodan uusi käytäjä
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';

-- annetan käytäjäle oikeuksia lukea tämä tietokanta
GRANT SELECT ON currencydb.currency TO 'appuser'@'localhost';

-- päivitetän oikeuet
FLUSH PRIVILEGES;