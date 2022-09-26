package ch.teachu.teachu_admin.shared.timetable;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

import javax.annotation.Generated;
import java.util.Date;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "ch.teachu.teachu_admin.client.timetable.TimetableForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class TimetableFormData extends AbstractFormData {
  private static final long serialVersionUID = 1L;

  public From getFrom() {
    return getFieldByClass(From.class);
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

  public To getTo() {
    return getFieldByClass(To.class);
  }

  public static class From extends AbstractValueFieldData<Date> {
    private static final long serialVersionUID = 1L;
  }

  public static class IdProperty extends AbstractPropertyData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class To extends AbstractValueFieldData<Date> {
    private static final long serialVersionUID = 1L;
  }
}
