-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-12-2023 a las 05:25:24
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `citas_medicas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `cod_cita` int(11) NOT NULL,
  `nombre_cita` varchar(100) NOT NULL,
  `fecha_cita` date NOT NULL,
  `hora_cita` varchar(50) NOT NULL,
  `direccion_cita` varchar(100) NOT NULL,
  `consultorio_cita` varchar(10) NOT NULL,
  `documento_med` int(11) NOT NULL,
  `documento_pac` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`cod_cita`, `nombre_cita`, `fecha_cita`, `hora_cita`, `direccion_cita`, `consultorio_cita`, `documento_med`, `documento_pac`) VALUES
(1, 'Chequeo Cardiaco', '2024-01-06', '18:00', 'Calle 100 #23-22', '404', 1001123456, 1100123456),
(4, 'tension', '2023-01-12', '11:00', 'Calle 100', '303', 1001123456, 1100123456);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contacto_med`
--

CREATE TABLE `contacto_med` (
  `cod_contactom` int(11) NOT NULL,
  `documento_med` int(11) NOT NULL,
  `cod_telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `contacto_med`
--

INSERT INTO `contacto_med` (`cod_contactom`, `documento_med`, `cod_telefono`) VALUES
(1, 1001123456, 1),
(2, 1002123456, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contacto_p`
--

CREATE TABLE `contacto_p` (
  `cod_contactop` int(11) NOT NULL,
  `documento_pac` int(11) NOT NULL,
  `cod_telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `contacto_p`
--

INSERT INTO `contacto_p` (`cod_contactop`, `documento_pac`, `cod_telefono`) VALUES
(1, 1101123456, 4),
(2, 1102123456, 5),
(3, 1100123456, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctores`
--

CREATE TABLE `doctores` (
  `documento_med` int(11) NOT NULL,
  `nombre_med` varchar(100) NOT NULL,
  `apellido_paterno` varchar(100) NOT NULL,
  `apellido_materno` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `doctores`
--

INSERT INTO `doctores` (`documento_med`, `nombre_med`, `apellido_paterno`, `apellido_materno`) VALUES
(1001123456, 'Diego', 'Castro', 'Lopez'),
(1002123456, 'Juan', 'Casas', 'Barbosa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidades`
--

CREATE TABLE `especialidades` (
  `cod_esp` int(11) NOT NULL,
  `nombre_esp` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `especialidades`
--

INSERT INTO `especialidades` (`cod_esp`, `nombre_esp`) VALUES
(1, 'Cardiologia'),
(2, 'Pediatria'),
(3, 'Dermatologia'),
(4, 'Hematologia'),
(5, 'Neumologia'),
(6, 'Otorrinolaringología');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `cod_usuario` int(11) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `passwordU` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`cod_usuario`, `usuario`, `passwordU`) VALUES
(1, 'Diego', '12345'),
(2, 'Danna', '54321');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `med_especialistas`
--

CREATE TABLE `med_especialistas` (
  `med_esp` int(11) NOT NULL,
  `cod_esp` int(11) NOT NULL,
  `documento_med` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `documento_pac` int(11) NOT NULL,
  `nombre_pac` varchar(100) NOT NULL,
  `apellido_paterno` varchar(100) NOT NULL,
  `apellido_materno` varchar(100) NOT NULL,
  `direccion_rec` varchar(100) NOT NULL,
  `cod_plan` int(11) NOT NULL,
  `fecha_adq_plan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`documento_pac`, `nombre_pac`, `apellido_paterno`, `apellido_materno`, `direccion_rec`, `cod_plan`, `fecha_adq_plan`) VALUES
(1100123456, 'Estebam', 'Lopez', 'Arcilla', 'Calle 12a #4', 1, '2023-05-06'),
(1101123456, 'Carol', 'Jimenez', 'Ardila', 'Calle 15a #4', 2, '2023-07-08'),
(1102123456, 'Stiven', 'Vanegas', 'Leon', 'Calle 77 #5', 2, '2022-01-12');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planes`
--

CREATE TABLE `planes` (
  `cod_plan` int(11) NOT NULL,
  `nombre_plan` varchar(100) NOT NULL,
  `prioridad_plan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `planes`
--

INSERT INTO `planes` (`cod_plan`, `nombre_plan`, `prioridad_plan`) VALUES
(1, 'Basico', 'Baja'),
(2, 'Premium', 'Alta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefonos`
--

CREATE TABLE `telefonos` (
  `cod_telefono` int(11) NOT NULL,
  `numero` varchar(100) NOT NULL,
  `cod_categoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `telefonos`
--

INSERT INTO `telefonos` (`cod_telefono`, `numero`, `cod_categoria`) VALUES
(1, '3021234567', 2),
(2, '3031234567', 1),
(3, '3801234567', 1),
(4, '3811234567', 1),
(5, '3821234567', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tel_categorias`
--

CREATE TABLE `tel_categorias` (
  `cod_categoria` int(11) NOT NULL,
  `nombre_cat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tel_categorias`
--

INSERT INTO `tel_categorias` (`cod_categoria`, `nombre_cat`) VALUES
(1, 'CELULAR'),
(2, 'FIJO');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`cod_cita`),
  ADD KEY `documento_med` (`documento_med`),
  ADD KEY `documento_pac` (`documento_pac`);

--
-- Indices de la tabla `contacto_med`
--
ALTER TABLE `contacto_med`
  ADD PRIMARY KEY (`cod_contactom`),
  ADD KEY `documento_med` (`documento_med`),
  ADD KEY `cod_telefono` (`cod_telefono`);

--
-- Indices de la tabla `contacto_p`
--
ALTER TABLE `contacto_p`
  ADD PRIMARY KEY (`cod_contactop`),
  ADD KEY `documento_pac` (`documento_pac`),
  ADD KEY `cod_telefono` (`cod_telefono`);

--
-- Indices de la tabla `doctores`
--
ALTER TABLE `doctores`
  ADD PRIMARY KEY (`documento_med`);

--
-- Indices de la tabla `especialidades`
--
ALTER TABLE `especialidades`
  ADD PRIMARY KEY (`cod_esp`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`cod_usuario`);

--
-- Indices de la tabla `med_especialistas`
--
ALTER TABLE `med_especialistas`
  ADD PRIMARY KEY (`med_esp`),
  ADD KEY `documento_med` (`documento_med`),
  ADD KEY `cod_esp` (`cod_esp`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`documento_pac`),
  ADD KEY `cod_plan` (`cod_plan`);

--
-- Indices de la tabla `planes`
--
ALTER TABLE `planes`
  ADD PRIMARY KEY (`cod_plan`);

--
-- Indices de la tabla `telefonos`
--
ALTER TABLE `telefonos`
  ADD PRIMARY KEY (`cod_telefono`),
  ADD KEY `cod_categoria` (`cod_categoria`);

--
-- Indices de la tabla `tel_categorias`
--
ALTER TABLE `tel_categorias`
  ADD PRIMARY KEY (`cod_categoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `cod_cita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `contacto_med`
--
ALTER TABLE `contacto_med`
  MODIFY `cod_contactom` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `contacto_p`
--
ALTER TABLE `contacto_p`
  MODIFY `cod_contactop` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `especialidades`
--
ALTER TABLE `especialidades`
  MODIFY `cod_esp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `login`
--
ALTER TABLE `login`
  MODIFY `cod_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `med_especialistas`
--
ALTER TABLE `med_especialistas`
  MODIFY `med_esp` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `planes`
--
ALTER TABLE `planes`
  MODIFY `cod_plan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `telefonos`
--
ALTER TABLE `telefonos`
  MODIFY `cod_telefono` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `tel_categorias`
--
ALTER TABLE `tel_categorias`
  MODIFY `cod_categoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `citas_ibfk_1` FOREIGN KEY (`documento_med`) REFERENCES `doctores` (`documento_med`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `citas_ibfk_2` FOREIGN KEY (`documento_pac`) REFERENCES `pacientes` (`documento_pac`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `contacto_med`
--
ALTER TABLE `contacto_med`
  ADD CONSTRAINT `contacto_med_ibfk_1` FOREIGN KEY (`documento_med`) REFERENCES `doctores` (`documento_med`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `contacto_med_ibfk_2` FOREIGN KEY (`cod_telefono`) REFERENCES `telefonos` (`cod_telefono`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `contacto_p`
--
ALTER TABLE `contacto_p`
  ADD CONSTRAINT `contacto_p_ibfk_1` FOREIGN KEY (`documento_pac`) REFERENCES `pacientes` (`documento_pac`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `contacto_p_ibfk_2` FOREIGN KEY (`cod_telefono`) REFERENCES `telefonos` (`cod_telefono`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `med_especialistas`
--
ALTER TABLE `med_especialistas`
  ADD CONSTRAINT `med_especialistas_ibfk_1` FOREIGN KEY (`documento_med`) REFERENCES `doctores` (`documento_med`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `med_especialistas_ibfk_2` FOREIGN KEY (`cod_esp`) REFERENCES `especialidades` (`cod_esp`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD CONSTRAINT `pacientes_ibfk_1` FOREIGN KEY (`cod_plan`) REFERENCES `planes` (`cod_plan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `telefonos`
--
ALTER TABLE `telefonos`
  ADD CONSTRAINT `telefonos_ibfk_1` FOREIGN KEY (`cod_categoria`) REFERENCES `tel_categorias` (`cod_categoria`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
