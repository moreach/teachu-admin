package ch.teachu.teachu_admin.shared.event.lesson;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

import javax.annotation.Generated;
import java.util.Date;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "ch.teachu.teachu_admin.client.event.lesson.LessonEventTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class LessonEventTablePageData extends AbstractTablePageData {
  private static final long serialVersionUID = 1L;

  @Override
  public LessonEventTableRowData addRow() {
    return (LessonEventTableRowData) super.addRow();
  }

  @Override
  public LessonEventTableRowData addRow(int rowState) {
    return (LessonEventTableRowData) super.addRow(rowState);
  }

  @Override
  public LessonEventTableRowData createRow() {
    return new LessonEventTableRowData();
  }

  @Override
  public Class<? extends AbstractTableRowData> getRowType() {
    return LessonEventTableRowData.class;
  }

  @Override
  public LessonEventTableRowData[] getRows() {
    return (LessonEventTableRowData[]) super.getRows();
  }

  @Override
  public LessonEventTableRowData rowAt(int index) {
    return (LessonEventTableRowData) super.rowAt(index);
  }

  public void setRows(LessonEventTableRowData[] rows) {
    super.setRows(rows);
  }

  public static class LessonEventTableRowData extends AbstractTableRowData {
    private static final long serialVersionUID = 1L;
    public static final String id = "id";
    public static final String title = "title";
    public static final String date = "date";
    public static final String lessonEventType = "lessonEventType";
    private String m_id;
    private String m_title;
    private Date m_date;
    private String m_lessonEventType;

    public String getId() {
      return m_id;
    }

    public void setId(String newId) {
      m_id = newId;
    }

    public String getTitle() {
      return m_title;
    }

    public void setTitle(String newTitle) {
      m_title = newTitle;
    }

    public Date getDate() {
      return m_date;
    }

    public void setDate(Date newDate) {
      m_date = newDate;
    }

    public String getLessonEventType() {
      return m_lessonEventType;
    }

    public void setLessonEventType(String newLessonEventType) {
      m_lessonEventType = newLessonEventType;
    }
  }
}
