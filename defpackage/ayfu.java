package defpackage;

import java.text.MessageFormat;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayfu extends axzq {
    private final ayfv a;

    public ayfu(ayfv ayfvVar, ayof ayofVar) {
        ayfvVar.getClass();
        this.a = ayfvVar;
        ayofVar.getClass();
    }

    public static Level c(int i) {
        int i2 = i - 1;
        return i2 != 2 ? i2 != 3 ? Level.FINEST : Level.FINE : Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.axzq
    public final void a(int i, String str) {
        aybc aybcVar = this.a.c;
        Level c = c(i);
        if (ayfv.a.isLoggable(c)) {
            ayfv.a(aybcVar, c, str);
        }
        d(i);
    }

    @Override // defpackage.axzq
    public final void b(int i, String str, Object... objArr) {
        Level c = c(i);
        d(i);
        a(i, ayfv.a.isLoggable(c) ? MessageFormat.format(str, objArr) : null);
    }
}
