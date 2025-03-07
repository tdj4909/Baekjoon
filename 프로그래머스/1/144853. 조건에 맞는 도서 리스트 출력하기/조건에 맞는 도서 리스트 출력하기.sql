SELECT
    BOOK_ID,
    TO_CHAR(PUBLISHED_DATE,'yyyy-mm-dd') AS PUBLISHED_DATE
FROM
    BOOK
WHERE
    TO_CHAR(PUBLISHED_DATE, 'yyyy') = '2021'
    AND CATEGORY = '인문'
ORDER BY
    PUBLISHED_DATE
;