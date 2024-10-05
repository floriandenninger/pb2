package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class imu {
    public final ing a;
    public final ifn b;
    public final shf c;
    public final Executor d;
    public final acsw e;
    public final aeeo f;
    public final amnv g;
    public final aioc h;
    public final aaqz i;
    public final afsy j;
    public final ayqw k = new ayqw();
    public imr l;
    public final gfw m;
    public final aoae n;

    public imu(ing ingVar, aoae aoaeVar, ifn ifnVar, shf shfVar, Executor executor, acsw acswVar, aeeo aeeoVar, amnv amnvVar, aioc aiocVar, aaqz aaqzVar, afsy afsyVar, gfw gfwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        aoaeVar.getClass();
        this.n = aoaeVar;
        this.b = ifnVar;
        shfVar.getClass();
        this.c = shfVar;
        executor.getClass();
        this.d = executor;
        acswVar.getClass();
        this.e = acswVar;
        this.a = ingVar;
        aeeoVar.getClass();
        this.f = aeeoVar;
        this.g = amnvVar;
        this.h = aiocVar;
        this.i = aaqzVar;
        this.j = afsyVar;
        this.m = gfwVar;
    }

    public static aigd a(acsx acsxVar, boolean z, boolean z2, afkm afkmVar) {
        aigc a = aigd.a();
        a.a = acsxVar;
        a.f(z);
        a.e(z2);
        if (afkmVar != null) {
            a.b = afkmVar;
        }
        return a.a();
    }

    public static Optional b(haj hajVar, long j, int i) {
        if (i != 2) {
            return Optional.ofNullable(hajVar.c(j));
        }
        return Optional.ofNullable(hajVar.b(j));
    }

    public static void d(haj hajVar, long j, int i, anhh anhhVar) {
        if (i != 2) {
            hajVar.e(j, anhhVar);
        } else {
            hajVar.d(j, anhhVar);
        }
    }

    public static boolean e(aujz aujzVar, String str) {
        return f(aujzVar) && !TextUtils.isEmpty(str);
    }

    public static boolean f(aujz aujzVar) {
        return aujzVar != null && aujzVar.H;
    }

    public static boolean g(aujz aujzVar) {
        return aujzVar != null && aujzVar.i;
    }

    public final void c() {
        imr imrVar = this.l;
        if (imrVar != null) {
            imrVar.d = true;
            Iterator it = imrVar.c.values().iterator();
            while (it.hasNext()) {
                ((imt) it.next()).d();
            }
            imrVar.c.clear();
            this.l = null;
        }
    }
}
