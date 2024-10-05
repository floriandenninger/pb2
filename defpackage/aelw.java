package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aelw {
    public aesa a;
    private final String d;
    private final afgx e;
    private final afeu f;
    public final Object b = new Object();
    public final List c = new ArrayList();
    private final List g = new ArrayList();

    public aelw(afgx afgxVar, String str, afeu afeuVar) {
        this.e = afgxVar;
        this.d = str;
        this.f = afeuVar;
        this.a = d(afgxVar, str);
    }

    private static aesa d(afgx afgxVar, String str) {
        afgs c = afgxVar.c(str);
        if (c == null) {
            return null;
        }
        return aery.b(new Handler(Looper.getMainLooper()), c, aeru.c);
    }

    public final void a() {
        synchronized (this.b) {
            if (this.a != null) {
                return;
            }
            aesa d = d(this.e, this.d);
            this.a = d;
            if (d == null) {
                aelz.g("OnesieQoeReporter: No Qoe Client.");
                return;
            }
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                this.a.e((afih) it.next());
            }
            for (aelv aelvVar : this.c) {
                this.a.j(aelvVar.a, aelvVar.b);
            }
        }
    }

    public final void b(IOException iOException) {
        synchronized (this.b) {
            afih c = this.f.c(afif.ONESIE, iOException, null, null, null, 0L, false, false);
            c.g();
            aesa aesaVar = this.a;
            if (aesaVar != null) {
                aesaVar.e(c);
            } else {
                this.g.add(c);
            }
        }
    }

    public final void c(String str, Exception exc) {
        synchronized (this.b) {
            afih afihVar = new afih(afif.ONESIE, str, 0L, exc);
            afihVar.g();
            aesa aesaVar = this.a;
            if (aesaVar != null) {
                aesaVar.e(afihVar);
            } else {
                this.g.add(afihVar);
            }
        }
    }
}
