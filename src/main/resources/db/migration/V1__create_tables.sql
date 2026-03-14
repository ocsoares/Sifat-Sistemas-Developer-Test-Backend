CREATE TABLE IF NOT EXISTS cmv (
    id BINARY(16) PRIMARY KEY,
    month VARCHAR(20) NOT NULL,
    cost DECIMAL(10, 2) NOT NULL
);

CREATE TABLE IF NOT EXISTS product_groups (
    id BINARY(16) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    total_sold INT NOT NULL
);

CREATE TABLE IF NOT EXISTS products (
    id BINARY(16) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    total_sold INT NOT NULL,
    group_id BINARY(16) NOT NULL,
    CONSTRAINT fk_product_group FOREIGN KEY (group_id) REFERENCES product_groups(id)
);