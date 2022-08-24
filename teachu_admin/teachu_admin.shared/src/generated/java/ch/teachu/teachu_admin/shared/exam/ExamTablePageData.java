package ch.teachu.teachu_admin.shared.exam;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "ch.teachu.teachu_admin.client.exam.ExamTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ExamTablePageData extends AbstractTablePageData {
  private static final long serialVersionUID = 1L;

  @Override
  public ExamTableRowData addRow() {
    return (ExamTableRowData) super.addRow();
  }

  @Override
  public ExamTableRowData addRow(int rowState) {
    return (ExamTableRowData) super.addRow(rowState);
  }

  @Override
  public ExamTableRowData createRow() {
    return new ExamTableRowData();
  }

  @Override
  public Class<? extends AbstractTableRowData> getRowType() {
    return ExamTableRowData.class;
  }

  @Override
  public ExamTableRowData[] getRows() {
    return (ExamTableRowData[]) super.getRows();
  }

  @Override
  public ExamTableRowData rowAt(int index) {
    return (ExamTableRowData) super.rowAt(index);
  }

  public void setRows(ExamTableRowData[] rows) {
    super.setRows(rows);
  }

  public static class ExamTableRowData extends AbstractTableRowData {
    private static final long serialVersionUID = 1L;
    public static final String id = "id";
    public static final String name = "name";
    public static final String weight = "weight";
    public static final String date = "date";
    public static final String viewDate = "viewDate";
    public static final String schoolClass = "schoolClass";
    public static final String schoolClassSubject = "schoolClassSubject";
    private String m_id;
    private String m_name;
    private BigDecimal m_weight;
    private Date m_date;
    private Date m_viewDate;
    private String m_schoolClass;
    private String m_schoolClassSubject;

    public String getId() {
      return m_id;
    }

    public void setId(String newId) {
      m_id = newId;
    }

    public String getName() {
      return m_name;
    }

    public void setName(String newName) {
      m_name = newName;
    }

    public BigDecimal getWeight() {
      return m_weight;
    }

    public void setWeight(BigDecimal newWeight) {
      m_weight = newWeight;
    }

    public Date getDate() {
      return m_date;
    }

    public void setDate(Date newDate) {
      m_date = newDate;
    }

    public Date getViewDate() {
      return m_viewDate;
    }

    public void setViewDate(Date newViewDate) {
      m_viewDate = newViewDate;
    }

    public String getSchoolClass() {
      return m_schoolClass;
    }

    public void setSchoolClass(String newSchoolClass) {
      m_schoolClass = newSchoolClass;
    }

    public String getSchoolClassSubject() {
      return m_schoolClassSubject;
    }

    public void setSchoolClassSubject(String newSchoolClassSubject) {
      m_schoolClassSubject = newSchoolClassSubject;
    }
  }
}
