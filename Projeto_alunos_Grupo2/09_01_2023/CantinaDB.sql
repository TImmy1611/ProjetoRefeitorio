-- --------------------------------------------------------
-- Anfitrião:                    127.0.0.1
-- Versão do servidor:           5.7.24 - MySQL Community Server (GPL)
-- SO do servidor:               Win64
-- HeidiSQL Versão:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- A despejar estrutura da base de dados para dbcantina
CREATE DATABASE IF NOT EXISTS `dbcantina` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `dbcantina`;

-- A despejar estrutura para tabela dbcantina.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `id_admin` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(50) NOT NULL DEFAULT '',
  `Login` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `Tipo_admin_id_tipoadmin` int(11) NOT NULL,
  `Estado_atividade_idEstado_atividade` int(11) NOT NULL,
  PRIMARY KEY (`id_admin`,`Tipo_admin_id_tipoadmin`,`Estado_atividade_idEstado_atividade`),
  UNIQUE KEY `idADMIN_UNIQUE` (`id_admin`),
  UNIQUE KEY `Login_UNIQUE` (`Login`),
  KEY `fk_ADMIN_Tipo_admin_idx` (`Tipo_admin_id_tipoadmin`),
  KEY `fk_ADMIN_Estado_atividade1_idx` (`Estado_atividade_idEstado_atividade`),
  CONSTRAINT `fk_ADMIN_Estado_atividade1` FOREIGN KEY (`Estado_atividade_idEstado_atividade`) REFERENCES `estado_atividade` (`idEstado_atividade`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ADMIN_Tipo_admin` FOREIGN KEY (`Tipo_admin_id_tipoadmin`) REFERENCES `tipo_admin` (`id_tipoadmin`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.admin: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`id_admin`, `Nome`, `Login`, `Password`, `Tipo_admin_id_tipoadmin`, `Estado_atividade_idEstado_atividade`) VALUES
	(1, '', 'Jorge', '123456789', 1, 1),
	(2, '', 'Miguel', '987654321', 2, 1),
	(3, '', 'Paulo', '999888777', 2, 1),
	(4, '', 'Tiago', '111222333', 1, 0),
	(5, '', 'Fernando', '987456321', 1, 0),
	(6, '', 'Sofia', 'coisasdegaja', 1, 0),
	(7, '', 'Boss', 'BigBoss', 1, 0),
	(8, '', 'Boss2', 'BigBoss2', 2, 0),
	(9, 'Joaquina', 'Barrote ', '12', 3, 1);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.cartao
CREATE TABLE IF NOT EXISTS `cartao` (
  `idCartao` int(11) NOT NULL,
  `cod_HEX` varchar(45) NOT NULL,
  `Formando_idFormando` int(11) NOT NULL,
  PRIMARY KEY (`idCartao`,`Formando_idFormando`),
  UNIQUE KEY `idCartao_UNIQUE` (`idCartao`),
  UNIQUE KEY `cod_HEX_UNIQUE` (`cod_HEX`),
  KEY `fk_Cartao_Formando1_idx` (`Formando_idFormando`),
  CONSTRAINT `fk_Cartao_Formando1` FOREIGN KEY (`Formando_idFormando`) REFERENCES `formando` (`idFormando`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.cartao: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `cartao` DISABLE KEYS */;
INSERT INTO `cartao` (`idCartao`, `cod_HEX`, `Formando_idFormando`) VALUES
	(1, '053deb9af41dd24b07ff1dadf31b36e9', 1),
	(2, '216213d697416bfc96431c26cbf2aa2e', 2),
	(6, '4e74ad9b761a109c42f32a48af096f9f', 6),
	(4, '72e39d63fde06186f85d7ce1a257d649', 4),
	(5, 'a1782cde399aa463a9350c3584759b7d', 5),
	(7, 'b1c7dc4e4539c0549c028f708241101a', 7),
	(3, 'eba907ee79de1682434d52346b88b42d', 3);
/*!40000 ALTER TABLE `cartao` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.cod_temp
CREATE TABLE IF NOT EXISTS `cod_temp` (
  `Cod_temp` int(6) NOT NULL,
  `data_inicio` datetime DEFAULT NULL,
  `data_fim` datetime DEFAULT NULL,
  `Formando_idFormando` int(11) NOT NULL,
  PRIMARY KEY (`Cod_temp`,`Formando_idFormando`),
  UNIQUE KEY `idCod_temp_UNIQUE` (`Cod_temp`),
  UNIQUE KEY `Formando_idFormando_UNIQUE` (`Formando_idFormando`),
  KEY `fk_Cod_temp_Formando1_idx` (`Formando_idFormando`),
  CONSTRAINT `fk_Cod_temp_Formando1` FOREIGN KEY (`Formando_idFormando`) REFERENCES `formando` (`idFormando`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.cod_temp: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `cod_temp` DISABLE KEYS */;
/*!40000 ALTER TABLE `cod_temp` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.dias_excluidos
CREATE TABLE IF NOT EXISTS `dias_excluidos` (
  `idDias_Excluidos` int(11) NOT NULL,
  `data` datetime NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `ADMIN_id_admin` int(11) NOT NULL,
  PRIMARY KEY (`idDias_Excluidos`,`ADMIN_id_admin`),
  UNIQUE KEY `idDias_Excluidos_UNIQUE` (`idDias_Excluidos`),
  KEY `fk_Dias_Excluidos_ADMIN1_idx` (`ADMIN_id_admin`),
  CONSTRAINT `fk_Dias_Excluidos_ADMIN1` FOREIGN KEY (`ADMIN_id_admin`) REFERENCES `admin` (`id_admin`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.dias_excluidos: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `dias_excluidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `dias_excluidos` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.ementa
CREATE TABLE IF NOT EXISTS `ementa` (
  `idEmenta` int(11) NOT NULL,
  `sopa` varchar(45) NOT NULL,
  `carne` varchar(45) NOT NULL,
  `peixe` varchar(45) NOT NULL,
  `veg` varchar(45) NOT NULL,
  `sobremesa` varchar(45) NOT NULL,
  PRIMARY KEY (`idEmenta`),
  KEY `sopa` (`sopa`),
  KEY `carne` (`carne`),
  KEY `peixe` (`peixe`),
  KEY `veg` (`veg`),
  KEY `sobremesa` (`sobremesa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.ementa: ~10 rows (aproximadamente)
/*!40000 ALTER TABLE `ementa` DISABLE KEYS */;
INSERT INTO `ementa` (`idEmenta`, `sopa`, `carne`, `peixe`, `veg`, `sobremesa`) VALUES
	(1, 'Sopa de Feojao', 'Feijoada', 'Peixe com Feijao', 'Feijao', 'humus de feijao'),
	(2, 'Sopa de Agriao', 'Bitoque', 'Bacalhau', 'Grao', 'mousse'),
	(3, 'Sopa de cenoura', 'Vaca', 'Pescada', 'Ervilhas', 'Bolo de chocolate'),
	(4, 'Sopa de abobora', 'Carne de porco', 'Peixe-Gato', 'Bolonhesa de soja', 'Pudim'),
	(5, 'Sopa de caldo-verde', 'Almondegas', 'Camarao', 'Pizza de soja', 'Maca-assada'),
	(6, 'Sopa de Agriao', 'Vaca', 'Bacalhau', 'Ervilhas', 'humus'),
	(7, 'Sopa de Agriao', 'Bitoque', 'Pescada', 'Tarte-Vegetariana', 'humus'),
	(8, 'Canja', 'Rolo de carne', 'Bacalhau à brás', 'Legumes à brás', 'Pudim'),
	(9, 'Sopa de cenoura', 'Frango', 'Polvo', 'Peixinhos da Horta', 'Pizza'),
	(10, 'Sopa de cavalo cansado', 'Carne picada', 'Sushi', 'Risotto', 'Rabanada');
/*!40000 ALTER TABLE `ementa` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.estado_atividade
CREATE TABLE IF NOT EXISTS `estado_atividade` (
  `idEstado_atividade` int(11) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  PRIMARY KEY (`idEstado_atividade`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.estado_atividade: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `estado_atividade` DISABLE KEYS */;
INSERT INTO `estado_atividade` (`idEstado_atividade`, `descricao`) VALUES
	(0, 'Inativo'),
	(1, 'Ativo');
/*!40000 ALTER TABLE `estado_atividade` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.formando
CREATE TABLE IF NOT EXISTS `formando` (
  `idFormando` int(11) NOT NULL,
  `Nome` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `NIF` int(9) NOT NULL,
  `Tipo_Residencia_idTipo_Residencia` int(11) NOT NULL,
  `Estado_atividade_idEstado_atividade` int(11) NOT NULL,
  PRIMARY KEY (`idFormando`,`Tipo_Residencia_idTipo_Residencia`,`Estado_atividade_idEstado_atividade`),
  UNIQUE KEY `idFormando_UNIQUE` (`idFormando`),
  UNIQUE KEY `NIF_UNIQUE` (`NIF`),
  KEY `fk_Formando_Tipo_Residencia1_idx` (`Tipo_Residencia_idTipo_Residencia`),
  KEY `fk_Formando_Estado_atividade1_idx` (`Estado_atividade_idEstado_atividade`),
  CONSTRAINT `fk_Formando_Estado_atividade1` FOREIGN KEY (`Estado_atividade_idEstado_atividade`) REFERENCES `estado_atividade` (`idEstado_atividade`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Formando_Tipo_Residencia1` FOREIGN KEY (`Tipo_Residencia_idTipo_Residencia`) REFERENCES `tipo_residencia` (`idTipo_Residencia`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.formando: ~23 rows (aproximadamente)
/*!40000 ALTER TABLE `formando` DISABLE KEYS */;
INSERT INTO `formando` (`idFormando`, `Nome`, `Email`, `NIF`, `Tipo_Residencia_idTipo_Residencia`, `Estado_atividade_idEstado_atividade`) VALUES
	(1, 'Henrique', '', 123456789, 1, 1),
	(2, 'Joaquim', '', 987654321, 0, 0),
	(3, 'Maria', '', 123654789, 1, 1),
	(4, 'Telmo', '', 321456789, 1, 1),
	(5, 'Jesualdo', '', 456222111, 0, 1),
	(6, 'Matias', '', 111999888, 0, 0),
	(7, 'Timoteo', '', 444555666, 0, 1),
	(8, 'Josefino', '', 353535322, 1, 1);
/*!40000 ALTER TABLE `formando` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.menu_mensal
CREATE TABLE IF NOT EXISTS `menu_mensal` (
  `idMenu_Mensal` int(11) NOT NULL,
  `data` datetime NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `Ementa_idEmenta` int(11) NOT NULL,
  PRIMARY KEY (`idMenu_Mensal`,`Ementa_idEmenta`),
  UNIQUE KEY `idMenu_Mensal_UNIQUE` (`idMenu_Mensal`),
  UNIQUE KEY `data_UNIQUE` (`data`),
  KEY `fk_Menu_Mensal_Ementa1_idx` (`Ementa_idEmenta`),
  CONSTRAINT `fk_Menu_Mensal_Ementa1` FOREIGN KEY (`Ementa_idEmenta`) REFERENCES `ementa` (`idEmenta`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.menu_mensal: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `menu_mensal` DISABLE KEYS */;
INSERT INTO `menu_mensal` (`idMenu_Mensal`, `data`, `descricao`, `Ementa_idEmenta`) VALUES
	(1, '2023-01-02 15:07:02', 'Hoje', 1);
/*!40000 ALTER TABLE `menu_mensal` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.reg_confirmacao
CREATE TABLE IF NOT EXISTS `reg_confirmacao` (
  `idReg_Confirmacao` binary(1) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  PRIMARY KEY (`idReg_Confirmacao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.reg_confirmacao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `reg_confirmacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `reg_confirmacao` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.reg_marcacao
CREATE TABLE IF NOT EXISTS `reg_marcacao` (
  `idReg_Marcacao` int(11) NOT NULL,
  `data` datetime NOT NULL,
  `Cartao_idCartao` int(11) NOT NULL,
  `Reg_Confirmacao_idReg_Confirmacao` binary(50) NOT NULL DEFAULT '\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0',
  `Tipo_Refeicao_idTipo_Refeicao` int(11) NOT NULL,
  PRIMARY KEY (`idReg_Marcacao`),
  KEY `FK_reg_marcacao_cartao` (`Cartao_idCartao`),
  KEY `FK_reg_marcacao_tipo_refeicao` (`Tipo_Refeicao_idTipo_Refeicao`),
  KEY `FK_reg_marcacao_reg_confirmacao` (`Reg_Confirmacao_idReg_Confirmacao`),
  CONSTRAINT `FK_reg_marcacao_cartao` FOREIGN KEY (`Cartao_idCartao`) REFERENCES `cartao` (`idCartao`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_reg_marcacao_reg_confirmacao` FOREIGN KEY (`Reg_Confirmacao_idReg_Confirmacao`) REFERENCES `reg_confirmacao` (`idReg_Confirmacao`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_reg_marcacao_tipo_refeicao` FOREIGN KEY (`Tipo_Refeicao_idTipo_Refeicao`) REFERENCES `tipo_refeicao` (`idTipo_Refeicao`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.reg_marcacao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `reg_marcacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `reg_marcacao` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.tipo_admin
CREATE TABLE IF NOT EXISTS `tipo_admin` (
  `id_tipoadmin` int(11) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  PRIMARY KEY (`id_tipoadmin`),
  UNIQUE KEY `idTipo_admin_UNIQUE` (`id_tipoadmin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.tipo_admin: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo_admin` DISABLE KEYS */;
INSERT INTO `tipo_admin` (`id_tipoadmin`, `descricao`) VALUES
	(1, 'Super_Admin'),
	(2, 'Admin'),
	(3, 'Admin_Financeiro');
/*!40000 ALTER TABLE `tipo_admin` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.tipo_refeicao
CREATE TABLE IF NOT EXISTS `tipo_refeicao` (
  `idTipo_Refeicao` int(11) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  PRIMARY KEY (`idTipo_Refeicao`),
  UNIQUE KEY `idTipo_Refeicao_UNIQUE` (`idTipo_Refeicao`),
  UNIQUE KEY `descricao_UNIQUE` (`descricao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.tipo_refeicao: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo_refeicao` DISABLE KEYS */;
INSERT INTO `tipo_refeicao` (`idTipo_Refeicao`, `descricao`) VALUES
	(1, 'Carne'),
	(5, 'Jantar'),
	(2, 'Peixe'),
	(4, 'Peq_almoco'),
	(3, 'Vegetariano');
/*!40000 ALTER TABLE `tipo_refeicao` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.tipo_residencia
CREATE TABLE IF NOT EXISTS `tipo_residencia` (
  `idTipo_Residencia` int(11) NOT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTipo_Residencia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.tipo_residencia: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo_residencia` DISABLE KEYS */;
INSERT INTO `tipo_residencia` (`idTipo_Residencia`, `descricao`) VALUES
	(0, 'Nao-residente'),
	(1, 'Residente');
/*!40000 ALTER TABLE `tipo_residencia` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.turma
CREATE TABLE IF NOT EXISTS `turma` (
  `idTurma` int(11) NOT NULL AUTO_INCREMENT,
  `data_inicio` date NOT NULL,
  `data_fim` date NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `cod_curso` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idTurma`),
  UNIQUE KEY `idTurma_UNIQUE` (`idTurma`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.turma: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `turma` DISABLE KEYS */;
INSERT INTO `turma` (`idTurma`, `data_inicio`, `data_fim`, `descricao`, `cod_curso`) VALUES
	(1, '2023-01-02', '2024-01-02', 'Técnico de Programacao', NULL),
	(2, '2024-01-02', '2025-01-02', 'Técnico de Multimedia', NULL),
	(3, '2025-01-02', '2025-01-02', 'Técnico de Ceramica', NULL),
	(4, '2000-01-02', '2022-01-02', 'Técnico de Tecnicidades', NULL);
/*!40000 ALTER TABLE `turma` ENABLE KEYS */;

-- A despejar estrutura para tabela dbcantina.turma_has_formando
CREATE TABLE IF NOT EXISTS `turma_has_formando` (
  `Turma_idTurma` int(11) NOT NULL DEFAULT '0',
  `Formando_idFormando` int(11) NOT NULL,
  PRIMARY KEY (`Turma_idTurma`,`Formando_idFormando`),
  KEY `fk_Turma_has_Formando_Formando1_idx` (`Formando_idFormando`),
  KEY `fk_Turma_has_Formando_Turma1_idx` (`Turma_idTurma`),
  CONSTRAINT `fk_Turma_has_Formando_Formando1` FOREIGN KEY (`Formando_idFormando`) REFERENCES `formando` (`idFormando`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Turma_has_Formando_Turma1` FOREIGN KEY (`Turma_idTurma`) REFERENCES `turma` (`idTurma`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- A despejar dados para tabela dbcantina.turma_has_formando: ~23 rows (aproximadamente)
/*!40000 ALTER TABLE `turma_has_formando` DISABLE KEYS */;
INSERT INTO `turma_has_formando` (`Turma_idTurma`, `Formando_idFormando`) VALUES
	(1, 1),
	(4, 2),
	(3, 3),
	(2, 4),
	(2, 5),
	(4, 6),
	(1, 7),
	(1, 8);
/*!40000 ALTER TABLE `turma_has_formando` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;