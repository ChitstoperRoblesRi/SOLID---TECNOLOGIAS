package main

type PasarelaPago interface {
	Cobrar(monto float64) error
}
