from dispositivos import DisposotivoElectronico
from mixins import ConexionWifi, BateriaRecargable, SensorMovimiento

class CamaraSeguridadInalambrica(DisposotivoElectronico, ConexionWifi, BateriaRecargable, SensorMovimiento):

    def __init__(self, marca, modelo):
        DisposotivoElectronico.__init__(self, marca, modelo)
        ConexionWifi.__init__(self)
        BateriaRecargable.__init__(self, nivel_bateria=100)

    def reporte_completo(self):
        texto = f"--- {self.marca} {self.modelo} ---\n"
        texto += f"🔴 Estado actual: {'ENCENDIDA' if self.estado else 'APAGADA'}\n"

        if self.red_conectada:
            texto += f"🟢 Red: Conectado a '{self.red_conectada}'\n IP: {self.ip}\n"
        else:
            texto +=  "🔴 Red: Desconectada\n"

        texto += f"Bateria: {self.nivel_bateria}%"
        if self.nivel_bateria == 0:
            texto += "[NECESITA CARGA!]"
        return texto