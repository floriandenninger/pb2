package defpackage;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
class amws implements Serializable {
    private static final long serialVersionUID = 0;
    final Object f;
    final Object g;

    public amws(Object obj, Object obj2) {
        obj.getClass();
        this.f = obj;
        this.g = obj2 == null ? this : obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.g) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final String toString() {
        String obj;
        synchronized (this.g) {
            obj = this.f.toString();
        }
        return obj;
    }
}
