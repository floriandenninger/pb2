package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxl implements Closeable {
    private final axkz a;
    private final axlg b;
    private volatile boolean c;
    private final ArrayList d;

    vxl() {
        this.c = false;
        this.d = new ArrayList();
        this.a = null;
        this.b = null;
        this.c = true;
    }

    public final deg a() {
        deg c;
        synchronized (this.d) {
            if (this.c) {
                throw new IOException("Unable to build container with closed resources");
            }
            c = this.b.c(this.a);
        }
        return c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (!this.c) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    try {
                        ((Closeable) it.next()).close();
                    } catch (IOException e) {
                        vtv.c("Exception while closing resource", e);
                    }
                }
                this.d.clear();
                this.c = true;
            }
        }
    }

    public vxl(axkz axkzVar, axlg axlgVar, List list) {
        this.c = false;
        this.d = new ArrayList();
        this.b = axlgVar;
        this.a = axkzVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Closeable closeable = (Closeable) it.next();
            closeable.getClass();
            this.d.add(closeable);
        }
    }
}
