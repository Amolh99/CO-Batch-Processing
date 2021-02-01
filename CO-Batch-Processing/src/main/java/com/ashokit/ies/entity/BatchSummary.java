package com.ashokit.ies.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "BATCH_SUMMARY")
public class BatchSummary {

	@Column(name = "BATCH_NAME")
	private String batchName;

	@Column(name = "FAILURE_TRIGGER_COUNT")
	private Long failureTriggerCount;

	@Column(name = "SUCCESS_TRIGGER_COUNT")
	private Long successTriggerCount;

	@Column(name = "TOTAL_TRIGGER_PROCESSED")
	private Long totalTriggerProcessed;

}
