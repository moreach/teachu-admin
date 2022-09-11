package ch.teachu.teachu_admin.shared.chatgroup;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.fields.tablefield.AbstractTableFieldBeanData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

import javax.annotation.Generated;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "ch.teachu.teachu_admin.client.chatgroup.ChatGroupForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ChatGroupFormData extends AbstractFormData {
  private static final long serialVersionUID = 1L;

  public Description getDescription() {
    return getFieldByClass(Description.class);
  }

  /**
   * access method for property Id.
   */
  public String getId() {
    return getIdProperty().getValue();
  }

  /**
   * access method for property Id.
   */
  public void setId(String id) {
    getIdProperty().setValue(id);
  }

  public IdProperty getIdProperty() {
    return getPropertyByClass(IdProperty.class);
  }

  public Members getMembers() {
    return getFieldByClass(Members.class);
  }

  public Title getTitle() {
    return getFieldByClass(Title.class);
  }

  public static class Description extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class IdProperty extends AbstractPropertyData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Members extends AbstractTableFieldBeanData {
    private static final long serialVersionUID = 1L;

    @Override
    public MembersRowData addRow() {
      return (MembersRowData) super.addRow();
    }

    @Override
    public MembersRowData addRow(int rowState) {
      return (MembersRowData) super.addRow(rowState);
    }

    @Override
    public MembersRowData createRow() {
      return new MembersRowData();
    }

    @Override
    public Class<? extends AbstractTableRowData> getRowType() {
      return MembersRowData.class;
    }

    @Override
    public MembersRowData[] getRows() {
      return (MembersRowData[]) super.getRows();
    }

    @Override
    public MembersRowData rowAt(int index) {
      return (MembersRowData) super.rowAt(index);
    }

    public void setRows(MembersRowData[] rows) {
      super.setRows(rows);
    }

    public static class MembersRowData extends AbstractTableRowData {
      private static final long serialVersionUID = 1L;
      public static final String name = "name";
      private String m_name;

      public String getName() {
        return m_name;
      }

      public void setName(String newName) {
        m_name = newName;
      }
    }
  }

  public static class Title extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }
}