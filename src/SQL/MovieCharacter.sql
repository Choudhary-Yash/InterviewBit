SELECT CONCAT(directors.director_first_name,directors.director_last_name) AS director_name , movies.movie_title 
FROM movies, directors, movies_directors
WHERE movies.movie_id IN (SELECT movie_id FROM movies_cast WHERE role='SeanMaguire') 
AND movies_directors.movie_id = movies.movie_id
AND directors.director_id = movies_directors.director_id;