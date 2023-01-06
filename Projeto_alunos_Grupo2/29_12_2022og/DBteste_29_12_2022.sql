-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Tipo_admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tipo_admin` (
  `id_tipoadmin` INT NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_tipoadmin`),
  UNIQUE INDEX `idTipo_admin_UNIQUE` (`id_tipoadmin` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Estado_atividade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Estado_atividade` (
  `idEstado_atividade` INT NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEstado_atividade`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ADMIN`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ADMIN` (
  `id_admin` INT NOT NULL AUTO_INCREMENT,
  `Login` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `Tipo_admin_id_tipoadmin` INT NOT NULL,
  `Estado_atividade_idEstado_atividade` INT NOT NULL,
  PRIMARY KEY (`id_admin`, `Tipo_admin_id_tipoadmin`, `Estado_atividade_idEstado_atividade`),
  UNIQUE INDEX `idADMIN_UNIQUE` (`id_admin` ASC) VISIBLE,
  UNIQUE INDEX `Login_UNIQUE` (`Login` ASC) VISIBLE,
  INDEX `fk_ADMIN_Tipo_admin_idx` (`Tipo_admin_id_tipoadmin` ASC) VISIBLE,
  INDEX `fk_ADMIN_Estado_atividade1_idx` (`Estado_atividade_idEstado_atividade` ASC) VISIBLE,
  CONSTRAINT `fk_ADMIN_Tipo_admin`
    FOREIGN KEY (`Tipo_admin_id_tipoadmin`)
    REFERENCES `mydb`.`Tipo_admin` (`id_tipoadmin`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ADMIN_Estado_atividade1`
    FOREIGN KEY (`Estado_atividade_idEstado_atividade`)
    REFERENCES `mydb`.`Estado_atividade` (`idEstado_atividade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Ementa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Ementa` (
  `idEmenta` INT NOT NULL,
  `sopa` VARCHAR(45) NOT NULL,
  `carne` VARCHAR(45) NOT NULL,
  `peixe` VARCHAR(45) NOT NULL,
  `veg` VARCHAR(45) NOT NULL,
  `sobremesa` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEmenta`),
  UNIQUE INDEX `sopa_UNIQUE` (`sopa` ASC) VISIBLE,
  UNIQUE INDEX `carne_UNIQUE` (`carne` ASC) VISIBLE,
  UNIQUE INDEX `peixe_UNIQUE` (`peixe` ASC) VISIBLE,
  UNIQUE INDEX `veg_UNIQUE` (`veg` ASC) VISIBLE,
  UNIQUE INDEX `sobremesa_UNIQUE` (`sobremesa` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Menu_Mensal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Menu_Mensal` (
  `idMenu_Mensal` INT NOT NULL,
  `data` DATETIME NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `Ementa_idEmenta` INT NOT NULL,
  PRIMARY KEY (`idMenu_Mensal`, `Ementa_idEmenta`),
  UNIQUE INDEX `idMenu_Mensal_UNIQUE` (`idMenu_Mensal` ASC) VISIBLE,
  UNIQUE INDEX `data_UNIQUE` (`data` ASC) VISIBLE,
  INDEX `fk_Menu_Mensal_Ementa1_idx` (`Ementa_idEmenta` ASC) VISIBLE,
  CONSTRAINT `fk_Menu_Mensal_Ementa1`
    FOREIGN KEY (`Ementa_idEmenta`)
    REFERENCES `mydb`.`Ementa` (`idEmenta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Turma`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Turma` (
  `idTurma` INT NOT NULL,
  `data_inicio` DATETIME NOT NULL,
  `data_fim` DATETIME NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idTurma`),
  UNIQUE INDEX `idTurma_UNIQUE` (`idTurma` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Tipo_Residencia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tipo_Residencia` (
  `idTipo_Residencia` INT NOT NULL,
  `descricao` VARCHAR(45) NULL,
  PRIMARY KEY (`idTipo_Residencia`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Estado_atividade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Estado_atividade` (
  `idEstado_atividade` INT NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEstado_atividade`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Formando`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Formando` (
  `idFormando` INT NOT NULL,
  `NIF` INT(9) NOT NULL,
  `Nome` VARCHAR(45) NOT NULL,
  `Tipo_Residencia_idTipo_Residencia` INT NOT NULL,
  `Estado_atividade_idEstado_atividade` INT NOT NULL,
  PRIMARY KEY (`idFormando`, `Tipo_Residencia_idTipo_Residencia`, `Estado_atividade_idEstado_atividade`),
  UNIQUE INDEX `idFormando_UNIQUE` (`idFormando` ASC) VISIBLE,
  UNIQUE INDEX `NIF_UNIQUE` (`NIF` ASC) VISIBLE,
  INDEX `fk_Formando_Tipo_Residencia1_idx` (`Tipo_Residencia_idTipo_Residencia` ASC) VISIBLE,
  INDEX `fk_Formando_Estado_atividade1_idx` (`Estado_atividade_idEstado_atividade` ASC) VISIBLE,
  CONSTRAINT `fk_Formando_Tipo_Residencia1`
    FOREIGN KEY (`Tipo_Residencia_idTipo_Residencia`)
    REFERENCES `mydb`.`Tipo_Residencia` (`idTipo_Residencia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Formando_Estado_atividade1`
    FOREIGN KEY (`Estado_atividade_idEstado_atividade`)
    REFERENCES `mydb`.`Estado_atividade` (`idEstado_atividade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Turma_has_Formando`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Turma_has_Formando` (
  `Turma_idTurma` INT NOT NULL,
  `Formando_idFormando` INT NOT NULL,
  PRIMARY KEY (`Turma_idTurma`, `Formando_idFormando`),
  INDEX `fk_Turma_has_Formando_Formando1_idx` (`Formando_idFormando` ASC) VISIBLE,
  INDEX `fk_Turma_has_Formando_Turma1_idx` (`Turma_idTurma` ASC) VISIBLE,
  CONSTRAINT `fk_Turma_has_Formando_Turma1`
    FOREIGN KEY (`Turma_idTurma`)
    REFERENCES `mydb`.`Turma` (`idTurma`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Turma_has_Formando_Formando1`
    FOREIGN KEY (`Formando_idFormando`)
    REFERENCES `mydb`.`Formando` (`idFormando`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cartao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cartao` (
  `idCartao` INT NOT NULL,
  `cod_HEX` VARCHAR(45) NOT NULL,
  `Formando_idFormando` INT NOT NULL,
  PRIMARY KEY (`idCartao`, `Formando_idFormando`),
  UNIQUE INDEX `idCartao_UNIQUE` (`idCartao` ASC) VISIBLE,
  UNIQUE INDEX `cod_HEX_UNIQUE` (`cod_HEX` ASC) VISIBLE,
  INDEX `fk_Cartao_Formando1_idx` (`Formando_idFormando` ASC) VISIBLE,
  CONSTRAINT `fk_Cartao_Formando1`
    FOREIGN KEY (`Formando_idFormando`)
    REFERENCES `mydb`.`Formando` (`idFormando`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Reg_Confirmacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Reg_Confirmacao` (
  `idReg_Confirmacao` BINARY NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idReg_Confirmacao`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Tipo_Refeicao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tipo_Refeicao` (
  `idTipo_Refeicao` INT NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idTipo_Refeicao`),
  UNIQUE INDEX `idTipo_Refeicao_UNIQUE` (`idTipo_Refeicao` ASC) VISIBLE,
  UNIQUE INDEX `descricao_UNIQUE` (`descricao` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Reg_Marcacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Reg_Marcacao` (
  `idReg_Marcacao` INT NOT NULL,
  `data` DATETIME NOT NULL,
  `Cartao_idCartao` INT NOT NULL,
  `Reg_Confirmacao_idReg_Confirmacao` INT NOT NULL,
  `Tipo_Refeicao_idTipo_Refeicao` INT NOT NULL,
  PRIMARY KEY (`idReg_Marcacao`, `Cartao_idCartao`, `Reg_Confirmacao_idReg_Confirmacao`, `Tipo_Refeicao_idTipo_Refeicao`),
  UNIQUE INDEX `idReg_Marcacao_UNIQUE` (`idReg_Marcacao` ASC) VISIBLE,
  INDEX `fk_Reg_Marcacao_Cartao1_idx` (`Cartao_idCartao` ASC) VISIBLE,
  INDEX `fk_Reg_Marcacao_Reg_Confirmacao1_idx` (`Reg_Confirmacao_idReg_Confirmacao` ASC) VISIBLE,
  INDEX `fk_Reg_Marcacao_Tipo_Refeicao1_idx` (`Tipo_Refeicao_idTipo_Refeicao` ASC) VISIBLE,
  CONSTRAINT `fk_Reg_Marcacao_Cartao1`
    FOREIGN KEY (`Cartao_idCartao`)
    REFERENCES `mydb`.`Cartao` (`idCartao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reg_Marcacao_Reg_Confirmacao1`
    FOREIGN KEY (`Reg_Confirmacao_idReg_Confirmacao`)
    REFERENCES `mydb`.`Reg_Confirmacao` (`idReg_Confirmacao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reg_Marcacao_Tipo_Refeicao1`
    FOREIGN KEY (`Tipo_Refeicao_idTipo_Refeicao`)
    REFERENCES `mydb`.`Tipo_Refeicao` (`idTipo_Refeicao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cod_temp`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cod_temp` (
  `Cod_temp` INT(6) NOT NULL,
  `data_inicio` DATETIME NULL,
  `data_fim` DATETIME NULL,
  `Formando_idFormando` INT NOT NULL,
  PRIMARY KEY (`Cod_temp`, `Formando_idFormando`),
  UNIQUE INDEX `idCod_temp_UNIQUE` (`Cod_temp` ASC) VISIBLE,
  INDEX `fk_Cod_temp_Formando1_idx` (`Formando_idFormando` ASC) VISIBLE,
  UNIQUE INDEX `Formando_idFormando_UNIQUE` (`Formando_idFormando` ASC) VISIBLE,
  CONSTRAINT `fk_Cod_temp_Formando1`
    FOREIGN KEY (`Formando_idFormando`)
    REFERENCES `mydb`.`Formando` (`idFormando`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Dias_Excluidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Dias_Excluidos` (
  `idDias_Excluidos` INT NOT NULL,
  `data` DATETIME NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `ADMIN_id_admin` INT NOT NULL,
  PRIMARY KEY (`idDias_Excluidos`, `ADMIN_id_admin`),
  UNIQUE INDEX `idDias_Excluidos_UNIQUE` (`idDias_Excluidos` ASC) VISIBLE,
  INDEX `fk_Dias_Excluidos_ADMIN1_idx` (`ADMIN_id_admin` ASC) VISIBLE,
  CONSTRAINT `fk_Dias_Excluidos_ADMIN1`
    FOREIGN KEY (`ADMIN_id_admin`)
    REFERENCES `mydb`.`ADMIN` (`id_admin`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
