package bean;

public class CollectionBuilder {
    static long i = 0;

    public static Collection getCollection(boolean withId) {
        Collection c = new Collection();
        c.setId(next(withId));
        c.addBD(new Serie(next(withId), "Arawn")
                .addPossede(new Bd(next(withId), "1", "Bran le Maudit", ""))
                .addPossede(new Bd(next(withId), "2", "Les liens du sang", ""))
                .addPossede(new Bd(next(withId), "3", "La Bataille de Cad Goddun", ""))
                .addManquante(new Bd(next(withId), "4", "Le chaudron du sang", ""))
                .addManquante(new Bd(next(withId), "5", "Résurrection", ""))
                .addManquante(new Bd(next(withId), "6", "La terre brulée", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Arawn1_26012008_153221.jpg")
                .withEditeur("Soleil Celtic"));


        c.addBD(new Serie(next(withId), "Mjollnir", true)
                .addPossede(new Bd(next(withId), "1", "Le Marteau et l'Enclume", ""))
                .addPossede(new Bd(next(withId), "2", "Ragnarok", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_192958.jpg")
                .withEditeur("Soleil Celtic"));

        c.addBD(new Serie(next(withId), "Okko")
                .addPossede(new Bd(next(withId), "1", "Le cycle de l'eau - I", ""))
                .addPossede(new Bd(next(withId), "2", "Le cycle de l'eau - II", ""))
                .addPossede(new Bd(next(withId), "3", "Le cycle de la terre - I", ""))
                .addPossede(new Bd(next(withId), "4", "Le cycle de la terre - II", ""))
                .addPossede(new Bd(next(withId), "5", "Le cycle de l'air - I", ""))
                .addPossede(new Bd(next(withId), "6", "Le cycle de l'air - II", ""))
                .addPossede(new Bd(next(withId), "7", "Le cycle du feu - I", ""))
                .addPossede(new Bd(next(withId), "8", "Le cycle du feu - II", ""))
                .addPossede(new Bd(next(withId), "9", "Le cycle du vide - I", ""))
                .addManquante(new Bd(next(withId), "10", "Le cycle du vide - II", "http://www.bedetheque.com/media/Couvertures/Couv_258069.jpg"))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_41693.jpg")
                .withEditeur("Delcourt"));

        c.addBD(new Serie(next(withId), "La licorne")
                .addPossede(new Bd(next(withId), "1", "Le Dernier Temple d'Asclépios", ""))
                .addPossede(new Bd(next(withId), "2", "Ad Naturam", ""))
                .addPossede(new Bd(next(withId), "3", "Les Eaux noires de Venise", ""))
                .addPossede(new Bd(next(withId), "4", "Le jour du Baptême", ""))
                .addManquante(new Bd(next(withId), "HS1", "Le Grimoire de La Licorne 12/2010", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_58319.jpg")
                .withEditeur("Delcourt"));

        c.addBD(new Serie(next(withId), "Samurai", true)
                .addPossede(new Bd(next(withId), "1", "Le Coeur du Prophète", ""))
                .addPossede(new Bd(next(withId), "2", "Les Sept Sources d'Akanobu", ""))
                .addPossede(new Bd(next(withId), "3", "Le Treizième Prophète", ""))
                .addPossede(new Bd(next(withId), "4", "Le rituel de Morinaga", ""))
                .addPossede(new Bd(next(withId), "5", "L'Île sans nom", ""))
                .addPossede(new Bd(next(withId), "6", "Shobei", ""))
                .addPossede(new Bd(next(withId), "7", "Frères d'armes", ""))
                .addPossede(new Bd(next(withId), "8", "Frères de sang", ""))
                .addPossede(new Bd(next(withId), "9", "Ogomo", ""))
                .addManquante(new Bd(next(withId),"10", "Ririko","http://www.bedetheque.com/media/Couvertures/Couv_258014.jpg"))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/samurai02.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "La guerre des Fees", true)
                .addPossede(new Bd(next(withId), "1", "Dans la gueule du loup", ""))
                .addPossede(new Bd(next(withId), "2", "Aedlyn", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_135417.jpg")
                .withEditeur("Soleil Celtic"));

        c.addBD(new Serie(next(withId), "Samurai Légendes", true)
                .addPossede(new Bd(next(withId), "1", "Furiko", ""))
                .addPossede(new Bd(next(withId), "2", "L'échange", ""))
                .addPossede(new Bd(next(withId), "3", "L'aube Rouge", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_201038.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Les rois forgerons", true)
                .addPossede(new Bd(next(withId), "1", "Le Sceau de Karzac Um Rork", ""))
                .addPossede(new Bd(next(withId), "2", "Le Petit Père des Elfes", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_185526.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Nuit Safran", true)
                .addPossede(new Bd(next(withId), "1", "Albumen l'éthéré", ""))
                .addPossede(new Bd(next(withId), "2", "La vengeance d'Albumen", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_107222.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Konungar", true)
                .addPossede(new Bd(next(withId), "1", "Invasions", ""))
                .addPossede(new Bd(next(withId), "2", "Les guerriers du neant", ""))
                .addPossede(new Bd(next(withId), "3", "Le châtiment", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_126735.jpg")
                .withEditeur("Glenat"));

        c.addBD(new Serie(next(withId), "Les arcanes d'Alya", true)
                .addPossede(new Bd(next(withId), "1", "La chasseresse écarlate", ""))
                .addPossede(new Bd(next(withId), "2", "Ames soeurs", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/ArcanesDalya01_66103.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Le chant des Stryges")
                .addPossede(new Bd(next(withId), "1", "Ombres", ""))
                .addManquante(new Bd(next(withId), "2", "Pièges", ""))
                .addManquante(new Bd(next(withId), "3", "Emprises", ""))
                .addManquante(new Bd(next(withId), "4", "Expériences", ""))
                .addManquante(new Bd(next(withId), "5", "Vestiges", ""))
                .addManquante(new Bd(next(withId), "6", "Existences", ""))
                .addManquante(new Bd(next(withId), "7", "Rencontres", ""))
                .addManquante(new Bd(next(withId), "8", "Défis", ""))
                .addManquante(new Bd(next(withId), "9", "Révélations", ""))
                .addManquante(new Bd(next(withId), "10", "Manipulations", ""))
                .addManquante(new Bd(next(withId), "11", "Cellules", ""))
                .addManquante(new Bd(next(withId), "12", "Chutes", ""))
                .addManquante(new Bd(next(withId), "13", "Pouvoirs", ""))
                .addManquante(new Bd(next(withId), "14", "Enlèvements", ""))
                .addManquante(new Bd(next(withId), "15", "Hybrides", ""))
                .addManquante(new Bd(next(withId), "16", "Exécutions", ""))
                .addManquante(new Bd(next(withId), "HS1", "Les Stryges : mythes et réalité", ""))
                .addManquante(new Bd(next(withId), "HS2", "Carnet de croquis", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/ChantDesStrygesLe01d092004.jpg")
                .withEditeur("Delcourt"));

        c.addBD(new Serie(next(withId), "La geste des chevaliers Dragon")
                .addPossede(new Bd(next(withId), "1", "Jaina", ""))
                .addPossede(new Bd(next(withId), "2", "Akanah", ""))
                .addPossede(new Bd(next(withId), "3", "Le pays de non-vie", ""))
                .addPossede(new Bd(next(withId), "4", "Brisken", ""))
                .addPossede(new Bd(next(withId), "5", "Les Jardins du Palais", ""))
                .addPossede(new Bd(next(withId), "6", "Par-delà les montagnes", ""))
                .addPossede(new Bd(next(withId), "7", "Revoir le soleil", ""))
                .addPossede(new Bd(next(withId), "8", "Le chœur des ténèbres", ""))
                .addPossede(new Bd(next(withId), "9", "Aveugles", ""))
                .addPossede(new Bd(next(withId), "10", "Vers la lumière", ""))
                .addPossede(new Bd(next(withId), "11", "Toutes les mille et une lunes", ""))
                .addPossede(new Bd(next(withId), "12", "Ellys", ""))
                .addPossede(new Bd(next(withId), "13", "Salmyre", ""))
                .addPossede(new Bd(next(withId), "14", "La Première", ""))
                .addPossede(new Bd(next(withId), "15", "L'Ennemi", ""))
                .addPossede(new Bd(next(withId), "16", "La Déesse", ""))
                .addManquante(new Bd(next(withId), "17", "Amarelle - La Guerre des Sardes - I", ""))
                .addManquante(new Bd(next(withId), "18", "Amarelle - La Guerre des Sardes - II", ""))
                .addManquante(new Bd(next(withId), "19", "L'Antidote", ""))
                .addManquante(new Bd(next(withId), "HS1", "Les contrees du levant", ""))
                .withImageUrl("http://www.bedetheque.com/media/ParaBD/262coffretT04A06Soleil1_10072010_124616.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Marie des dragons")
                .addPossede(new Bd(next(withId), "1", "Armance", ""))
                .addPossede(new Bd(next(withId), "3", "Amaury", ""))
                .addManquante(new Bd(next(withId), "2", "Vengeances", ""))
                .addManquante(new Bd(next(withId), "4", "William", ""))
                .addManquante(new Bd(next(withId), "5", "Les quatres", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_99004.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Beast", true)
                .addPossede(new Bd(next(withId), "1", "Yunze, le dieu gardien", ""))
                .addPossede(new Bd(next(withId), "2", "Amrath, la reine sauvage", ""))
                .addPossede(new Bd(next(withId), "3", "Tône-thet, le passeur d'âmes", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/107550_c.jpg")
                .withEditeur("Le Lombard"));

        c.addBD(new Serie(next(withId), "Lanfeust des etoiles", false)
                .addPossede(new Bd(next(withId), "1", "Un, deux... Troy", ""))
                .addPossede(new Bd(next(withId), "2", "Les tours de Meirrion", ""))
                .addPossede(new Bd(next(withId), "3", "Les sables d'Abraxar", ""))
                .addPossede(new Bd(next(withId), "4", "Les buveurs de mondes", ""))
                .addPossede(new Bd(next(withId), "5", "La chevauchée des bactéries", ""))
                .addPossede(new Bd(next(withId), "6", "Le râle du flibustier", ""))
                .addPossede(new Bd(next(withId), "7", "Le secret des Dolphantes", ""))
                .addPossede(new Bd(next(withId), "8", "Le sang des comètes", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_7299.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Lanfeust de Troy Integrales", true)
                .addPossede(new Bd(next(withId), "1", "Volumes 1 2 3", ""))
                .addManquante(new Bd(next(withId), "2", "Volumes 4 5 6", ""))
                .addManquante(new Bd(next(withId), "3", "Volumes 7 8 encyclo", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_163937.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Les chroniques de la lune noire")
                .addPossede(new Bd(next(withId), "1", "Le Signe des Ténèbres", ""))
                .addPossede(new Bd(next(withId), "2", "Le vent des Dragons", ""))
                .addPossede(new Bd(next(withId), "3", "La Marque des Démons", ""))
                .addPossede(new Bd(next(withId), "4", "Quand sifflent les Serpents", ""))
                .addPossede(new Bd(next(withId), "5", "La danse écarlate", ""))
                .addPossede(new Bd(next(withId), "6", "La Couronne des Ombres", ""))
                .addPossede(new Bd(next(withId), "7", "De Vents, de Jade et de Jais", ""))
                .addPossede(new Bd(next(withId), "8", "Le Glaive de justice", ""))
                .addPossede(new Bd(next(withId), "9", "Les Chants de la négation", ""))
                .addPossede(new Bd(next(withId), "10", "L'Aigle foudroyé", ""))
                .addPossede(new Bd(next(withId), "11", "Ave Tenebrae", ""))
                .addManquante(new Bd(next(withId), "0", "En un jeu cruel", ""))
                .addManquante(new Bd(next(withId), "12", "La Porte des Enfers", ""))
                .addManquante(new Bd(next(withId), "13", "La Prophétie ", ""))
                .addManquante(new Bd(next(withId), "14", "La Fin des Temps", ""))
                .addManquante(new Bd(next(withId), "15", "Terra Secunda - I", ""))
                .addManquante(new Bd(next(withId), "16", "Terra Secunda - II", ""))
                .addManquante(new Bd(next(withId), "HS1", "L'empire de la negation", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_955.jpg")
                .withEditeur("Dargaud"));

        c.addBD(new Serie(next(withId), "Les arcanes de la lune noire", true)
                .addPossede(new Bd(next(withId), "1", "Ghorghor Bey", ""))
                .addPossede(new Bd(next(withId), "2", "Pile-ou-Face", ""))
                .addPossede(new Bd(next(withId), "3", "Parsifal", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/froid.jpg")
                .withEditeur("Dargaud"));

        c.addBD(new Serie(next(withId), "XIII")
                .addPossede(new Bd(next(withId), "1", "Le jour du soleil noir", ""))
                .addPossede(new Bd(next(withId), "2", "Là où va l'indien... ", ""))
                .addPossede(new Bd(next(withId), "3", "Toutes les larmes de l'enfer", ""))
                .addPossede(new Bd(next(withId), "4", "SPADS", ""))
                .addPossede(new Bd(next(withId), "5", "Rouge total", ""))
                .addPossede(new Bd(next(withId), "6", "Le dossier Jason Fly", ""))
                .addPossede(new Bd(next(withId), "7", "La nuit du 3 août", ""))
                .addPossede(new Bd(next(withId), "8", "Treize contre un", ""))
                .addPossede(new Bd(next(withId), "9", "Pour Maria", ""))
                .addPossede(new Bd(next(withId), "10", "El cascador", ""))
                .addPossede(new Bd(next(withId), "11", "Trois montres d'argent", ""))
                .addPossede(new Bd(next(withId), "12", "Le jugement", ""))
                .addPossede(new Bd(next(withId), "14", "Secret défense", ""))
                .addPossede(new Bd(next(withId), "15", " Lachez les chiens !", ""))
                .addPossede(new Bd(next(withId), "16", "Opération Montecristo", ""))
                .addPossede(new Bd(next(withId), "17", "L'or de Maximilien", ""))
                .addPossede(new Bd(next(withId), "18", "La version Irlandaise", ""))
                .addPossede(new Bd(next(withId), "19", "Le dernier round", ""))
                .addPossede(new Bd(next(withId), "20", " Le jour du Mayflower", ""))
                .addManquante(new Bd(next(withId), "13", "The XIII mystery - L'enquête", ""))
                .addManquante(new Bd(next(withId), "21", "L'appât", ""))
                .addManquante(new Bd(next(withId), "22", "Retour à Greenfalls", ""))
                .addManquante(new Bd(next(withId), "23", "Le Message du martyr", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_177856.jpg")
                .withEditeur("Dargaud"));

        c.addBD(new Serie(next(withId), "Thorgal")
                .addPossede(new Bd(next(withId), "1", "La magicienne trahie", ""))
                .addPossede(new Bd(next(withId), "2", "L'île des mers gelées", ""))
                .addPossede(new Bd(next(withId), "3", "Les trois vieillards du pays d'Aran", ""))
                .addPossede(new Bd(next(withId), "4", "La galère noire", ""))
                .addPossede(new Bd(next(withId), "5", "Au-delà des ombres", ""))
                .addPossede(new Bd(next(withId), "6", "La chute de Brek Zarith", ""))
                .addPossede(new Bd(next(withId), "8", "Alinoë", ""))
                .addPossede(new Bd(next(withId), "9", "Les archers", ""))
                .addPossede(new Bd(next(withId), "10", "Le pays Qâ", ""))
                .addPossede(new Bd(next(withId), "22", "Géants", ""))
                .addPossede(new Bd(next(withId), "24", "Arachnéa", ""))
                .addPossede(new Bd(next(withId), "27", "Le Barbare", ""))
                .addPossede(new Bd(next(withId), "28", "Kriss de Valnor", ""))
                .addPossede(new Bd(next(withId), "31", "e bouclier de Thor", ""))
                .addPossede(new Bd(next(withId), "33", "Le Bateau-Sabre", ""))
                .addManquante(new Bd(next(withId), "7", "L'enfant des étoiles", ""))
                .addManquante(new Bd(next(withId), "11", "Les yeux de Tanatloc", ""))
                .addManquante(new Bd(next(withId), "12", "La cité du dieu perdu", ""))
                .addManquante(new Bd(next(withId), "13", " Entre terre et lumière", ""))
                .addManquante(new Bd(next(withId), "14", "Aaricia", ""))
                .addManquante(new Bd(next(withId), "15", "Le maître des montagnes", ""))
                .addManquante(new Bd(next(withId), "16", "Louve", ""))
                .addManquante(new Bd(next(withId), "17", "La gardienne des clés", ""))
                .addManquante(new Bd(next(withId), "18", " L'épée-Soleil", ""))
                .addManquante(new Bd(next(withId), "19", "La forteresse invisible", ""))
                .addManquante(new Bd(next(withId), "20", "La marque des bannis", ""))
                .addManquante(new Bd(next(withId), "21", "La couronne d'Ogotaï", ""))
                .addManquante(new Bd(next(withId), "23", "La cage", ""))
                .addManquante(new Bd(next(withId), "25", "Le Mal bleu", ""))
                .addManquante(new Bd(next(withId), "26", "Le Royaume sous le Sable", ""))
                .addManquante(new Bd(next(withId), "29", "Le Sacrifice", ""))
                .addManquante(new Bd(next(withId), "30", "Moi, Jolan", ""))
                .addManquante(new Bd(next(withId), "32", "La Bataille d'Asgard", ""))
                .addManquante(new Bd(next(withId), "34", "Kah-Aniel", ""))
                .addManquante(new Bd(next(withId), "HS1", "Trois femmes pour un heros", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_398.jpg")
                .withEditeur("Le Lombard"));

        c.addBD(new Serie(next(withId), "Les complaintes des landes perdues cycle 1", true)
                .addPossede(new Bd(next(withId), "1", "Sioban", ""))
                .addPossede(new Bd(next(withId), "2", "Blackmore", ""))
                .addPossede(new Bd(next(withId), "3", "Dame Gerfaut", ""))
                .addPossede(new Bd(next(withId), "4", "Kyle of Klanach", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_21792.jpg")
                .withEditeur("Dargaud"));

        c.addBD(new Serie(next(withId), "Les complaintes des landes perdues cycle 2", true)
                .addPossede(new Bd(next(withId), "1", "Moriganes", ""))
                .addPossede(new Bd(next(withId), "2", "Le Guinea Lord", ""))
                .addPossede(new Bd(next(withId), "3", "La Fée Sanctus", ""))
                .addPossede(new Bd(next(withId), "4", "Sill Valt", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_40118.jpg")
                .withEditeur("Dargaud"));

        c.addBD(new Serie(next(withId), "Crepuscule des dieux", true)
                .addPossede(new Bd(next(withId), "0", "La Malédiction de l'Anneau", ""))
                .addPossede(new Bd(next(withId), "1", "La Malédiction des Nibelungen", ""))
                .addPossede(new Bd(next(withId), "2", "Siegfried", ""))
                .addPossede(new Bd(next(withId), "3", "Fafner", ""))
                .addPossede(new Bd(next(withId), "4", "Brunhilde", ""))
                .addPossede(new Bd(next(withId), "5", "Kriemhilde", ""))
                .addPossede(new Bd(next(withId), "6", "Ragnarök", ""))
                .addPossede(new Bd(next(withId), "7", "Le Grand Hiver", ""))
                .addPossede(new Bd(next(withId), "8", "Le Sang d'Odin", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/CrepusculeDesDieuxLe0_24072009_052139.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Gardien du Feu", true)
                .addPossede(new Bd(next(withId), "1", "Goulven", ""))
                .addPossede(new Bd(next(withId), "2", "Adèle", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/GardienDuFeuLe1_27022009_162821.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Frere Pardon", true)
                .addPossede(new Bd(next(withId), "1", "Les eaux de Theodeus", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/frerepardoncouv.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Les forets d'Opale", true)
                .addPossede(new Bd(next(withId), "1", "Le bracelet de Cohars", ""))
                .addPossede(new Bd(next(withId), "2", "L'envers du grimoire", ""))
                .addPossede(new Bd(next(withId), "3", "La cicatrice verte", ""))
                .addPossede(new Bd(next(withId), "4", "Les Geôles de Nénuphe", ""))
                .addPossede(new Bd(next(withId), "5", "Onze racines", ""))
                .addPossede(new Bd(next(withId), "6", "Le sortilège du pontife", ""))
                .addPossede(new Bd(next(withId), "7", "Les Dents de pierre", ""))
                .addPossede(new Bd(next(withId), "8", "Les hordes de la nuit", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/foretsdopale01.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Siegfried", true)
                .addPossede(new Bd(next(withId), "1", "Siegfried", ""))
                .addPossede(new Bd(next(withId), "2", "La Walkyrie", ""))
                .addPossede(new Bd(next(withId), "3", "le crepuscule des dieux", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_67936.jpg")
                .withEditeur("Dargaud"));

        c.addBD(new Serie(next(withId), "Arctica")
                .addPossede(new Bd(next(withId), "1", "10.000 ans sous les glaces", ""))
                .addPossede(new Bd(next(withId), "2", "Mystere sous la mer", ""))
                .addPossede(new Bd(next(withId), "3", "Le passager de la prehistoire", ""))
                .addPossede(new Bd(next(withId), "4", "Revelations", ""))
                .addPossede(new Bd(next(withId), "5", "Destination terre", ""))
                .addManquante(new Bd(next(withId), "6", "Les fugitifs", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_69106.jpg")
                .withEditeur("Delcourt"));

        c.addBD(new Serie(next(withId), "Black Op")
                .addPossede(new Bd(next(withId), "6", "Tome 6", ""))
                .addManquante(new Bd(next(withId), "1", "Tome 1", ""))
                .addManquante(new Bd(next(withId), "2", "Tome 2", ""))
                .addManquante(new Bd(next(withId), "3", "Tome 3", ""))
                .addManquante(new Bd(next(withId), "4", "Tome 4", ""))
                .addManquante(new Bd(next(withId), "5", "Tome 5", ""))
                .addManquante(new Bd(next(withId), "7", "Tome 7", ""))
                .addManquante(new Bd(next(withId), "8", "Tome 8", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/BlackOp-couv_100964.jpg")
                .withEditeur("Dargaud"));

        c.addBD(new Serie(next(withId), "La quete de l'oiseau du temps")
                .addPossede(new Bd(next(withId), "2", "Le temple de l'oubli", ""))
                .addManquante(new Bd(next(withId), "1", "La conque de Ramor", ""))
                .addManquante(new Bd(next(withId), "3", "Le Rige", ""))
                .addManquante(new Bd(next(withId), "4", "L'oeuf des ténébres", ""))
                .addManquante(new Bd(next(withId), "5", "L'ami Javin", ""))
                .addManquante(new Bd(next(withId), "6", "Le grimoire des dieux", ""))
                .addManquante(new Bd(next(withId), "7", "La voie du Rige", ""))
                .addManquante(new Bd(next(withId), "8", "Le chevalier Bragon", ""))
                .addManquante(new Bd(next(withId), "HS1", "Esquisses - L'ami Javin", ""))
                .addManquante(new Bd(next(withId), "HS2", "En quête de l'oiseau du temps", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_69122.jpg")
                .withEditeur("Dargaud"));

        c.addBD(new Serie(next(withId), "Atalantes")
                .addPossede(new Bd(next(withId), "1", "Le pacte", ""))
                .addPossede(new Bd(next(withId), "2", "Nautiliaa", ""))
                .addManquante(new Bd(next(withId), "3", "Les mystères de Samothrace", ""))
                .addManquante(new Bd(next(withId), "4", "L'envol des Boréades", ""))
                .addManquante(new Bd(next(withId), "5", "Calaïs et Zétès", ""))
                .addManquante(new Bd(next(withId), "6", "Le labyrinthe d'Hadès ", ""))
                .addManquante(new Bd(next(withId), "7", "Le Dernier des Grands Anciens", ""))
                .addManquante(new Bd(next(withId), "HS 1", "Les amis d'Atalantes", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/atalante01.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Les 4 As")
                .addPossede(new Bd(next(withId), "", "La Saucisse volante", ""))
                .addPossede(new Bd(next(withId), "", "Le diamant bleu", ""))
                .addPossede(new Bd(next(withId), "", "Le magicien", ""))
                .addPossede(new Bd(next(withId), "", "et la bombe F", ""))
                .addPossede(new Bd(next(withId), "", "Hold up big bank", ""))
                .addPossede(new Bd(next(withId), "", "Et le couroucoucou", ""))
                .addPossede(new Bd(next(withId), "", "Le chateau malefique", ""))
                .addPossede(new Bd(next(withId), "", "La licorne", ""))
                .addPossede(new Bd(next(withId), "", "L'atlantide", ""))
                .addPossede(new Bd(next(withId), "", "La ruee vers l'or", ""))
                .addPossede(new Bd(next(withId), "", "Le visiteur de minuit", ""))
                .addPossede(new Bd(next(withId), "", "Le secret de la montagne", ""))
                .addPossede(new Bd(next(withId), "", "Le serpent de mer", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et l'aeroglisseur", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et la vache sacree", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et la coupe d'or", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le dragon des neiges", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le rallye olympique", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et l'île du robinson", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le tyran", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le Picasso vole", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le gang des chapeaux blancs", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le vaisseau fantôme", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et l'iceberg", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le tresor des tsars", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et la deesse des mers", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et la navette spatiale", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le requin geant", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et l'empire cache", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le mystere de la jungle", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et les extraterrestres", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le fantôme du Mont Saint-Michel", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le robot vandale", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et les sorcieres", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et les dinosaures", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et la momie", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et les fantômes", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le monstre des oceans", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 As et Halloween", ""))
                .addManquante(new Bd(next(withId), "", "Le loup de Tasmanie", ""))
                .addManquante(new Bd(next(withId), "", "Les 4 as et le grand supreme", ""))
                .addManquante(new Bd(next(withId), "", "Mission Mars", ""))
                .addManquante(new Bd(next(withId), "", "La balade des 4 as", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/quatreas8_03112002.jpg")
                .withEditeur("Casterman"));

        c.addBD(new Serie(next(withId), "Merlin")
                .addPossede(new Bd(next(withId), "1", "La colère d'Ahès ", ""))
                .addPossede(new Bd(next(withId), "2", "L'éveil du pouvoir", ""))
                .addPossede(new Bd(next(withId), "4", "Avalon", ""))
                .addPossede(new Bd(next(withId), "5", "Brendann le maudit", ""))
                .addPossede(new Bd(next(withId), "6", "L'ermite et le nid", ""))
                .addPossede(new Bd(next(withId), "8", "L'aube des armes", ""))
                .addManquante(new Bd(next(withId), "3", "Le Cromm-Cruach", ""))
                .addManquante(new Bd(next(withId), "7", "Le chaudron de Bran-le-Béni", ""))
                .addManquante(new Bd(next(withId), "9", "Le secret du codex", ""))
                .addManquante(new Bd(next(withId), "10", "La princesse d'Ys", ""))
                .addManquante(new Bd(next(withId), "11", "Le Roi Arthur", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/merlinnucleasoleil03.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "L'epervier", true)
                .addPossede(new Bd(next(withId), "1", "", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Epervier1_2l.jpg")
                .withEditeur("Dupuis"));

        c.addBD(new Serie(next(withId), "Dick Herisson")
                .addPossede(new Bd(next(withId), "1", "L'ombre du torrero", ""))
                .addPossede(new Bd(next(withId), "4", "Le vampire de La coste", ""))
                .addPossede(new Bd(next(withId), "5", "La conspiration des poissoniers", ""))
                .addManquante(new Bd(next(withId), "2", "Les voleurs d'oreilles", ""))
                .addManquante(new Bd(next(withId), "3", "L'opera maudit", ""))
                .addManquante(new Bd(next(withId), "6", "Freres de cendres", ""))
                .addManquante(new Bd(next(withId), "7", "Le tombeau d'Absalom", ""))
                .addManquante(new Bd(next(withId), "8", "La maison du pendu", ""))
                .addManquante(new Bd(next(withId), "9", "Le 7 ieme cri", ""))
                .addManquante(new Bd(next(withId), "10", "La brouette des morts", ""))
                .addManquante(new Bd(next(withId), "11", "L'araignee pourpre 1/2", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/DickHerisson1a_21022005.jpg")
                .withEditeur("Dargaud"));

        c.addBD(new Serie(next(withId), "Chaos Team")
                .addPossede(new Bd(next(withId), "1.1", "", ""))
                .addPossede(new Bd(next(withId), "1.2", "", ""))
                .addPossede(new Bd(next(withId), "2.1", "", ""))
                .addManquante(new Bd(next(withId), "2.2", "", ""))
                .addManquante(new Bd(next(withId), "HS1", "La vengeance du béret vert", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_194532.jpg")
                .withEditeur("Akileos"));

        c.addBD(new Serie(next(withId), "Apocalypse Luis Royo")
                .addPossede(new Bd(next(withId), "1", "", ""))
                .withImageUrl("http://p7.storage.canalblog.com/70/29/712462/81182314_o.jpg")
                .withEditeur(""));

        c.addBD(new Serie(next(withId), "Asgard", "1 2", true)
                .addPossede(new Bd(next(withId), "1", "Pied-de-fer", ""))
                .addPossede(new Bd(next(withId), "2", "Le Serpent-Monde", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_151330.jpg")
                .withEditeur("Dargaud"));

        c.addBD(new Serie(next(withId), "Korrigans", "1 2 3 4", true)
                .addPossede(new Bd(next(withId), "1", "Les enfants de la nuit", ""))
                .addPossede(new Bd(next(withId), "2", "Guerriers des ténèbres", ""))
                .addPossede(new Bd(next(withId), "3", "Le peuple de Dana", ""))
                .addPossede(new Bd(next(withId), "4", "Le seigneur du chaos", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/150570_c.jpg")
                .withEditeur("Delcourt"));

        c.addBD(new Serie(next(withId), "Elric")
                .addPossede(new Bd(next(withId), "1", "Le trone de rubis", ""))
                .addPossede(new Bd(next(withId), "2", "Stormbringer", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_187244.jpg")
                .withEditeur("Glenat"));

        c.addBD(new Serie(next(withId), "Tif et Tondu")
                .addPossede(new Bd(next(withId), "5", "En amérique centrale", ""))
                .addPossede(new Bd(next(withId), "22", "Un plan démoniaque", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_215593.jpg")
                .withEditeur("Dupuis"));

        c.addBD(new Serie(next(withId), "Les druides")
                .addPossede(new Bd(next(withId), "1", "Le mystère des Oghams ", ""))
                .addPossede(new Bd(next(withId), "2", "Is la blanche", ""))
                .addPossede(new Bd(next(withId), "3", "La lance de Lug", ""))
                .addPossede(new Bd(next(withId), "4", "La ronde des géants", ""))
                .addPossede(new Bd(next(withId), "5", "La Pierre de destinée", ""))
                .addPossede(new Bd(next(withId), "6", "Crépuscule", ""))
                .addPossede(new Bd(next(withId), "7", "Les disparus de Cornouailles ", ""))
                .addManquante(new Bd(next(withId), "8", "Les Secrets d'Orient", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_199535.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "La foret")
                .addPossede(new Bd(next(withId), "1", "La foret", ""))
                .addPossede(new Bd(next(withId), "2", "Le logis des ames", ""))
                .addManquante(new Bd(next(withId), "3", "A vida y a muert", ""))
                .addManquante(new Bd(next(withId), "4", "La veuve noire", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Foret02_80394.jpg")
                .withEditeur("Casterman"));

        c.addBD(new Serie(next(withId), "Slhoka")
                .addPossede(new Bd(next(withId), "1", "L'île oubliée", ""))
                .addPossede(new Bd(next(withId), "2", "Les Jardins de Sangalî", ""))
                .addPossede(new Bd(next(withId), "3", "Le monde blanc", ""))
                .addPossede(new Bd(next(withId), "4", "Les arches de sang", ""))
                .addPossede(new Bd(next(withId), "5", "L'eveil", ""))
                .addPossede(new Bd(next(withId), "6", "Les meandres", ""))
                .addPossede(new Bd(next(withId), "7", "L'Autre rive", ""))
                .addPossede(new Bd(next(withId), "8", "L'epingle des ephemeres", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_163697.jpg")
                .withEditeur("Soleil"));

        c.addBD(new Serie(next(withId), "Black et Mortimer", true)
                .addPossede(new Bd(next(withId), "1 2 3", "Le secret de l'Espadon", ""))
                .addPossede(new Bd(next(withId), "1 2", "Le mystere de la grande pyramide", ""))
                .addPossede(new Bd(next(withId), "", "La marque jaune", ""))
                .addPossede(new Bd(next(withId), "", "L'enigme de l'Atlantide", ""))
                .addPossede(new Bd(next(withId), "", "S.O.S. meteores", ""))
                .addPossede(new Bd(next(withId), "", "Le piege diabolique", ""))
                .addPossede(new Bd(next(withId), "", "L'affaire du collier", ""))
                .addPossede(new Bd(next(withId), "1 2", "Les 3 formules du Professeur Sato", ""))
                .addPossede(new Bd(next(withId), "", "L'affaire Francis Blake", ""))
                .addPossede(new Bd(next(withId), "", "La machination Voronov", ""))
                .addPossede(new Bd(next(withId), "", "L'etrange rendez-vous", ""))
                .addPossede(new Bd(next(withId), "1 2", "Les sarcophages du 6e continent", ""))
                .addPossede(new Bd(next(withId), "1", "Le sanctuaire du Gondwana", ""))
                .addPossede(new Bd(next(withId), "1 2", "La malediction des trente deniers", ""))
                .addPossede(new Bd(next(withId), "", "Le serment des cinq lords", ""))
                .addPossede(new Bd(next(withId), "", "L'onde Septimus", ""))
                .addPossede(new Bd(next(withId), "", "Le baton de Plutarque 12/2014", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/Couv_115948.jpg")
                .withEditeur("Black et Mortimer"));


        c.addBD(new Serie(next(withId), "Harry Dickson")
                .addPossede(new Bd(next(withId), "", "La bande de l'araignee", ""))
                .addPossede(new Bd(next(withId), "", "Les spectres bourreaux", ""))
                .addPossede(new Bd(next(withId), "", "Les 3 cercles de l'epouvante", ""))
                .addPossede(new Bd(next(withId), "", "La conspiration fantastique", ""))
                .addPossede(new Bd(next(withId), "", "Le royaume introuvable", ""))
                .addManquante(new Bd(next(withId), "", "L'etrange lueur verte", ""))
                .addManquante(new Bd(next(withId), "", "Echec au roi", ""))
                .addManquante(new Bd(next(withId), "", "Le temple de fer", ""))
                .addManquante(new Bd(next(withId), "", "Les gardiens du gouffre 09/2014", ""))
                .withImageUrl("http://www.bedetheque.com/media/Couvertures/harrydicksonzanon01.jpg")
                .withEditeur("Art & B.D."));

        return c;
    }


    private static Long next(boolean withId) {
        if(withId) {
            return i++;
        }else{
            return null;
        }
    }
}
