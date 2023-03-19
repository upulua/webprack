DROP TABLE IF EXISTS history CASCADE;
CREATE TABLE history (
    history_id SERIAL PRIMARY KEY,
    worker_id INT REFERENCES worker(worker_id),
    position_id INT REFERENCES position(position_id),
    start_date TIMESTAMP NOT NULL,
    finish_date TIMESTAMP NOT NULL
);