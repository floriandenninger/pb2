package defpackage;

import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xnf implements xql {
    public String a;
    public Long b;
    private final WeakReference c;
    private final bv d;
    private final xpa e;
    private final akbz f;
    private final aahd g;

    public xnf(xng xngVar, bv bvVar, xpa xpaVar, akbz akbzVar, aahd aahdVar) {
        this.c = new WeakReference(xngVar);
        bvVar.getClass();
        this.d = bvVar;
        this.e = xpaVar;
        akbzVar.getClass();
        this.f = akbzVar;
        aahdVar.getClass();
        this.g = aahdVar;
    }

    @Override // defpackage.xql
    public final Long a() {
        return this.b;
    }

    @Override // defpackage.xql
    public final String b() {
        return this.a;
    }

    @Override // defpackage.xql
    public final void c(cnq cnqVar) {
        xng xngVar = (xng) this.c.get();
        if (xngVar == null) {
            return;
        }
        whu.K(xngVar.a, R.string.error_post_failed, 1);
    }

    @Override // defpackage.xql
    public final void d(armi armiVar) {
        xpa xpaVar;
        apyv apyvVar;
        if (((xng) this.c.get()) == null) {
            return;
        }
        this.d.kv();
        arlj arljVar = armiVar.f;
        if (arljVar == null) {
            arljVar = arlj.a;
        }
        if ((arljVar.b & 4) != 0) {
            akca m = this.f.m();
            arlj arljVar2 = armiVar.f;
            if (arljVar2 == null) {
                arljVar2 = arlj.a;
            }
            aqyg aqygVar = arljVar2.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            m.k(ajcq.b(aqygVar));
            this.f.o(m.b());
        }
        armj armjVar = armiVar.d;
        if (armjVar == null) {
            armjVar = armj.a;
        }
        if (armjVar.b == 62285947 && (xpaVar = this.e) != null) {
            armj armjVar2 = armiVar.d;
            if (armjVar2 == null) {
                armjVar2 = armj.a;
            }
            if (armjVar2.b == 62285947) {
                apyvVar = (apyv) armjVar2.c;
            } else {
                apyvVar = apyv.a;
            }
            xpaVar.e(apyvVar);
        }
        this.g.b(armiVar.e);
    }
}
