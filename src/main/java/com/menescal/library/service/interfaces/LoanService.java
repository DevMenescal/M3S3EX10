package com.menescal.library.service.interfaces;

import com.menescal.library.model.entity.Loan;

public interface LoanService extends DefaultCrud<Loan> {
    Loan pagarEmprestimo(Long id);
}
