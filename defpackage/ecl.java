package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ecl implements Callable {
    protected final ebe a;
    protected final String b;
    protected final String c;
    protected Method d;
    protected final int e;
    protected final int f;
    protected final aone g;

    public ecl(ebe ebeVar, String str, String str2, aone aoneVar, int i, int i2) {
        getClass().getSimpleName();
        this.a = ebeVar;
        this.b = str;
        this.c = str2;
        this.g = aoneVar;
        this.e = i;
        this.f = i2;
    }

    protected abstract void a();

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        kt();
        return null;
    }

    public void kt() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method c = this.a.c(this.b, this.c);
            this.d = c;
            if (c == null) {
                return;
            }
            a();
            eac eacVar = this.a.k;
            if (eacVar == null || (i = this.e) == Integer.MIN_VALUE) {
                return;
            }
            eacVar.a(this.f, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
