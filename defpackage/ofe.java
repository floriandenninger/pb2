package defpackage;

import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ofe implements fxi, oez {
    public ofa a;
    private final fxj c;
    private final fxh d;
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    public int b = 0;

    public ofe(fxj fxjVar, final ofc ofcVar) {
        this.c = fxjVar;
        this.d = new fxh() { // from class: ofb
            @Override // defpackage.fxh
            public final void e(Configuration configuration) {
                ofc.this.j(configuration);
            }
        };
    }

    public static boolean f(int i) {
        return (i & 2) != 0;
    }

    public static boolean h(int i) {
        return (i & 1) != 0;
    }

    private final void i() {
        boolean z;
        boolean z2;
        ofa ofaVar = this.a;
        int i = 0;
        if (ofaVar != null) {
            z = ofaVar.a;
            z2 = this.c.b;
        } else {
            z = false;
            z2 = false;
        }
        int i2 = this.b;
        if (z2) {
            i = z ? 3 : 1;
        } else if (z) {
            i = 2;
        }
        if (i2 == i) {
            return;
        }
        this.b = i;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ofd) it.next()).e(i2, i);
        }
    }

    @Override // defpackage.fxi
    public final void a() {
        i();
    }

    @Override // defpackage.fxi
    public final void b() {
        i();
    }

    public final void c(oex oexVar) {
        if (this.e.contains(oexVar)) {
            return;
        }
        this.e.add(oexVar);
    }

    public final void d(ofd ofdVar) {
        if (this.f.contains(ofdVar)) {
            return;
        }
        this.f.add(ofdVar);
    }

    public final void e(ofa ofaVar) {
        ofa ofaVar2 = this.a;
        if (ofaVar == ofaVar2) {
            return;
        }
        this.a = ofaVar;
        boolean z = ofaVar2 != null;
        boolean z2 = ofaVar != null;
        if (ofaVar2 != null) {
            ofaVar2.j(this);
        }
        if (ofaVar != null) {
            ofaVar.g(this);
        }
        if (z != z2) {
            if (ofaVar == null) {
                this.c.i(this);
                this.c.h(this.d);
            } else {
                this.c.g(this);
                this.c.f(this.d);
            }
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((oex) it.next()).oY(ofaVar2, ofaVar);
        }
        i();
    }

    @Override // defpackage.oez
    public final void g(ofa ofaVar, int i) {
        if (this.a != ofaVar || (i & 1) == 0) {
            return;
        }
        i();
    }
}
