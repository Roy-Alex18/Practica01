def examenRAGS01():
    #Definir variables
    exaCono=float
    entPers=float
    testPsi=float
    a=float
    b=float
    c=float
    e=float
    mensaje=str
    #Datos de entrada
    exaCono=float(input("ingrese la nota del examen de conocimiento:"))
    entPers=float(input("ingrese la nota de la entrevista personal:"))
    testPsi=float(input("ingrese la nota del test psicologico:"))
    #Proceso
    a=exaCono*0.40
    b=entPers*0.35
    c=testPsi*0.25
    e=a+b+c
    if e>=17:
        mensaje=("su nota es 4")
    elif e<17 and e>=14:
        mensaje=("su nota es 3")
    elif e<14 and e>=11:
        mensaje=("su nota es 2")
    else:
        mensaje=("no tiene vacante y es nivel 1")
    #Datos de salida
    print(mensaje)
def examenRAGS02():
    #Datos de salida
    descuento=float
    montopagar=float
    precio=float
    preciofin=float
    IGV=float
    #Datos de entrada
    precio=float(input("ingrese el precio:"))
    #Proceso
    if precio>2000:
        descuento=precio*0.10
    elif precio<2000 and precio>=1000:
        descuento=precio*0.05
    elif precio>=500 and precio>=1000:
        descuento=precio*0.02
    else:
        descuento=precio*0
    preciofin=precio-descuento
    IGV=preciofin*0.18
    montopagar=preciofin+IGV
    #Datos de salida
    print(f"el precio final es: {montopagar}")
    print(f"el IGV es: {IGV}")
    print(f"el descuento es: {descuento}")
def examenRAGS03():
    #Definir variables
    v1:float
    v2:float
    floatsigno:str
    total:float
    #Datos de entrada 
    v1=float(input("ingrese el primer numero:"))
    v2=float(input("ingrese el segundo variable:"))
    print("+=suma:")
    print("-=resta:")
    print("/=division:")
    print("*=multiplicacion:")
    print("^=potencia:")
    print("R=RAIZ:")
    print("%modulo de 2:")
    signo=str(input("ingrese el signo:"))
    #Proceso
    if signo=="+":
        total=v1+v2
    elif signo=="-":
        total=v1-v2
    elif signo=="/":
        total=v1/v2
    elif signo=="*":
        total=v1*v2
    elif signo=="^":
        total=v1^v2
    elif signo=="R":
        total=v1**0.5
    else:
        total=v1-v2
    #Datos de salida
    print(f"resultado: {total}")
def examenRAGS04():
    #definir variables
    años:float
    genero:str
    mensaje:str
    #Datos de entrada
    años=float(input("ingrese los años:"))
    print("genero:mujer,varon:")
    genero=str(input("ingrese los tipos de generos:"))
    #Proceso
    if años>70:
        mensaje=("la vacuna es de tipo c")
    elif años>16 and años<=69 and genero=="mujer":
        mensaje=("la vacuna es de tipo b")
    elif años>16 and años<=69 and genero=="varon":
        mensaje=("la vacuna es de tipo a")
    else:
        mensaje=("la vacuna es de tipo a")
    #Datos de salido
    print(mensaje)

#PreguntasRAGS5
#Definir variables
numero:float
#Datos de entrada
numero=float(input("ingrese el numero de la pregunta: "))
#Proceso
if numero==1:
    examenRAGS01()
elif numero==2:
    examenRAGS02()
elif numero==3:
    examenRAGS03()
else:
    examenRAGS04()
#Datos de salida
print("Gracias")
