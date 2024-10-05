package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vef implements vcv {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    private vef() {
    }

    public static vef b() {
        return new vef();
    }

    @Override // defpackage.vcv
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final File a(vcu vcuVar) {
        if (this.a) {
            if (!vcuVar.a()) {
                return vcuVar.b.c(vcuVar.f);
            }
            throw new vds("Short circuit would skip transforms.");
        }
        vdp a = vdp.a(veg.b().a(vcuVar));
        try {
            Closeable closeable = a.a;
            if (closeable instanceof vdh) {
                File c = ((vdh) closeable).c();
                a.close();
                return c;
            }
            throw new IOException("Not convertible and fallback to pipe is disabled.");
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void d() {
        this.a = true;
    }
}
