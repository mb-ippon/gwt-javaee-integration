insert into country(id, code, libelle,version)Values(100,'SRB', 'Serbia',0),(101,'ESP', 'Spain',0),(102,'CHE', 'Switzerland',0),(103,'FRA', 'France',0),(104,'GBR', 'Great Britain',0),(105,'ARG', 'Argentina',0),(106,'CZE', 'Czech Republic',0);
insert into player(id, height, weight,atpPoint,yearTurnPro,name,playHand,country_id,birthDay,version)Values(500,188, 88,12260,2003,'Djokovic N.',0,100,TO_DATE('05/22/1987', 'MM/DD/YYYY'),0),(501,185, 85,13030,2001,'Nadal R.',1,101,TO_DATE('06/03/1986', 'MM/DD/YYYY'),0),(502,185, 85,4205,1998,'Federer R.',0,102,TO_DATE('08/08/1981', 'MM/DD/YYYY'),0),(503,188, 91,3065,2004,'Tsonga J.W.',0,103,TO_DATE('04/17/1985', 'MM/DD/YYYY'),0),(504,175, 73,5800,2000,'Ferrer D.',0,101,TO_DATE('02/04/1982', 'MM/DD/YYYY'),0),(505,190, 84,5790,2005,'Murray A.',0,104,TO_DATE('05/15/1987', 'MM/DD/YYYY'),0),(506,198, 97,5255,2005,'Del Potro J.M.',0,105,TO_DATE('09/23/1988', 'MM/DD/YYYY'),0),(507,196, 91,4180,2002,'Berdych T.',0,106,TO_DATE('09/17/1985', 'MM/DD/YYYY'),0),(508,183, 81,3730,2002,'Wawrinka S.',0,102,TO_DATE('03/28/1985', 'MM/DD/YYYY'),0),(509,185, 75,3300,2002,'Gasquet R.',0,103,TO_DATE('06/18/1986', 'MM/DD/YYYY'),0);
commit;