package ch.teachu.teachu_admin.shared.exam;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

import javax.annotation.Generated;
import java.math.BigDecimal;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "ch.teachu.teachu_admin.client.exam.ExamForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ExamFormData extends AbstractFormData {
  private static final long serialVersionUID = 1L;

  public Date getDate() {
    return getFieldByClass(Date.class);
  }

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

  public Name getName() {
    return getFieldByClass(Name.class);
  }

  public SchoolClass getSchoolClass() {
    return getFieldByClass(SchoolClass.class);
  }

  /**
   * access method for property SchoolClassSubjectId.
   */
  public String getSchoolClassSubjectId() {
    return getSchoolClassSubjectIdProperty().getValue();
  }

  /**
   * access method for property SchoolClassSubjectId.
   */
  public void setSchoolClassSubjectId(String schoolClassSubjectId) {
    getSchoolClassSubjectIdProperty().setValue(schoolClassSubjectId);
  }

  public SchoolClassSubjectIdProperty getSchoolClassSubjectIdProperty() {
    return getPropertyByClass(SchoolClassSubjectIdProperty.class);
  }

  public Subject getSubject() {
    return getFieldByClass(Subject.class);
  }

  public ViewDate getViewDate() {
    return getFieldByClass(ViewDate.class);
  }

  public Weight getWeight() {
    return getFieldByClass(Weight.class);
  }

  public static class Date extends AbstractValueFieldData<java.util.Date> {
    private static final long serialVersionUID = 1L;
  }

  public static class Description extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class IdProperty extends AbstractPropertyData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Name extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class SchoolClass extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class SchoolClassSubjectIdProperty extends AbstractPropertyData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Subject extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class ViewDate extends AbstractValueFieldData<java.util.Date> {
    private static final long serialVersionUID = 1L;
  }

  public static class Weight extends AbstractValueFieldData<BigDecimal> {
    private static final long serialVersionUID = 1L;
  }
}
