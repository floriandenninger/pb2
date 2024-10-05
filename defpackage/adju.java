package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adju {
    public final adko a;
    public final Set b;
    public final Set c;
    final Set d;
    public final Set e;
    public final Set f;
    public adjr g;
    public final Set h;
    private final adka j;
    private final adch k;
    private final adlt l;
    private final acue m;
    private ayqx o;
    private int n = 0;
    private final Handler i = new Handler(Looper.getMainLooper());

    public adju(SharedPreferences sharedPreferences, adko adkoVar, acun acunVar, Set set, Set set2, adch adchVar, adlt adltVar, shf shfVar, acue acueVar, ammr ammrVar, byte[] bArr) {
        this.a = adkoVar;
        this.k = adchVar;
        this.l = adltVar;
        this.m = acueVar;
        Set a = adjv.a(set);
        this.b = a;
        this.c = adjv.b(set2);
        this.d = new HashSet();
        sharedPreferences.getClass();
        this.j = new adka(sharedPreferences, a, acunVar.d, shfVar);
        this.h = new HashSet();
        this.e = adjv.a(new HashSet(ammrVar.n()));
        this.f = adjv.b(new HashSet(ammrVar.o()));
        this.o = e();
    }

    private final ayqx e() {
        return this.m.l().ax(new ayrs() { // from class: adjt
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                adju adjuVar = adju.this;
                Boolean bool = (Boolean) obj;
                String.valueOf(String.valueOf(bool)).length();
                if (bool.booleanValue()) {
                    adjuVar.b.addAll(adjuVar.e);
                    adjuVar.c.addAll(adjuVar.f);
                } else {
                    adjuVar.b.removeAll(adjuVar.e);
                    adjuVar.c.removeAll(adjuVar.f);
                }
            }
        });
    }

    public final void a(adjm adjmVar) {
        this.d.add(adjmVar);
    }

    public final synchronized void b() {
        if (this.o.e()) {
            this.o = e();
        }
        if (this.n == 0) {
            this.g = new adjr(this.i, this.j, this.b, this.c, this.d, this.k, this.l, this.a.l.B());
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                this.g.b((kib) it.next());
            }
        }
        this.n++;
    }

    public final synchronized void c() {
        ayrz.c((AtomicReference) this.o);
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            adjr adjrVar = this.g;
            synchronized (adjrVar.k) {
                adjm adjmVar = adjrVar.j;
                if (adjmVar != null) {
                    adjmVar.c();
                    adjrVar.j = null;
                }
            }
            adjrVar.a();
            ayrz.c((AtomicReference) adjrVar.h);
            this.g = null;
        }
    }

    public final void d() {
        this.d.clear();
    }
}
