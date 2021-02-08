-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 08 fév. 2021 à 20:38
-- Version du serveur :  10.1.36-MariaDB
-- Version de PHP :  7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestionetudiant`
--

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `idE` int(11) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `sexe` varchar(255) NOT NULL,
  `tel` int(11) NOT NULL,
  `mail` varchar(255) NOT NULL,
  `idf` int(11) DEFAULT NULL,
  `nomf` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`idE`, `prenom`, `nom`, `sexe`, `tel`, `mail`, `idf`, `nomf`) VALUES
(1, 'mehdi', 'founounou', 'homme', 60000000, 'mehdi@gmail.com', 2, 'miashs');

-- --------------------------------------------------------

--
-- Structure de la table `formation`
--

CREATE TABLE `formation` (
  `idF` int(11) NOT NULL,
  `nomf` varchar(255) NOT NULL,
  `parcours` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `formation`
--

INSERT INTO `formation` (`idF`, `nomf`, `parcours`) VALUES
(10, 'POO', 'MIAGE\r'),
(11, 'RO', 'MIAGE\r'),
(12, 'WEB', 'MIAGE');

-- --------------------------------------------------------

--
-- Structure de la table `ue`
--

CREATE TABLE `ue` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `dureeh` int(11) NOT NULL,
  `ECTS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ue`
--

INSERT INTO `ue` (`id`, `nom`, `dureeh`, `ECTS`) VALUES
(1, 'POO', 15, 6);

-- --------------------------------------------------------

--
-- Structure de la table `uevalide`
--

CREATE TABLE `uevalide` (
  `id` int(11) NOT NULL,
  `validation` tinyint(1) NOT NULL,
  `note` int(11) NOT NULL,
  `idUe` int(11) NOT NULL,
  `idE` int(11) NOT NULL,
  `semestre` int(11) DEFAULT NULL,
  `anneU` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `uevalide`
--

INSERT INTO `uevalide` (`id`, `validation`, `note`, `idUe`, `idE`, `semestre`, `anneU`) VALUES
(1, 1, 15, 1, 1, 1, 2020);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `motdepasse` varchar(255) NOT NULL,
  `utype` varchar(255) NOT NULL,
  `Username` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `nom`, `prenom`, `motdepasse`, `utype`, `Username`) VALUES
(8, 'noureddine', 'test', 'a', 'Etudiant', 'testnoureddine'),
(9, 'bekhdadi', 'noureddine', 'azerty', 'Etudiant', 'noureddine.bekhdadi'),
(10, 'founounou', 'mehdi', 'founounoumdp', 'etudiant', '2');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`idE`),
  ADD KEY `fk_idf` (`idf`);

--
-- Index pour la table `formation`
--
ALTER TABLE `formation`
  ADD PRIMARY KEY (`idF`);

--
-- Index pour la table `ue`
--
ALTER TABLE `ue`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `uevalide`
--
ALTER TABLE `uevalide`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_ide` (`idE`),
  ADD KEY `fk_idue` (`idUe`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `etudiant`
--
ALTER TABLE `etudiant`
  MODIFY `idE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `formation`
--
ALTER TABLE `formation`
  MODIFY `idF` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT pour la table `ue`
--
ALTER TABLE `ue`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `uevalide`
--
ALTER TABLE `uevalide`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `uevalide`
--
ALTER TABLE `uevalide`
  ADD CONSTRAINT `fk_ide` FOREIGN KEY (`idE`) REFERENCES `etudiant` (`idE`),
  ADD CONSTRAINT `fk_idue` FOREIGN KEY (`idUe`) REFERENCES `ue` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
