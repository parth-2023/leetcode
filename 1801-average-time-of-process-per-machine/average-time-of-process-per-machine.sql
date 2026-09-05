# Write your MySQL query statement below
WITH temp AS(
    SELECT a.machine_id, a.process_id, b.timestamp-a.timestamp AS duration FROM activity a JOIN activity b ON a.machine_id=b.machine_id AND a.process_id=b.process_id AND a.activity_type= 'start' AND b.activity_type='end'
)


SELECT c.machine_id, 
round(avg(c.duration),3) AS processing_time
 from temp c JOIN temp d ON (c.machine_id=d.machine_id AND c.process_id!=d.process_id) OR(c.machine_id=d.machine_id) GROUP BY c.machine_id