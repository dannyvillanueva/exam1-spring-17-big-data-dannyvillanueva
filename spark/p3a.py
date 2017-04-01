#Code here
import csv
dataStudents = sc.textFile("/home/danny/studentsPR.csv")
listaStudent=dataStudents.map(lambda x: [x]).map(lambda x : list(csv.reader(x))[6])
Students=listaStudent.filter(lambda x: x[5] == 'F').filter(lambda x: x[2] == '71381')
Students.foreach(print)