package ch.teachu.teachu_admin.client.admin;

import ch.teachu.teachu_admin.client.schoolconfig.SchoolConfigTablePage;
import ch.teachu.teachu_admin.client.user.UserTablePage;
import ch.teachu.teachu_admin.shared.AdminPermission;
import ch.teachu.teachu_admin.shared.Icons;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.text.TEXTS;
import org.eclipse.scout.rt.security.ACCESS;

import java.util.List;

@Order(1000)
public class AdminOutline extends AbstractOutline {

  @Override
  protected void execCreateChildPages(List<IPage<?>> pageList) {
    super.execCreateChildPages(pageList);
    pageList.add(new UserTablePage());
    pageList.add(new SchoolConfigTablePage());
  }

  @Override
  protected String getConfiguredTitle() {
    return TEXTS.get("Admin");
  }

  @Override
  protected String getConfiguredIconId() {
    return Icons.Pencil;
  }

  @Override
  protected boolean getConfiguredVisible() {
    return ACCESS.check(new AdminPermission());
  }
}
