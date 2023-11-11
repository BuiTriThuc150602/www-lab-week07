package vn.edu.iuh.fit.wwwlabweek07.backend.enums;

import lombok.Getter;

@Getter
public enum ProductStatus {
  ACTIVE(1),
  IN_ACTIVE(0),
  TERMINATED(-1);
  private final int value;

  ProductStatus(int value) {
    this.value = value;
  }

}
