SELECT * -- * means all columns
FROM city;
-- USE quoted identifiers if coullmn name is a keyword - backtick
SELECT `Code`, `Name`, `Continent` 
FROM country; -- good practice to use all caps for keywords like SELECT or FROM , ETC.

SELECT Code
	, Name 
	, Continent
FROM country
WHERE Region = 'Caribbean';
 