package com.rcp.editor.commands;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import com.rcp.editor.ui.SimpleEditorInputModel;
import com.rcp.editor.ui.SimpleEditorPart;


public class OpenEditor extends AbstractHandler {
	private static int counter=0;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
        IWorkbenchPage page = window.getActivePage();
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection != null && selection instanceof IStructuredSelection) {
            Object obj = ((IStructuredSelection) selection).getFirstElement();
            if (obj != null) {
            	++counter;
                SimpleEditorInputModel input = new SimpleEditorInputModel(counter);
                try {
                    page.openEditor(input, SimpleEditorPart.ID);
                } catch (PartInitException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return null;
    }
}