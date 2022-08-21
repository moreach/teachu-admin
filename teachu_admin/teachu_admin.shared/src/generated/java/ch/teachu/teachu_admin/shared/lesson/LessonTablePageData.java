package ch.teachu.teachu_admin.shared.lesson;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

import javax.annotation.Generated;
import java.util.Date;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "ch.teachu.teachu_admin.client.lesson.LessonTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class LessonTablePageData extends AbstractTablePageData {
  private static final long serialVersionUID = 1L;

  @Override
  public LessonTableRowData addRow() {
    return (LessonTableRowData) super.addRow();
  }

  @Override
  public LessonTableRowData addRow(int rowState) {
    return (LessonTableRowData) super.addRow(rowState);
  }

  @Override
  public LessonTableRowData createRow() {
    return new LessonTableRowData();
  }

  @Override
  public Class<? extends AbstractTableRowData> getRowType() {
    return LessonTableRowData.class;
  }

  @Override
  public LessonTableRowData[] getRows() {
    return (LessonTableRowData[]) super.getRows();
  }

  @Override
  public LessonTableRowData rowAt(int index) {
    return (LessonTableRowData) super.rowAt(index);
  }

  public void setRows(LessonTableRowData[] rows) {
    super.setRows(rows);
  }

  public static class LessonTableRowData extends AbstractTableRowData {
    private static final long serialVersionUID = 1L;
    public static final String id = "id";
    public static final String subject = "subject";
    public static final String weekday = "weekday";
    public static final String startTime = "startTime";
    public static final String endTime = "endTime";
    public static final String room = "room";
    private String m_id;
    private String m_subject;
    private String m_weekday;
    private Date m_startTime;
    private Date m_endTime;
    private String m_room;

    public String getId() {
      return m_id;
    }

    public void setId(String newId) {
      m_id = newId;
    }

    public String getSubject() {
      return m_subject;
    }

    public void setSubject(String newSubject) {
      m_subject = newSubject;
    }

    public String getWeekday() {
      return m_weekday;
    }

    public void setWeekday(String newWeekday) {
      m_weekday = newWeekday;
    }

    public Date getStartTime() {
      return m_startTime;
    }

    public void setStartTime(Date newStartTime) {
      m_startTime = newStartTime;
    }

    public Date getEndTime() {
      return m_endTime;
    }

    public void setEndTime(Date newEndTime) {
      m_endTime = newEndTime;
    }

    public String getRoom() {
      return m_room;
    }

    public void setRoom(String newRoom) {
      m_room = newRoom;
    }
  }
}
