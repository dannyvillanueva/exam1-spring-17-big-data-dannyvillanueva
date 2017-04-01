# You sql follows

# Pregunta 1:

 SELECT e.region, e.ciudad, count(*)
 FROM escuelas e
 GROUP BY e.region, e.ciudad;;

# Pregunta 2:

SELECT e.nombre, count(*)
FROM escuelas e , students s
WHERE e.escuelaID=s.escuelaID
GROUP BY e.nombre;

# Pregunta 3:

SELECT s.studentID, e.nombre
FROM  escuelas e, students s
WHERE e.escuelaID=s.escuelaID AND (e.ciudad="Ponce" OR e.ciudad="Cabo Rojo");


# Pregunta 4:

SELECT e.region, e.ciudad, count(*)
FROM escuelas e, students s
WHERE e.escuelaID=s.escuelaID
GROUP BY e.region, e.ciudad;

