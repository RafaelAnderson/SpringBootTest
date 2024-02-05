package org.rponte.test.springboot.app.services;

import org.rponte.test.springboot.app.models.Cuenta;

import java.math.BigDecimal;

public interface CuentaService {
    Cuenta findById(Long id);
    int revisarTotalTransferencias(Long bancoId);
    BigDecimal revisarSaldo(Long cuentaId);
    void transferir(Long numCuentOrigen, Long numCuentaDestino, BigDecimal monto, Long bancoId);
}
