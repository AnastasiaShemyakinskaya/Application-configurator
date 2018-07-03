package com.rcp.editor.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import  org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class SimpleEditorInputModel implements IEditorInput {
	 private final long id;

	    public SimpleEditorInputModel(long id) {
	        this.id = id;
	    }

	    public long getId() {
	        return id;
	    }
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "MyEditor"; 
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return "Editor";
	}
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        SimpleEditorInputModel other = (SimpleEditorInputModel) obj;
	        if (id != other.id)
	            return false;
	        return true;
	    }
	

}
