package dev.gold.untitled.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name = "expenses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Expense {

  @Id
  private Long id;

  private Long userId;
  
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "expense_type_id", referencedColumnName = "id")
  private ExpenseType expenseType;
  
  private BigDecimal amount;
  private LocalDate effectivityDate;
  private LocalDate createdDate;
}
