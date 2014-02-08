package com.nihildev.critfumble;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class dataLoader {
	
	public dataLoader(){
		
	}
	
	public void loadFumbles(SQLiteDatabase db){
		Log.d("DB","Filling Fumbles");
		 if(db != null){
			 String sqlCreate = "CREATE TABLE IF NOT EXISTS Fumbles (Min INTEGER,Max INTEGER,text TEXT)";
			 db.execSQL(sqlCreate);
			 db.execSQL("INSERT INTO Fumbles VALUES (201, 216,'Hindrance - Sweat in your eyes, -1 to hit for 10 seconds')");
			 db.execSQL("INSERT INTO Fumbles VALUES (217, 232,'Hindrance - Blook in your eyes, -3 to hit for 10 seconds')");
			 db.execSQL("INSERT INTO Fumbles VALUES (233, 247,'Hindrance - Nearby Ally is Automatically hit (by their opponent)')");
			 db.execSQL("INSERT INTO Fumbles VALUES (248, 263,'Hindrance - Distracted by ally or opponent, -4 to hit and no Dex bonus to AC for 10 seconds')");
			 db.execSQL("INSERT INTO Fumbles VALUES (264, 276,'Equipment Mishap - Boot/footgear breaks, -1 to attacks and defense until repaired or discarded')");
			 db.execSQL("INSERT INTO Fumbles VALUES (277, 318,'Equipment Mishap - Backpack, pouch or other container strap breaks, -1 to attack and defense until item repaired or discarded.')");
			 db.execSQL("INSERT INTO Fumbles VALUES (319, 343,'Equipment Mishap - Belt, girdle, etc. breaks, -1 to attack and defense until item repaired or discarded')");
			 db.execSQL("INSERT INTO Fumbles VALUES (344, 364,'Equipment Mishap - Armor loosened, -1 to attack and defense until readjusted (by redonning or by another person helping for 10 seconds)')");
			 db.execSQL("INSERT INTO Fumbles VALUES (365, 370,'Equipment Mishap - Armor strap breaks, -2 to attack and defense until repaired')");
			 db.execSQL("INSERT INTO Fumbles VALUES (371, 398,'Equipment Mishap - Shield strap breaks, -3 to attacka nd defense until repaired or dicarded')");
			 db.execSQL("INSERT INTO Fumbles VALUES (399, 436,'Armor Damage - Damage own armor by 1 point')");
			 db.execSQL("INSERT INTO Fumbles VALUES (437, 472,'Weapon Damaged/Broken - Handle Broken, -1 to hit')");
			 db.execSQL("INSERT INTO Fumbles VALUES (473, 508,'Weapon Damaged/Broken - Blade/Head Broken, -1 to damage')");
			 db.execSQL("INSERT INTO Fumbles VALUES (509, 517,'Weapon Damaged/Broken - Blade shattered (useless)')");
			 db.execSQL("INSERT INTO Fumbles VALUES (518, 526,'Weapon Damaged/Broken - Handle/Haft sheared (useless)')");
			 db.execSQL("INSERT INTO Fumbles VALUES (527, 535,'Weapon Damaged/Broken - Sheared (useless)')");
			 db.execSQL("INSERT INTO Fumbles VALUES (536, 553,'Weapon Damaged/Broken - Handle Badly Broken, -2 to hit')");
			 db.execSQL("INSERT INTO Fumbles VALUES (554, 571,'Weapon Damaged/Broken - Blade/head badly broken, -25% to damage')");
			 db.execSQL("INSERT INTO Fumbles VALUES (572, 580,'Weapon Damaged/Broken - Blade/head sheared/cracked, -50% to damage')");
			 db.execSQL("INSERT INTO Fumbles VALUES (581, 616,'Weapon Damaged/Broken - Edge dulled, nicked and/or cracked, -1 to attack and -1 to damage')");
			 db.execSQL("INSERT INTO Fumbles VALUES (617, 630,'Unbalanced - Overextended +d4 seconds penalty to next attack, -2 to next defense roll')");
			 db.execSQL("INSERT INTO Fumbles VALUES (631, 644,'Unbalanced - Hinder a random, adjacent ally who sufferes +d6 seconds penalty to next attack and -(d4+1) penalty on next attack roll or 25% chance of hitting you instead')");
			 db.execSQL("INSERT INTO Fumbles VALUES (645, 658,'Unbalanced - Off balance +d4 seconds to next attack')");
			 db.execSQL("INSERT INTO Fumbles VALUES (659, 672,'Unbalanced - Overextended, -2 to next defense roll')");
			 db.execSQL("INSERT INTO Fumbles VALUES (673, 688,'Unbalanced - Slip, make check vs. ½ dex or fall prone plus -6 to all dfense and attack rolls for 10 seconds')");
			 db.execSQL("INSERT INTO Fumbles VALUES (689, 690,'Sprains/Hyperextensions - Left Big Toe')");
			 db.execSQL("INSERT INTO Fumbles VALUES (691, 692,'Sprains/Hyperextensions - Right Big Toe')");
			 db.execSQL("INSERT INTO Fumbles VALUES (693, 694,'Sprains/Hyperextensions - Left Foot')");
			 db.execSQL("INSERT INTO Fumbles VALUES (695, 696,'Sprains/Hyperextensions - Right Foot')");
			 db.execSQL("INSERT INTO Fumbles VALUES (697, 698,'Sprains/Hyperextensions - Right Ankle')");
			 db.execSQL("INSERT INTO Fumbles VALUES (699, 700,'Sprains/Hyperextensions - Left Ankle')");
			 db.execSQL("INSERT INTO Fumbles VALUES (701, 702,'Sprains/Hyperextensions - Right Knee')");
			 db.execSQL("INSERT INTO Fumbles VALUES (703, 704,'Sprains/Hyperextensions - Left Knee')");
			 db.execSQL("INSERT INTO Fumbles VALUES (705, 706,'Sprains/Hyperextensions - Right Hip')");
			 db.execSQL("INSERT INTO Fumbles VALUES (707, 708,'Sprains/Hyperextensions - Left Hip')");
			 db.execSQL("INSERT INTO Fumbles VALUES (709, 710,'Sprains/Hyperextensions - Right Wrist')");
			 db.execSQL("INSERT INTO Fumbles VALUES (711, 712,'Sprains/Hyperextensions - Left Wrist')");
			 db.execSQL("INSERT INTO Fumbles VALUES (713, 714,'Sprains/Hyperextensions - Right Shoulder')");
			 db.execSQL("INSERT INTO Fumbles VALUES (715, 716,'Sprains/Hyperextensions - Left Shoulder')");
			 db.execSQL("INSERT INTO Fumbles VALUES (717, 718,'Sprains/Hyperextensions - Right Elbow')");
			 db.execSQL("INSERT INTO Fumbles VALUES (719, 720,'Sprains/Hyperextensions - Left Elbow')");
			 db.execSQL("INSERT INTO Fumbles VALUES (721, 722,'Sprains/Hyperextensions - Neck')");
			 db.execSQL("INSERT INTO Fumbles VALUES (723, 724,'Sprains/Hyperextensions - Back')");
			 db.execSQL("INSERT INTO Fumbles VALUES (725, 726,'Sprains/Hyperextensions - Left Achilles')");
			 db.execSQL("INSERT INTO Fumbles VALUES (727, 728,'Sprains/Hyperextensions - Right Achilles')");
			 db.execSQL("INSERT INTO Fumbles VALUES (729, 730,'Strains/Pulls - Left Calf')");
			 db.execSQL("INSERT INTO Fumbles VALUES (731, 732,'Strains/Pulls - Right Calf')");
			 db.execSQL("INSERT INTO Fumbles VALUES (733, 735,'Strains/Pulls - Left Hamstring')");
			 db.execSQL("INSERT INTO Fumbles VALUES (736, 738,'Strains/Pulls - Right Hamstring')");
			 db.execSQL("INSERT INTO Fumbles VALUES (739, 740,'Strains/Pulls - Left Quadriceps')");
			 db.execSQL("INSERT INTO Fumbles VALUES (741, 742,'Strains/Pulls - Right Quadriceps')");
			 db.execSQL("INSERT INTO Fumbles VALUES (743, 744,'Strains/Pulls - Gluteus Max')");
			 db.execSQL("INSERT INTO Fumbles VALUES (745, 746,'Strains/Pulls - Forearm')");
			 db.execSQL("INSERT INTO Fumbles VALUES (747, 748,'Strains/Pulls - Bicep')");
			 db.execSQL("INSERT INTO Fumbles VALUES (749, 751,'Strains/Pulls - Tricep')");
			 db.execSQL("INSERT INTO Fumbles VALUES (752, 759,'Strains/Pulls - Lower Back')");
			 db.execSQL("INSERT INTO Fumbles VALUES (760, 761,'Strains/Pulls - Side')");
			 db.execSQL("INSERT INTO Fumbles VALUES (762, 766,'Strains/Pulls - Upper Back')");
			 db.execSQL("INSERT INTO Fumbles VALUES (767, 768,'Strains/Pulls - Left Shoulder')");
			 db.execSQL("INSERT INTO Fumbles VALUES (769, 770,'Strains/Pulls - Right Shoulder')");
			 db.execSQL("INSERT INTO Fumbles VALUES (771, 771,'Strains/Pulls - Neck')");
			 db.execSQL("INSERT INTO Fumbles VALUES (772, 773,'Strains/Pulls - Hip')");
			 db.execSQL("INSERT INTO Fumbles VALUES (774, 774,'Strains/Pulls - Abs')");
			 db.execSQL("INSERT INTO Fumbles VALUES (775, 864,'Injure Ally - Damage to a random ally within reach; roll damage dice, add strength, make dexterity check to deliver only half damage')");
			 db.execSQL("INSERT INTO Fumbles VALUES (866, 941,'Lose Weapons - Drop weapon at feet')");
			 db.execSQL("INSERT INTO Fumbles VALUES (942, 964,'Lose Weapons - Drop weapon 2 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (965, 982,'Lose Weapons - Drop weapon 3 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (983, 995,'Lose Weapons - Drop weapon 4 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (996, 1004,'Lose Weapons - Toss weapon 5 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1005, 1010,'Lose Weapons - Toss weapon 6 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1011, 1015,'Lose Weapons - Toss weapon 7 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1016, 1020,'Lose Weapons - Toss weapon 8 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1021, 1024,'Lose Weapons - Toss weapon 9 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1025, 1028,'Lose Weapons - Throw weapon 10 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1029, 1031,'Lose Weapons - Throw weapon 11 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1032, 1034,'Lose Weapons - Throw weapon 12 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1035, 1037,'Lose Weapons - Throw weapon 13 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1038, 1039,'Lose Weapons - Throw weapon 14 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1040, 1041,'Lose Weapons - Hurl weapon 15 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1042, 1043,'Lose Weapons - Hurl weapon 16 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1044, 1044,'Lose Weapons - Hurl weapon d4p + 16 feet away')");
			 db.execSQL("INSERT INTO Fumbles VALUES (1045, 1100,'Injure Self - Damage to self; roll damage dice, add strength, make dexterity check to suffer only half damage total')");

	     }
		 Log.d("DB","End Filling Fumbles");
	}
	
	public void loadCritHacking(SQLiteDatabase db){
		Log.d("DB","Filling CritHacking");
		if(db != null){
			String sqlCreate = "CREATE TABLE IF NOT EXISTS Hacking (Min INTEGER,Max INTEGER, Min2 INTEGER,Max2 INTEGER,text TEXT)";
			db.execSQL(sqlCreate);

			db.execSQL("INSERT INTO Hacking VALUES (1, 100, 1, 10,'Top of Foot - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (1, 100, 11, 15,'Top of Foot - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (1, 100, 16, 20,'Top of Foot - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (1, 100, 21, 25,'Top of Foot - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Hacking VALUES (1, 100, 26, 30,'Top of Foot - 2 extra damage dice;muscle tear; movement penalty ( - 50% for 1d12p hours, -25% until healed))')");
			db.execSQL("INSERT INTO Hacking VALUES (1, 100, 31, 40,'Top of Foot - 3 extra damage dice; torn ligament; movement penalty ( - 75% for 6 hours, -50% until healed))')");
			db.execSQL("INSERT INTO Hacking VALUES (1, 100, 41, 50,'Top of Foot - 4 extra damage dice; automatically ToPed; compound fracture; movement penalty (-75% for 1day, -50% until healed), permanent limp), permanent limp')");
			db.execSQL("INSERT INTO Hacking VALUES (1, 100, 51, 999,'Top of Foot - 4 extra damage dice; automatically ToPed; shattered bone; severe bleeding; movement penalty ( -75% for 1day, - 50% until healed), permanent limp')");

			db.execSQL("INSERT INTO Hacking VALUES (101, 104, 1, 10,'Heel - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (101, 104, 11, 15,'Heel - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (101, 104, 16, 20,'Heel - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (101, 104, 21, 25,'Heel - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Hacking VALUES (101, 104, 26, 30,'Heel - 2 extra damage dice;muscle tear; -2 Attack	penalty; -2 Defense penalty; movement penalty ( -50% for 1d12p hours, -25% until healed))')");
			db.execSQL("INSERT INTO Hacking VALUES (101, 104, 31, 40,'Heel - 3 extra damage dice; torn ligament; -3 Attack penalty; -2 Dex penalty; movement penalty ( -75% for 6 hours, -50% until healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (101, 104, 41, 50,'Heel - 4 extra damage dice; automatically ToPed; compound fracture; -3 Attack penalty; -2 Defense penalty; movement penalty (-75% for 1day, -50% until healed), permanent limp & -1 ATK penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (101, 104, 51, 9999,'Heel - 4 extra damage dice; automatically ToPed; shattered bone;severe bleeding; -3 Attack penalty; -2 Dexterity penalty; immobile, permanent limp, -1 ATK & DEF penalty')");

			db.execSQL("INSERT INTO Hacking VALUES (105, 136, 1, 10,'Toe(s) - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (105, 136, 11, 15,'Toe(s) - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (105, 136, 16, 20,'Toe(s) - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (105, 136, 21, 25,'Toe(s) - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Hacking VALUES (105, 136, 26, 30,'Toe(s) - 2 extra damage dice; muscle tear; movement penalty (- 50% for 1d12p hours, -25% until healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (105, 136, 31, 40,'Toe(s) - 3 extra damage dice; torn ligament; movement penalty ( - 75% for 6 hours, -50% until healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (105, 136, 41, 50,'Toe(s) - 3 extra damage dice; broken bone; movement penalty ( - 75% for 6 hours, -50% until healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (105, 136, 51, 9999,'Toe(s) - 3 extra damage dice; broken bone; severe bleeding; movement penalty ( - 75% for 6 hours, -50% until healed)')");

			db.execSQL("INSERT INTO Hacking VALUES (137, 140, 1, 10,'Arch of Foot - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (137, 140, 11, 15,'Arch of Foot - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (137, 140, 16, 20,'Arch of Foot - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (137, 140, 21, 25,'Arch of Foot - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Hacking VALUES (137, 140, 26, 30,'Arch of Foot - 2 extra damage dice; muscle tear; -2 Attack penalty; -2 Defense penalty; movement penalty ( -50% for 1d12p hours, -25% until healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (137, 140, 31, 40,'Arch of Foot - 3 extra damage dice; torn ligament; -3 Attack penalty; -2 Dex penalty; movement penalty ( -75% for 6 hours, -50% until healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (137, 140, 41, 50,'Arch of Foot - 4 extra damage dice; automatically ToPed; compound fracture; -3 Attack penalty; -2 Defense penalty; movement penalty (-75% for 1day, -50% until healed), permanent limp & -1 ATK penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (137, 140, 51, 9999,'Arch of Foot - 4 extra damage dice; automatically ToPed; shattered bone; severe bleeding; -3 Attack penalty; -2 Dexterity penalty; immobile, permanent limp, -1 ATK & DEF penalty')");

			db.execSQL("INSERT INTO Hacking VALUES (141, 170, 1, 10,'Inner Ankle - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (141, 170, 11, 15,'Inner Ankle - movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (141, 170, 16, 20,'Inner Ankle - 1 extra damage die; movement penalty -50% for 5 minutes; count reset')");
			db.execSQL("INSERT INTO Hacking VALUES (141, 170, 21, 25,'Inner Ankle - 2 extra damage dice; movement penalty -50% for 1 minute; count reset; held items dropped; -1 Defense')");
			db.execSQL("INSERT INTO Hacking VALUES (141, 170, 26, 30,'Inner Ankle - 2 extra damage dice; movement penalty (50% until healed); count reset; held items dropped; -3 Defense')");
			db.execSQL("INSERT INTO Hacking VALUES (141, 170, 31, 40,'Inner Ankle - 3 extra damage dice; torn ligament; -4 Defense penalty; -2 Str penalty; movement penalty ( -75% until healed); count reset; held items dropped; -1 Defense, -/25 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (141, 170, 41, 50,'Inner Ankle - 4 extra damage dice; automatically ToPed; [compound fracture; immobile; permanent limp, - 2 Defense, -0/75 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (141, 170, 51, 9999,'Inner Ankle - 4 extra damage dice; automatically ToPed; shattered bone; torn ligaments or tendon; severe bleeding; immobile; permanent limp, -1 ATK penalty, - 2 Defense')");

			db.execSQL("INSERT INTO Hacking VALUES (171, 200, 1, 10,'Outer Ankle - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (171, 200, 11, 15,'Outer Ankle - movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (171, 200, 16, 20,'Outer Ankle - 1 extra damage die; movement penalty -50% for 5 minutes; count reset')");
			db.execSQL("INSERT INTO Hacking VALUES (171, 200, 21, 25,'Outer Ankle - 2 extra damage dice; movement penalty -50% for 1 minute; count reset; held items dropped; -1 Defense')");
			db.execSQL("INSERT INTO Hacking VALUES (171, 200, 26, 30,'Outer Ankle - 2 extra damage dice; movement penalty (50% until healed); count reset; held items dropped; -3 Defense')");
			db.execSQL("INSERT INTO Hacking VALUES (171, 200, 31, 40,'Outer Ankle - 3 extra damage dice; torn ligament; -4 Defense penalty; -2 Str penalty; movement penalty ( -75% until healed); count reset; held items dropped; -1 Defense, -/25 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (171, 200, 41, 50,'Outer Ankle - 4 extra damage dice; automatically ToPed; [compound fracture; immobile; permanent limp, -2 Defense, -0/75 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (171, 200, 51, 9999,'Outer Ankle - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons; severe bleeding; immobile; permanent limp, - 2 Defense')");

			db.execSQL("INSERT INTO Hacking VALUES (201, 220, 1, 10,'Achilles Ankle - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (201, 220, 11, 15,'Achilles Ankle - movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (201, 220, 16, 20,'Achilles Ankle - 1 extra damage die; movement penalty -50% for 5 minutes; count reset')");
			db.execSQL("INSERT INTO Hacking VALUES (201, 220, 21, 25,'Achilles Ankle - 2 extra damage dice; movement penalty -50% for 5 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (201, 220, 26, 30,'Achilles Ankle - 2 extra damage dice; movement penalty (50% until healed); count reset; held items dropped; -3 Defense')");
			db.execSQL("INSERT INTO Hacking VALUES (201, 220, 31, 40,'Achilles Ankle - 3 extra damage dice; torn ligament; -4 Defense penalty; -2 Str penalty; movement penalty ( -75% until healed); count reset; held items dropped; permanent limp, -1 Defense, -/25 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (201, 220, 41, 50,'Achilles Ankle - 4 extra damage dice; automatically ToPed; [compound fracture; immobile; permanent limp, -2 Defense, -0/75 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (201, 220, 51, 9999,'Achilles Ankle - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons; severe bleeding; immobile; permanent limp, - 2 Defense')");

			db.execSQL("INSERT INTO Hacking VALUES (221, 964, 1, 10,'Shin - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (221, 964, 11, 15,'Shin - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (221, 964, 16, 20,'Shin - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (221, 964, 21, 25,'Shin - 2 extra damage dice; movement penalty -50% for 5 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (221, 964, 26, 30,'Shin - 2 extra damage dice;count reset; held items dropped; -2 Defense')");
			db.execSQL("INSERT INTO Hacking VALUES (221, 964, 31, 40,'Shin - 3 extra damage dice; count reset; held items dropped; torn ligament; -4 Defense penalty; movement penalty ( -75% until healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (221, 964, 41, 50,'Shin - 3 extra damage dice; automatically ToPed; compound fracture; immobile')");
			db.execSQL("INSERT INTO Hacking VALUES (221, 964, 51, 9999,'Shin - 4 extra damage dice; automatically ToPed; Leg Severed; severe bleeding; immobile; Peg Leg proficiency required to regain movement')");

			db.execSQL("INSERT INTO Hacking VALUES (965, 1006, 1, 10,'Calf - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (965, 1006, 11, 15,'Calf - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (965, 1006, 16, 20,'Calf - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (965, 1006, 21, 25,'Calf - 2 extra damage dice; movement penalty -50% for 5 minute')");
			db.execSQL("INSERT INTO Hacking VALUES (965, 1006, 26, 30,'Calf - 2 extra damage dice;count reset; held items dropped; -1 Defense')");
			db.execSQL("INSERT INTO Hacking VALUES (965, 1006, 31, 40,'Calf - 3 extra damage dice; count reset; held items dropped;broken bone and muscle tear; -4 Defense penalty; movement penalty ( -75% until healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (965, 1006, 41, 50,'Calf - 3 extra damage dice; automatically ToPed; compound fracture; immobile')");
			db.execSQL("INSERT INTO Hacking VALUES (965, 1006, 51, 9999,'Calf - 4 extra damage dice; automatically ToPed;Leg Severed; severe bleeding; immobile; Peg Leg proficiency required to regain movement')");

			db.execSQL("INSERT INTO Hacking VALUES (1007, 1118, 1, 10,'Knee - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (1007, 1118, 11, 15,'Knee - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (1007, 1118, 16, 20,'Knee - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (1007, 1118, 21, 25,'Knee - 2 extra damage dice; -2 Def penalty; movement penalty ( - 50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Hacking VALUES (1007, 1118, 26, 30,'Knee - 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, - 50% for subsequent week); -3 Def penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (1007, 1118, 31, 40,'Knee - 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty; permanent -1 Def penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (1007, 1118, 41, 50,'Knee - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -2 Def')");
			db.execSQL("INSERT INTO Hacking VALUES (1007, 1118, 51, 9999,'Knee - 4 extra damage dice; automatically ToPed; Leg Severed; severe bleeding; immobile; Peg Leg proficiency required to regain movement')");

			db.execSQL("INSERT INTO Hacking VALUES (1119, 1132, 1, 10,'Back of Knee - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (1119, 1132, 11, 15,'Back of Knee - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (1119, 1132, 16, 20,'Back of Knee - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (1119, 1132, 21, 25,'Back of Knee - 2 extra damage dice; -2 Def penalty; movement penalty ( - 50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Hacking VALUES (1119, 1132, 26, 30,'Back of Knee - 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, - 50% for subsequent week); -3 Def penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (1119, 1132, 31, 40,'Back of Knee - 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (1119, 1132, 41, 50,'Back of Knee - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -1 Def')");
			db.execSQL("INSERT INTO Hacking VALUES (1119, 1132, 51, 9999,'Back of Knee - 4 extra damage dice; automatically ToPed; Leg Severed; severe bleeding; immobile; Peg Leg proficiency required to regain movement')");

			db.execSQL("INSERT INTO Hacking VALUES (1133, 1216, 1, 10,'Hamstring - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (1133, 1216, 11, 15,'Hamstring - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (1133, 1216, 16, 20,'Hamstring - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (1133, 1216, 21, 25,'Hamstring - 2 extra damage dice; -1 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Hacking VALUES (1133, 1216, 26, 30,'Hamstring - 3 extra damage dice; 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (1133, 1216, 31, 40,'Hamstring - 3 extra damage dice; 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (1133, 1216, 41, 50,'Hamstring - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -1 Def')");
			db.execSQL("INSERT INTO Hacking VALUES (1133, 1216, 51, 9999,'Hamstring - 4 extra damage dice; automatically ToPed; compound fracture, severe bleeding, immobile; permanent limp,& -1 ATK & -1 DEF')");

			db.execSQL("INSERT INTO Hacking VALUES (1217, 2000, 1, 10,'Thigh - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (1217, 2000, 11, 15,'Thigh - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (1217, 2000, 16, 20,'Thigh - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (1217, 2000, 21, 25,'Thigh - 2 extra damage dice; -1 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Hacking VALUES (1217, 2000, 26, 30,'Thigh - 3 extra damage dice; 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (1217, 2000, 31, 40,'Thigh - 3 extra damage dice; 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (1217, 2000, 41, 50,'Thigh - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -1 Def')");
			db.execSQL("INSERT INTO Hacking VALUES (1217, 2000, 51, 9999,'Thigh - 4 extra damage dice; automatically ToPed; compound fracture, severe bleeding; immobile; permanent limp,& -1 ATK & -1 DEF')");

			db.execSQL("INSERT INTO Hacking VALUES (2001, 2330, 1, 10,'Hip - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (2001, 2330, 11, 15,'Hip - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (2001, 2330, 16, 20,'Hip - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (2001, 2330, 21, 25,'Hip - 2 extra damage dice; -2 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Hacking VALUES (2001, 2330, 26, 30,'Hip - 3 extra damage dice; 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (2001, 2330, 31, 40,'Hip - 3 extra damage dice; 3 extra damage dice; automatically ToPed; [broken bone; [immobile); -3 Def penalty]')");
			db.execSQL("INSERT INTO Hacking VALUES (2001, 2330, 41, 50,'Hip - 4 extra damage dice; automatically ToPed; compound fracture, immobile; permanent limp, & --1 ATK & -1 DEF')");
			db.execSQL("INSERT INTO Hacking VALUES (2001, 2330, 51, 9999,'Hip - 4 extra damage dice; automatically ToPed; compound fracture, severe bleeding; immobile; permanent limp, & -1 ATK & -2 DEF')");

			db.execSQL("INSERT INTO Hacking VALUES (2331, 2405, 1, 10,'Groin (Male Only) - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (2331, 2405, 11, 15,'Groin (Male Only) - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (2331, 2405, 16, 20,'Groin (Male Only) - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (2331, 2405, 21, 25,'Groin (Male Only) - 2 extra damage dice; -2 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Hacking VALUES (2331, 2405, 26, 30,'Groin (Male Only) - 3 extra damage dice automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty]')");
			db.execSQL("INSERT INTO Hacking VALUES (2331, 2405, 31, 40,'Groin (Male Only) - 4 extra damage dice; automatically ToPed; [internal bleeding; movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty]')");
			db.execSQL("INSERT INTO Hacking VALUES (2331, 2405, 41, 50,'Groin (Male Only) - 4 extra damage dice; automatically ToPed; [internal bleeding; movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty]')");
			db.execSQL("INSERT INTO Hacking VALUES (2331, 2405, 51, 9999,'Groin (Male Only) - 4 extra damage dice; automatically ToPed; [sterilized; internal bleeding; movement penalty (- 75% for 6 hours, - 50% until healed); -4 Def penalty]')");

			db.execSQL("INSERT INTO Hacking VALUES (2406, 2435, 1, 10,'Buttock - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (2406, 2435, 11, 15,'Buttock - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (2406, 2435, 16, 20,'Buttock - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (2406, 2435, 21, 25,'Buttock - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (2406, 2435, 26, 30,'Buttock - 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (2406, 2435, 31, 40,'Buttock - 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty')");
			db.execSQL("INSERT INTO Hacking VALUES (2406, 2435, 41, 50,'Buttock - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, &-1 Def')");
			db.execSQL("INSERT INTO Hacking VALUES (2406, 2435, 51, 9999,'Buttock - 4 extra damage dice; automatically ToPed; compound fracture, severe bleeding, immobile; permanent limp, & -1 DEF')");

			db.execSQL("INSERT INTO Hacking VALUES (2436, 2570, 1, 10,'Lower Abdomen - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (2436, 2570, 11, 15,'Lower Abdomen - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (2436, 2570, 16, 20,'Lower Abdomen - 2 extra damage dice; -2 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (2436, 2570, 21, 25,'Lower Abdomen - 3 extra damage dice; automatically ToPed; [muscle tear, severe bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (2436, 2570, 26, 30,'Lower Abdomen - 3 extra damage dice; automatically ToPed; [muscle tear, severe bleeding, -3 Str until healed - permanent loss of 0.50 Con]')");
			db.execSQL("INSERT INTO Hacking VALUES (2436, 2570, 31, 40,'Lower Abdomen - 4 extra damage dice; automatically ToPed; severe bleeding; permanent -1 Con')");
			db.execSQL("INSERT INTO Hacking VALUES (2436, 2570, 41, 50,'Lower Abdomen - Target killed instantly; gutted and internal organs spill out')");
			db.execSQL("INSERT INTO Hacking VALUES (2436, 2570, 51, 9999,'Lower Abdomen - Target killed instantly; gutted and internal organs spill out')");

			db.execSQL("INSERT INTO Hacking VALUES (2571, 3020, 1, 10,'Lower Side - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (2571, 3020, 11, 15,'Lower Side - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (2571, 3020, 16, 20,'Lower Side - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (2571, 3020, 21, 25,'Lower Side - 2 extra damage dice; -2 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (2571, 3020, 26, 30,'Lower Side - 3 extra damage dice; automatically ToPed; [muscle tear, severe bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (2571, 3020, 31, 40,'Lower Side - 3 extra damage dice; automatically ToPed; [muscle tear, severe bleeding, -3 Str until healed - permanent loss of 0.50 Con]')");
			db.execSQL("INSERT INTO Hacking VALUES (2571, 3020, 41, 50,'Lower Side - 4 extra damage dice; automatically ToPed; severe bleeding; permanent -1 Con')");
			db.execSQL("INSERT INTO Hacking VALUES (2571, 3020, 51, 9999,'Lower Side - Target killed instantly; gutted and internal organs spill out')");

			db.execSQL("INSERT INTO Hacking VALUES (3021, 3110, 1, 10,'Upper Abdomen - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (3021, 3110, 11, 15,'Upper Abdomen - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (3021, 3110, 16, 20,'Upper Abdomen - 2 extra damage dice; -2 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (3021, 3110, 21, 25,'Upper Abdomen - 3 extra damage dice; automatically ToPed; [muscle tear, severe bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (3021, 3110, 26, 30,'Upper Abdomen - 3 extra damage dice; automatically ToPed; [muscletear, severe bleeding, -3 Str until healed - permanent loss of 0.50 Con]')");
			db.execSQL("INSERT INTO Hacking VALUES (3021, 3110, 31, 40,'Upper Abdomen - 4 extra damage dice; automatically ToPed; severe bleeding; permanent -1 Con')");
			db.execSQL("INSERT INTO Hacking VALUES (3021, 3110, 41, 50,'Upper Abdomen - Target killed instantly; gutted and internal organs spill out')");
			db.execSQL("INSERT INTO Hacking VALUES (3021, 3110, 51, 9999,'Upper Abdomen - Target killed instantly; gutted and internal organs spill out')");

			db.execSQL("INSERT INTO Hacking VALUES (3111, 3125, 1, 10,'Small of Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (3111, 3125, 11, 15,'Small of Back - 2 extra damage dice; count reset; held items Dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (3111, 3125, 16, 20,'Small of Back - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (3111, 3125, 21, 25,'Small of Back - 3 extra damage dice; count reset; held items dropped; torn muscle and 65% chance of internal bleeding; -2 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (3111, 3125, 26, 30,'Small of Back - 3 extra damage dice; automatically ToPed; [torn muscle, severe bleeding, -3 Str until healed – permanent loss of 0.75 Strength]')");
			db.execSQL("INSERT INTO Hacking VALUES (3111, 3125, 31, 40,'Small of Back - 4 extra damage dice; automatically ToPed; [broken bone (vertebrae), paralyzed until healed (85% chance of it being permanent)]')");
			db.execSQL("INSERT INTO Hacking VALUES (3111, 3125, 41, 50,'Small of Back - Target killed instantly; severed spine')");
			db.execSQL("INSERT INTO Hacking VALUES (3111, 3125, 51, 9999,'Small of Back - Target killed instantly; severed spine')");

			db.execSQL("INSERT INTO Hacking VALUES (3126, 3155, 1, 10,'Lower Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (3126, 3155, 11, 15,'Lower Back - 2 extra damage dice; count reset; held items Dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (3126, 3155, 16, 20,'Lower Back - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (3126, 3155, 21, 25,'Lower Back - 3 extra damage dice; count reset; held items dropped; torn muscle; -3 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (3126, 3155, 26, 30,'Lower Back - 3 extra damage dice; automatically ToPed; [broken bone (vertebrae), paralyzed until healed (65% chance of it being permanent)]')");
			db.execSQL("INSERT INTO Hacking VALUES (3126, 3155, 31, 40,'Lower Back - 4 extra damage dice; automatically ToPed; [broken bone (vertebrae), paralyzed until healed (85% chance of it being permanent)]')");
			db.execSQL("INSERT INTO Hacking VALUES (3126, 3155, 41, 50,'Lower Back - Target killed instantly; severed spine')");
			db.execSQL("INSERT INTO Hacking VALUES (3126, 3155, 51, 9999,'Lower Back - Target killed instantly; severed spine')");

			db.execSQL("INSERT INTO Hacking VALUES (3156, 3425, 1, 10,'Chest - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (3156, 3425, 11, 15,'Chest - 2 extra damage dice; count reset; held items Dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (3156, 3425, 16, 20,'Chest - 2 extra damage dice; count reset; held items dropped; broken bone; -2 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (3156, 3425, 21, 25,'Chest - 3 extra damage dice; count reset; held items dropped; broken bone; -3 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (3156, 3425, 26, 30,'Chest - 3 extra damage dice; automatically ToPed; [broken bone, 75% chance of internal bleeding, -3 Str until healed, -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Hacking VALUES (3156, 3425, 31, 40,'Chest - 4 extra damage dice; automatically ToPed; [compound fracture, internal bleeding, -5 Str until healed, -1/25 Str permanently)')");
			db.execSQL("INSERT INTO Hacking VALUES (3156, 3425, 41, 50,'Chest - Target killed instantly; ruptured aorta')");
			db.execSQL("INSERT INTO Hacking VALUES (3156, 3425, 51, 9999,'Chest - Target killed instantly; ruptured aorta')");

			db.execSQL("INSERT INTO Hacking VALUES (3426, 3455, 1, 10,'Upper Side - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (3426, 3455, 11, 15,'Upper Side - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (3426, 3455, 16, 20,'Upper Side - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (3426, 3455, 21, 25,'Upper Side - 2 extra damage dice count reset; held items dropped; broken ribs; -2 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (3426, 3455, 26, 30,'Upper Side - 3 extra damage dice count reset; held items dropped; broken ribs; severe bleeding; -3 Str until healed; -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Hacking VALUES (3426, 3455, 31, 40,'Upper Side - 3 extra damage dice; automatically ToPed;severe bleeding, broken ribs, -5 Str until healed, -1/25 Str permanently)')");
			db.execSQL("INSERT INTO Hacking VALUES (3426, 3455, 41, 50,'Upper Side - 4 extra damage dice; automatically ToPed;severe bleeding, broken ribs, -6 Str until healed, -1/50 Str permanently)')");
			db.execSQL("INSERT INTO Hacking VALUES (3426, 3455, 51, 9999,'Upper Side - Target killed instantly; pulmunary artery ruptured')");

			db.execSQL("INSERT INTO Hacking VALUES (3456, 3485, 1, 10,'Upper Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (3456, 3485, 11, 15,'Upper Back - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (3456, 3485, 16, 20,'Upper Back - 2 extra damage dice; count reset; held items dropped; muscle tear; -2 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (3456, 3485, 21, 25,'Upper Back - 3 extra damage dice; count reset; held items dropped; muscle tear; -3 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (3456, 3485, 26, 30,'Upper Back - 3 extra damage dice; automatically ToPed; [torn ligament, -3 Str until healed, -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Hacking VALUES (3456, 3485, 31, 40,'Upper Back - 4 extra damage dice; automatically ToPed [broken bones; severe bleeding, -6 Str until healed; -1/50 Str permanently)')");
			db.execSQL("INSERT INTO Hacking VALUES (3456, 3485, 41, 50,'Upper Back - Target killed instantly; ruptured aorta')");
			db.execSQL("INSERT INTO Hacking VALUES (3456, 3485, 51, 9999,'Upper Back - Target killed instantly; ruptured aorta')");

			db.execSQL("INSERT INTO Hacking VALUES (3486, 3500, 1, 10,'Upper Middle Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (3486, 3500, 11, 15,'Upper Middle Back - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (3486, 3500, 16, 20,'Upper Middle Back - 2 extra damage dice; count reset; held items dropped; muscle tear; -2 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (3486, 3500, 21, 25,'Upper Middle Back - 3 extra damage dice; count reset; held items dropped; muscle tear; -3 Str until healed')");
			db.execSQL("INSERT INTO Hacking VALUES (3486, 3500, 26, 30,'Upper Middle Back - 3 extra damage dice; automatically ToPed; [torn ligament, -3 Str until healed, -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Hacking VALUES (3486, 3500, 31, 40,'Upper Middle Back - 4 extra damage dice; automatically ToPed [broken bones; severe bleeding, -6 Str until healed; -1/50 Str permanently)')");
			db.execSQL("INSERT INTO Hacking VALUES (3486, 3500, 41, 50,'Upper Middle Back - Target killed instantly; ruptured aorta')");
			db.execSQL("INSERT INTO Hacking VALUES (3486, 3500, 51, 9999,'Upper Middle Back - Target killed instantly; ruptured aorta')");

			db.execSQL("INSERT INTO Hacking VALUES (3501, 3820, 1, 10,'Armpit - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (3501, 3820, 11, 15,'Armpit - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (3501, 3820, 16, 20,'Armpit - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (3501, 3820, 21, 25,'Armpit - 2 extra damage dice; count reset; held items dropped; -2 Atk (if primary side) or -2 Def (if secondary); -2 Str [all until healed]')");
			db.execSQL("INSERT INTO Hacking VALUES (3501, 3820, 26, 30,'Armpit - 3 extra damage dice; count reset; held items dropped; -3 Atk (if primary side) or -3 Def (if secondary); -3 Str; -1 Dex; -0/50 Str permanently')");
			db.execSQL("INSERT INTO Hacking VALUES (3501, 3820, 31, 40,'Armpit - 3 extra damage dice; automatically ToPed; [torn ligaments; -3 Atk (if primary side) or -3 Def (if secondary); -3 Str; -1 Dex; -1 Atk or Def & -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Hacking VALUES (3501, 3820, 41, 50,'Armpit - 4 extra damage dice; automatically ToPed; [torn ligaments; -3 Atk (if primary side) or -3 Def (if secondary); -4 Str; -2 Dex; -1 Atk or Def, -0/50 Dex & -1/00 Str permanently')");
			db.execSQL("INSERT INTO Hacking VALUES (3501, 3820, 51, 9999,'Armpit - 4 extra damage dice; automatically ToPed; [torn ligaments; severe bleeding; -3 Atk (if primary side) or -3 Def (if secondary); -4 Str; -2 Dex; -1 Atk or Def, -0/50 Dex & -1/50 Str permanently)')");

			db.execSQL("INSERT INTO Hacking VALUES (3821, 4300, 1, 10,'Upper Outer Arm - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (3821, 4300, 11, 15,'Upper Outer Arm - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (3821, 4300, 16, 20,'Upper Outer Arm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (3821, 4300, 21, 25,'Upper Outer Arm - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -2 Str [all until healed]')");
			db.execSQL("INSERT INTO Hacking VALUES (3821, 4300, 26, 30,'Upper Outer Arm - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Hacking VALUES (3821, 4300, 31, 40,'Upper Outer Arm - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -0/75 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (3821, 4300, 41, 50,'Upper Outer Arm - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -4 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -1/00 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (3821, 4300, 51, 9999,'Upper Outer Arm - 4 extra damage dice; automatically ToPed; Arm Severed')");

			db.execSQL("INSERT INTO Hacking VALUES (4301, 4492, 1, 10,'Upper Inner Arm - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (4301, 4492, 11, 15,'Upper Inner Arm - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (4301, 4492, 16, 20,'Upper Inner Arm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (4301, 4492, 21, 25,'Upper Inner Arm - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -2 Str [all until healed]')");
			db.execSQL("INSERT INTO Hacking VALUES (4301, 4492, 26, 30,'Upper Inner Arm - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Hacking VALUES (4301, 4492, 31, 40,'Upper Inner Arm - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -0/75 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (4301, 4492, 41, 50,'Upper Inner Arm - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -4 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -1/00 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (4301, 4492, 51, 9999,'Upper Inner Arm - 4 extra damage dice; automatically ToPed; Arm Severed; severe bleeding')");

			db.execSQL("INSERT INTO Hacking VALUES (4493, 4588, 1, 10,'Elbow - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (4493, 4588, 11, 15,'Elbow - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (4493, 4588, 16, 20,'Elbow - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (4493, 4588, 21, 25,'Elbow - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Hacking VALUES (4493, 4588, 26, 30,'Elbow - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Hacking VALUES (4493, 4588, 31, 40,'Elbow - 3 extra damage dice; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -2 Str [all until healed]; permanent -1 Atk (if primary else -1 Def)')");
			db.execSQL("INSERT INTO Hacking VALUES (4493, 4588, 41, 50,'Elbow - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -2 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def)')");
			db.execSQL("INSERT INTO Hacking VALUES (4493, 4588, 51, 9999,'Elbow - 4 extra damage dice; automatically ToPed; Arm Severed at elbow; severe bleeding')");

			db.execSQL("INSERT INTO Hacking VALUES (4589, 4684, 1, 10,'Inner Joint - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (4589, 4684, 11, 15,'Inner Joint - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (4589, 4684, 16, 20,'Inner Joint - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (4589, 4684, 21, 25,'Inner Joint - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (4589, 4684, 26, 30,'Inner Joint - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Hacking VALUES (4589, 4684, 31, 40,'Inner Joint - 2 extra damage dice; count reset; held items dropped -3 Atk & +1 Speed (if primary side) or -3 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Hacking VALUES (4589, 4684, 41, 50,'Inner Joint - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -2 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def)')");
			db.execSQL("INSERT INTO Hacking VALUES (4589, 4684, 51, 9999,'Inner Joint - 4 extra damage dice; automatically ToPed; Arm Severed at elbow; severe bleeding')");

			db.execSQL("INSERT INTO Hacking VALUES (4685, 5308, 1, 10,'Back of Forearm - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (4685, 5308, 11, 15,'Back of Forearm - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (4685, 5308, 16, 20,'Back of Forearm - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (4685, 5308, 21, 25,'Back of Forearm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (4685, 5308, 26, 30,'Back of Forearm - 2 extra damage dice; count reset; held items dropped -2 Atk (if primary side);')");
			db.execSQL("INSERT INTO Hacking VALUES (4685, 5308, 31, 40,'Back of Forearm - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Hacking VALUES (4685, 5308, 41, 50,'Back of Forearm - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Hacking VALUES (4685, 5308, 51, 9999,'Back of Forearm - 4 extra damage dice; automatically ToPed; Arm Severed below elbow; severe bleeding')");

			db.execSQL("INSERT INTO Hacking VALUES (5309, 5836, 1, 10,'Inner Forearm - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (5309, 5836, 11, 15,'Inner Forearm - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (5309, 5836, 16, 20,'Inner Forearm - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (5309, 5836, 21, 25,'Inner Forearm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (5309, 5836, 26, 30,'Inner Forearm - 2 extra damage dice; count reset; held items dropped -2 Atk (if primary side);')");
			db.execSQL("INSERT INTO Hacking VALUES (5309, 5836, 31, 40,'Inner Forearm - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Hacking VALUES (5309, 5836, 41, 50,'Inner Forearm - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Hacking VALUES (5309, 5836, 51, 9999,'Inner Forearm - 4 extra damage dice; automatically ToPed; Arm Severed below elbow; severe bleeding')");

			db.execSQL("INSERT INTO Hacking VALUES (5837, 5908, 1, 10,'Back of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (5837, 5908, 11, 15,'Back of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (5837, 5908, 16, 20,'Back of Wrist - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (5837, 5908, 21, 25,'Back of Wrist - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side)')");
			db.execSQL("INSERT INTO Hacking VALUES (5837, 5908, 26, 30,'Back of Wrist - 2 extra damage dice; count reset; held items dropped -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Hacking VALUES (5837, 5908, 31, 40,'Back of Wrist - 3 extra damage dice; [muscle tear; -4 Atk & +2 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Hacking VALUES (5837, 5908, 41, 50,'Back of Wrist - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & +3 Speed (if primary side); -1 Str [all until healed]; permanent -2 Atk & +2 Speed (if primary)')");
			db.execSQL("INSERT INTO Hacking VALUES (5837, 5908, 51, 9999,'Back of Wrist - 4 extra damage dice; automatically ToPed; Arm Severed at wrist; severe bleeding')");

			db.execSQL("INSERT INTO Hacking VALUES (5909, 5980, 1, 10,'Front of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (5909, 5980, 11, 15,'Front of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (5909, 5980, 16, 20,'Front of Wrist - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (5909, 5980, 21, 25,'Front of Wrist - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side)')");
			db.execSQL("INSERT INTO Hacking VALUES (5909, 5980, 26, 30,'Front of Wrist - 2 extra damage dice; count reset; held items dropped -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Hacking VALUES (5909, 5980, 31, 40,'Front of Wrist - 3 extra damage dice; [muscle tear; -4 Atk & +2 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Hacking VALUES (5909, 5980, 41, 50,'Front of Wrist - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & +3 Speed (if primary side); -1 Str [all until healed]; permanent -2 Atk & +2 Speed (if primary)')");
			db.execSQL("INSERT INTO Hacking VALUES (5909, 5980, 51, 9999,'Front of Wrist - 4 extra damage dice; automatically ToPed; Arm Severed at wrist; severe bleeding')");

			db.execSQL("INSERT INTO Hacking VALUES (5981, 6052, 1, 10,'Back of Hand - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (5981, 6052, 11, 15,'Back of Hand - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (5981, 6052, 16, 20,'Back of Hand - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (5981, 6052, 21, 25,'Back of Hand - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (5981, 6052, 26, 30,'Back of Hand - 2 extra damage dice; count reset; held items dropped; -2 Atk')");
			db.execSQL("INSERT INTO Hacking VALUES (5981, 6052, 31, 40,'Back of Hand - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Hacking VALUES (5981, 6052, 41, 50,'Back of Hand - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +2 Speed (if primary side); [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Hacking VALUES (5981, 6052, 51, 9999,'Back of Hand - 4 extra damage dice; automatically ToPed; Hand Severed; severe bleeding')");

			db.execSQL("INSERT INTO Hacking VALUES (6053, 6076, 1, 10,'Palm - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (6053, 6076, 11, 15,'Palm - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (6053, 6076, 16, 20,'Palm - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (6053, 6076, 21, 25,'Palm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (6053, 6076, 26, 30,'Palm - 2 extra damage dice; count reset; held items dropped; -2 Atk')");
			db.execSQL("INSERT INTO Hacking VALUES (6053, 6076, 31, 40,'Palm - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Hacking VALUES (6053, 6076, 41, 50,'Palm - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +2 Speed (if primary side); [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Hacking VALUES (6053, 6076, 51, 9999,'Palm - 4 extra damage dice; automatically ToPed; Hand Severed; severe bleeding')");

			db.execSQL("INSERT INTO Hacking VALUES (6077, 6220, 1, 10,'Finger(s) - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (6077, 6220, 11, 15,'Finger(s) - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (6077, 6220, 16, 20,'Finger(s) - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (6077, 6220, 21, 25,'Finger(s) - 2 extra damage dice; count reset; held items dropped if ToP check failed')");
			db.execSQL("INSERT INTO Hacking VALUES (6077, 6220, 26, 30,'Finger(s) - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (6077, 6220, 31, 40,'Finger(s) - 2 extra damage dice; count reset; held items dropped; -2 Atk')");
			db.execSQL("INSERT INTO Hacking VALUES (6077, 6220, 41, 50,'Finger(s) - 3 extra damage dice; [muscle tear; -2 Atk & +1 Speed (if primary side);')");
			db.execSQL("INSERT INTO Hacking VALUES (6077, 6220, 51, 9999,'Finger(s) - 3 extra damage dice; Finger Severed')");

			db.execSQL("INSERT INTO Hacking VALUES (6221, 7180, 1, 10,'Side of Shoulder - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (6221, 7180, 11, 15,'Side of Shoulder - 1 extra damage die')");
			db.execSQL("INSERT INTO Hacking VALUES (6221, 7180, 16, 20,'Side of Shoulder - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (6221, 7180, 21, 25,'Side of Shoulder - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Hacking VALUES (6221, 7180, 26, 30,'Side of Shoulder - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -4 Str [all until healed]; permanent -1 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (6221, 7180, 31, 40,'Side of Shoulder - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -5 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -1/50 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (6221, 7180, 41, 50,'Side of Shoulder - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -6 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -2/00 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (6221, 7180, 51, 9999,'Side of Shoulder - 4 extra damage dice; automatically ToPed; Arm lopped off at shoulder; severe bleeding')");

			db.execSQL("INSERT INTO Hacking VALUES (7181, 9100, 1, 10,'Top of Shoulder - no additional effect')");
			db.execSQL("INSERT INTO Hacking VALUES (7181, 9100, 11, 15,'Top of Shoulder - 1 extra damage die')");
			 db.execSQL("INSERT INTO Hacking VALUES (7181, 9100, 16, 20,'Top of Shoulder - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (7181, 9100, 21, 25,'Top of Shoulder - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Hacking VALUES (7181, 9100, 26, 30,'Top of Shoulder - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -4 Str [all until healed]; permanent -1 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (7181, 9100, 31, 40,'Top of Shoulder - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -5 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -1/50 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (7181, 9100, 41, 50,'Top of Shoulder - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -6 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -2/00 Str')");
			db.execSQL("INSERT INTO Hacking VALUES (7181, 9100, 51, 9999,'Top of Shoulder - 4 extra damage dice; automatically ToPed;Arm lopped off at shoulder; severe bleeding')");

			db.execSQL("INSERT INTO Hacking VALUES (9101, 9121, 1, 10,'Front of Neck - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9101, 9121, 11, 15,'Front of Neck - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9101, 9121, 16, 20,'Front of Neck - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9101, 9121, 21, 25,'Front of Neck - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9101, 9121, 26, 30,'Front of Neck - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9101, 9121, 31, 40,'Front of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9101, 9121, 41, 50,'Front of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9101, 9121, 51, 9999,'Front of Neck - Target killed instantly')");

			db.execSQL("INSERT INTO Hacking VALUES (9122, 9142, 1, 10,'Back of Neck - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9122, 9142, 11, 15,'Back of Neck - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9122, 9142, 16, 20,'Back of Neck - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9122, 9142, 21, 25,'Back of Neck - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9122, 9142, 26, 30,'Back of Neck - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9122, 9142, 31, 40,'Back of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9122, 9142, 41, 50,'Back of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9122, 9142, 51, 9999,'v - Target killed instantly')");

			db.execSQL("INSERT INTO Hacking VALUES (9143, 9373, 1, 10,'Side of Neck - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9143, 9373, 11, 15,'Side of Neck - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9143, 9373, 16, 20,'Side of Neck - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9143, 9373, 21, 25,'Side of Neck - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9143, 9373, 26, 30,'Side of Neck - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9143, 9373, 31, 40,'Side of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9143, 9373, 41, 50,'Side of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9143, 9373, 51, 9999,'Side of Neck - Target killed instantly')");

			db.execSQL("INSERT INTO Hacking VALUES (9374, 9653, 1, 10,'Side of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9374, 9653, 11, 15,'Side of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9374, 9653, 16, 20,'Side of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9374, 9653, 21, 25,'Side of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9374, 9653, 26, 30,'Side of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9374, 9653, 31, 40,'Side of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9374, 9653, 41, 50,'Side of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9374, 9653, 51, 9999,'Side of Head - Target killed instantly')");

			db.execSQL("INSERT INTO Hacking VALUES (9654, 9688, 1, 10,'Lower Back of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9654, 9688, 11, 15,'Lower Back of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9654, 9688, 16, 20,'Lower Back of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9654, 9688, 21, 25,'Lower Back of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9654, 9688, 26, 30,'Lower Back of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9654, 9688, 31, 40,'Lower Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9654, 9688, 41, 50,'Lower Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9654, 9688, 51, 9999,'Lower Back of Head - Target killed instantly')");

			db.execSQL("INSERT INTO Hacking VALUES (9689, 9768, 1, 10,'Lower Side of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9689, 9768, 11, 15,'Lower Side of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9689, 9768, 16, 20,'Lower Side of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9689, 9768, 21, 25,'Lower Side of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -1 Looks')");
			db.execSQL("INSERT INTO Hacking VALUES (9689, 9768, 26, 30,'Lower Side of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Hacking VALUES (9689, 9768, 31, 40,'Lower Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9689, 9768, 41, 50,'Lower Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9689, 9768, 51, 9999,'Lower Side of Face - Target killed instantly')");

			db.execSQL("INSERT INTO Hacking VALUES (9769, 9788, 1, 10,'Lower Center of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9769, 9788, 11, 15,'Lower Center of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9769, 9788, 16, 20,'Lower Center of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9769, 9788, 21, 25,'Lower Center of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -1 Looks')");
			db.execSQL("INSERT INTO Hacking VALUES (9769, 9788, 26, 30,'Lower Center of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Hacking VALUES (9769, 9788, 31, 40,'Lower Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9769, 9788, 41, 50,'Lower Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9769, 9788, 51, 9999,'Lower Center of Face - Target killed instantly')");

			db.execSQL("INSERT INTO Hacking VALUES (9789, 9823, 1, 10,'Upper Back of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9789, 9823, 11, 15,'Upper Back of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9789, 9823, 16, 20,'Upper Back of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9789, 9823, 21, 25,'Upper Back of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9789, 9823, 26, 30,'Upper Back of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9789, 9823, 31, 40,'Upper Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9789, 9823, 41, 50,'Upper Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9789, 9823, 51, 9999,'Upper Back of Head - Target killed instantly')");

			db.execSQL("INSERT INTO Hacking VALUES (9824, 9903, 1, 10,'Upper Side of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9824, 9903, 11, 15,'Upper Side of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9824, 9903, 16, 20,'Upper Side of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped; permanent -1 Looks')");
			db.execSQL("INSERT INTO Hacking VALUES (9824, 9903, 21, 25,'Upper Side of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Hacking VALUES (9824, 9903, 26, 30,'Upper Side of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -3 Looks')");
			db.execSQL("INSERT INTO Hacking VALUES (9824, 9903, 31, 40,'Upper Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9824, 9903, 41, 50,'Upper Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9824, 9903, 51, 9999,'Upper Side of Face - Target killed instantly')");

			db.execSQL("INSERT INTO Hacking VALUES (9904, 9923, 1, 10,'Upper Center of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9904, 9923, 11, 15,'Upper Center of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9904, 9923, 16, 20,'Upper Center of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped; permanent -1 Looks')");
			db.execSQL("INSERT INTO Hacking VALUES (9904, 9923, 21, 25,'Upper Center of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Hacking VALUES (9904, 9923, 26, 30,'Upper Center of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -4 Looks')");
			db.execSQL("INSERT INTO Hacking VALUES (9904, 9923, 31, 40,'Upper Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9904, 9923, 41, 50,'Upper Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9904, 9923, 51, 9999,'Upper Center of Face - Target killed instantly')");

			db.execSQL("INSERT INTO Hacking VALUES (9924, 10000, 1, 10,'Top of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9924, 10000, 11, 15,'Top of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9924, 10000, 16, 20,'Top of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Hacking VALUES (9924, 10000, 21, 25,'Top of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9924, 10000, 26, 30,'Top of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Hacking VALUES (9924, 10000, 31, 40,'Top of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9924, 10000, 41, 50,'Top of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Hacking VALUES (9924, 10000, 51, 9999,'Top of Head - Target killed instantly')");
		
		}
		Log.d("DB","End Filling CritHacking");
	}
	public void loadCritPiercing(SQLiteDatabase db){
		Log.d("DB","Filling CritPiercing");
		if(db != null){
			String sqlCreate = "CREATE TABLE IF NOT EXISTS Piercing (Min INTEGER,Max INTEGER, Min2 INTEGER,Max2 INTEGER,text TEXT)";
			db.execSQL(sqlCreate);

			db.execSQL("INSERT INTO Piercing VALUES (1, 100, 1, 10,'Top of Foot - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (1, 100, 11, 15,'Top of Foot - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (1, 100, 16, 20,'Top of Foot - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (1, 100, 21, 25,'Top of Foot - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Piercing VALUES (1, 100, 26, 30,'Top of Foot - 2 extra damage dice; broken bone; movement penalty ( - 50% for 1d12p hours, -25% until healed))')");
			db.execSQL("INSERT INTO Piercing VALUES (1, 100, 31, 40,'Top of Foot - 3 extra damage dice; broken bone; movement penalty ( - 75% for 6 hours, -50% until healed))')");
			db.execSQL("INSERT INTO Piercing VALUES (1, 100, 41, 50,'Top of Foot - 4 extra damage dice; automatically ToPed; compound fracture; movement penalty (-75% for 1day, -50% until healed), permanent limp), permanent limp')");
			db.execSQL("INSERT INTO Piercing VALUES (1, 100, 51, 999,'Top of Foot - 4 extra damage dice; automatically ToPed; shattered bone; movement penalty ( -75% for 1day, - 50% until healed), permanent limp')");

			db.execSQL("INSERT INTO Piercing VALUES (101, 104, 1, 10,'Heel - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (101, 104, 11, 15,'Heel - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (101, 104, 16, 20,'Heel - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (101, 104, 21, 25,'Heel - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Piercing VALUES (101, 104, 26, 30,'Heel - 2 extra damage dice; broken bone; -2 Attack penalty; -2 Defense penalty; movement penalty ( -50% for 1d12p hours, -25% until healed))')");
			db.execSQL("INSERT INTO Piercing VALUES (101, 104, 31, 40,'Heel - 3 extra damage dice; broken bone; -3 Attack penalty; -2 Dex penalty; movement penalty ( -75% for 6 hours, -50% until healed),permanent limp')");
			db.execSQL("INSERT INTO Piercing VALUES (101, 104, 41, 50,'Heel - 4 extra damage dice; automatically ToPed; compound fracture; -3 Attack penalty; -2 Defense penalty; movement penalty (-75% for 1day, -50% until healed), permanent limp & -1 ATK penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (101, 104, 51, 9999,'Heel - 4 extra damage dice; automatically ToPed; shattered bone; -3 Attack penalty; -2 Dexterity penalty; immobile, permanent limp, -1 ATK & DEF penalty')");

			db.execSQL("INSERT INTO Piercing VALUES (105, 136, 1, 10,'Toe(s) - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (105, 136, 11, 15,'Toe(s) - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (105, 136, 16, 20,'Toe(s) - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (105, 136, 21, 25,'Toe(s) - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Piercing VALUES (105, 136, 26, 30,'Toe(s) - 2 extra damage dice; broken bone; movement penalty (- 50% for 1d12p hours, -25% until healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (105, 136, 31, 40,'Toe(s) - 3 extra damage dice; broken bone; movement penalty ( - 75% for 6 hours, -50% until healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (105, 136, 41, 50,'Toe(s) - 3 extra damage dice; broken bone; movement penalty ( - 75% for 6 hours, -50% until healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (105, 136, 51, 9999,'Toe(s) - 3 extra damage dice; broken bone; severe bleeding; movement penalty ( - 75% for 6 hours, -50% until healed)')");

			db.execSQL("INSERT INTO Piercing VALUES (137, 140, 1, 10,'Arch of Foot - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (137, 140, 11, 15,'Arch of Foot - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (137, 140, 16, 20,'Arch of Foot - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (137, 140, 21, 25,'Arch of Foot - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Piercing VALUES (137, 140, 26, 30,'Arch of Foot - 2 extra damage dice; broken bone; -2 Attack penalty; -2 Defense penalty; movement penalty ( -50% for 1d12p hours, -25% until healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (137, 140, 31, 40,'Arch of Foot - 3 extra damage dice; broken bone; -3 Attack penalty; -2 Dex penalty; movement penalty ( -75% for 6 hours, -50% until healed), permanent limp')");
			db.execSQL("INSERT INTO Piercing VALUES (137, 140, 41, 50,'Arch of Foot - 4 extra damage dice; automatically ToPed; compound fracture; -3 Attack penalty; -2 Defense penalty; movement penalty (-75% for 1day, -50% until healed), permanent limp & -1 ATK penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (137, 140, 51, 9999,'Arch of Foot - 4 extra damage dice; automatically ToPed; shattered bone; -3 Attack penalty; -2 Dexterity penalty; immobile, permanent limp, -1 ATK & DEF penalty')");

			db.execSQL("INSERT INTO Piercing VALUES (141, 170, 1, 10,'Inner Ankle - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (141, 170, 11, 15,'Inner Ankle - movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (141, 170, 16, 20,'Inner Ankle - 1 extra damage die; movement penalty -50% for 5 minutes; count reset')");
			db.execSQL("INSERT INTO Piercing VALUES (141, 170, 21, 25,'Inner Ankle - 2 extra damage dice; movement penalty -50% for 1 minute; count reset; held items dropped; -1 Defense')");
			db.execSQL("INSERT INTO Piercing VALUES (141, 170, 26, 30,'Inner Ankle - 2 extra damage dice; movement penalty (50% until healed); count reset; held items dropped; -3 Defense')");
			db.execSQL("INSERT INTO Piercing VALUES (141, 170, 31, 40,'Inner Ankle - 3 extra damage dice; broken bone; -4 Defense penalty; -2 Str penalty; movement penalty ( -75% until healed); count reset; held items dropped; -1 Defense, -/25 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (141, 170, 41, 50,'Inner Ankle - 4 extra damage dice; automatically ToPed; [compound fracture; immobile; permanent limp, - 2 Defense, -0/75 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (141, 170, 51, 9999,'Inner Ankle - 4 extra damage dice; automatically ToPed; shattered bone; torn ligaments or tendon; immobile; permanent limp, -1 ATK penalty, - 2 Defense')");

			db.execSQL("INSERT INTO Piercing VALUES (171, 200, 1, 10,'Outer Ankle - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (171, 200, 11, 15,'Outer Ankle - movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (171, 200, 16, 20,'Outer Ankle - 1 extra damage die; movement penalty -50% for 5 minutes; count reset')");
			db.execSQL("INSERT INTO Piercing VALUES (171, 200, 21, 25,'Outer Ankle - 2 extra damage dice; movement penalty -50% for 1 minute; count reset; held items dropped; -1 Defense')");
			db.execSQL("INSERT INTO Piercing VALUES (171, 200, 26, 30,'Outer Ankle - 2 extra damage dice; movement penalty (50% until healed); count reset; held items dropped; -3 Defense')");
			db.execSQL("INSERT INTO Piercing VALUES (171, 200, 31, 40,'Outer Ankle - 3 extra damage dice; broken bone; -4 Defense penalty; -2 Str penalty; movement penalty ( -75% until healed); count reset; held items dropped; -1 Defense, -/25 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (171, 200, 41, 50,'Outer Ankle - 4 extra damage dice; automatically ToPed; [compound fracture; immobile; permanent limp, -2 Defense, -0/75 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (171, 200, 51, 9999,'Outer Ankle - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons; immobile; permanent limp, - 2 Defense')");

			db.execSQL("INSERT INTO Piercing VALUES (201, 220, 1, 10,'Achilles Ankle - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (201, 220, 11, 15,'Achilles Ankle - movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (201, 220, 16, 20,'Achilles Ankle - 1 extra damage die; movement penalty -50% for 5 minutes; count reset')");
			db.execSQL("INSERT INTO Piercing VALUES (201, 220, 21, 25,'Achilles Ankle - 2 extra damage dice; movement penalty -50% for 5 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (201, 220, 26, 30,'Achilles Ankle - 2 extra damage dice; movement penalty (50% until healed); count reset; held items dropped; -3 Defense')");
			db.execSQL("INSERT INTO Piercing VALUES (201, 220, 31, 40,'Achilles Ankle - 3 extra damage dice; broken bone; -4 Defense penalty; -2 Str penalty; movement penalty ( -75% until healed); count reset; held items dropped; permanent limp, -1 Defense, -/25 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (201, 220, 41, 50,'Achilles Ankle - 4 extra damage dice; automatically ToPed; [compound fracture; immobile; permanent limp, -2 Defense, -0/75 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (201, 220, 51, 9999,'Achilles Ankle - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons; immobile; permanent limp, - 2 Defense')");

			db.execSQL("INSERT INTO Piercing VALUES (221, 964, 1, 10,'Shin - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (221, 964, 11, 15,'Shin - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (221, 964, 16, 20,'Shin - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (221, 964, 21, 25,'Shin - 2 extra damage dice; movement penalty -50% for 5 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (221, 964, 26, 30,'Shin - 2 extra damage dice;count reset; held items dropped; -2 Defense')");
			db.execSQL("INSERT INTO Piercing VALUES (221, 964, 31, 40,'Shin - 3 extra damage dice; count reset; held items dropped; broken bone; -4 Defense penalty; movement penalty ( -75% until healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (221, 964, 41, 50,'Shin - 3 extra damage dice; automatically ToPed; compound fracture; immobile')");
			db.execSQL("INSERT INTO Piercing VALUES (221, 964, 51, 9999,'Shin - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons; immobile; permanent limp, - 1 Defense')");

			db.execSQL("INSERT INTO Piercing VALUES (965, 1006, 1, 10,'Calf - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (965, 1006, 11, 15,'Calf - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (965, 1006, 16, 20,'Calf - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (965, 1006, 21, 25,'Calf - 2 extra damage dice; movement penalty -50% for 5 minute')");
			db.execSQL("INSERT INTO Piercing VALUES (965, 1006, 26, 30,'Calf - 2 extra damage dice;count reset; held items dropped; muscle tear, -1 Defense')");
			db.execSQL("INSERT INTO Piercing VALUES (965, 1006, 31, 40,'Calf - 3 extra damage dice; count reset; held items dropped;broken bone and muscle tear; -4 Defense penalty; movement penalty ( -75% until healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (965, 1006, 41, 50,'Calf - 3 extra damage dice; automatically ToPed; compound fracture; immobile')");
			db.execSQL("INSERT INTO Piercing VALUES (965, 1006, 51, 9999,'Calf - 4 extra damage dice; automatically ToPed;multiple fracture, torn ligaments/tendons; immobile; permanent limp, - 1 Defense')");

			db.execSQL("INSERT INTO Piercing VALUES (1007, 1118, 1, 10,'Knee - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (1007, 1118, 11, 15,'Knee - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (1007, 1118, 16, 20,'Knee - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (1007, 1118, 21, 25,'Knee - 2 extra damage dice; -2 Def penalty; movement penalty ( - 50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Piercing VALUES (1007, 1118, 26, 30,'Knee - 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, - 50% for subsequent week); -3 Def penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (1007, 1118, 31, 40,'Knee - 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty; permanent -1 Def penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (1007, 1118, 41, 50,'Knee - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -2 Def')");
			db.execSQL("INSERT INTO Piercing VALUES (1007, 1118, 51, 9999,'Knee - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons, immobile; permanent limp, & -2 Def')");

			db.execSQL("INSERT INTO Piercing VALUES (1119, 1132, 1, 10,'Back of Knee - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (1119, 1132, 11, 15,'Back of Knee - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (1119, 1132, 16, 20,'Back of Knee - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (1119, 1132, 21, 25,'Back of Knee - 2 extra damage dice; -2 Def penalty; movement penalty ( - 50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Piercing VALUES (1119, 1132, 26, 30,'Back of Knee - 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, - 50% for subsequent week); -3 Def penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (1119, 1132, 31, 40,'Back of Knee - 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (1119, 1132, 41, 50,'Back of Knee - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -1 Def')");
			db.execSQL("INSERT INTO Piercing VALUES (1119, 1132, 51, 9999,'Back of Knee - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons, immobile; permanent limp, & -2 Def')");

			db.execSQL("INSERT INTO Piercing VALUES (1133, 1216, 1, 10,'Hamstring - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (1133, 1216, 11, 15,'Hamstring - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (1133, 1216, 16, 20,'Hamstring - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (1133, 1216, 21, 25,'Hamstring - 2 extra damage dice; -1 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Piercing VALUES (1133, 1216, 26, 30,'Hamstring - 3 extra damage dice; 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (1133, 1216, 31, 40,'Hamstring - 3 extra damage dice; 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (1133, 1216, 41, 50,'Hamstring - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -1 Def')");
			db.execSQL("INSERT INTO Piercing VALUES (1133, 1216, 51, 9999,'Hamstring - 4 extra damage dice; automatically ToPed; compound fracture, immobile; permanent limp,& -1 ATK & -1 DEF')");

			db.execSQL("INSERT INTO Piercing VALUES (1217, 2000, 1, 10,'Thigh - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (1217, 2000, 11, 15,'Thigh - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (1217, 2000, 16, 20,'Thigh - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (1217, 2000, 21, 25,'Thigh - 2 extra damage dice; -1 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Piercing VALUES (1217, 2000, 26, 30,'Thigh - 3 extra damage dice; 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (1217, 2000, 31, 40,'Thigh - 3 extra damage dice; 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (1217, 2000, 41, 50,'Thigh - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -1 Def')");
			db.execSQL("INSERT INTO Piercing VALUES (1217, 2000, 51, 9999,'Thigh - 4 extra damage dice; automatically ToPed; compound fracture, immobile; permanent limp,& -1 ATK & -1 DEF')");

			db.execSQL("INSERT INTO Piercing VALUES (2001, 2330, 1, 10,'Hip - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (2001, 2330, 11, 15,'Hip - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (2001, 2330, 16, 20,'Hip - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (2001, 2330, 21, 25,'Hip - 2 extra damage dice; -2 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Piercing VALUES (2001, 2330, 26, 30,'Hip - 3 extra damage dice; 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (2001, 2330, 31, 40,'Hip - 3 extra damage dice; 3 extra damage dice; automatically ToPed; [broken bone; [immobile); -3 Def penalty]')");
			db.execSQL("INSERT INTO Piercing VALUES (2001, 2330, 41, 50,'Hip - 4 extra damage dice; automatically ToPed; compound fracture, immobile; permanent limp, & --1 ATK & -1 DEF')");
			db.execSQL("INSERT INTO Piercing VALUES (2001, 2330, 51, 9999,'Hip - 4 extra damage dice; automatically ToPed; compound fracture, immobile; permanent limp, & -1 ATK & -2 DEF')");

			db.execSQL("INSERT INTO Piercing VALUES (2331, 2405, 1, 10,'Groin (Male Only) - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (2331, 2405, 11, 15,'Groin (Male Only) - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (2331, 2405, 16, 20,'Groin (Male Only) - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (2331, 2405, 21, 25,'Groin (Male Only) - 2 extra damage dice; -2 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Piercing VALUES (2331, 2405, 26, 30,'Groin (Male Only) - 3 extra damage dice automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty]')");
			db.execSQL("INSERT INTO Piercing VALUES (2331, 2405, 31, 40,'Groin (Male Only) - 4 extra damage dice; automatically ToPed; [internal bleeding; movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty]')");
			db.execSQL("INSERT INTO Piercing VALUES (2331, 2405, 41, 50,'Groin (Male Only) - 4 extra damage dice; automatically ToPed; [internal bleeding; movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty]')");
			db.execSQL("INSERT INTO Piercing VALUES (2331, 2405, 51, 9999,'Groin (Male Only) - 4 extra damage dice; automatically ToPed; [sterilized; internal bleeding; movement penalty (- 75% for 6 hours, - 50% until healed); -4 Def penalty]')");

			db.execSQL("INSERT INTO Piercing VALUES (2406, 2435, 1, 10,'Buttock - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (2406, 2435, 11, 15,'Buttock - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (2406, 2435, 16, 20,'Buttock - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (2406, 2435, 21, 25,'Buttock - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (2406, 2435, 26, 30,'Buttock - 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (2406, 2435, 31, 40,'Buttock - 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty')");
			db.execSQL("INSERT INTO Piercing VALUES (2406, 2435, 41, 50,'Buttock - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, &-1 Def')");
			db.execSQL("INSERT INTO Piercing VALUES (2406, 2435, 51, 9999,'Buttock - 4 extra damage dice; automatically ToPed; compound fracture, immobile; permanent limp, & -1 DEF')");

			db.execSQL("INSERT INTO Piercing VALUES (2436, 2570, 1, 10,'Lower Abdomen - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (2436, 2570, 11, 15,'Lower Abdomen - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (2436, 2570, 16, 20,'Lower Abdomen - 2 extra damage dice;[50% chance for internal bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (2436, 2570, 21, 25,'Lower Abdomen - 3 extra damage dice; automatically ToPed; [muscle tear, internal bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (2436, 2570, 26, 30,'Lower Abdomen - 3 extra damage dice; automatically ToPed; [muscle tear, internal bleeding, -3 Str until healed - permanent loss of 0.50 Con]')");
			db.execSQL("INSERT INTO Piercing VALUES (2436, 2570, 31, 40,'Lower Abdomen - 4 extra damage dice; automatically ToPed; internal bleeding; permanent -1 Con')");
			db.execSQL("INSERT INTO Piercing VALUES (2436, 2570, 41, 50,'4 extra damage dice; automatically ToPed;severe bleeding; permanent -2 Con')");
			db.execSQL("INSERT INTO Piercing VALUES (2436, 2570, 51, 9999,'Lower Abdomen - Target killed instantly; multiple organ failure')");

			db.execSQL("INSERT INTO Piercing VALUES (2571, 3020, 1, 10,'Lower Side - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (2571, 3020, 11, 15,'Lower Side - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (2571, 3020, 16, 20,'Lower Side - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (2571, 3020, 21, 25,'Lower Side - 2 extra damage dice; [50% chance for internal bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (2571, 3020, 26, 30,'Lower Side - 3 extra damage dice; automatically ToPed; [muscle tear, severe bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (2571, 3020, 31, 40,'Lower Side - 3 extra damage dice; automatically ToPed; [muscle tear, severe bleeding, -3 Str until healed - permanent loss of 0.50 Con]')");
			db.execSQL("INSERT INTO Piercing VALUES (2571, 3020, 41, 50,'Lower Side - 4 extra damage dice; automatically ToPed; severe bleeding; permanent -1 Con')");
			db.execSQL("INSERT INTO Piercing VALUES (2571, 3020, 51, 9999,'Lower Side - 4 extra damage dice; automatically ToPed; internal Hemorrhaging; permanent -2 Con')");

			db.execSQL("INSERT INTO Piercing VALUES (3021, 3110, 1, 10,'Upper Abdomen - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (3021, 3110, 11, 15,'Upper Abdomen - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (3021, 3110, 16, 20,'Upper Abdomen - 2 extra damage dice;[50% chance for internal bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (3021, 3110, 21, 25,'Upper Abdomen - 3 extra damage dice; automatically ToPed; [muscle tear, severe bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (3021, 3110, 26, 30,'Upper Abdomen - 3 extra damage dice; automatically ToPed; [muscletear, severe bleeding, -3 Str until healed - permanent loss of 0.50 Con]')");
			db.execSQL("INSERT INTO Piercing VALUES (3021, 3110, 31, 40,'Upper Abdomen - 4 extra damage dice; automatically ToPed; severe bleeding; permanent -1 Con')");
			db.execSQL("INSERT INTO Piercing VALUES (3021, 3110, 41, 50,'Upper Abdomen - 4 extra damage dice; automatically ToPed; internal Hemorrhaging; permanent -2 Con')");
			db.execSQL("INSERT INTO Piercing VALUES (3021, 3110, 51, 9999,'Upper Abdomen - multiple organ failure')");

			db.execSQL("INSERT INTO Piercing VALUES (3111, 3125, 1, 10,'Small of Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (3111, 3125, 11, 15,'Small of Back - 2 extra damage dice; count reset; held items Dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (3111, 3125, 16, 20,'Small of Back - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (3111, 3125, 21, 25,'Small of Back - 3 extra damage dice; count reset; held items dropped; torn muscle and 65% chance of internal bleeding; -2 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (3111, 3125, 26, 30,'Small of Back - 3 extra damage dice; automatically ToPed; [torn muscle, severe bleeding, -3 Str until healed – permanent loss of 0.75 Strength]')");
			db.execSQL("INSERT INTO Piercing VALUES (3111, 3125, 31, 40,'Small of Back - 4 extra damage dice; automatically ToPed; [broken bone (vertebrae), paralyzed until healed (85% chance of it being permanent)]')");
			db.execSQL("INSERT INTO Piercing VALUES (3111, 3125, 41, 50,'Small of Back - Target killed instantly; severed spine')");
			db.execSQL("INSERT INTO Piercing VALUES (3111, 3125, 51, 9999,'Small of Back - Target killed instantly; severed spine')");

			db.execSQL("INSERT INTO Piercing VALUES (3126, 3155, 1, 10,'Lower Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (3126, 3155, 11, 15,'Lower Back - 2 extra damage dice; count reset; held items Dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (3126, 3155, 16, 20,'Lower Back - 2 extra damage dice; count reset; held items dropped; 30% chance of internal bleeding')");
			db.execSQL("INSERT INTO Piercing VALUES (3126, 3155, 21, 25,'Lower Back - 3 extra damage dice; count reset; held items dropped; torn muscle; -3 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (3126, 3155, 26, 30,'Lower Back - 3 extra damage dice; automatically ToPed; [broken bone (vertebrae), paralyzed until healed (65% chance of it being permanent)]')");
			db.execSQL("INSERT INTO Piercing VALUES (3126, 3155, 31, 40,'Lower Back - 4 extra damage dice; automatically ToPed; [broken bone (vertebrae), paralyzed until healed (85% chance of it being permanent)]')");
			db.execSQL("INSERT INTO Piercing VALUES (3126, 3155, 41, 50,'Lower Back - Target killed instantly; severed spine')");
			db.execSQL("INSERT INTO Piercing VALUES (3126, 3155, 51, 9999,'Lower Back - Target killed instantly; severed spine')");

			db.execSQL("INSERT INTO Piercing VALUES (3156, 3425, 1, 10,'Chest - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (3156, 3425, 11, 15,'Chest - 2 extra damage dice; count reset; held items Dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (3156, 3425, 16, 20,'Chest - 2 extra damage dice; count reset; held items dropped; 30% chance of internal bleeding; broken bone; -2 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (3156, 3425, 21, 25,'Chest - 3 extra damage dice; count reset; held items dropped; broken bone and 50% chance of internal bleeding;; -3 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (3156, 3425, 26, 30,'Chest - 3 extra damage dice; automatically ToPed; [broken bone, 75% chance of internal bleeding, -3 Str until healed, -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Piercing VALUES (3156, 3425, 31, 40,'Chest - 4 extra damage dice; automatically ToPed; [compound fracture, internal bleeding, -5 Str until healed, -1/25 Str permanently)')");
			db.execSQL("INSERT INTO Piercing VALUES (3156, 3425, 41, 50,'Chest - Target killed instantly; ruptured aorta')");
			db.execSQL("INSERT INTO Piercing VALUES (3156, 3425, 51, 9999,'Chest - Target killed instantly; ruptured aorta')");

			db.execSQL("INSERT INTO Piercing VALUES (3426, 3455, 1, 10,'Upper Side - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (3426, 3455, 11, 15,'Upper Side - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (3426, 3455, 16, 20,'Upper Side - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (3426, 3455, 21, 25,'Upper Side - 2 extra damage dice count reset; held items dropped; broken ribs; 30% internal bleeding; -2 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (3426, 3455, 26, 30,'Upper Side - 3 extra damage dice count reset; held items dropped; broken ribs; severe bleeding; -3 Str until healed; -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Piercing VALUES (3426, 3455, 31, 40,'Upper Side - 3 extra damage dice; automatically ToPed;severe bleeding, broken ribs, -5 Str until healed, -1/25 Str permanently)')");
			db.execSQL("INSERT INTO Piercing VALUES (3426, 3455, 41, 50,'Upper Side - 4 extra damage dice; automatically ToPed;severe bleeding, broken ribs, -6 Str until healed, -1/50 Str permanently)')");
			db.execSQL("INSERT INTO Piercing VALUES (3426, 3455, 51, 9999,'Upper Side - Target killed instantly; body cavity crushed')");

			db.execSQL("INSERT INTO Piercing VALUES (3456, 3485, 1, 10,'Upper Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (3456, 3485, 11, 15,'Upper Back - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (3456, 3485, 16, 20,'Upper Back - 2 extra damage dice; count reset; held items dropped; muscle tear; -2 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (3456, 3485, 21, 25,'Upper Back - 3 extra damage dice; count reset; held items dropped; muscle tear; -3 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (3456, 3485, 26, 30,'Upper Back - 3 extra damage dice; automatically ToPed; [torn ligament, -3 Str until healed, -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Piercing VALUES (3456, 3485, 31, 40,'Upper Back - 4 extra damage dice; automatically ToPed [broken bones; severe bleeding, -6 Str until healed; -1/50 Str permanently)')");
			db.execSQL("INSERT INTO Piercing VALUES (3456, 3485, 41, 50,'Upper Back - Target killed instantly; ruptured aorta')");
			db.execSQL("INSERT INTO Piercing VALUES (3456, 3485, 51, 9999,'Upper Back - Target killed instantly; ruptured aorta')");

			db.execSQL("INSERT INTO Piercing VALUES (3486, 3500, 1, 10,'Upper Middle Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (3486, 3500, 11, 15,'Upper Middle Back - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (3486, 3500, 16, 20,'Upper Middle Back - 2 extra damage dice; count reset; held items dropped; muscle tear; -2 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (3486, 3500, 21, 25,'Upper Middle Back - 3 extra damage dice; count reset; held items dropped; muscle tear; -3 Str until healed')");
			db.execSQL("INSERT INTO Piercing VALUES (3486, 3500, 26, 30,'Upper Middle Back - 3 extra damage dice; automatically ToPed; [torn ligament, -3 Str until healed, -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Piercing VALUES (3486, 3500, 31, 40,'Upper Middle Back - 4 extra damage dice; automatically ToPed [broken bones; severe bleeding, -6 Str until healed; -1/50 Str permanently)')");
			db.execSQL("INSERT INTO Piercing VALUES (3486, 3500, 41, 50,'Upper Middle Back - Target killed instantly; ruptured aorta')");
			db.execSQL("INSERT INTO Piercing VALUES (3486, 3500, 51, 9999,'Upper Middle Back - Target killed instantly; ruptured aorta')");

			db.execSQL("INSERT INTO Piercing VALUES (3501, 3820, 1, 10,'Armpit - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (3501, 3820, 11, 15,'Armpit - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (3501, 3820, 16, 20,'Armpit - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (3501, 3820, 21, 25,'Armpit - 2 extra damage dice; count reset; held items dropped; -2 Atk (if primary side) or -2 Def (if secondary); -2 Str [all until healed]')");
			db.execSQL("INSERT INTO Piercing VALUES (3501, 3820, 26, 30,'Armpit - 3 extra damage dice; count reset; held items dropped; -3 Atk (if primary side) or -3 Def (if secondary); -3 Str; -1 Dex; -0/50 Str permanently')");
			db.execSQL("INSERT INTO Piercing VALUES (3501, 3820, 31, 40,'Armpit - 3 extra damage dice; automatically ToPed; [torn ligaments; -3 Atk (if primary side) or -3 Def (if secondary); -3 Str; -1 Dex; -1 Atk or Def & -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Piercing VALUES (3501, 3820, 41, 50,'Armpit - 4 extra damage dice; automatically ToPed; [torn ligaments; -3 Atk (if primary side) or -3 Def (if secondary); -4 Str; -2 Dex; -1 Atk or Def, -0/50 Dex & -1/00 Str permanently')");
			db.execSQL("INSERT INTO Piercing VALUES (3501, 3820, 51, 9999,'Armpit - Target killed instantly; body cavity crushed')");

			db.execSQL("INSERT INTO Piercing VALUES (3821, 4300, 1, 10,'Upper Outer Arm - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (3821, 4300, 11, 15,'Upper Outer Arm - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (3821, 4300, 16, 20,'Upper Outer Arm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (3821, 4300, 21, 25,'Upper Outer Arm - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -2 Str [all until healed]')");
			db.execSQL("INSERT INTO Piercing VALUES (3821, 4300, 26, 30,'Upper Outer Arm - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Piercing VALUES (3821, 4300, 31, 40,'Upper Outer Arm - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -0/75 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (3821, 4300, 41, 50,'Upper Outer Arm - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -4 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -1/00 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (3821, 4300, 51, 9999,'Upper Outer Arm - 4 extra damage dice; automatically ToPed; Arm Mangled and Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (4301, 4492, 1, 10,'Upper Inner Arm - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (4301, 4492, 11, 15,'Upper Inner Arm - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (4301, 4492, 16, 20,'Upper Inner Arm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (4301, 4492, 21, 25,'Upper Inner Arm - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -2 Str [all until healed]')");
			db.execSQL("INSERT INTO Piercing VALUES (4301, 4492, 26, 30,'Upper Inner Arm - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Piercing VALUES (4301, 4492, 31, 40,'Upper Inner Arm - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -0/75 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (4301, 4492, 41, 50,'Upper Inner Arm - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -4 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -1/00 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (4301, 4492, 51, 9999,'Upper Inner Arm - 4 extra damage dice; automatically ToPed; Arm Mangled and Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (4493, 4588, 1, 10,'Elbow - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (4493, 4588, 11, 15,'Elbow - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (4493, 4588, 16, 20,'Elbow - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (4493, 4588, 21, 25,'Elbow - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Piercing VALUES (4493, 4588, 26, 30,'Elbow - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Piercing VALUES (4493, 4588, 31, 40,'Elbow - 3 extra damage dice; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -2 Str [all until healed]; permanent -1 Atk (if primary else -1 Def)')");
			db.execSQL("INSERT INTO Piercing VALUES (4493, 4588, 41, 50,'Elbow - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -2 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def)')");
			db.execSQL("INSERT INTO Piercing VALUES (4493, 4588, 51, 9999,'Elbow - 4 extra damage dice; automatically ToPed; Elbow & below Mangled and Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (4589, 4684, 1, 10,'Inner Joint - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (4589, 4684, 11, 15,'Inner Joint - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (4589, 4684, 16, 20,'Inner Joint - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (4589, 4684, 21, 25,'Inner Joint - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (4589, 4684, 26, 30,'Inner Joint - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Piercing VALUES (4589, 4684, 31, 40,'Inner Joint - 2 extra damage dice; count reset; held items dropped -3 Atk & +1 Speed (if primary side) or -3 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Piercing VALUES (4589, 4684, 41, 50,'Inner Joint - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -2 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def)')");
			db.execSQL("INSERT INTO Piercing VALUES (4589, 4684, 51, 9999,'Inner Joint - 4 extra damage dice; automatically ToPed; Elbow & below Mangled and Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (4685, 5308, 1, 10,'Back of Forearm - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (4685, 5308, 11, 15,'Back of Forearm - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (4685, 5308, 16, 20,'Back of Forearm - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (4685, 5308, 21, 25,'Back of Forearm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (4685, 5308, 26, 30,'Back of Forearm - 2 extra damage dice; count reset; held items dropped -2 Atk (if primary side);')");
			db.execSQL("INSERT INTO Piercing VALUES (4685, 5308, 31, 40,'Back of Forearm - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Piercing VALUES (4685, 5308, 41, 50,'Back of Forearm - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Piercing VALUES (4685, 5308, 51, 9999,'Back of Forearm - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (5309, 5836, 1, 10,'Inner Forearm - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (5309, 5836, 11, 15,'Inner Forearm - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (5309, 5836, 16, 20,'Inner Forearm - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (5309, 5836, 21, 25,'Inner Forearm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (5309, 5836, 26, 30,'Inner Forearm - 2 extra damage dice; count reset; held items dropped -2 Atk (if primary side);')");
			db.execSQL("INSERT INTO Piercing VALUES (5309, 5836, 31, 40,'Inner Forearm - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Piercing VALUES (5309, 5836, 41, 50,'Inner Forearm - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Piercing VALUES (5309, 5836, 51, 9999,'Inner Forearm - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (5837, 5908, 1, 10,'Back of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (5837, 5908, 11, 15,'Back of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (5837, 5908, 16, 20,'Back of Wrist - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (5837, 5908, 21, 25,'Back of Wrist - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side)')");
			db.execSQL("INSERT INTO Piercing VALUES (5837, 5908, 26, 30,'Back of Wrist - 2 extra damage dice; count reset; held items dropped -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Piercing VALUES (5837, 5908, 31, 40,'Back of Wrist - 3 extra damage dice; [muscle tear; -4 Atk & +2 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Piercing VALUES (5837, 5908, 41, 50,'Back of Wrist - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & +3 Speed (if primary side); -1 Str [all until healed]; permanent -2 Atk & +2 Speed (if primary)')");
			db.execSQL("INSERT INTO Piercing VALUES (5837, 5908, 51, 9999,'Back of Wrist - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (5909, 5980, 1, 10,'Front of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (5909, 5980, 11, 15,'Front of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (5909, 5980, 16, 20,'Front of Wrist - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (5909, 5980, 21, 25,'Front of Wrist - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side)')");
			db.execSQL("INSERT INTO Piercing VALUES (5909, 5980, 26, 30,'Front of Wrist - 2 extra damage dice; count reset; held items dropped -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Piercing VALUES (5909, 5980, 31, 40,'Front of Wrist - 3 extra damage dice; [muscle tear; -4 Atk & +2 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Piercing VALUES (5909, 5980, 41, 50,'Front of Wrist - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & +3 Speed (if primary side); -1 Str [all until healed]; permanent -2 Atk & +2 Speed (if primary)')");
			db.execSQL("INSERT INTO Piercing VALUES (5909, 5980, 51, 9999,'Front of Wrist - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (5981, 6052, 1, 10,'Back of Hand - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (5981, 6052, 11, 15,'Back of Hand - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (5981, 6052, 16, 20,'Back of Hand - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (5981, 6052, 21, 25,'Back of Hand - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (5981, 6052, 26, 30,'Back of Hand - 2 extra damage dice; count reset; held items dropped; -2 Atk')");
			db.execSQL("INSERT INTO Piercing VALUES (5981, 6052, 31, 40,'Back of Hand - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Piercing VALUES (5981, 6052, 41, 50,'Back of Hand - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +2 Speed (if primary side); [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Piercing VALUES (5981, 6052, 51, 9999,'Back of Hand - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (6053, 6076, 1, 10,'Palm - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (6053, 6076, 11, 15,'Palm - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (6053, 6076, 16, 20,'Palm - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (6053, 6076, 21, 25,'Palm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (6053, 6076, 26, 30,'Palm - 2 extra damage dice; count reset; held items dropped; -2 Atk')");
			db.execSQL("INSERT INTO Piercing VALUES (6053, 6076, 31, 40,'Palm - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Piercing VALUES (6053, 6076, 41, 50,'Palm - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +2 Speed (if primary side); [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Piercing VALUES (6053, 6076, 51, 9999,'Palm - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (6077, 6220, 1, 10,'Finger(s) - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (6077, 6220, 11, 15,'Finger(s) - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (6077, 6220, 16, 20,'Finger(s) - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (6077, 6220, 21, 25,'Finger(s) - 2 extra damage dice; count reset; held items dropped if ToP check failed')");
			db.execSQL("INSERT INTO Piercing VALUES (6077, 6220, 26, 30,'Finger(s) - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (6077, 6220, 31, 40,'Finger(s) - 2 extra damage dice; count reset; held items dropped; -2 Atk')");
			db.execSQL("INSERT INTO Piercing VALUES (6077, 6220, 41, 50,'Finger(s) - 3 extra damage dice; [muscle tear; -2 Atk & +1 Speed (if primary side);')");
			db.execSQL("INSERT INTO Piercing VALUES (6077, 6220, 51, 9999,'Finger(s) - 3 extra damage dice; Finger Mangled')");

			db.execSQL("INSERT INTO Piercing VALUES (6221, 7180, 1, 10,'Side of Shoulder - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (6221, 7180, 11, 15,'Side of Shoulder - 1 extra damage die')");
			db.execSQL("INSERT INTO Piercing VALUES (6221, 7180, 16, 20,'Side of Shoulder - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (6221, 7180, 21, 25,'Side of Shoulder - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Piercing VALUES (6221, 7180, 26, 30,'Side of Shoulder - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -4 Str [all until healed]; permanent -1 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (6221, 7180, 31, 40,'Side of Shoulder - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -5 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -1/50 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (6221, 7180, 41, 50,'Side of Shoulder - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -6 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -2/00 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (6221, 7180, 51, 9999,'Side of Shoulder - 4 extra damage dice; automatically ToPed; Arm Mangled and Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (7181, 9100, 1, 10,'Top of Shoulder - no additional effect')");
			db.execSQL("INSERT INTO Piercing VALUES (7181, 9100, 11, 15,'Top of Shoulder - 1 extra damage die')");
			 db.execSQL("INSERT INTO Piercing VALUES (7181, 9100, 16, 20,'Top of Shoulder - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (7181, 9100, 21, 25,'Top of Shoulder - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Piercing VALUES (7181, 9100, 26, 30,'Top of Shoulder - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -4 Str [all until healed]; permanent -1 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (7181, 9100, 31, 40,'Top of Shoulder - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -5 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -1/50 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (7181, 9100, 41, 50,'Top of Shoulder - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -6 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -2/00 Str')");
			db.execSQL("INSERT INTO Piercing VALUES (7181, 9100, 51, 9999,'Top of Shoulder - 4 extra damage dice; automatically ToPed; Arm Mangled and Useless')");

			db.execSQL("INSERT INTO Piercing VALUES (9101, 9121, 1, 10,'Front of Neck - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9101, 9121, 11, 15,'Front of Neck - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9101, 9121, 16, 20,'Front of Neck - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9101, 9121, 21, 25,'Front of Neck - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9101, 9121, 26, 30,'Front of Neck - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9101, 9121, 31, 40,'Front of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9101, 9121, 41, 50,'Front of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9101, 9121, 51, 9999,'Front of Neck - Target killed instantly')");

			db.execSQL("INSERT INTO Piercing VALUES (9122, 9142, 1, 10,'Back of Neck - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9122, 9142, 11, 15,'Back of Neck - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9122, 9142, 16, 20,'Back of Neck - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9122, 9142, 21, 25,'Back of Neck - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9122, 9142, 26, 30,'Back of Neck - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9122, 9142, 31, 40,'Back of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9122, 9142, 41, 50,'Back of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9122, 9142, 51, 9999,'Back of Neck  - Target killed instantly')");

			db.execSQL("INSERT INTO Piercing VALUES (9143, 9373, 1, 10,'Side of Neck - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9143, 9373, 11, 15,'Side of Neck - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9143, 9373, 16, 20,'Side of Neck - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9143, 9373, 21, 25,'Side of Neck - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9143, 9373, 26, 30,'Side of Neck - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9143, 9373, 31, 40,'Side of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9143, 9373, 41, 50,'Side of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9143, 9373, 51, 9999,'Side of Neck - Target killed instantly')");

			db.execSQL("INSERT INTO Piercing VALUES (9374, 9653, 1, 10,'Side of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9374, 9653, 11, 15,'Side of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9374, 9653, 16, 20,'Side of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9374, 9653, 21, 25,'Side of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9374, 9653, 26, 30,'Side of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9374, 9653, 31, 40,'Side of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9374, 9653, 41, 50,'Side of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9374, 9653, 51, 9999,'Side of Head - Target killed instantly')");

			db.execSQL("INSERT INTO Piercing VALUES (9654, 9688, 1, 10,'Lower Back of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9654, 9688, 11, 15,'Lower Back of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9654, 9688, 16, 20,'Lower Back of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9654, 9688, 21, 25,'Lower Back of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9654, 9688, 26, 30,'Lower Back of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9654, 9688, 31, 40,'Lower Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9654, 9688, 41, 50,'Lower Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9654, 9688, 51, 9999,'Lower Back of Head - Target killed instantly')");

			db.execSQL("INSERT INTO Piercing VALUES (9689, 9768, 1, 10,'Lower Side of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9689, 9768, 11, 15,'Lower Side of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9689, 9768, 16, 20,'Lower Side of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9689, 9768, 21, 25,'Lower Side of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -1 Looks')");
			db.execSQL("INSERT INTO Piercing VALUES (9689, 9768, 26, 30,'Lower Side of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Piercing VALUES (9689, 9768, 31, 40,'Lower Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9689, 9768, 41, 50,'Lower Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9689, 9768, 51, 9999,'Lower Side of Face - Target killed instantly')");

			db.execSQL("INSERT INTO Piercing VALUES (9769, 9788, 1, 10,'Lower Center of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9769, 9788, 11, 15,'Lower Center of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9769, 9788, 16, 20,'Lower Center of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9769, 9788, 21, 25,'Lower Center of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -1 Looks')");
			db.execSQL("INSERT INTO Piercing VALUES (9769, 9788, 26, 30,'Lower Center of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Piercing VALUES (9769, 9788, 31, 40,'Lower Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9769, 9788, 41, 50,'Lower Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9769, 9788, 51, 9999,'Lower Center of Face - Target killed instantly')");

			db.execSQL("INSERT INTO Piercing VALUES (9789, 9823, 1, 10,'Upper Back of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9789, 9823, 11, 15,'Upper Back of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9789, 9823, 16, 20,'Upper Back of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9789, 9823, 21, 25,'Upper Back of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9789, 9823, 26, 30,'Upper Back of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9789, 9823, 31, 40,'Upper Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9789, 9823, 41, 50,'Upper Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9789, 9823, 51, 9999,'Upper Back of Head - Target killed instantly')");

			db.execSQL("INSERT INTO Piercing VALUES (9824, 9903, 1, 10,'Upper Side of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9824, 9903, 11, 15,'Upper Side of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9824, 9903, 16, 20,'Upper Side of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped; permanent -1 Looks')");
			db.execSQL("INSERT INTO Piercing VALUES (9824, 9903, 21, 25,'Upper Side of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Piercing VALUES (9824, 9903, 26, 30,'Upper Side of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -3 Looks')");
			db.execSQL("INSERT INTO Piercing VALUES (9824, 9903, 31, 40,'Upper Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9824, 9903, 41, 50,'Upper Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9824, 9903, 51, 9999,'Upper Side of Face - Target killed instantly')");

			db.execSQL("INSERT INTO Piercing VALUES (9904, 9923, 1, 10,'Upper Center of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9904, 9923, 11, 15,'Upper Center of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9904, 9923, 16, 20,'Upper Center of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped; permanent -1 Looks')");
			db.execSQL("INSERT INTO Piercing VALUES (9904, 9923, 21, 25,'Upper Center of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Piercing VALUES (9904, 9923, 26, 30,'Upper Center of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -4 Looks')");
			db.execSQL("INSERT INTO Piercing VALUES (9904, 9923, 31, 40,'Upper Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9904, 9923, 41, 50,'Upper Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9904, 9923, 51, 9999,'Upper Center of Face - Target killed instantly')");

			db.execSQL("INSERT INTO Piercing VALUES (9924, 10000, 1, 10,'Top of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9924, 10000, 11, 15,'Top of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9924, 10000, 16, 20,'Top of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Piercing VALUES (9924, 10000, 21, 25,'Top of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9924, 10000, 26, 30,'Top of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Piercing VALUES (9924, 10000, 31, 40,'Top of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9924, 10000, 41, 50,'Top of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Piercing VALUES (9924, 10000, 51, 9999,'Top of Head - Target killed instantly')");
			
		}
		Log.d("DB","End Filling CritPiercing");
	}
	
	public void loadCritCrushing(SQLiteDatabase db){
		Log.d("DB","Filling CritCrushing");
		if(db != null){
			String sqlCreate = "CREATE TABLE IF NOT EXISTS Crushing (Min INTEGER,Max INTEGER, Min2 INTEGER,Max2 INTEGER,text TEXT)";
			db.execSQL(sqlCreate);
			db.execSQL("INSERT INTO Crushing VALUES (1, 100, 1, 10,'Top of Foot - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (1, 100, 11, 15,'Top of Foot - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (1, 100, 16, 20,'Top of Foot - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (1, 100, 21, 25,'Top of Foot - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Crushing VALUES (1, 100, 26, 30,'Top of Foot - 2 extra damage dice;broken bone; movement penalty ( - 50% for 1d12p hours, -25% until healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (1, 100, 31, 40,'Top of Foot - 3 extra damage dice; broken bone; movement penalty ( - 75% for 6 hours, -50% until healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (1, 100, 41, 50,'Top of Foot - 4 extra damage dice; automatically ToPed; compound fracture; movement penalty (-75% for 1day, -50% until healed), permanent limp')");
			db.execSQL("INSERT INTO Crushing VALUES (1, 100, 51, 999,'Top of Foot - 4 extra damage dice; automatically ToPed; shattered bone; movement penalty ( -75% for 1day, -50% until healed), permanent limp')");
			
			db.execSQL("INSERT INTO Crushing VALUES (101, 104, 1, 10,'Heel - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (101, 104, 11, 15,'Heel - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (101, 104, 16, 20,'Heel - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (101, 104, 21, 25,'Heel - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Crushing VALUES (101, 104, 26, 30,'Heel - 2 extra damage dice;broken bone; -2 Attack penalty; -2 Defense penalty; movement penalty ( -50% for 1d12p hours, -25% until healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (101, 104, 31, 40,'Heel - 3 extra damage dice; broken bone; -3 Attack penalty; -2 Dex penalty; movement penalty ( -75% for 6 hours, -50% until healed), permanent limp')");
			db.execSQL("INSERT INTO Crushing VALUES (101, 104, 41, 50,'Heel - 4 extra damage dice; automatically ToPed; compound fracture; -3 Attack penalty; -2 Defense penalty; movement penalty (-75% for 1day, -50% until healed), permanent limp & -1 ATK penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (101, 104, 51, 9999,'Heel - 4 extra damage dice; automatically ToPed; shattered bone; -3 Attack penalty; -2 Dexterity penalty; immobile, permanent limp, -1 ATK & DEF penalty')");
			
			db.execSQL("INSERT INTO Crushing VALUES (105, 136, 1, 10,'Toe(s) - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (105, 136, 11, 15,'Toe(s) - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (105, 136, 16, 20,'Toe(s) - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (105, 136, 21, 25,'Toe(s) - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Crushing VALUES (105, 136, 26, 30,'Toe(s) - 2 extra damage dice;broken bone; movement penalty (- 50% for 1d12p hours, -25% until healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (105, 136, 31, 40,'Toe(s) - 3 extra damage dice; broken bone; movement penalty ( - 75% for 6 hours, -50% until healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (105, 136, 41, 50,'Toe(s) - 3 extra damage dice; broken bone; movement penalty ( - 75% for 6 hours, -50% until healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (105, 136, 51, 9999,'Toe(s) - 3 extra damage dice; broken bone; movement penalty ( - 75% for 6 hours, -50% until healed)')");
			
			db.execSQL("INSERT INTO Crushing VALUES (137, 140, 1, 10,'Arch of Foot - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (137, 140, 11, 15,'Arch of Foot - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (137, 140, 16, 20,'Arch of Foot - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (137, 140, 21, 25,'Arch of Foot - 2 extra damage dice; movement penalty -50% for 5 minutes')");
			db.execSQL("INSERT INTO Crushing VALUES (137, 140, 26, 30,'Arch of Foot - 2 extra damage dice;broken bone; -2 Attack penalty; -2 Defense penalty; movement penalty ( -50% for 1d12p hours, -25% until healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (137, 140, 31, 40,'Arch of Foot - 3 extra damage dice; broken bone; -3 Attack penalty; -2 Dex penalty; movement penalty ( -75% for 6 hours, -50% until healed), permanent limp')");
			db.execSQL("INSERT INTO Crushing VALUES (137, 140, 41, 50,'Arch of Foot - 4 extra damage dice; automatically ToPed; compound fracture; -3 Attack penalty; -2 Defense penalty; movement penalty (-75% for 1day, -50% until healed), permanent limp & -1 ATK penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (137, 140, 51, 9999,'Arch of Foot - 4 extra damage dice; automatically ToPed; shattered bone; -3 Attack penalty; -2 Dexterity penalty; immobile, permanent limp, -1 ATK & DEF penalty')");
			
			db.execSQL("INSERT INTO Crushing VALUES (141, 170, 1, 10,'Inner Ankle - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (141, 170, 11, 15,'Inner Ankle - movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (141, 170, 16, 20,'Inner Ankle - 1 extra damage die; movement penalty -50% for 5 minutes; count reset')");
			db.execSQL("INSERT INTO Crushing VALUES (141, 170, 21, 25,'Inner Ankle - 2 extra damage dice; movement penalty -50% for 1 minute; count reset; held items dropped; -1 Defense')");
			db.execSQL("INSERT INTO Crushing VALUES (141, 170, 26, 30,'Inner Ankle - 2 extra damage dice; movement penalty (50% until healed); count reset; held items dropped; -3 Defense')");
			db.execSQL("INSERT INTO Crushing VALUES (141, 170, 31, 40,'Inner Ankle - 3 extra damage dice; broken bone; -4 Defense penalty; -2 Str penalty; movement penalty ( -75% until healed); count reset; held items dropped; permanent limp, -1 Defense, -/25 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (141, 170, 41, 50,'Inner Ankle - 4 extra damage dice; automatically ToPed; [compound fracture; immobile; permanent limp, - 2 Defense, -0/75 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (141, 170, 51, 9999,'Inner Ankle - 4 extra damage dice; automatically ToPed; shattered bone; torn ligaments or tendon; immobile; permanent limp, -1 ATK penalty, - 2 Defense')");
			
			db.execSQL("INSERT INTO Crushing VALUES (171, 200, 1, 10,'Outer Ankle - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (171, 200, 11, 15,'Outer Ankle - movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (171, 200, 16, 20,'Outer Ankle - 1 extra damage die; movement penalty -50% for 5 minutes; count reset')");
			db.execSQL("INSERT INTO Crushing VALUES (171, 200, 21, 25,'Outer Ankle - 2 extra damage dice; movement penalty -50% for 1 minute; count reset; held items dropped; -1 Defense')");
			db.execSQL("INSERT INTO Crushing VALUES (171, 200, 26, 30,'Outer Ankle - 2 extra damage dice; movement penalty (50% until healed); count reset; held items dropped; -3 Defense')");
			db.execSQL("INSERT INTO Crushing VALUES (171, 200, 31, 40,'Outer Ankle - 3 extra damage dice; broken bone; -4 Defense penalty; -2 Str penalty; movement penalty ( -75% until healed); count reset; held items dropped; permanent limp, -1 Defense, -/25 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (171, 200, 41, 50,'Outer Ankle - 4 extra damage dice; automatically ToPed; [compound fracture; immobile; permanent limp, -2 Defense, -0/75 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (171, 200, 51, 9999,'Outer Ankle - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons; immobile; permanent limp, - 2 Defense')");
			
			db.execSQL("INSERT INTO Crushing VALUES (201, 220, 1, 10,'Achilles Ankle - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (201, 220, 11, 15,'Achilles Ankle - movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (201, 220, 16, 20,'Achilles Ankle - 1 extra damage die; movement penalty -50% for 5 minutes; count reset')");
			db.execSQL("INSERT INTO Crushing VALUES (201, 220, 21, 25,'Achilles Ankle - 2 extra damage dice; movement penalty -50% for 5 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (201, 220, 26, 30,'Achilles Ankle - 2 extra damage dice; movement penalty (50% until healed); count reset; held items dropped; -3 Defense')");
			db.execSQL("INSERT INTO Crushing VALUES (201, 220, 31, 40,'Achilles Ankle - 3 extra damage dice; broken bone; -4 Defense penalty; -2 Str penalty; movement penalty ( -75% until healed); count reset; held items dropped; permanent limp, -1 Defense, -/25 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (201, 220, 41, 50,'Achilles Ankle - 4 extra damage dice; automatically ToPed; [compound fracture; immobile; permanent limp, -2 Defense, -0/75 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (201, 220, 51, 9999,'Achilles Ankle - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons; immobile; permanent limp, - 2 Defense')");
			
			db.execSQL("INSERT INTO Crushing VALUES (221, 964, 1, 10,'Shin - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (221, 964, 11, 15,'Shin - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (221, 964, 16, 20,'Shin - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (221, 964, 21, 25,'Shin - 2 extra damage dice; movement penalty -50% for 5 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (221, 964, 26, 30,'Shin - 2 extra damage dice;count reset; held items dropped; -2 Defense')");
			db.execSQL("INSERT INTO Crushing VALUES (221, 964, 31, 40,'Shin - 3 extra damage dice; count reset; held items dropped;broken bone; -4 Defense penalty; movement penalty ( -75% until healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (221, 964, 41, 50,'Shin - 3 extra damage dice; automatically ToPed; compound fracture; immobile')");
			db.execSQL("INSERT INTO Crushing VALUES (221, 964, 51, 9999,'Shin - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons; immobile; permanent limp, - 1 Defense')");
			
			db.execSQL("INSERT INTO Crushing VALUES (965, 1006, 1, 10,'Calf - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (965, 1006, 11, 15,'Calf - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (965, 1006, 16, 20,'Calf - 1 extra damage die; movement penalty -50% for 1 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (965, 1006, 21, 25,'Calf - 2 extra damage dice; movement penalty -50% for 5 minute')");
			db.execSQL("INSERT INTO Crushing VALUES (965, 1006, 26, 30,'Calf - 2 extra damage dice;count reset; held items dropped; -2 Defense')");
			db.execSQL("INSERT INTO Crushing VALUES (965, 1006, 31, 40,'Calf - 3 extra damage dice; count reset; held items dropped;broken bone; -4 Defense penalty; movement penalty ( -75% until healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (965, 1006, 41, 50,'Calf - 3 extra damage dice; automatically ToPed; compound fracture; immobile')");
			db.execSQL("INSERT INTO Crushing VALUES (965, 1006, 51, 9999,'Calf - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons; immobile; permanent limp, - 1 Defense')");

			db.execSQL("INSERT INTO Crushing VALUES (1007, 1118, 1, 10,'Knee - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (1007, 1118, 11, 15,'Knee - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (1007, 1118, 16, 20,'Knee - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (1007, 1118, 21, 25,'Knee - 2 extra damage dice; -2 Def penalty; movement penalty ( - 50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Crushing VALUES (1007, 1118, 26, 30,'Knee - 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, - 50% for subsequent week); -3 Def penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (1007, 1118, 31, 40,'Knee - 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty; permanent -1 Def penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (1007, 1118, 41, 50,'Knee - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -2 Def')");
			db.execSQL("INSERT INTO Crushing VALUES (1007, 1118, 51, 9999,'Knee - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons, immobile; permanent limp, & -2 Def')");

			db.execSQL("INSERT INTO Crushing VALUES (1119, 1132, 1, 10,'Back of Knee - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (1119, 1132, 11, 15,'Back of Knee - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (1119, 1132, 16, 20,'Back of Knee - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (1119, 1132, 21, 25,'Back of Knee - 2 extra damage dice; -2 Def penalty; movement penalty ( - 50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Crushing VALUES (1119, 1132, 26, 30,'Back of Knee - 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, - 50% for subsequent week); -3 Def penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (1119, 1132, 31, 40,'Back of Knee - 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (1119, 1132, 41, 50,'Back of Knee - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -1 Def')");
			db.execSQL("INSERT INTO Crushing VALUES (1119, 1132, 51, 9999,'Back of Knee - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons, immobile; permanent limp, & -2 Def')");

			db.execSQL("INSERT INTO Crushing VALUES (1133, 1216, 1, 10,'Hamstring - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (1133, 1216, 11, 15,'Hamstring - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (1133, 1216, 16, 20,'Hamstring - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (1133, 1216, 21, 25,'Hamstring - 2 extra damage dice; -1 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Crushing VALUES (1133, 1216, 26, 30,'Hamstring - 3 extra damage dice; 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (1133, 1216, 31, 40,'Hamstring - 3 extra damage dice; 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (1133, 1216, 41, 50,'Hamstring - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -1 Def')");
			db.execSQL("INSERT INTO Crushing VALUES (1133, 1216, 51, 9999,'Hamstring - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons, immobile; permanent limp,& -1 ATK & -1 DEF')");
			
			db.execSQL("INSERT INTO Crushing VALUES (1217, 2000, 1, 10,'Thigh - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (1217, 2000, 11, 15,'Thigh - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (1217, 2000, 16, 20,'Thigh - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (1217, 2000, 21, 25,'Thigh - 2 extra damage dice; -1 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Crushing VALUES (1217, 2000, 26, 30,'Thigh - 3 extra damage dice; 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (1217, 2000, 31, 40,'Thigh - 3 extra damage dice; 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (1217, 2000, 41, 50,'Thigh - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, & -1 Def')");
			db.execSQL("INSERT INTO Crushing VALUES (1217, 2000, 51, 9999,'Thigh - 4 extra damage dice; automatically ToPed; multiple fracture, torn ligaments/tendons, immobile; permanent limp,& -1 ATK & -1 DEF')");
			
			db.execSQL("INSERT INTO Crushing VALUES (2001, 2330, 1, 10,'Hip - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (2001, 2330, 11, 15,'Hip - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (2001, 2330, 16, 20,'Hip - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (2001, 2330, 21, 25,'Hip - 2 extra damage dice; -2 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Crushing VALUES (2001, 2330, 26, 30,'Hip - 3 extra damage dice; 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (2001, 2330, 31, 40,'Hip - 3 extra damage dice; 3 extra damage dice; automatically ToPed; [broken bone; [immobile); -3 Def penalty]')");
			db.execSQL("INSERT INTO Crushing VALUES (2001, 2330, 41, 50,'Hip - 4 extra damage dice; automatically ToPed; compound fracture, immobile; permanent limp, & --1 ATK & -1 DEF')");
			db.execSQL("INSERT INTO Crushing VALUES (2001, 2330, 51, 9999,'Hip - 4 extra damage dice; automatically ToPed; compound fracture, immobile; permanent limp, & -1 ATK & -2 DEF')");
			
			db.execSQL("INSERT INTO Crushing VALUES (2331, 2405, 1, 10,'Groin (Male Only) - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (2331, 2405, 11, 15,'Groin (Male Only) - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (2331, 2405, 16, 20,'Groin (Male Only) - 2 extra damage dice; movement penalty -50% for 5 minutes; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (2331, 2405, 21, 25,'Groin (Male Only) - 2 extra damage dice; -2 Atk & Def penalty; movement penalty ( -50% for 6 hours, -25% until healed); count reset; held items dropped;')");
			db.execSQL("INSERT INTO Crushing VALUES (2331, 2405, 26, 30,'Groin (Male Only) - 3 extra damage dice automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty]')");
			db.execSQL("INSERT INTO Crushing VALUES (2331, 2405, 31, 40,'Groin (Male Only) - 4 extra damage dice; automatically ToPed; [internal bleeding; movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty]')");
			db.execSQL("INSERT INTO Crushing VALUES (2331, 2405, 41, 50,'Groin (Male Only) - 4 extra damage dice; automatically ToPed; [internal bleeding; movement penalty (-75% for 6 hours, -50% until healed); -4 Def penalty]')");
			db.execSQL("INSERT INTO Crushing VALUES (2331, 2405, 51, 9999,'Groin (Male Only) - 4 extra damage dice; automatically ToPed; [sterilized; internal bleeding; movement penalty (- 75% for 6 hours, - 50% until healed); -4 Def penalty]')");
			
			db.execSQL("INSERT INTO Crushing VALUES (2406, 2435, 1, 10,'Buttock - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (2406, 2435, 11, 15,'Buttock - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (2406, 2435, 16, 20,'Buttock - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (2406, 2435, 21, 25,'Buttock - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (2406, 2435, 26, 30,'Buttock - 3 extra damage dice; count reset; held items dropped; movement penalty (-75% for 6 hours, -50% for subsequent week); -2 Def penalty')");
			db.execSQL("INSERT INTO Crushing VALUES (2406, 2435, 31, 40,'Buttock - 3 extra damage dice; automatically ToPed; [movement penalty (-75% for 6 hours, -50% until healed); -3 Def penalty')");			db.execSQL("INSERT INTO Crushing VALUES (2406, 2435, 41, 50,'Buttock - 4 extra damage dice; automatically ToPed;torn ligaments/ tendons, immobile; permanent limp, &-1 Def')");
			db.execSQL("INSERT INTO Crushing VALUES (2406, 2435, 51, 9999,'Buttock - 4 extra damage dice; automatically ToPed; compound fracture, immobile; permanent limp, & -1 DEF')");
			
			db.execSQL("INSERT INTO Crushing VALUES (2436, 2570, 1, 10,'Lower Abdomen - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (2436, 2570, 11, 15,'Lower Abdomen - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (2436, 2570, 16, 20,'Lower Abdomen - 2 extra damage dice; [50% chance for internal bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (2436, 2570, 21, 25,'Lower Abdomen - 3 extra damage dice; automatically ToPed; [muscle tear, internal bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (2436, 2570, 26, 30,'Lower Abdomen - 3 extra damage dice; automatically ToPed; [muscletear, internal bleeding, -3 Str until healed - permanent loss of 0.50 Con]')");
			db.execSQL("INSERT INTO Crushing VALUES (2436, 2570, 31, 40,'Lower Abdomen - 4 extra damage dice; automatically ToPed; internal Hemorrhaging; permanent -1 Con')");
			db.execSQL("INSERT INTO Crushing VALUES (2436, 2570, 41, 50,'Lower Abdomen - 4 extra damage dice; automatically ToPed; internal Hemorrhaging; permanent -2 Con')");
			db.execSQL("INSERT INTO Crushing VALUES (2436, 2570, 51, 9999,'Lower Abdomen - Target killed instantly; multiple organ failure')");
			
			db.execSQL("INSERT INTO Crushing VALUES (2571, 3020, 1, 10,'Lower Side - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (2571, 3020, 11, 15,'Lower Side - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (2571, 3020, 16, 20,'Lower Side - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (2571, 3020, 21, 25,'Lower Side - 2 extra damage dice; [50% chance for internal bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (2571, 3020, 26, 30,'Lower Side - 3 extra damage dice; automatically ToPed; [muscle tear, internal bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (2571, 3020, 31, 40,'Lower Side - 3 extra damage dice; automatically ToPed; [muscle tear, internal bleeding, -3 Str until healed - permanent loss of 0.50 Con]')");
			db.execSQL("INSERT INTO Crushing VALUES (2571, 3020, 41, 50,'Lower Side - 4 extra damage dice; automatically ToPed; internal Hemorrhaging; permanent -1 Con')");
			db.execSQL("INSERT INTO Crushing VALUES (2571, 3020, 51, 9999,'Lower Side - 4 extra damage dice; automatically ToPed; internal Hemorrhaging; permanent -2 Con')");
			
			db.execSQL("INSERT INTO Crushing VALUES (3021, 3110, 1, 10,'Upper Abdomen - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (3021, 3110, 11, 15,'Upper Abdomen - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (3021, 3110, 16, 20,'Upper Abdomen - 2 extra damage dice; [50% chance for internal bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (3021, 3110, 21, 25,'Upper Abdomen - 3 extra damage dice; automatically ToPed; [muscle tear, internal bleeding, -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (3021, 3110, 26, 30,'Upper Abdomen - 3 extra damage dice; automatically ToPed; [muscletear, internal bleeding, -3 Str until healed - permanent loss of 0.50 Con]')");
			db.execSQL("INSERT INTO Crushing VALUES (3021, 3110, 31, 40,'Upper Abdomen - 4 extra damage dice; automatically ToPed; internal Hemorrhaging; permanent -1 Con')");
			db.execSQL("INSERT INTO Crushing VALUES (3021, 3110, 41, 50,'Upper Abdomen - 4 extra damage dice; automatically ToPed; internal Hemorrhaging; permanent -2 Con')");
			db.execSQL("INSERT INTO Crushing VALUES (3021, 3110, 51, 9999,'Upper Abdomen - Target killed instantly; multiple organ failure')");
			
			db.execSQL("INSERT INTO Crushing VALUES (3111, 3125, 1, 10,'Small of Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (3111, 3125, 11, 15,'Small of Back - 2 extra damage dice; count reset; held items Dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (3111, 3125, 16, 20,'Small of Back - 2 extra damage dice; count reset; held items dropped; 30% chance of internal bleeding')");
			db.execSQL("INSERT INTO Crushing VALUES (3111, 3125, 21, 25,'Small of Back - 3 extra damage dice; count reset; held items dropped; torn muscle and 65% chance of internal bleeding; -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (3111, 3125, 26, 30,'Small of Back - 3 extra damage dice; automatically ToPed; [bruised kidney & torn muscle, internal bleeding, -3 Str until healed – permanent loss of 0.75 Strength]')");
			db.execSQL("INSERT INTO Crushing VALUES (3111, 3125, 31, 40,'Small of Back - 4 extra damage dice; automatically ToPed; [broken bone (vertebrae), paralyzed until healed (85% chance of it being permanent)]')");
			db.execSQL("INSERT INTO Crushing VALUES (3111, 3125, 41, 50,'Small of Back - Target killed instantly; broken spine')");
			db.execSQL("INSERT INTO Crushing VALUES (3111, 3125, 51, 9999,'Small of Back - Target killed instantly; broken spine')");
			
			db.execSQL("INSERT INTO Crushing VALUES (3126, 3155, 1, 10,'Lower Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (3126, 3155, 11, 15,'Lower Back - 2 extra damage dice; count reset; held items Dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (3126, 3155, 16, 20,'Lower Back - 2 extra damage dice; count reset; held items dropped; 30% chance of internal bleeding')");
			db.execSQL("INSERT INTO Crushing VALUES (3126, 3155, 21, 25,'Lower Back - 3 extra damage dice; count reset; held items dropped; torn muscle and 65% chance of internal bleeding; -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (3126, 3155, 26, 30,'Lower Back - 3 extra damage dice; automatically ToPed; [broken bone (vertebrae), paralyzed until healed (65% chance of it being permanent)]')");
			db.execSQL("INSERT INTO Crushing VALUES (3126, 3155, 31, 40,'Lower Back - 4 extra damage dice; automatically ToPed; [broken bone (vertebrae), paralyzed until healed (85% chance of it being permanent)]')");
			db.execSQL("INSERT INTO Crushing VALUES (3126, 3155, 41, 50,'Lower Back - Target killed instantly; broken spine')");
			db.execSQL("INSERT INTO Crushing VALUES (3126, 3155, 51, 9999,'Lower Back - Target killed instantly; broken spine')");
			
			db.execSQL("INSERT INTO Crushing VALUES (3156, 3425, 1, 10,'Chest - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (3156, 3425, 11, 15,'Chest - 2 extra damage dice; count reset; held items Dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (3156, 3425, 16, 20,'Chest - 2 extra damage dice; count reset; held items dropped; 30% chance of internal bleeding; broken bone; -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (3156, 3425, 21, 25,'Chest - 3 extra damage dice; count reset; held items dropped; broken bone and 50% chance of internal bleeding; -3 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (3156, 3425, 26, 30,'Chest - 3 extra damage dice; automatically ToPed; [broken bone, bruised lung, 75% chance of internal bleeding, -3 Str until healed, -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Crushing VALUES (3156, 3425, 31, 40,'Chest - 4 extra damage dice; automatically ToPed; [compound fracture, internal bleeding, -5 Str until healed, -1/25 Str permanently)')");
			db.execSQL("INSERT INTO Crushing VALUES (3156, 3425, 41, 50,'Chest - Target killed instantly; ruptured aorta')");
			db.execSQL("INSERT INTO Crushing VALUES (3156, 3425, 51, 9999,'Chest - Target killed instantly; ruptured aorta')");
			
			db.execSQL("INSERT INTO Crushing VALUES (3426, 3455, 1, 10,'Upper Side - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (3426, 3455, 11, 15,'Upper Side - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (3426, 3455, 16, 20,'Upper Side - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (3426, 3455, 21, 25,'Upper Side - 2 extra damage dice count reset; held items dropped; broken ribs; 30% internal bleeding; -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (3426, 3455, 26, 30,'Upper Side - 3 extra damage dice count reset; held items dropped; broken ribs; 50% internal bleeding; -3 Str until healed; -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Crushing VALUES (3426, 3455, 31, 40,'Upper Side - 3 extra damage dice; automatically ToPed;internal bleeding, broken ribs, -5 Str until healed, -1/25 Str permanently)')");
			db.execSQL("INSERT INTO Crushing VALUES (3426, 3455, 41, 50,'Upper Side - 4 extra damage dice; automatically ToPed;internal bleeding, broken ribs, -6 Str until healed, -1/50 Str permanently)')");
			db.execSQL("INSERT INTO Crushing VALUES (3426, 3455, 51, 9999,'Upper Side - Target killed instantly; body cavity crushed')");
			
			db.execSQL("INSERT INTO Crushing VALUES (3456, 3485, 1, 10,'Upper Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (3456, 3485, 11, 15,'Upper Back - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (3456, 3485, 16, 20,'Upper Back - 2 extra damage dice; count reset; held items dropped; muscle tear; -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (3456, 3485, 21, 25,'Upper Back - 3 extra damage dice; count reset; held items dropped; muscle tear; -3 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (3456, 3485, 26, 30,'Upper Back - 3 extra damage dice; automatically ToPed; [broken bone, 30% chance of internal bleeding, -3 Str until healed, -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Crushing VALUES (3456, 3485, 31, 40,'Upper Back - 4 extra damage dice; automatically ToPed [broken bones; internal bleeding, -6 Str until healed; -1/50 Str permanently)')");
			db.execSQL("INSERT INTO Crushing VALUES (3456, 3485, 41, 50,'Upper Back - Target killed instantly; ruptured aorta')");
			db.execSQL("INSERT INTO Crushing VALUES (3456, 3485, 51, 9999,'Upper Back - Target killed instantly; ruptured aorta')");
			
			db.execSQL("INSERT INTO Crushing VALUES (3486, 3500, 1, 10,'Upper Middle Back - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (3486, 3500, 11, 15,'Upper Middle Back - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (3486, 3500, 16, 20,'Upper Middle Back - 2 extra damage dice; count reset; held items dropped; muscle tear; -2 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (3486, 3500, 21, 25,'Upper Middle Back - 3 extra damage dice; count reset; held items dropped; muscle tear; -3 Str until healed')");
			db.execSQL("INSERT INTO Crushing VALUES (3486, 3500, 26, 30,'Upper Middle Back - 3 extra damage dice; automatically ToPed; [broken bone, 30% chance of internal bleeding, -3 Str until healed, -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Crushing VALUES (3486, 3500, 31, 40,'Upper Middle Back - 4 extra damage dice; automatically ToPed [broken bones; internal bleeding, -6 Str until healed; -1/50 Str permanently)')");
			db.execSQL("INSERT INTO Crushing VALUES (3486, 3500, 41, 50,'Upper Middle Back - Target killed instantly; ruptured aorta')");
			db.execSQL("INSERT INTO Crushing VALUES (3486, 3500, 51, 9999,'Upper Middle Back - Target killed instantly; ruptured aorta')");
			
			db.execSQL("INSERT INTO Crushing VALUES (3501, 3820, 1, 10,'Armpit - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (3501, 3820, 11, 15,'Armpit - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (3501, 3820, 16, 20,'Armpit - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (3501, 3820, 21, 25,'Armpit - 2 extra damage dice; count reset; held items dropped; -2 Atk (if primary side) or -2 Def (if secondary); -2 Str [all until healed]')");
			db.execSQL("INSERT INTO Crushing VALUES (3501, 3820, 26, 30,'Armpit - 3 extra damage dice; count reset; held items dropped; -3 Atk (if primary side) or -3 Def (if secondary); -3 Str; -1 Dex; -0/50 Str permanently')");
			db.execSQL("INSERT INTO Crushing VALUES (3501, 3820, 31, 40,'Armpit - 3 extra damage dice; automatically ToPed; [torn ligaments; -3 Atk (if primary side) or -3 Def (if secondary); -3 Str; -1 Dex; -1 Atk or Def & -0/75 Str permanently)')");
			db.execSQL("INSERT INTO Crushing VALUES (3501, 3820, 41, 50,'Armpit - 4 extra damage dice; automatically ToPed; [torn ligaments; -3 Atk (if primary side) or -3 Def (if secondary); -4 Str; -2 Dex; -1 Atk or Def, -0/50 Dex & -1/00 Str permanently')");
			db.execSQL("INSERT INTO Crushing VALUES (3501, 3820, 51, 9999,'Armpit - Target killed instantly; body cavity crushed')");
			
			db.execSQL("INSERT INTO Crushing VALUES (3821, 4300, 1, 10,'Upper Outer Arm - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (3821, 4300, 11, 15,'Upper Outer Arm - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (3821, 4300, 16, 20,'Upper Outer Arm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (3821, 4300, 21, 25,'Upper Outer Arm - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -2 Str [all until healed]')");
			db.execSQL("INSERT INTO Crushing VALUES (3821, 4300, 26, 30,'Upper Outer Arm - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Crushing VALUES (3821, 4300, 31, 40,'Upper Outer Arm - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -0/75 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (3821, 4300, 41, 50,'Upper Outer Arm - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -4 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -1/00 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (3821, 4300, 51, 9999,'Upper Outer Arm - 4 extra damage dice; automatically ToPed; Arm Mangled and Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (4301, 4492, 1, 10,'Upper Inner Arm - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (4301, 4492, 11, 15,'Upper Inner Arm - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (4301, 4492, 16, 20,'Upper Inner Arm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (4301, 4492, 21, 25,'Upper Inner Arm - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -2 Str [all until healed]')");
			db.execSQL("INSERT INTO Crushing VALUES (4301, 4492, 26, 30,'Upper Inner Arm - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Crushing VALUES (4301, 4492, 31, 40,'Upper Inner Arm - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -3 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -0/75 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (4301, 4492, 41, 50,'Upper Inner Arm - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -4 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -1/00 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (4301, 4492, 51, 9999,'Upper Inner Arm - 4 extra damage dice; automatically ToPed; Arm Mangled and Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (4493, 4588, 1, 10,'Elbow - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (4493, 4588, 11, 15,'Elbow - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (4493, 4588, 16, 20,'Elbow - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (4493, 4588, 21, 25,'Elbow - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Crushing VALUES (4493, 4588, 26, 30,'Elbow - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Crushing VALUES (4493, 4588, 31, 40,'Elbow - 3 extra damage dice; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -2 Str [all until healed]; permanent -1 Atk (if primary else -1 Def)')");
			db.execSQL("INSERT INTO Crushing VALUES (4493, 4588, 41, 50,'Elbow - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -2 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def)')");
			db.execSQL("INSERT INTO Crushing VALUES (4493, 4588, 51, 9999,'Elbow - 4 extra damage dice; automatically ToPed; Elbow & below Mangled and Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (4589, 4684, 1, 10,'Inner Joint - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (4589, 4684, 11, 15,'Inner Joint - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (4589, 4684, 16, 20,'Inner Joint - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (4589, 4684, 21, 25,'Inner Joint - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (4589, 4684, 26, 30,'Inner Joint - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Crushing VALUES (4589, 4684, 31, 40,'Inner Joint - 2 extra damage dice; count reset; held items dropped -3 Atk & +1 Speed (if primary side) or -3 Def (if secondary); -1 Str [all until healed]')");
			db.execSQL("INSERT INTO Crushing VALUES (4589, 4684, 41, 50,'Inner Joint - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -2 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def)')");
			db.execSQL("INSERT INTO Crushing VALUES (4589, 4684, 51, 9999,'Inner Joint - 4 extra damage dice; automatically ToPed; Elbow & below Mangled and Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (4685, 5308, 1, 10,'Back of Forearm - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (4685, 5308, 11, 15,'Back of Forearm - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (4685, 5308, 16, 20,'Back of Forearm - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (4685, 5308, 21, 25,'Back of Forearm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (4685, 5308, 26, 30,'Back of Forearm - 2 extra damage dice; count reset; held items dropped -2 Atk (if primary side);')");
			db.execSQL("INSERT INTO Crushing VALUES (4685, 5308, 31, 40,'Back of Forearm - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Crushing VALUES (4685, 5308, 41, 50,'Back of Forearm - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Crushing VALUES (4685, 5308, 51, 9999,'Back of Forearm - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (5309, 5836, 1, 10,'Inner Forearm - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (5309, 5836, 11, 15,'Inner Forearm - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (5309, 5836, 16, 20,'Inner Forearm - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (5309, 5836, 21, 25,'Inner Forearm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (5309, 5836, 26, 30,'Inner Forearm - 2 extra damage dice; count reset; held items dropped -2 Atk (if primary side);')");
			db.execSQL("INSERT INTO Crushing VALUES (5309, 5836, 31, 40,'Inner Forearm - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Crushing VALUES (5309, 5836, 41, 50,'Inner Forearm - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +1 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk')");
			db.execSQL("INSERT INTO Crushing VALUES (5309, 5836, 51, 9999,'Inner Forearm - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (5837, 5908, 1, 10,'Back of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (5837, 5908, 11, 15,'Back of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (5837, 5908, 16, 20,'Back of Wrist - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (5837, 5908, 21, 25,'Back of Wrist - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side)')");
			db.execSQL("INSERT INTO Crushing VALUES (5837, 5908, 26, 30,'Back of Wrist - 2 extra damage dice; count reset; held items dropped -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Crushing VALUES (5837, 5908, 31, 40,'Back of Wrist - 3 extra damage dice; [muscle tear; -4 Atk & +2 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Crushing VALUES (5837, 5908, 41, 50,'Back of Wrist - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & +3 Speed (if primary side); -1 Str [all until healed]; permanent -2 Atk & +2 Speed (if primary)')");
			db.execSQL("INSERT INTO Crushing VALUES (5837, 5908, 51, 9999,'Back of Wrist - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (5909, 5980, 1, 10,'Front of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (5909, 5980, 11, 15,'Front of Wrist - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (5909, 5980, 16, 20,'Front of Wrist - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (5909, 5980, 21, 25,'Front of Wrist - 2 extra damage dice; count reset; held items dropped, -2 Atk & +1 Speed (if primary side)')");
			db.execSQL("INSERT INTO Crushing VALUES (5909, 5980, 26, 30,'Front of Wrist - 2 extra damage dice; count reset; held items dropped -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Crushing VALUES (5909, 5980, 31, 40,'Front of Wrist - 3 extra damage dice; [muscle tear; -4 Atk & +2 Speed (if primary side); -1 Str [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Crushing VALUES (5909, 5980, 41, 50,'Front of Wrist - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & +3 Speed (if primary side); -1 Str [all until healed]; permanent -2 Atk & +2 Speed (if primary)')");
			db.execSQL("INSERT INTO Crushing VALUES (5909, 5980, 51, 9999,'Front of Wrist - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (5981, 6052, 1, 10,'Back of Hand - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (5981, 6052, 11, 15,'Back of Hand - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (5981, 6052, 16, 20,'Back of Hand - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (5981, 6052, 21, 25,'Back of Hand - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (5981, 6052, 26, 30,'Back of Hand - 2 extra damage dice; count reset; held items dropped; -2 Atk')");
			db.execSQL("INSERT INTO Crushing VALUES (5981, 6052, 31, 40,'Back of Hand - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Crushing VALUES (5981, 6052, 41, 50,'Back of Hand - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +2 Speed (if primary side); [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Crushing VALUES (5981, 6052, 51, 9999,'Back of Hand - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (6053, 6076, 1, 10,'Palm - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (6053, 6076, 11, 15,'Palm - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (6053, 6076, 16, 20,'Palm - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (6053, 6076, 21, 25,'Palm - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (6053, 6076, 26, 30,'Palm - 2 extra damage dice; count reset; held items dropped; -2 Atk')");
			db.execSQL("INSERT INTO Crushing VALUES (6053, 6076, 31, 40,'Palm - 3 extra damage dice; [muscle tear; -3 Atk & +1 Speed (if primary side); permanent -1 Atk (if primary)')");
			db.execSQL("INSERT INTO Crushing VALUES (6053, 6076, 41, 50,'Palm - 4 extra damage dice; automatically ToPed; [torn ligaments; -4 Atk & +2 Speed (if primary side); [all until healed]; permanent -1 Atk & +1 Speed (if primary)')");
			db.execSQL("INSERT INTO Crushing VALUES (6053, 6076, 51, 9999,'Palm - 4 extra damage dice; automatically ToPed; Mangled and Hand Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (6077, 6220, 1, 10,'Finger(s) - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (6077, 6220, 11, 15,'Finger(s) - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (6077, 6220, 16, 20,'Finger(s) - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (6077, 6220, 21, 25,'Finger(s) - 2 extra damage dice; count reset; held items dropped if ToP check failed')");
			db.execSQL("INSERT INTO Crushing VALUES (6077, 6220, 26, 30,'Finger(s) - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (6077, 6220, 31, 40,'Finger(s) - 2 extra damage dice; count reset; held items dropped; -2 Atk')");
			db.execSQL("INSERT INTO Crushing VALUES (6077, 6220, 41, 50,'Finger(s) - 3 extra damage dice; [muscle tear; -2 Atk & +1 Speed (if primary side);')");
			db.execSQL("INSERT INTO Crushing VALUES (6077, 6220, 51, 9999,'Finger(s) - 3 extra damage dice; Finger Mangled')");
			
			db.execSQL("INSERT INTO Crushing VALUES (6221, 7180, 1, 10,'Side of Shoulder - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (6221, 7180, 11, 15,'Side of Shoulder - 1 extra damage die')");
			db.execSQL("INSERT INTO Crushing VALUES (6221, 7180, 16, 20,'Side of Shoulder - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (6221, 7180, 21, 25,'Side of Shoulder - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Crushing VALUES (6221, 7180, 26, 30,'Side of Shoulder - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -4 Str [all until healed]; permanent -1 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (6221, 7180, 31, 40,'Side of Shoulder - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -5 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -1/50 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (6221, 7180, 41, 50,'Side of Shoulder - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -6 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -2/00 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (6221, 7180, 51, 9999,'Side of Shoulder - 4 extra damage dice; automatically ToPed; Arm Mangled and Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (7181, 9100, 1, 10,'Top of Shoulder - no additional effect')");
			db.execSQL("INSERT INTO Crushing VALUES (7181, 9100, 11, 15,'Top of Shoulder - 1 extra damage die')");
			 db.execSQL("INSERT INTO Crushing VALUES (7181, 9100, 16, 20,'Top of Shoulder - 2 extra damage dice; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (7181, 9100, 21, 25,'Top of Shoulder - 2 extra damage dice; count reset; held items dropped -2 Atk & +1 Speed (if primary side) or -2 Def (if secondary); -3 Str [all until healed]')");
			db.execSQL("INSERT INTO Crushing VALUES (7181, 9100, 26, 30,'Top of Shoulder - 2 extra damage dice; count reset; held items dropped -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -4 Str [all until healed]; permanent -1 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (7181, 9100, 31, 40,'Top of Shoulder - 3 extra damage dice; automatically ToPed; [muscle tear; -3 Atk & -1 Speed (if primary side) or -3 Def (if secondary); -5 Str [all until healed]; permanent -1 Atk (if primary else -1 Def), -1/50 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (7181, 9100, 41, 50,'Top of Shoulder - 4 extra damage dice; automatically ToPed; [torn ligaments; -5 Atk & -2 Speed (if primary side) or -4 Def (if secondary); -6 Str [all until healed]; permanent -1 Atk & +1 Speed (or -1 Def) and -2/00 Str')");
			db.execSQL("INSERT INTO Crushing VALUES (7181, 9100, 51, 9999,'Top of Shoulder - 4 extra damage dice; automatically ToPed; Arm Mangled and Useless')");
			
			db.execSQL("INSERT INTO Crushing VALUES (9101, 9121, 1, 10,'Front of Neck - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9101, 9121, 11, 15,'Front of Neck - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9101, 9121, 16, 20,'Front of Neck - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9101, 9121, 21, 25,'Front of Neck - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9101, 9121, 26, 30,'Front of Neck - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9101, 9121, 31, 40,'Front of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9101, 9121, 41, 50,'Front of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9101, 9121, 51, 9999,'Front of Neck - Target killed instantly')");
			
			db.execSQL("INSERT INTO Crushing VALUES (9122, 9142, 1, 10,'Back of Neck - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9122, 9142, 11, 15,'Back of Neck - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9122, 9142, 16, 20,'Back of Neck - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9122, 9142, 21, 25,'Back of Neck - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9122, 9142, 26, 30,'Back of Neck - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9122, 9142, 31, 40,'Back of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9122, 9142, 41, 50,'Back of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9122, 9142, 51, 9999,'Back of Neck - Target killed instantly')");
			
			db.execSQL("INSERT INTO Crushing VALUES (9143, 9373, 1, 10,'Side of Neck - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9143, 9373, 11, 15,'Side of Neck - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9143, 9373, 16, 20,'Side of Neck - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9143, 9373, 21, 25,'Side of Neck - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9143, 9373, 26, 30,'Side of Neck - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9143, 9373, 31, 40,'Side of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9143, 9373, 41, 50,'Side of Neck - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9143, 9373, 51, 9999,'Side of Neck - Target killed instantly')");
			
			db.execSQL("INSERT INTO Crushing VALUES (9374, 9653, 1, 10,'Side of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9374, 9653, 11, 15,'Side of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9374, 9653, 16, 20,'Side of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9374, 9653, 21, 25,'Side of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9374, 9653, 26, 30,'Side of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9374, 9653, 31, 40,'Side of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9374, 9653, 41, 50,'Side of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9374, 9653, 51, 9999,'Side of Head - Target killed instantly')");
			
			db.execSQL("INSERT INTO Crushing VALUES (9654, 9688, 1, 10,'Lower Back of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9654, 9688, 11, 15,'Lower Back of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9654, 9688, 16, 20,'Lower Back of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9654, 9688, 21, 25,'Lower Back of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9654, 9688, 26, 30,'Lower Back of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9654, 9688, 31, 40,'Lower Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9654, 9688, 41, 50,'Lower Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9654, 9688, 51, 9999,'Lower Back of Head - Target killed instantly')");
			
			db.execSQL("INSERT INTO Crushing VALUES (9689, 9768, 1, 10,'Lower Side of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9689, 9768, 11, 15,'Lower Side of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9689, 9768, 16, 20,'Lower Side of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9689, 9768, 21, 25,'Lower Side of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -1 Looks')");
			db.execSQL("INSERT INTO Crushing VALUES (9689, 9768, 26, 30,'Lower Side of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Crushing VALUES (9689, 9768, 31, 40,'Lower Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9689, 9768, 41, 50,'Lower Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9689, 9768, 51, 9999,'Lower Side of Face - Target killed instantly')");
			
			db.execSQL("INSERT INTO Crushing VALUES (9769, 9788, 1, 10,'Lower Center of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9769, 9788, 11, 15,'Lower Center of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9769, 9788, 16, 20,'Lower Center of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9769, 9788, 21, 25,'Lower Center of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -1 Looks')");
			db.execSQL("INSERT INTO Crushing VALUES (9769, 9788, 26, 30,'Lower Center of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Crushing VALUES (9769, 9788, 31, 40,'Lower Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9769, 9788, 41, 50,'Lower Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9769, 9788, 51, 9999,'Lower Center of Face - Target killed instantly')");
			
			db.execSQL("INSERT INTO Crushing VALUES (9789, 9823, 1, 10,'Upper Back of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9789, 9823, 11, 15,'Upper Back of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9789, 9823, 16, 20,'Upper Back of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9789, 9823, 21, 25,'Upper Back of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9789, 9823, 26, 30,'Upper Back of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9789, 9823, 31, 40,'Upper Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9789, 9823, 41, 50,'Upper Back of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9789, 9823, 51, 9999,'Upper Back of Head - Target killed instantly')");
			
			db.execSQL("INSERT INTO Crushing VALUES (9824, 9903, 1, 10,'Upper Side of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9824, 9903, 11, 15,'Upper Side of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9824, 9903, 16, 20,'Upper Side of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped; permanent -1 Looks')");
			db.execSQL("INSERT INTO Crushing VALUES (9824, 9903, 21, 25,'Upper Side of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Crushing VALUES (9824, 9903, 26, 30,'Upper Side of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -3 Looks')");
			db.execSQL("INSERT INTO Crushing VALUES (9824, 9903, 31, 40,'Upper Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9824, 9903, 41, 50,'Upper Side of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9824, 9903, 51, 9999,'Upper Side of Face - Target killed instantly')");
			
			db.execSQL("INSERT INTO Crushing VALUES (9904, 9923, 1, 10,'Upper Center of Face - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9904, 9923, 11, 15,'Upper Center of Face - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9904, 9923, 16, 20,'Upper Center of Face - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped; permanent -1 Looks')");
			db.execSQL("INSERT INTO Crushing VALUES (9904, 9923, 21, 25,'Upper Center of Face - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed); permanent -2 Looks')");
			db.execSQL("INSERT INTO Crushing VALUES (9904, 9923, 26, 30,'Upper Center of Face - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed); permanent -4 Looks')");
			db.execSQL("INSERT INTO Crushing VALUES (9904, 9923, 31, 40,'Upper Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9904, 9923, 41, 50,'Upper Center of Face - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9904, 9923, 51, 9999,'Upper Center of Face - Target killed instantly')");
			
			db.execSQL("INSERT INTO Crushing VALUES (9924, 10000, 1, 10,'Top of Head - 2 extra damage dice; -1 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9924, 10000, 11, 15,'Top of Head - 2 extra damage dice; -2 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9924, 10000, 16, 20,'Top of Head - 3 extra damage dice; -3 Atk & Def; count reset; held items dropped')");
			db.execSQL("INSERT INTO Crushing VALUES (9924, 10000, 21, 25,'Top of Head - 3 extra damage dice; automatically ToPed; (-5 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9924, 10000, 26, 30,'Top of Head - 4 extra damage dice; automatically ToPed; (-8 Atk & Def penalties until wound healed)')");
			db.execSQL("INSERT INTO Crushing VALUES (9924, 10000, 31, 40,'Top of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9924, 10000, 41, 50,'Top of Head - Target killed instantly')");
			db.execSQL("INSERT INTO Crushing VALUES (9924, 10000, 51, 9999,'Top of Head - Target killed instantly')");
		}
		Log.d("DB","End Filling CritCrushing");
	}
	

}
