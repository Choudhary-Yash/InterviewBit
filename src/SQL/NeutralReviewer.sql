SELECT  reviewer_name 
FROM reviewers 
where reviewer_id IN (
    SELECT DISTINCT reviewer_id 
    FROM ratings 
    WHERE reviewer_stars IS NULL
    );

-- Using DISTINCT is a must as there can be many movies for which a reviewer has not reviewed and we just want unique names of reviewers.