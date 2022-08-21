package ch.teachu.teachu_admin.shared.schoolclass.subject;

import org.eclipse.scout.rt.shared.services.lookup.ILookupService;
import org.eclipse.scout.rt.shared.services.lookup.LookupCall;

public class SchoolClassSubjectLookupCall extends LookupCall<String> {
  private static final long serialVersionUID = 1L;

  private String schoolClassId;

  public void setSchoolClassId(String schoolClassId) {
    this.schoolClassId = schoolClassId;
  }

  public String getSchoolClassId() {
    return schoolClassId;
  }

  @Override
  protected Class<? extends ILookupService<String>> getConfiguredService() {
    return ISchoolClassSubjectLookupService.class;
  }
}
