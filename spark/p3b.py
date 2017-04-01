#Code here
import csv
dataEscuela = sc.textFile("/home/carlos/Files/escuelasPR.csv")
listaEscuela=dataEscuela.map(lambda x: [x]).map(lambda x : list(csv.reader(x))[3])
ponce = listaEscuela.filter(lambda x: x[2] == 'Ponce')
caboRojo = listaEscuela.filter(lambda x: x[2] == 'Cabo Rojo')
dorado = listaEscuela.filter(lambda x: x[2] == 'Dorado')
Escuelas = ponce.union(caboRojo).union(dorado)
Escuelas.foreach(print)