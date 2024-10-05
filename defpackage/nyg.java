package defpackage;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nyg implements nwy {
    public final Map a;
    public int b;
    public Rect c = new Rect();
    private final aypn d;
    private final aypn e;

    public nyg(nuv nuvVar, Map map) {
        this.a = map;
        final int i = 1;
        this.d = nuvVar.a.M(new ayrv(this) { // from class: nyf
            public final /* synthetic */ nyg a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                if (i == 0) {
                    nwy nwyVar = (nwy) this.a.a.get((nuu) obj);
                    nwyVar.getClass();
                    return nwyVar.c();
                }
                nwy nwyVar2 = (nwy) this.a.a.get((nuu) obj);
                nwyVar2.getClass();
                return nwyVar2.d();
            }
        }).h(ntu.m);
        final int i2 = 0;
        this.e = nuvVar.a.M(new ayrv(this) { // from class: nyf
            public final /* synthetic */ nyg a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                if (i2 == 0) {
                    nwy nwyVar = (nwy) this.a.a.get((nuu) obj);
                    nwyVar.getClass();
                    return nwyVar.c();
                }
                nwy nwyVar2 = (nwy) this.a.a.get((nuu) obj);
                nwyVar2.getClass();
                return nwyVar2.d();
            }
        }).h(ntu.m);
    }

    @Override // defpackage.nwy
    public final int a() {
        return this.b;
    }

    @Override // defpackage.nwy
    public final Rect b() {
        return this.c;
    }

    @Override // defpackage.nwy
    public final aypn c() {
        return this.e;
    }

    @Override // defpackage.nwy
    public final aypn d() {
        return this.d;
    }

    @Override // defpackage.nwy
    public final void e() {
        Iterator<E> it = ((amrz) this.a).values().iterator();
        while (it.hasNext()) {
            ((nwy) it.next()).e();
        }
        final int i = 0;
        this.d.X(new ayrs(this) { // from class: nye
            public final /* synthetic */ nyg a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.c = (Rect) obj;
                } else {
                    this.a.b = ((Integer) obj).intValue();
                }
            }
        });
        final int i2 = 1;
        this.e.X(new ayrs(this) { // from class: nye
            public final /* synthetic */ nyg a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.c = (Rect) obj;
                } else {
                    this.a.b = ((Integer) obj).intValue();
                }
            }
        });
    }
}
