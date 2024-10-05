package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aizz implements Runnable {
    public ScheduledFuture a;
    public aryi b;
    public apxf c;
    public arya d;
    public boolean e;
    public final List f;
    final /* synthetic */ ajae g;
    private final String h;
    private final byte[] i;
    private aomf j;
    private final String k;
    private final atxz l;
    private int m;

    public aizz(ajae ajaeVar, ajad ajadVar) {
        this.g = ajaeVar;
        String str = ajadVar.a;
        str.getClass();
        this.h = str;
        this.b = ajadVar.c;
        this.f = new ArrayList();
        this.i = ajadVar.b;
        this.j = ajadVar.f;
        this.l = ajadVar.g;
        this.k = ajadVar.i;
    }

    public final ajag a() {
        azrw azrwVar = new azrw() { // from class: aizy
            @Override // defpackage.azrw
            public final Object get() {
                return Boolean.valueOf(aizz.this.e);
            }
        };
        String str = this.h;
        ajag ajagVar = new ajag();
        ajagVar.a = azrwVar;
        ajagVar.b = str;
        ajagVar.f = this.l;
        return ajagVar;
    }

    public final void b() {
        this.e = true;
        this.m = 0;
        ScheduledFuture scheduledFuture = this.a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.a = null;
        }
        this.f.clear();
    }

    public final boolean c() {
        ScheduledFuture scheduledFuture;
        return (this.e || (scheduledFuture = this.a) == null || scheduledFuture.isDone()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return amkq.b(this.b, ((aizz) obj).b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        aryi aryiVar;
        apxf apxfVar;
        yjk.e();
        if (this.e) {
            return;
        }
        aaxm a = ((ajaa) this.g.b.get()).a();
        a.d(this.h);
        a.m(this.i);
        ajab ajabVar = (ajab) a;
        ajabVar.d = this.f;
        ajabVar.s = this.j;
        ajabVar.t = this.k;
        if (this.g.c.u()) {
            a.c = this.m;
        }
        aigr aigrVar = null;
        r1 = null;
        arya aryaVar = null;
        try {
            arxn b = ((ajaa) this.g.b.get()).b(a);
            boolean z = true;
            this.m++;
            if (b == null || (b.b & 2) == 0) {
                aryiVar = null;
            } else {
                aryiVar = b.d;
                if (aryiVar == null) {
                    aryiVar = aryi.a;
                }
            }
            this.b = aryiVar;
            if (b == null || (b.b & 16) == 0) {
                apxfVar = null;
            } else {
                apxfVar = b.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            }
            this.c = apxfVar;
            if (b != null && (b.b & 64) != 0 && (aryaVar = b.g) == null) {
                aryaVar = arya.a;
            }
            this.d = aryaVar;
            if (b != null && (b.b & 256) != 0) {
                this.j = b.h;
            }
            if (!this.e) {
                ajae ajaeVar = this.g;
                ajag a2 = a();
                a2.c = aryiVar;
                a2.d = this.c;
                a2.e = this.d;
                z = ajaeVar.F(a2.a());
            }
            ajae ajaeVar2 = this.g;
            ajaeVar2.f = ajaeVar2.w(b);
            if (z) {
                ajae ajaeVar3 = this.g;
                ajaeVar3.C(this, ajaeVar3.f);
            }
        } catch (aasx e) {
            Iterator it = this.g.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aigr d = ((ajai) it.next()).d(e);
                if (d != null) {
                    aigrVar = d;
                    break;
                }
            }
            if (aigrVar != null) {
                this.g.D(aigrVar);
            } else {
                ajae ajaeVar4 = this.g;
                ajaeVar4.C(this, ajaeVar4.f);
            }
        }
    }
}
