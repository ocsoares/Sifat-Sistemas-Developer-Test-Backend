INSERT INTO product_groups (id, name, total_sold) VALUES
    (UUID_TO_BIN(UUID()), 'Eletrônicos', 1500),
    (UUID_TO_BIN(UUID()), 'Roupas', 1200),
    (UUID_TO_BIN(UUID()), 'Alimentos', 980),
    (UUID_TO_BIN(UUID()), 'Móveis', 750),
    (UUID_TO_BIN(UUID()), 'Livros', 430);

INSERT INTO products (id, name, total_sold, group_id) VALUES
    (UUID_TO_BIN(UUID()), 'Ventilador Retrô', 12, (SELECT id FROM product_groups WHERE name = 'Eletrônicos')),
    (UUID_TO_BIN(UUID()), 'Calça Social', 18, (SELECT id FROM product_groups WHERE name = 'Roupas')),
    (UUID_TO_BIN(UUID()), 'Azeite Importado', 22, (SELECT id FROM product_groups WHERE name = 'Alimentos')),
    (UUID_TO_BIN(UUID()), 'Estante Rústica', 9, (SELECT id FROM product_groups WHERE name = 'Móveis')),
    (UUID_TO_BIN(UUID()), 'Livro de Filosofia', 15, (SELECT id FROM product_groups WHERE name = 'Livros'));

INSERT INTO cmv (id, month, cost) VALUES
    (UUID_TO_BIN(UUID()), 'Janeiro',   15000.00),
    (UUID_TO_BIN(UUID()), 'Fevereiro', 18500.00),
    (UUID_TO_BIN(UUID()), 'Março',     22000.00),
    (UUID_TO_BIN(UUID()), 'Abril',     19800.00),
    (UUID_TO_BIN(UUID()), 'Maio',      25300.00),
    (UUID_TO_BIN(UUID()), 'Junho',     21000.00),
    (UUID_TO_BIN(UUID()), 'Julho',     28700.00),
    (UUID_TO_BIN(UUID()), 'Agosto',    31200.00),
    (UUID_TO_BIN(UUID()), 'Setembro',  27500.00),
    (UUID_TO_BIN(UUID()), 'Outubro',   33000.00),
    (UUID_TO_BIN(UUID()), 'Novembro',  41000.00),
    (UUID_TO_BIN(UUID()), 'Dezembro',  38500.00);