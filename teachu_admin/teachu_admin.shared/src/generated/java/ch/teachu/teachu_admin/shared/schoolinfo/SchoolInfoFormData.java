package ch.teachu.teachu_admin.shared.schoolinfo;

import org.eclipse.scout.rt.platform.resource.BinaryResource;
import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

import javax.annotation.Generated;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "ch.teachu.teachu_admin.client.schoolinfo.SchoolInfoForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class SchoolInfoFormData extends AbstractFormData {
    private static final long serialVersionUID = 1L;

  public Active getActive() {
    return getFieldByClass(Active.class);
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

  /**
   * access method for property Image.
   */
  public byte[] getImage() {
    return getImageProperty().getValue();
  }

  /**
   * access method for property Image.
   */
  public void setImage(byte[] image) {
    getImageProperty().setValue(image);
  }

  public ImageProperty getImageProperty() {
    return getPropertyByClass(ImageProperty.class);
  }

  public Important getImportant() {
    return getFieldByClass(Important.class);
  }

  public Message getMessage() {
    return getFieldByClass(Message.class);
  }

  public Pinned getPinned() {
    return getFieldByClass(Pinned.class);
  }

  public Title getTitle() {
    return getFieldByClass(Title.class);
  }

  public Upload getUpload() {
    return getFieldByClass(Upload.class);
  }

  public static class Active extends AbstractValueFieldData<Boolean> {
    private static final long serialVersionUID = 1L;
  }

  public static class IdProperty extends AbstractPropertyData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class ImageProperty extends AbstractPropertyData<byte[]> {
    private static final long serialVersionUID = 1L;
  }

  public static class Important extends AbstractValueFieldData<Boolean> {
    private static final long serialVersionUID = 1L;
  }

  public static class Message extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Pinned extends AbstractValueFieldData<Boolean> {
    private static final long serialVersionUID = 1L;
  }

  public static class Title extends AbstractValueFieldData<String> {
    private static final long serialVersionUID = 1L;
  }

  public static class Upload extends AbstractValueFieldData<BinaryResource> {
    private static final long serialVersionUID = 1L;
  }
}
