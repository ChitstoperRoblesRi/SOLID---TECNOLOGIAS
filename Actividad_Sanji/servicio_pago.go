package main

import "fmt"

type ServicioPago struct {
	pasarela PasarelaPago
	emisor   EmisorComprobante
}

func NuevoServicioPago(pasarela PasarelaPago, emisor EmisorComprobante) *ServicioPago {
	return &ServicioPago{
		pasarela: pasarela,
		emisor:   emisor,
	}
}

func (sp *ServicioPago) ProcesarPago(correo string, monto float64) error {
	if err := sp.pasarela.Cobrar(monto); err != nil {
		return fmt.Errorf("No se pudo realizar el cobro %w\n", err)
	}

	if err := sp.emisor.Enviar(correo, monto); err != nil {
		return fmt.Errorf("No se pudo enviar el comprobante %w\n", err)
	}
	return nil
}
