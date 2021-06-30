INSERT INTO `shopr`.`book` (`type`, `id`, `price`, `supplier_id`, `title`, `author`, `isbn`, `pages`, `book_genre`, `description`) VALUES ('Fiction', '1', '12.99', '1', 'Harry Potter', 'J.K Rowling', '978-90-123-4215-8', '512', 'FANTASY', 'wizards');
INSERT INTO `shopr`.`book` (`type`, `id`, `price`, `supplier_id`, `title`, `author`, `isbn`, `pages`, `book_subject`) VALUES ('Non-Fiction', '2', '19.99', '1', 'Master your Mindset', 'Michael Pilarczyk', '100-20-514-1234-1', '272', 'EDUCATION');
INSERT INTO `shopr`.`book` (`type`, `id`, `price`, `supplier_id`, `title`, `author`, `isbn`, `pages`, `book_genre`, `description`) VALUES ('Fiction', '3', '22.15', '5', 'The kite runner', 'Khaled Hosseini', '147-25-896-3265-4', '436', 'ROMAN', 'A story about fait');
INSERT INTO `shopr`.`book` (`type`, `id`, `price`, `supplier_id`, `title`, `author`, `isbn`, `pages`, `book_genre`, `description`) VALUES ('Fiction', '4', '15.85', '17', 'I search of lost time', 'Marcel Proust', '987-56-456-7418-2', '514', 'ROMAN', 'impressions of a sensitieve boy');
INSERT INTO `shopr`.`book` (`type`, `id`, `price`, `supplier_id`, `title`, `author`, `isbn`, `pages`, `book_subject`) VALUES ('Non-Fiction', '5', '17.99', '4', 'Plants only kitchen', 'Gaz Oakley', '654-23-789-9632-5', '55', 'COOKBOOK');
INSERT INTO `shopr`.`lp` (`id`, `price`, `supplier_id`, `title`, `artist`, `lp_genre`) VALUES ('1', '15.99', '1', 'Video Games', 'Lana Del Rey', 'POP');
INSERT INTO `shopr`.`lp` (`id`, `price`, `supplier_id`, `title`, `artist`, `lp_genre`) VALUES ('2', '12.99', '5', 'Sure Thing', 'Miquel', 'RHYTHMANDBLUES');
INSERT INTO `shopr`.`lp` (`id`, `price`, `supplier_id`, `title`, `artist`, `lp_genre`) VALUES ('3', '15.20', '5', 'Losing it ', 'Fisher', 'DANCE');
INSERT INTO `shopr`.`lp` (`id`, `price`, `supplier_id`, `title`, `artist`, `lp_genre`) VALUES ('4', '22.50', '19', 'Aaron', 'Paul  Kalkbrenner', 'DANCE');
INSERT INTO `shopr`.`lp` (`id`, `price`, `supplier_id`, `title`, `artist`, `lp_genre`) VALUES ('5', '12.99', '9', 'Till it\'s gone', 'Yelawolf', 'ROCK');
INSERT INTO `shopr`.`game` (`id`, `price`, `supplier_id`, `title`, `game_genre`, `minimum_age`, `publisher`) VALUES ('1', '59.99', '3', 'World of Warcraft', 'MMORPG', '12', 'Blizzard Entertainment');
INSERT INTO `shopr`.`game` (`id`, `price`, `supplier_id`, `title`, `game_genre`, `minimum_age`, `publisher`) VALUES ('2', '69.99', '19', 'Resident evil village', 'FPS', '18', 'Capcom');
INSERT INTO `shopr`.`game` (`id`, `price`, `supplier_id`, `title`, `game_genre`, `minimum_age`, `publisher`) VALUES ('3', '59.99', '4', 'Call of Duty: Black ops', 'FPS', '18', 'Activision');