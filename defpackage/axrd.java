package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axrd {
    private final File a;
    private final List b;

    public axrd() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        this.a = file;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.b = new ArrayList();
    }

    public final void a() {
        for (axrc axrcVar : this.b) {
            try {
                axrm.l(axrcVar.b);
            } catch (Exception e) {
                axrm.h.log(Level.WARNING, "could not delete file ", (Throwable) e);
            }
            if (!axrcVar.a.delete()) {
                throw new Exception("could not delete temporary file");
                break;
            }
        }
        this.b.clear();
    }

    public final axrc b() {
        axrc axrcVar = new axrc(this.a);
        this.b.add(axrcVar);
        return axrcVar;
    }
}
