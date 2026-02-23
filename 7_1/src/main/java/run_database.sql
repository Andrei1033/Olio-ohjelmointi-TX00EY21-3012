--
USE currencydb;

-- Hae kaikki valuutat
SELECT * FROM currencydb.currency;

--Hae valuutta, jonka code = 'EUR'
SELECT * FROM currencydb.currency
WHERE code = 'EUR';

--Laske valuuttojen määrä
SELECT COUNT(*) AS total_currencies
FROM currencydb.currency;

--Hae korkein vaihtokurssi
SELECT *
FROM currencydb.currency
ORDER BY rate DESC LIMIT 1;
