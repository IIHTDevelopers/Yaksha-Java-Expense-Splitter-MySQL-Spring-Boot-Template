package com.expensesplitter.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expensesplitter.entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

	// Finds all expenses where the specified user is the payer.

	// Finds all expenses that are shared with the specified user.

	// Custom query to find all expenses involving the specified user either as the payer or as a participant in the sharedWith collection. 
	// This includes expenses the user paid for and expenses shared with the user.
}
