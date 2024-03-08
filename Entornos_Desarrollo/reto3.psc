Algoritmo reto3
	suma <- 0
	cantidad <- 0
	Escribir 'Ingresa un valor(-999 para finalizar):'
	Leer valor
	Si valor<>-999 Entonces
		suma <- suma+valor
		cantidad <- cantidad+1
	FinSi
	Mientras valor<>-999 Hacer
		Escribir 'Ingresa un valor(-999 para finalizar):'
		Leer valor
		Si valor<>-999 Entonces
			suma <- suma+valor
			cantidad <- cantidad+1
		FinSi
	FinMientras
	Si cantidad<>0 Entonces
		media <- suma/cantidad
		Escribir 'La media de los valores ingresados es: '
		Escribir media
	SiNo
		Escribir 'No  se ingresaron valores'
	FinSi
FinAlgoritmo
