package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class upw {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    private final amnp d;
    private volatile Process e;
    public volatile boolean c = false;
    public final amml b = new amml() { // from class: upv
        @Override // defpackage.amml
        public final Object apply(Object obj) {
            try {
                return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
            } catch (IOException unused) {
                upw.this.c = true;
                return null;
            }
        }
    };

    public upw(amob amobVar) {
        this.d = amnp.d(amobVar);
    }

    public final void a(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (this.e != null) {
            try {
                if (this.e.exitValue() != 0) {
                    this.c = true;
                    this.e = null;
                }
            } catch (IllegalThreadStateException unused) {
                return;
            }
        }
        if (this.c) {
            return;
        }
        synchronized (this) {
            amnp amnpVar = this.d;
            if (amnpVar.a && amnpVar.a(TimeUnit.MILLISECONDS) < a) {
                return;
            }
            this.d.e();
            this.d.f();
            this.e = (Process) this.b.apply(str);
        }
    }
}
