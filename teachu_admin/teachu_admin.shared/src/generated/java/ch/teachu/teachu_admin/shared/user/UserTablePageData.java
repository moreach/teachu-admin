package ch.teachu.teachu_admin.shared.user;

import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.page.AbstractTablePageData;

import javax.annotation.Generated;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "ch.teachu.teachu_admin.client.user.UserTablePage", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class UserTablePageData extends AbstractTablePageData {
  private static final long serialVersionUID = 1L;

  @Override
  public UserTableRowData addRow() {
    return (UserTableRowData) super.addRow();
  }

  @Override
  public UserTableRowData addRow(int rowState) {
    return (UserTableRowData) super.addRow(rowState);
  }

  @Override
  public UserTableRowData createRow() {
    return new UserTableRowData();
  }

  @Override
  public Class<? extends AbstractTableRowData> getRowType() {
    return UserTableRowData.class;
  }

  @Override
  public UserTableRowData[] getRows() {
    return (UserTableRowData[]) super.getRows();
  }

  @Override
  public UserTableRowData rowAt(int index) {
    return (UserTableRowData) super.rowAt(index);
  }

  public void setRows(UserTableRowData[] rows) {
    super.setRows(rows);
  }

  public static class UserTableRowData extends AbstractTableRowData {
    private static final long serialVersionUID = 1L;
    public static final String id = "id";
    public static final String firstName = "firstName";
    public static final String lastName = "lastName";
    public static final String email = "email";
    public static final String active = "active";
    public static final String role = "role";
    private Object m_id;
    private String m_firstName;
    private String m_lastName;
    private String m_email;
    private Boolean m_active;
    private String m_role;

    public Object getId() {
      return m_id;
    }

    public void setId(Object newId) {
      m_id = newId;
    }

    public String getFirstName() {
      return m_firstName;
    }

    public void setFirstName(String newFirstName) {
      m_firstName = newFirstName;
    }

    public String getLastName() {
      return m_lastName;
    }

    public void setLastName(String newLastName) {
      m_lastName = newLastName;
    }

    public String getEmail() {
      return m_email;
    }

    public void setEmail(String newEmail) {
      m_email = newEmail;
    }

    public Boolean getActive() {
      return m_active;
    }

    public void setActive(Boolean newActive) {
      m_active = newActive;
    }

    public String getRole() {
      return m_role;
    }

    public void setRole(String newRole) {
      m_role = newRole;
    }
  }
}
