package com.jayalaxmi.expensetracker.repository;
import com.jayalaxmi.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

	public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	    List<Expense> findAllByOrderByDateDesc();
}
