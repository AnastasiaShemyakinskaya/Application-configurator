package com.rcp.editor.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
public class SimpleEditorPart extends EditorPart {
	public static final String ID = "com.rcp.editor.editor1";
	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
	}
	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        setSite(site);
        setInput(input);
        setPartName("First File");
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void createPartControl(Composite parent) {
		    FillLayout layout = new FillLayout(SWT.VERTICAL);
	        parent.setLayout(layout);   
	        Text text = new Text(parent, SWT.BORDER);
	        text.setText("Write Something");
	        text.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
