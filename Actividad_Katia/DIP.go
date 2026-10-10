package main

import "fmt"

type ClienteStripe struct {
	ClaveApi string
}

func (s *ClienteStripe) CobrarTarjeta(monto float64) bool {
	fmt.Printf("[API STRIPE] Enviando $%.2f con la clave %s\n", monto, s.ClaveApi)
	return true
}

type NotificadorSendgrid struct {
	CorreoRemitente string
}

func (n *NotificadorSendgrid) EnviarRecibirCorreo(monto float64, correo string) {
	fmt.Printf("[API SENDGRID] Enviando desde %s a %s la cantidad de %.2f\n", n.CorreoRemitente, correo, monto)
}

type ServicioPago struct {
	ClienteStripe *ClienteStripe
	notificador   *NotificadorSendgrid
}

func NuevoServicoPago() *ServicioPago {
	return &ServicioPago{
		ClienteStripe: &ClienteStripe{ClaveApi: "1"},
		notificador:   &NotificadorSendgrid{CorreoRemitente: "magdielito@gmail.com"},
	}
}

func (s *ServicioPago) ProcesarPago(monto float64, correo string) {
	if s.ClienteStripe.CobrarTarjeta(monto) {
		s.notificador.EnviarRecibirCorreo(monto, correo)
	}
}

func main() {
	servicio := NuevoServicoPago()
	servicio.ProcesarPago(1500.01, "caballerodelzodiaco@gmail.com")
}
