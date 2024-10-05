package defpackage;

import android.content.Context;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.BiPredicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksd {
    public final aksc a;
    private final Context c;
    private final avdx d;
    private final avdo e;
    private int f = -1;
    public float b = -1.0f;

    public aksd(Context context, aadw aadwVar, aksc akscVar) {
        this.c = context;
        this.a = akscVar;
        apwy b = aadwVar.b();
        b = b == null ? apwy.a : b;
        atej atejVar = b.k;
        avdy avdyVar = (atejVar == null ? atej.a : atejVar).x;
        avdx avdxVar = (avdyVar == null ? avdy.a : avdyVar).k;
        this.d = avdxVar == null ? avdx.a : avdxVar;
        atej atejVar2 = b.k;
        avdy avdyVar2 = (atejVar2 == null ? atej.a : atejVar2).x;
        avdo avdoVar = (avdyVar2 == null ? avdy.a : avdyVar2).m;
        this.e = avdoVar == null ? avdo.a : avdoVar;
    }

    public final float a() {
        return this.e.c;
    }

    public final int b() {
        int i = this.f;
        if (i < 0) {
            i = ThreadLocalRandom.current().nextInt(this.e.b);
            this.f = i;
        }
        return i * 1000;
    }

    public final int c() {
        return this.d.f;
    }

    public final int d() {
        return (int) this.d.d;
    }

    public final aksf e() {
        Context context = this.c;
        avdx avdxVar = this.d;
        int i = 0;
        if ((avdxVar.b & 8) != 0 && !avdxVar.e) {
            i = 1;
        }
        return new aksf(i, new aksg(context), new BiPredicate() { // from class: akse
            @Override // j$.util.function.BiPredicate
            public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
                return BiPredicate.CC.$default$and(this, biPredicate);
            }

            @Override // j$.util.function.BiPredicate
            public final /* synthetic */ BiPredicate negate() {
                return BiPredicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.BiPredicate
            public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
                return BiPredicate.CC.$default$or(this, biPredicate);
            }

            @Override // j$.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return false;
            }
        });
    }

    public final int f() {
        if (!this.d.c || d() <= 0) {
            return 1;
        }
        avdo avdoVar = this.e;
        return (avdoVar.c <= 0.0f || avdoVar.b <= 0) ? 2 : 3;
    }
}
