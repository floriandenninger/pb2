package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abhm extends ajtz {
    public boolean a;
    public boolean b;
    final /* synthetic */ abht c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abhm(abht abhtVar, aasm aasmVar, ypa ypaVar, final zaw zawVar, acra acraVar) {
        super(aasmVar, ypaVar, zawVar, acraVar);
        this.c = abhtVar;
        this.E = new ajtt() { // from class: abhk
            @Override // defpackage.ajtt
            public final void a(cnq cnqVar, final ajce ajceVar) {
                final abhm abhmVar = abhm.this;
                zaw zawVar2 = zawVar;
                abjp o = abhmVar.c.o();
                if (o != null) {
                    o.z(zawVar2.b(cnqVar), new Runnable() { // from class: abhl
                        @Override // java.lang.Runnable
                        public final void run() {
                            abhm.this.lt(ajceVar);
                        }
                    });
                }
                abhu abhuVar = abhmVar.c.w;
                if (abhuVar != null) {
                    abhuVar.f();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final asra l(aulp aulpVar) {
        if (aulpVar == null || !aulpVar.pY(asra.b)) {
            return null;
        }
        return (asra) aulpVar.pX(asra.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(asra asraVar) {
        this.c.t(asraVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ void lB(Object obj, ajcd ajcdVar) {
        k((asra) obj);
    }

    @Override // defpackage.ajtz
    protected final boolean lq() {
        return false;
    }

    @Override // defpackage.ajtz
    protected final void ls(aaqh aaqhVar, ajts ajtsVar) {
        if (aaqhVar instanceof aayy) {
            aayy aayyVar = (aayy) aaqhVar;
            if (this.a) {
                aayyVar.d = true;
            }
            if (this.b) {
                aayyVar.s = true;
            }
            abht abhtVar = this.c;
            if (abhtVar.v && !abhtVar.u) {
                aayyVar.c = true;
            }
            abhtVar.v = false;
            if (ajtsVar.a) {
                aayyVar.t = true;
            }
        }
    }

    @Override // defpackage.ajtz
    public final void lu(List list) {
        super.lu(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] d = ((ajce) it.next()).d();
            if (d != null) {
                this.c.q.mM().D(new acqx(d));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ Object nn(aulp aulpVar) {
        return l(aulpVar);
    }
}
