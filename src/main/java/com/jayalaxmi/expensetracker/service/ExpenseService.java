package com.jayalaxmi.expensetracker.service;

import com.jayalaxmi.expensetracker.model.Expense;
import com.jayalaxmi.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository repository;

    public List<Expense> listAll() {
        return repository.findAllByOrderByDateDesc();
    }

    public void save(Expense expense) {
        repository.save(expense);
    }

    public Expense get(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
