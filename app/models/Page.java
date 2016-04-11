package models;

import java.util.List;

/**
 * Created by sunsai on 2016/4/11 - 12:56.
 */
public class Page<T> {
  private int pageSize;
  private int totalRowCount;
  private int pageIndex;

  private List<T> itemList;

  public void setItemList(List<T> itemList) {
    this.itemList = itemList;
  }

  public List<T> getItemList() {
    return itemList;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public void setTotalRowCount(int totalRowCount) {
    this.totalRowCount = totalRowCount;
  }

  public void setPageIndex(int pageIndex) {
    this.pageIndex = pageIndex;
  }

  public int getTotalRowCount() {
    return totalRowCount;
  }

  public int getPageIndex() {
    return pageIndex;
  }

  public boolean hasPrev() {
    return pageIndex > 1;
  }

  public boolean hasNext() {
    return getPageCount() > pageIndex;
  }

  public int getPageCount() {
    return (totalRowCount + pageSize - 1) / pageSize;
  }

}
