package main

import "fmt"

type AdapatadorMercadoPago struct {
	TokenAccess string
}

func (mp *AdapatadorMercadoPago) Cobrar(monto float64) error {
	fmt.Printf("[Mercado Pago] Cobro realizado por el monto de %.2f, con el token %s\n", monto, mp.TokenAccess)
	return nil
}
