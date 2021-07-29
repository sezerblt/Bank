package org.akbank4j.core.models;

import java.util.List;
import org.akbank4j.core.records.CreditPaymentPlanRecords;

/**
 * This API allows you to get credit payment plan.
 *
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class CreditPaymentPlanModel {

  private List<CreditPaymentPlanRecords> paymentPlanList;

  public List<CreditPaymentPlanRecords> getPaymentPlanList() {
    return paymentPlanList;
  }

  public void setPaymentPlanList(List<CreditPaymentPlanRecords> paymentPlanList) {
    this.paymentPlanList = paymentPlanList;
  }

}
