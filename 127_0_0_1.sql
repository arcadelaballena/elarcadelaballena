-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-06-2014 a las 00:10:27
-- Versión del servidor: 5.6.16
-- Versión de PHP: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `basllena`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `imagenesjuegos`
--

CREATE TABLE IF NOT EXISTS `imagenesjuegos` (
  `ID` varchar(3) COLLATE utf8_spanish_ci NOT NULL,
  `portada` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `imagen1` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `imagen2` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `imagenesjuegos`
--

INSERT INTO `imagenesjuegos` (`ID`, `portada`, `imagen1`, `imagen2`) VALUES
('i1', 'http://i.imgur.com/BpJX60V.jpg', 'http://i.imgur.com/7cgVjLa.jpg', 'http://i.imgur.com/K0VX84j.jpg'),
('i10', 'http://i.imgur.com/yNrNeDI.jpg', 'http://i.imgur.com/pfVum2a.png', 'http://i.imgur.com/IITlXrC.jpg'),
('i11', 'http://i.imgur.com/Hvz6G0Q.jpg', 'http://i.imgur.com/6GThzwA.jpg', 'http://i.imgur.com/7vGLQ1X.jpg'),
('i12', 'http://i.imgur.com/wWpfiTX.jpg', 'http://i.imgur.com/OAHZOq9.jpg', 'http://i.imgur.com/8fwhojI.jpg'),
('i13', 'http://i.imgur.com/3joqPHA.png', 'http://i.imgur.com/gnnPC42.jpg', 'http://i.imgur.com/OMULcCg.jpg'),
('i14', 'http://i.imgur.com/nNNL7cC.jpg', 'http://i.imgur.com/878M1qB.jpg', 'http://i.imgur.com/hMqEPYD.png'),
('i15', 'http://i.imgur.com/NUB2svb.jpg', 'http://i.imgur.com/JWgLoEi.jpg', 'http://i.imgur.com/cUqvJpo.jpg'),
('i16', 'http://i.imgur.com/aJW5spA.jpg', 'http://i.imgur.com/dkE1aMb.jpg', 'http://i.imgur.com/ZDYg8wF.jpg'),
('i17', 'http://i.imgur.com/QweQgPo.png', 'http://i.imgur.com/OnLlvjT.jpg', 'http://i.imgur.com/BH4Gp8U.jpg'),
('i18', 'http://i.imgur.com/5Xa42aY.jpg', 'http://i.imgur.com/ot1gZp8.png', 'http://i.imgur.com/VCBgxq3.jpg'),
('i19', 'http://i.imgur.com/S7xO1FJ.jpg', 'http://i.imgur.com/VYRWlmX.jpg', 'http://i.imgur.com/RAnVAEi.jpg'),
('i2', 'http://i.imgur.com/H28eO5T.jpg', 'http://i.imgur.com/TW3lgwO.jpg', 'http://i.imgur.com/8ddyQMy.jpg'),
('i20', 'http://i.imgur.com/xMjkb7U.jpg', 'http://i.imgur.com/1AjFwJt.jpg', 'http://i.imgur.com/C3CmMzu.jpg'),
('i21', 'http://i.imgur.com/tjlT4BU.png', 'http://i.imgur.com/ECnRU8s.jpg', 'http://i.imgur.com/OcSzPHc.jpg'),
('i22', 'http://i.imgur.com/5wvXMO2.jpg', 'http://i.imgur.com/B1e5FIf.png', 'http://i.imgur.com/CsCOnrE.jpg'),
('i23', 'http://i.imgur.com/WYrneej.jpg', 'http://i.imgur.com/MnvqJ7L.jpg', 'http://i.imgur.com/v3kENXR.jpg'),
('i24', 'http://i.imgur.com/KiJKML0.jpg', 'http://i.imgur.com/Y7Myej1.jpg', 'http://i.imgur.com/L2F9kkz.png'),
('i25', 'http://i.imgur.com/gl9hO3D.jpg', 'http://i.imgur.com/uTeY0wr.png', 'http://i.imgur.com/TW3s1Pv.jpg'),
('i26', 'http://i.imgur.com/EIbsVTT.jpg', 'http://i.imgur.com/h1WOQKn.jpg', 'http://i.imgur.com/cb8ZT4v.jpg'),
('i27', 'http://i.imgur.com/WziRXRK.jpg', 'http://i.imgur.com/I3YZqAy.jpg', 'http://i.imgur.com/RkLS01H.jpg'),
('i3', 'http://i.imgur.com/zfK9ILI.jpg', 'http://i.imgur.com/faKmdTn.jpg', 'http://i.imgur.com/l5x8yrN.jpg'),
('i4', 'http://i.imgur.com/lx4Qdaq.jpg', 'http://i.imgur.com/dejbmp8.jpg', 'http://i.imgur.com/YypbeZq.jpg'),
('i5', 'http://i.imgur.com/SNcFozd.jpg', 'http://i.imgur.com/Nl4hnyz.jpg', 'http://i.imgur.com/J95pDeL.jpg'),
('i6', 'http://i.imgur.com/fn41qOb.jpg', 'http://i.imgur.com/wFv9VB2.jpg', 'http://i.imgur.com/UmHi9Qx.jpg'),
('i7', 'http://i.imgur.com/nKhrrDq.jpg', 'http://i.imgur.com/B555JPK.jpg', 'http://i.imgur.com/93BA9Om.jpg'),
('i8', 'http://i.imgur.com/nasyNoh.png', 'http://i.imgur.com/qge9Prh.jpg', 'http://i.imgur.com/AvYuMNe.jpg'),
('i9', 'http://i.imgur.com/oIavEvg.jpg', 'http://i.imgur.com/LgJ7G6Q.png', 'http://i.imgur.com/oGJfkq6.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juegos`
--

CREATE TABLE IF NOT EXISTS `juegos` (
  `ID` varchar(3) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `genero` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `desarrollador` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `distribuidor` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `fechaSalida` date NOT NULL,
  `comentario` varchar(1000) COLLATE utf8_spanish_ci NOT NULL,
  `enlace` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Conjunto total de juegos';

--
-- Volcado de datos para la tabla `juegos`
--

INSERT INTO `juegos` (`ID`, `nombre`, `genero`, `desarrollador`, `distribuidor`, `fechaSalida`, `comentario`, `enlace`) VALUES
('i1', 'Half Life 2', 'FPS', 'Valve', 'Valve', '2004-11-16', 'HALF-LIFE 2 supone un impacto en la industria de juegos con su combinación de acción frenética y narración continua y absorbente. El título de debut de Valve fue galardonado con más de 50 premios que lo consideraron el juego del año hasta convertirse en El mejor juego para PC de la historia, galardón concedido por la revista PC Gamer, y ha vendido más de ocho millones de unidades en todo el mundo.', 'http://store.steampowered.com/app/220/'),
('i10', 'GTA: Vice City', 'Accion', 'Rockstar', 'Rockstar', '2003-05-13', 'Bienvenido a los años 80. De la década de las grandes melenas, excesos y trajes de color pastel, regresa Grand Theft Auto, esta vez con la historia del ascenso de un hombre a lo más alto del mundo criminal. ', 'http://store.steampowered.com/agecheck/app/12110/'),
('i11', 'Company of Heroes', 'Estrategia', 'Relic Entertain', 'Sega', '2006-09-11', 'Proporcionando una visceral experiencia lúdica de la SGM, Company of Heroes redefine los juegos de estrategia en tiempo real reviviendo el sacrificio de heroicos soldados, los entornos devastados por la guerra y los dinámicos campos de batalla de la contienda. ', 'http://store.steampowered.com/app/4560/'),
('i12', 'Team Fortress 2', 'Accion', 'Valve', 'Valve', '2007-10-10', 'Nueve clases diferentes ofrecen una amplia variedad de habilidades tácticas y personalidades. Constantemente actualizado con nuevos modos de juego, mapas, equipamiento y, lo que es más importante, ¡sombreros! ', 'http://store.steampowered.com/app/440/'),
('i13', 'Thief Gold Edition', 'Accion', 'Looking GlassSt', 'Square Enix', '1998-11-30', 'Stalk your prey on the quest for stolen goods with your blackjack, sword, and an assortment of unique arrows. Steal for money and uncover the hidden agendas of your allies and enemies as you play through an unravelling story of deception and revenge. ', 'http://store.steampowered.com/app/211600/'),
('i14', 'System Shock 2', 'FPS', 'Irrational Game', 'Night Dive Stud', '1999-08-11', 'Recuerde, es mi voluntad que guió hasta aquí. Es mi voluntad que dio sus implantes cibernéticos, la única belleza en el que la carne se llama a un cuerpo. Si el valor que la carne ... que va a hacer lo que te digo. El culto clásico de terror de ciencia ficción FPS-RPG ha vuelto.', 'http://store.steampowered.com/app/238210/'),
('i15', 'Fallout 3', 'RPG', 'Bethesda', 'Bethesda', '2009-10-13', 'Los ingenieros de Vault-Tec han trabajado sin descanso en una reproducción interactiva de la vida en el Yermo para que la disfrutes desde la comodidad de tu refugio. Incluye un mundo en constante expansión, combates únicos, efectos visuales cargados de realismo, miles de decisiones para tomar y un increíble reparto de personajes... ', 'http://store.steampowered.com/app/22370/'),
('i16', 'Dishonored', 'Accion', 'Arkane Studios', 'Bethesda', '2012-10-11', 'Dishonored es un juego de acción en primera persona al que te entregarás por completo encarnando a un asesino sobrenatural movido por la sed de venganza. Un sistema de combate flexible te permitirá combinar una gran variedad de poderes sobrenaturales, armas y enrevesados artilugios para eliminar a tus enemigos.', 'http://store.steampowered.com/app/205100/'),
('i17', 'Deus Ex: Human Revolution', 'Accion', 'Eidos Montreal', 'Square Enix', '2013-10-25', 'Juegas como Adam Jensen, un ex SWAT al que han escogido para supervisar las necesidades defensivas de una de las empresas de biotecnología más experimentales de América. Tu trabajo consiste en proteger los secretos de la empresa.', 'http://store.steampowered.com/agecheck/app/238010/'),
('i18', 'Fez', 'Puzzle', 'Polytron', 'Trapdoor', '2013-05-01', 'Gomez is a 2D creature living in a 2D world. Or is he? When the existence of a mysterious 3rd dimension is revealed to him, Gomez is sent out on a journey that will take him to the very end of time and space. Use your ability to navigate 3D structures from 4 distinct classic 2D perspectives.', 'http://store.steampowered.com/app/224760/'),
('i19', 'Call of Duty', 'FPS', 'Infinity Ward', 'Activision', '2003-10-29', 'Call of Duty ofrece el descarnado realismo y la intensidad cinematográfica de las épicas batallas de la II Guerra Mundial como nunca antes: a través de los ojos de ciudadanos soldado y héroes olvidados de la alianza de naciones que ayudaron a conformar el curso de la historia moderna. ', 'http://store.steampowered.com/app/2620/'),
('i2', 'Bioshock', 'FPS', '2K Boston', '2K Games', '2007-08-21', 'BioShock es un shooter distinto a todos los que has jugado antes', 'http://store.steampowered.com/app/7670/'),
('i20', 'Crysis', 'FPS', 'Crytek', 'Electronic Arts', '2007-11-13', 'Adaptarse para Sobrevivir. Una épica historia que empuja a los jugadores a un ambiente en continuo cambio, forzándoles a adaptar sus tácticas y su acercamiento para conquistar campos de batalla que van desde junglas recién congeladas a ambientes alienígenas con gravedad cero. ¡Vístete para la ocasión!', 'http://store.steampowered.com/app/17300/'),
('i21', 'Mark of the Ninja', 'Estrategia', 'Klei Entertainm', 'Microsoft Studi', '2012-10-16', 'En Mark of the Ninja, sentirás lo que es ser un ninja de verdad. Deberás ser silencioso, ágil y llevar tu ingenio al máximo para burlar a tus oponentes en un mundo de escenarios maravillosos, con unas animaciones más que fluidas. ', 'http://store.steampowered.com/agecheck/app/214560/'),
('i22', 'Dota 2', 'MOBA', 'Valve', 'Valve', '2013-07-09', 'Dota comenzó como una modificación para Warcraft 3 creada por usuarios del mismo título y se ha convertido en uno de los juegos online más jugados del mundo. Siguiendo la tradición de Counter-Strike, Day of Defeat, Team Fortress, Portal y Alien Swarm.', 'http://store.steampowered.com/app/570/'),
('i23', 'Spelunky', 'Roguelike', 'Mossmouth', 'Mossmouth', '2013-08-08', 'Spelunky es un juego de plataformas único con niveles aleatorios que ofrecen una nueva experiencia desafiante cada vez que juegues. Subterránea profunda viaje y explorar lugares fantásticos llenos de toda clase de monstruos, trampas y tesoros. Tendrás total libertad mientras navega los entornos totalmente destructibles y dominar sus muchos secretos.', 'http://store.steampowered.com/app/239350/'),
('i24', 'Brothers: A Tale of Two Sons', 'Aventura', 'Starbreeze Stud', '505Games', '2013-09-03', ' Acompaña a los hermanos por su viaje épico de cuento de hadas, creado por Josef Fares, el visionario director sueco, y el desarrollador de primera Starbreeze Studios. Controla a ambos hermanos al mismo tiempo: una mecánica de juego de un jugador, pero cooperativo... ¡Lo nunca visto! ', 'http://store.steampowered.com/app/225080/'),
('i25', 'Braid', 'Puzzle', 'Number None', 'Number None', '2009-04-11', 'Braid es un juego de rompecabezas con toques plataformeros, presentado con un estilo pictórico, donde puedes manipular el flujo del tiempo de unas maneras inusuales y extrañas. Desde una casa en la ciudad, comenzarás una aventura hacia una serie de mundos y resolverás rompecabezas para rescatar una princesa raptada.', 'http://store.steampowered.com/app/26800/'),
('i26', 'Borderlands 2', 'FPS', 'Gearbox', '2K Games', '2012-09-21', 'Una nueva era de disparos y saqueos está a punto de comenzar. Juega como uno de los cuatro nuevos buscadores de la Cámara y enfréntate a legiones de nuevas criaturas, psicópatas y al villano que las controla, Jack el Guapo. Haz nuevos amigos, equípalos con un cillón de armas y pelea a su lado en partidas cooperativas de 4 jugadores, en una implacable búsqueda de venganza y redención a través de un desconocido e impredecible planeta.', 'http://store.steampowered.com/agecheck/app/49520/'),
('i27', 'XCOM: Enemy Unknown', 'Estrategia', 'Firaxis', '2K Games', '2012-10-11', 'XCOM: Enemy Unknown te pone al mando de una organización paramilitar secreta llamada XCOM. Como comandante de XCOM, defenderás la Tierra de una aterradora invasión alienígena a base de administrar recursos, desarrollar tecnologías y supervisar tanto estrategias de combate como tácticas de unidades individuales.', 'http://store.steampowered.com/agecheck/app/200510/'),
('i3', 'Half Life', 'FPS', 'Valve', 'Valve', '1998-11-08', 'HALF-LIFE supone un impacto en la industria de juegos con su combinación de acción frenética y narración continua y absorbente. El título de debut de Valve fue galardonado con más de 50 premios que lo consideraron el juego del año hasta convertirse en El mejor juego para PC de la historia, galardón concedido por la revista PC Gamer, y ha vendido más de ocho millones de unidades en todo el mundo.', 'http://store.steampowered.com/app/70/'),
('i4', 'Portal 2', 'Puzzle', 'Valve', 'Valve', '2011-04-19', 'Portal 2 continúa con esa fórmula ganadora consistente en una innovadora mecánica de juego, historia y música que condujeron al Portal original a ganar más de 70 galardones y lo convirtieron en un nuevo mito de la industria.', 'http://store.steampowered.com/app/620/'),
('i5', 'The Elder Scrolls V: Skyrim', 'RPG', 'Bethesda', 'Bethesda', '2011-11-11', 'El nuevo capítulo de la esperadísima saga Elder Scrolls llega de la mano de los creadores de los Juegos del Año 2006 y 2008, Bethesda Game Studios. Skyrim reinventa y el revoluciona el épico universo de fantasía, dando vida a un completo mundo virtual para que puedas explorarlo de la forma que quieras.', 'http://store.steampowered.com/agecheck/app/72850/'),
('i6', 'Bioshock: Infinite', 'FPS', 'Irrational Game', '2K Games', '2013-03-25', 'En deuda con la gente equivocada, con su vida en la línea, veterano de la Caballería de EE.UU. y la pistola ahora contratado, Booker DeWitt tiene sólo una oportunidad para limpiar su pizarra limpia. Se debe rescatar a Elizabeth, una misteriosa chica en prisión desde la infancia y encerrado en la ciudad voladora de Columbia.', 'http://store.steampowered.com/agecheck/app/8870/'),
('i7', 'Civilization IV', 'Estrategia', 'Firaxis Games', '2K Games', '2005-10-25', 'Con más de 6 millones de unidades vendidas y elogiosas críticas sin precedentes por parte de aficionados y prensa de todo el mundo, Sid Meier''s Civilization está considerada como una de las mejores franquicias de juegos para PC de todos los tiempos.', 'http://store.steampowered.com/app/3900/'),
('i8', 'Mass Effect 2', 'RPG', 'Bioware', 'Electronic Arts', '2010-01-28', '¡De los creadores de Star Wars®: Knights of the Old Republic™, Dragon Age: Origins™, y Mass Effect™ llega la segunda y oscura entrega de la emocionante trilogía Mass Effect! Dos años después de que el Comandante Shepard lograse repeler a los invasores Reapers empeñados en destruir toda vida orgánica, emerge un nuevo y misterioso enemigo. ', 'http://store.steampowered.com/app/24980/'),
('i9', 'The Elder Scrolls IV: Oblivion', 'RPG', 'Bethesda', 'Bethesda', '2007-09-11', 'The Elder Scrolls IV: Oblivion® Edición Juego del Año presenta uno de los mejores juegos de rol de todos los tiempos como nunca se había visto hasta ahora. Adéntrate en el mundo más detallado y emocionante jamás creado.', 'http://store.steampowered.com/app/22330/');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `IDu` varchar(5) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `contraseña` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `admin` tinyint(1) NOT NULL,
  `email` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`IDu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Usuarios del programa';

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`IDu`, `nombre`, `contraseña`, `admin`, `email`) VALUES
('1', 'tiger', 'tiger', 0, 'prueba@hotmail.com');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `imagenesjuegos`
--
ALTER TABLE `imagenesjuegos`
  ADD CONSTRAINT `imagenesjuegos_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `juegos` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;
--
-- Base de datos: `cdcol`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cds`
--

CREATE TABLE IF NOT EXISTS `cds` (
  `titel` varchar(200) COLLATE latin1_general_ci DEFAULT NULL,
  `interpret` varchar(200) COLLATE latin1_general_ci DEFAULT NULL,
  `jahr` int(11) DEFAULT NULL,
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `cds`
--

INSERT INTO `cds` (`titel`, `interpret`, `jahr`, `id`) VALUES
('Beauty', 'Ryuichi Sakamoto', 1990, 1),
('Goodbye Country (Hello Nightclub)', 'Groove Armada', 2001, 4),
('Glee', 'Bran Van 3000', 1997, 5);
--
-- Base de datos: `phpmyadmin`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_bookmark`
--

CREATE TABLE IF NOT EXISTS `pma_bookmark` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dbase` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `user` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `label` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `query` text COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Bookmarks' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_column_info`
--

CREATE TABLE IF NOT EXISTS `pma_column_info` (
  `id` int(5) unsigned NOT NULL AUTO_INCREMENT,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `column_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `mimetype` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `db_name` (`db_name`,`table_name`,`column_name`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Column information for phpMyAdmin' AUTO_INCREMENT=26 ;

--
-- Volcado de datos para la tabla `pma_column_info`
--

INSERT INTO `pma_column_info` (`id`, `db_name`, `table_name`, `column_name`, `comment`, `mimetype`, `transformation`, `transformation_options`) VALUES
(1, 'PruebaBD', 'Personas', 'DNI', '', '', '_', ''),
(2, 'PruebaBD', 'Personas', 'Nombre', '', '', '_', ''),
(3, 'PruebaBD', 'Personas', 'Edad', '', '', '_', ''),
(4, 'PruebaBD', 'Personas', 'Sexo', '', '', '_', ''),
(5, 'PruebaBD', 'Personas', 'Profesion', '', '', '_', ''),
(6, 'pruebabd', 'personas', 'Nombre', '', '', '_', ''),
(7, 'pruebabd', 'personas', 'Edad', '', '', '_', ''),
(8, 'pruebabd', 'personas', 'Sexo', '', '', '_', ''),
(9, 'basllena', 'juegos', 'ID', '', '', '_', ''),
(10, 'basllena', 'juegos', 'nombre', '', '', '_', ''),
(11, 'basllena', 'juegos', 'genero', '', '', '_', ''),
(12, 'basllena', 'juegos', 'desarrollador', '', '', '_', ''),
(13, 'basllena', 'juegos', 'distribuidor', '', '', '_', ''),
(14, 'basllena', 'juegos', 'fechaSalida', '', '', '_', ''),
(15, 'basllena', 'juegos', 'comentario', '', '', '_', ''),
(16, 'basllena', 'juegos', 'enlace', '', '', '_', ''),
(17, 'basllena', 'usuarios', 'IDu', '', '', '_', ''),
(18, 'basllena', 'usuarios', 'nombre', '', '', '_', ''),
(19, 'basllena', 'usuarios', 'contraseÃ±a', '', '', '_', ''),
(20, 'basllena', 'usuarios', 'admin', '', '', '_', ''),
(21, 'basllena', 'usuarios', 'email', '', '', '_', ''),
(22, 'basllena', 'ImagenesJuegos', 'ID', '', '', '_', ''),
(23, 'basllena', 'ImagenesJuegos', 'portada', '', '', '_', ''),
(24, 'basllena', 'ImagenesJuegos', 'imagen1', '', '', '_', ''),
(25, 'basllena', 'ImagenesJuegos', 'imagen2', '', '', '_', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_designer_coords`
--

CREATE TABLE IF NOT EXISTS `pma_designer_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `x` int(11) DEFAULT NULL,
  `y` int(11) DEFAULT NULL,
  `v` tinyint(4) DEFAULT NULL,
  `h` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`db_name`,`table_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for Designer';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_history`
--

CREATE TABLE IF NOT EXISTS `pma_history` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `timevalue` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sqlquery` text COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `username` (`username`,`db`,`table`,`timevalue`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='SQL history for phpMyAdmin' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_pdf_pages`
--

CREATE TABLE IF NOT EXISTS `pma_pdf_pages` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `page_nr` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `page_descr` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT '',
  PRIMARY KEY (`page_nr`),
  KEY `db_name` (`db_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='PDF relation pages for phpMyAdmin' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_recent`
--

CREATE TABLE IF NOT EXISTS `pma_recent` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Recently accessed tables';

--
-- Volcado de datos para la tabla `pma_recent`
--

INSERT INTO `pma_recent` (`username`, `tables`) VALUES
('root', '[{"db":"basllena","table":"usuarios"},{"db":"basllena","table":"imagenesjuegos"},{"db":"basllena","table":"juegos"},{"db":"basllena","table":"ImagenesJuegos"},{"db":"pruebabd","table":"personas"},{"db":"PruebaBD","table":"personas"},{"db":"PruebaBD","table":"Personas"},{"db":"phpmyadmin","table":"pma_column_info"},{"db":"phpmyadmin","table":"pma_designer_coords"},{"db":"phpmyadmin","table":"pma_history"}]');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_relation`
--

CREATE TABLE IF NOT EXISTS `pma_relation` (
  `master_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  PRIMARY KEY (`master_db`,`master_table`,`master_field`),
  KEY `foreign_field` (`foreign_db`,`foreign_table`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Relation table';

--
-- Volcado de datos para la tabla `pma_relation`
--

INSERT INTO `pma_relation` (`master_db`, `master_table`, `master_field`, `foreign_db`, `foreign_table`, `foreign_field`) VALUES
('basllena', 'imagenesjuegos', 'ID', 'basllena', 'juegos', 'ID');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_table_coords`
--

CREATE TABLE IF NOT EXISTS `pma_table_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pdf_page_number` int(11) NOT NULL DEFAULT '0',
  `x` float unsigned NOT NULL DEFAULT '0',
  `y` float unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`db_name`,`table_name`,`pdf_page_number`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for phpMyAdmin PDF output';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_table_info`
--

CREATE TABLE IF NOT EXISTS `pma_table_info` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `display_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  PRIMARY KEY (`db_name`,`table_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_table_uiprefs`
--

CREATE TABLE IF NOT EXISTS `pma_table_uiprefs` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `prefs` text COLLATE utf8_bin NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`username`,`db_name`,`table_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tables'' UI preferences';

--
-- Volcado de datos para la tabla `pma_table_uiprefs`
--

INSERT INTO `pma_table_uiprefs` (`username`, `db_name`, `table_name`, `prefs`, `last_update`) VALUES
('root', 'basllena', 'juegos', '{"sorted_col":"`juegos`.`ID` ASC"}', '2014-06-17 19:48:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_tracking`
--

CREATE TABLE IF NOT EXISTS `pma_tracking` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `version` int(10) unsigned NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `schema_snapshot` text COLLATE utf8_bin NOT NULL,
  `schema_sql` text COLLATE utf8_bin,
  `data_sql` longtext COLLATE utf8_bin,
  `tracking` set('UPDATE','REPLACE','INSERT','DELETE','TRUNCATE','CREATE DATABASE','ALTER DATABASE','DROP DATABASE','CREATE TABLE','ALTER TABLE','RENAME TABLE','DROP TABLE','CREATE INDEX','DROP INDEX','CREATE VIEW','ALTER VIEW','DROP VIEW') COLLATE utf8_bin DEFAULT NULL,
  `tracking_active` int(1) unsigned NOT NULL DEFAULT '1',
  PRIMARY KEY (`db_name`,`table_name`,`version`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT COMMENT='Database changes tracking for phpMyAdmin';

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pma_userconfig`
--

CREATE TABLE IF NOT EXISTS `pma_userconfig` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `timevalue` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `config_data` text COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User preferences storage for phpMyAdmin';

--
-- Volcado de datos para la tabla `pma_userconfig`
--

INSERT INTO `pma_userconfig` (`username`, `timevalue`, `config_data`) VALUES
('root', '2014-06-05 17:52:50', '{"lang":"es","collation_connection":"utf8mb4_general_ci","Export\\/file_template_database":"BASLLENA"}');
--
-- Base de datos: `pruebabd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE IF NOT EXISTS `personas` (
  `DNI` int(9) NOT NULL,
  `Nombre` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `Edad` int(3) NOT NULL,
  `Sexo` varchar(2) COLLATE utf8_spanish_ci NOT NULL,
  `Profesion` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`DNI`, `Nombre`, `Edad`, `Sexo`, `Profesion`) VALUES
(23524, 'sgs', 45, 'M', 'sfsf'),
(34235, 'zcac', 23, 'H', 'asfasf'),
(89104, 'Miaqu', 1, 'M', 'Gatuna'),
(345659, 'Vicky', 20, 'M', 'Estudianta'),
(355555, 'prueba', 22, 'H', 'probando'),
(361510, 'Pedro', 23, 'H', 'Programa'),
(361530, 'Pedro', 23, 'H', 'Programa'),
(3155450, 'Pedro', 23, 'H', 'Prog'),
(36155010, 'Petro', 26, 'H', 'meca');
--
-- Base de datos: `test`
--
--
-- Base de datos: `webauth`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_pwd`
--

CREATE TABLE IF NOT EXISTS `user_pwd` (
  `name` char(30) COLLATE latin1_general_ci NOT NULL DEFAULT '',
  `pass` char(32) COLLATE latin1_general_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Volcado de datos para la tabla `user_pwd`
--

INSERT INTO `user_pwd` (`name`, `pass`) VALUES
('xampp', 'wampp');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
