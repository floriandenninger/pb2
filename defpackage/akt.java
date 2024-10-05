package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akt {
    public static final ThreadLocal a = new ThreadLocal();
    public final aeg b = new aeg();
    final ArrayList c = new ArrayList();
    public final akp d = new akp(this);
    public final Runnable e = new Runnable() { // from class: ako
        @Override // java.lang.Runnable
        public final void run() {
            akp akpVar = akt.this.d;
            akpVar.a.f = SystemClock.uptimeMillis();
            akt aktVar = akpVar.a;
            long j = aktVar.f;
            long uptimeMillis = SystemClock.uptimeMillis();
            for (int i = 0; i < aktVar.c.size(); i++) {
                akq akqVar = (akq) aktVar.c.get(i);
                if (akqVar != null) {
                    Long l = (Long) aktVar.b.get(akqVar);
                    if (l != null) {
                        if (l.longValue() < uptimeMillis) {
                            aktVar.b.remove(akqVar);
                        }
                    }
                    akqVar.a(j);
                }
            }
            if (aktVar.g) {
                int size = aktVar.c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (aktVar.c.get(size) == null) {
                        aktVar.c.remove(size);
                    }
                }
                aktVar.g = false;
            }
            if (akpVar.a.c.size() > 0) {
                akt aktVar2 = akpVar.a;
                aktVar2.h.a(aktVar2.e);
            }
        }
    };
    long f = 0;
    public boolean g = false;
    public final aks h;

    public akt(aks aksVar) {
        this.h = aksVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return Thread.currentThread() == this.h.a.getThread();
    }
}
