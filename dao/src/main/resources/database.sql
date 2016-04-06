-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema employee_data
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema employee_data
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `employee_data` DEFAULT CHARACTER SET utf8 ;
USE `employee_data` ;

-- -----------------------------------------------------
-- Table `employee_data`.`department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employee_data`.`department` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `name` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employee_data`.`position`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employee_data`.`position` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `name` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
  ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `employee_data`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `employee_data`.`employee` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `first_name` VARCHAR(45) NULL COMMENT '',
  `last_name` VARCHAR(45) NULL COMMENT '',
  `department_id` INT NOT NULL COMMENT '',
  `position_id` INT NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `fk_empoyee_department_idx` (`department_id` ASC)  COMMENT '',
  INDEX `fk_employee_position1_idx` (`position_id` ASC)  COMMENT '',
  CONSTRAINT `fk_empoyee_department`
  FOREIGN KEY (`department_id`)
  REFERENCES `employee_data`.`department` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_employee_position1`
  FOREIGN KEY (`position_id`)
  REFERENCES `employee_data`.`position` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
