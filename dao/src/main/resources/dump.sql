-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.6.27-log - MySQL Community Server (GPL)
-- ОС Сервера:                   Win64
-- HeidiSQL Версия:              9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
-- Дамп данных таблицы employee_data.department: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` (`id`, `name`) VALUES
	(1, 'Biology'),
	(2, 'Chemistry'),
	(3, 'Economics'),
	(4, 'Genetics'),
	(5, 'Music');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;

-- Дамп данных таблицы employee_data.employee: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`id`, `first_name`, `last_name`, `department_id`, `position_id`) VALUES
	(1, 'Petya', 'Sidorov', 1, 1),
	(2, 'Vasya', 'Petrov', 2, 1),
	(3, 'John', 'Smith', 4, 4),
	(4, 'Natasha', 'Grodno', 5, 3),
	(5, 'Tanya', 'Horoshaya', 3, 2),
	(6, 'Poll', 'Newman', 5, 1),
	(7, 'Joshya', 'Blokh', 2, 1),
	(8, 'Zara', 'Man', 3, 4),
	(9, 'Kolya', 'Martynov', 2, 3),
	(10, 'Sashya', 'Martynova', 5, 1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;

-- Дамп данных таблицы employee_data.position: ~0 rows (приблизительно)
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
INSERT INTO `position` (`id`, `name`) VALUES
	(1, 'Developer'),
	(2, 'QA'),
	(3, 'PM'),
	(4, 'BA');
/*!40000 ALTER TABLE `position` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
