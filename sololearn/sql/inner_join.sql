SELECT productname, price, categoryname
FROM products INNER JOIN categories
ON products.categoryid=categories.id;
