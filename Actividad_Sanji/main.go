package main

import "fmt"

func main() {
	fmt.Println(" === Entorno Real === ")

	pasarelaReal := &AdapatadorMercadoPago{TokenAccess: "123!#$"}
	emisorReal := &AdaptadorTwilio{IdentificadorCuenta: "456&/("}

	servicioReal := NuevoServicioPago(pasarelaReal, emisorReal)
	_ = servicioReal.ProcesarPago("changotremendo@gmail.com", 1500.00)

	fmt.Println(" === Entorno Prueba === ")

	pasarelaMock := &SimuladorPasarela{DebeFallar: true}
	emisorMock := &SimuladorEmisor{}

	servicioMock := NuevoServicioPago(pasarelaMock, emisorMock)
	_ = servicioMock.ProcesarPago("tilintravieso@gmail.com", 3000)
}
