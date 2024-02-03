package model;

import java.math.BigDecimal;import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_installment")
public class Installment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer installment_number;
	
	private BigDecimal value;
	
	@ManyToOne
	@JsonIgnoreProperties("installment")
	private Transaction transaction;
	
	
	// Geters and Seters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getInstallment_number() {
		return installment_number;
	}

	public void setInstallment_number(Integer installment_number) {
		this.installment_number = installment_number;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	
	

}
