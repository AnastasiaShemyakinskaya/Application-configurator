package com.rcp.editor.application;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import com.rcp.editor.ui.ApplicationActionBarAdvisor;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	@Override
    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		return new WorkbenchWindowAdvisor(configurer) {
			@Override
            public void preWindowOpen() {
				super.preWindowOpen();
				IWorkbenchWindowConfigurer wc= getWindowConfigurer();
				wc.setTitle("MyEditor");
				wc.setInitialSize(new Point(600, 450));
				wc.setShowCoolBar(true);
				wc.setShowStatusLine(true);
			}

			@Override
            public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer abConfigurer) {
				return new ApplicationActionBarAdvisor(abConfigurer);
			}
		};
	}
	@Override
	public String getInitialWindowPerspectiveId() {
		return "com.rcp.editor.perspective";
	}

}


