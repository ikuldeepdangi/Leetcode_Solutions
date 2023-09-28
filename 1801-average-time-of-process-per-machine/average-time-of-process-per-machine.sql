# Write your MySQL query statement below
SELECT machine_id,
       ROUND(AVG(end_time - start_time), 3) AS processing_time
FROM (
    SELECT machine_id,
           MAX(CASE WHEN activity_type = 'start' THEN timestamp END) AS start_time,
           MAX(CASE WHEN activity_type = 'end' THEN timestamp END) AS end_time
    FROM Activity
    WHERE activity_type IN ('start', 'end')
    GROUP BY machine_id, process_id
) AS machine_times
GROUP BY machine_id;


