package org.nohope.akka;

import java.io.Serializable;

/**
 * Date: 9/4/12
 * Time: 12:00 PM
 */
public class NamedWorkerMetadata implements Serializable {
    private static final long serialVersionUID = 1L;

    private String identifier;

    private Object data;

    public NamedWorkerMetadata() {
    }

    public NamedWorkerMetadata(final String identifier, final Object data) {
        this.identifier = identifier;
        this.data = data;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setData(final Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        return obj instanceof NamedWorkerMetadata && ((NamedWorkerMetadata) obj).identifier.equals(identifier);

    }
}
