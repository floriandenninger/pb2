package defpackage;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbx {
    public final int a;
    public final CopyOnWriteArrayList b;
    public final ash c;

    private bbx(CopyOnWriteArrayList copyOnWriteArrayList, int i, ash ashVar) {
        this.b = copyOnWriteArrayList;
        this.a = i;
        this.c = ashVar;
    }

    public bbx(byte[] bArr) {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public static final void j(long j) {
        plh.d(j);
    }

    public final void a(Handler handler, bby bbyVar) {
        pse.c(bbyVar);
        this.b.add(new bbw(handler, bbyVar));
    }

    public final void b(final bbn bbnVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            bbw bbwVar = (bbw) it.next();
            final bby bbyVar = bbwVar.b;
            pts.ar(bbwVar.a, new Runnable() { // from class: bbu
                @Override // java.lang.Runnable
                public final void run() {
                    bbx bbxVar = bbx.this;
                    bbyVar.J(bbxVar.a, bbxVar.c, bbnVar);
                }
            });
        }
    }

    public final void c(int i, pms pmsVar, int i2, Object obj, long j) {
        j(j);
        b(new bbn(i, pmsVar, i2, obj));
    }

    public final void d(bbi bbiVar, bbn bbnVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            bbw bbwVar = (bbw) it.next();
            pts.ar(bbwVar.a, new bbs(this, bbwVar.b, bbiVar, bbnVar, 1));
        }
    }

    public final void e(bbi bbiVar, bbn bbnVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            bbw bbwVar = (bbw) it.next();
            pts.ar(bbwVar.a, new bbs(this, bbwVar.b, bbiVar, bbnVar, 0));
        }
    }

    public final void f(final bbi bbiVar, final bbn bbnVar, final IOException iOException, final boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            bbw bbwVar = (bbw) it.next();
            final bby bbyVar = bbwVar.b;
            pts.ar(bbwVar.a, new Runnable() { // from class: bbt
                @Override // java.lang.Runnable
                public final void run() {
                    bbx bbxVar = bbx.this;
                    bbyVar.S(bbxVar.a, bbxVar.c, bbiVar, bbnVar, iOException, z);
                }
            });
        }
    }

    public final void g(bbi bbiVar, bbn bbnVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            bbw bbwVar = (bbw) it.next();
            pts.ar(bbwVar.a, new bbs(this, bbwVar.b, bbiVar, bbnVar, 2));
        }
    }

    public final void h(final bbn bbnVar) {
        final ash ashVar = this.c;
        pse.c(ashVar);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            bbw bbwVar = (bbw) it.next();
            final bby bbyVar = bbwVar.b;
            pts.ar(bbwVar.a, new Runnable() { // from class: bbv
                @Override // java.lang.Runnable
                public final void run() {
                    bbx bbxVar = bbx.this;
                    bbyVar.U(bbxVar.a, ashVar, bbnVar);
                }
            });
        }
    }

    public final bbx i(int i, ash ashVar) {
        return new bbx(this.b, i, ashVar);
    }

    public final void k(bbi bbiVar, int i, pms pmsVar, int i2, Object obj, long j, long j2) {
        j(j);
        j(j2);
        d(bbiVar, new bbn(i, pmsVar, i2, obj));
    }

    public final void l(bbi bbiVar, int i, pms pmsVar, int i2, Object obj, long j, long j2) {
        j(j);
        j(j2);
        e(bbiVar, new bbn(i, pmsVar, i2, obj));
    }

    public final void m(bbi bbiVar, int i, pms pmsVar, int i2, Object obj, long j, long j2, IOException iOException, boolean z) {
        j(j);
        j(j2);
        f(bbiVar, new bbn(i, pmsVar, i2, obj), iOException, z);
    }

    public final void n(bbi bbiVar, int i, pms pmsVar, int i2, Object obj, long j, long j2) {
        j(j);
        j(j2);
        g(bbiVar, new bbn(i, pmsVar, i2, obj));
    }

    public final void o(Handler handler, aym aymVar) {
        pse.c(aymVar);
        this.b.add(new ayl(handler, aymVar));
    }

    public final void p() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ayl aylVar = (ayl) it.next();
            pts.ar(aylVar.a, new ayi(this, aylVar.b, 1, null));
        }
    }

    public final void q() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ayl aylVar = (ayl) it.next();
            pts.ar(aylVar.a, new ayi(this, aylVar.b, 0, null));
        }
    }

    public final void r() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ayl aylVar = (ayl) it.next();
            pts.ar(aylVar.a, new ayi(this, aylVar.b, 2, null));
        }
    }

    public final void s(final int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ayl aylVar = (ayl) it.next();
            final aym aymVar = aylVar.b;
            final byte[] bArr = null;
            pts.ar(aylVar.a, new Runnable(aymVar, i, bArr) { // from class: ayj
                public final /* synthetic */ aym a;
                public final /* synthetic */ int b;

                @Override // java.lang.Runnable
                public final void run() {
                    bbx bbxVar = bbx.this;
                    aym aymVar2 = this.a;
                    int i2 = this.b;
                    aymVar2.Z();
                    aymVar2.N(bbxVar.a, bbxVar.c, i2);
                }
            });
        }
    }

    public final void t(final Exception exc) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ayl aylVar = (ayl) it.next();
            final aym aymVar = aylVar.b;
            final byte[] bArr = null;
            pts.ar(aylVar.a, new Runnable(aymVar, exc, bArr) { // from class: ayk
                public final /* synthetic */ aym a;
                public final /* synthetic */ Exception b;

                @Override // java.lang.Runnable
                public final void run() {
                    bbx bbxVar = bbx.this;
                    this.a.O(bbxVar.a, bbxVar.c, this.b);
                }
            });
        }
    }

    public final void u() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ayl aylVar = (ayl) it.next();
            pts.ar(aylVar.a, new ayi(this, aylVar.b, 3, null));
        }
    }

    public final bbx v(int i, ash ashVar) {
        return new bbx(this.b, i, ashVar);
    }

    public bbx() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
