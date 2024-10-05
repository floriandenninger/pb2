package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akrh {
    public final azrw a;
    private final Executor b;
    private final anib c;
    private final aksl d;

    public akrh(azrw azrwVar, Executor executor, anib anibVar, aksl akslVar) {
        this.a = azrwVar;
        this.b = executor;
        this.c = anibVar;
        this.d = akslVar;
    }

    public final void a(akrg akrgVar, Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += bundle.getString(it.next(), "").length();
        }
        ((viw) this.d.q.get()).b(i, new Object[0]);
        akrgVar.a(bundle);
    }

    public final void b(akrg akrgVar) {
        c(null, akrgVar);
    }

    public final void c(String str, final akrg akrgVar) {
        final Bundle bundle = new Bundle();
        Iterator it = ((Set) this.a.get()).iterator();
        while (it.hasNext()) {
            try {
                ((akrj) it.next()).a(str, bundle);
            } catch (Exception e) {
                zga.d("Failed to fill feedback.", e);
            }
        }
        ynm.k(this.c.submit(new Runnable() { // from class: akrf
            @Override // java.lang.Runnable
            public final void run() {
                akrh akrhVar = akrh.this;
                Bundle bundle2 = bundle;
                Iterator it2 = ((Set) akrhVar.a.get()).iterator();
                while (it2.hasNext()) {
                    try {
                        ((akrj) it2.next()).b(bundle2);
                    } catch (Exception e2) {
                        zga.d("Failed to fill feedback.", e2);
                    }
                }
            }
        }), this.b, new ynk() { // from class: akrd
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                akrh akrhVar = akrh.this;
                akrg akrgVar2 = akrgVar;
                Bundle bundle2 = bundle;
                zga.d("Failed to execute all psd fillers.", th);
                akrhVar.a(akrgVar2, bundle2);
            }
        }, new ynl() { // from class: akre
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                akrh.this.a(akrgVar, bundle);
            }
        });
    }
}
