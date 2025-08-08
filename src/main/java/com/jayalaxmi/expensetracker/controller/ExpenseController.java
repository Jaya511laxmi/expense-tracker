package com.jayalaxmi.expensetracker.controller;

import com.jayalaxmi.expensetracker.model.Expense;
import com.jayalaxmi.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExpenseController {

    @Autowired
    private ExpenseService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listExpenses", service.listAll());
        return "index";
    }

    @GetMapping("/new")
    public String showNewExpenseForm(Model model) {
        model.addAttribute("expense", new Expense());
        return "new_expense";
    }

    @PostMapping("/save")
    public String saveExpense(@ModelAttribute("expense") Expense expense) {
        service.save(expense);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("expense", service.get(id));
        return "edit_expense";
    }

    @GetMapping("/delete/{id}")
    public String deleteExpense(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/";
    }
}

