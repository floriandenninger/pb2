package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aifk {
    public final aaea a;
    public final aadw b;
    public final axzg c;
    public final axzg d;
    public final axzg e;

    public aifk(aadw aadwVar, aaea aaeaVar, axzg axzgVar, axzg axzgVar2, axzg axzgVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = aadwVar;
        this.a = aaeaVar;
        this.c = axzgVar;
        this.d = axzgVar2;
        this.e = axzgVar3;
    }

    public static boolean B(aaea aaeaVar) {
        return e(aaeaVar).m;
    }

    public static boolean D(aaea aaeaVar) {
        atsh atshVar = d(aaeaVar).d;
        if (atshVar == null) {
            atshVar = atsh.a;
        }
        return atshVar.t;
    }

    public static boolean E(aaea aaeaVar) {
        return e(aaeaVar).q;
    }

    public static atyg F(aadw aadwVar) {
        if (aadwVar == null || aadwVar.b() == null) {
            return null;
        }
        atyg atygVar = aadwVar.b().v;
        return atygVar == null ? atyg.a : atygVar;
    }

    public static boolean G(aadw aadwVar) {
        atyg F = F(aadwVar);
        return F != null && F.m;
    }

    public static boolean H(aadw aadwVar) {
        atyg F = F(aadwVar);
        return F != null && F.n;
    }

    public static boolean I(aadw aadwVar) {
        if (aadwVar == null || aadwVar.b() == null) {
            return false;
        }
        atyg atygVar = aadwVar.b().v;
        if (atygVar == null) {
            atygVar = atyg.a;
        }
        return atygVar.b;
    }

    public static boolean J(aadw aadwVar) {
        if (aadwVar == null || aadwVar.b() == null) {
            return false;
        }
        atyg atygVar = aadwVar.b().v;
        if (atygVar == null) {
            atygVar = atyg.a;
        }
        return atygVar.d;
    }

    public static boolean K(aadw aadwVar) {
        if (aadwVar == null || aadwVar.b() == null) {
            return false;
        }
        atyg atygVar = aadwVar.b().v;
        if (atygVar == null) {
            atygVar = atyg.a;
        }
        return atygVar.c;
    }

    public static boolean L(aadw aadwVar) {
        atyg F = F(aadwVar);
        return F != null && F.g;
    }

    private static apef M(aaea aaeaVar) {
        apef apefVar = e(aaeaVar).d;
        return apefVar == null ? apef.a : apefVar;
    }

    public static int a(aaea aaeaVar) {
        atys e = e(aaeaVar);
        if (e == null) {
            return 0;
        }
        auai auaiVar = e.r;
        if (auaiVar == null) {
            auaiVar = auai.a;
        }
        return auaiVar.b;
    }

    public static long b(aaea aaeaVar, long j) {
        int i = e(aaeaVar).e;
        return i == 0 ? j : i;
    }

    public static long c(aaea aaeaVar) {
        int i = M(aaeaVar).b;
        if (i <= 0) {
            return -1L;
        }
        return i;
    }

    public static atcl d(aaea aaeaVar) {
        if (aaeaVar == null || aaeaVar.a() == null) {
            return atcl.a;
        }
        atcl atclVar = aaeaVar.a().i;
        return atclVar == null ? atcl.a : atclVar;
    }

    public static atys e(aaea aaeaVar) {
        if (aaeaVar == null || aaeaVar.a() == null) {
            return atys.a;
        }
        atys atysVar = aaeaVar.a().j;
        return atysVar == null ? atys.a : atysVar;
    }

    public static boolean g(aaea aaeaVar) {
        apbs apbsVar;
        if (aaeaVar == null || aaeaVar.a() == null) {
            apbsVar = apbs.a;
        } else {
            apbsVar = aaeaVar.a().o;
            if (apbsVar == null) {
                apbsVar = apbs.a;
            }
        }
        return apbsVar != null && apbsVar.n;
    }

    public static boolean i(aaea aaeaVar) {
        atys e = e(aaeaVar);
        return e != null && e.F;
    }

    public static boolean j(aaea aaeaVar) {
        return e(aaeaVar).S;
    }

    public static boolean l(aaea aaeaVar) {
        atcl d = d(aaeaVar);
        if (d == null) {
            return false;
        }
        atcm atcmVar = d.k;
        if (atcmVar == null) {
            atcmVar = atcm.a;
        }
        return atcmVar.c;
    }

    public static boolean m(aaea aaeaVar) {
        atys e = e(aaeaVar);
        return e != null && e.A;
    }

    public static boolean p(aaea aaeaVar) {
        atys e = e(aaeaVar);
        return e != null && e.w;
    }

    public static boolean q(aaea aaeaVar) {
        atys e = e(aaeaVar);
        return e != null && e.u;
    }

    public static boolean r(aaea aaeaVar) {
        atys e = e(aaeaVar);
        return e != null && e.v;
    }

    public static boolean s(aaea aaeaVar) {
        atys e = e(aaeaVar);
        return e != null && e.C;
    }

    public static boolean w(aaea aaeaVar) {
        return M(aaeaVar).b > 0 && M(aaeaVar).c;
    }

    public static boolean z(aaea aaeaVar) {
        return e(aaeaVar).z;
    }

    public final boolean A() {
        atyg F = F(this.b);
        return F != null && F.s;
    }

    public final boolean C() {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ayrz.c((AtomicReference) this.d.a.a.Y(axzc.d).B().ax(new lgx(atomicBoolean, 11)));
        return atomicBoolean.get();
    }

    public final boolean f() {
        atyg F = F(this.b);
        return F != null && F.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h() {
        Boolean bool;
        if (!e(this.a).Q) {
            aqvj aqvjVar = this.d.b.b().C;
            if (aqvjVar == null) {
                aqvjVar = aqvj.a;
            }
            if (aqvjVar.a(45358588L)) {
                aoot aootVar = aqvjVar.b;
                if (!aootVar.containsKey(45358588L)) {
                    throw new IllegalArgumentException();
                }
                aqvk aqvkVar = (aqvk) aootVar.get(45358588L);
                bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
            } else {
                bool = false;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean k() {
        return e(this.a).K;
    }

    public final boolean n(PlaybackStartDescriptor playbackStartDescriptor) {
        if (!TextUtils.isEmpty(playbackStartDescriptor.l()) && playbackStartDescriptor.w()) {
            return e(this.a).U;
        }
        return false;
    }

    public final boolean o() {
        return e(this.a).W;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        Boolean bool;
        aqvj aqvjVar = this.c.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45358801L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45358801L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45358801L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean u() {
        return e(this.a).O;
    }

    public final boolean v() {
        return e(this.a).V;
    }

    public final boolean x() {
        atyg F = F(this.b);
        return F != null && F.r;
    }

    public final boolean y() {
        atyg F = F(this.b);
        return F != null && F.p;
    }
}
