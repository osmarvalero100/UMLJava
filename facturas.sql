-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-02-2015 a las 19:42:17
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `facturas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `codcliente` varchar(5) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `nit` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`codcliente`, `nombre`, `direccion`, `nit`) VALUES
('001', 'Lucas Shoes LTDA', 'Calle 59 # 20 -20', '5635656');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle`
--

CREATE TABLE IF NOT EXISTS `detalle` (
  `codFactura` varchar(6) DEFAULT NULL,
  `idproducto` varchar(5) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle`
--

INSERT INTO `detalle` (`codFactura`, `idproducto`, `cantidad`) VALUES
('c001', 'p001', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
  `idfactura` varchar(6) NOT NULL,
  `idcliente` varchar(5) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`idfactura`, `idcliente`, `fecha`) VALUES
('C001', '001', '2015-01-13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `codproducto` varchar(5) NOT NULL,
  `idnombre` varchar(15) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codproducto`, `idnombre`, `precio`) VALUES
('p001', 'TABLET ASSUS 20', 299900),
('p002', 'SPEAKERS B-79', 25000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
 ADD PRIMARY KEY (`codcliente`);

--
-- Indices de la tabla `detalle`
--
ALTER TABLE `detalle`
 ADD KEY `detalle_producto_FK1` (`idproducto`), ADD KEY `detalle_factura_FK1` (`codFactura`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
 ADD PRIMARY KEY (`idfactura`), ADD KEY `factura_FK1` (`idcliente`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
 ADD PRIMARY KEY (`codproducto`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle`
--
ALTER TABLE `detalle`
ADD CONSTRAINT `detalle_factura_FK1` FOREIGN KEY (`codFactura`) REFERENCES `factura` (`idfactura`),
ADD CONSTRAINT `detalle_producto_FK1` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`codproducto`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
ADD CONSTRAINT `factura_FK1` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`codcliente`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
