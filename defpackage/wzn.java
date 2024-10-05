package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wzn {
    public final wyz a;
    public final ysy b;
    public final ywr c;
    public final azrw d;
    public final zbw e;
    public final aifw f;
    public final long g;
    public anhy h;
    public final aigv i;
    private final shf j;

    public wzn(wzm wzmVar) {
        this.a = wzmVar.a;
        shf shfVar = wzmVar.b;
        this.j = shfVar;
        this.b = wzmVar.c;
        ywr ywrVar = wzmVar.d;
        this.c = ywrVar;
        this.d = wzmVar.e;
        this.e = wzmVar.f;
        this.i = wzmVar.h;
        this.f = wzmVar.g;
        this.g = shfVar.c();
        this.h = anfq.h(ywrVar.a(), new amml() { // from class: wzl
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                return Long.valueOf(Math.min(wzn.this.g, ((awum) obj).c));
            }
        }, angq.a);
    }

    public static /* synthetic */ void c(Throwable th) {
        zga.d("Error while updating ads schema", th);
    }

    public final int a() {
        long b = b();
        if (b <= 0) {
            return 0;
        }
        double c = this.j.c() - b;
        Double.isNaN(c);
        long ceil = (long) Math.ceil(c / 1000.0d);
        if (ceil > 2147483647L || ceil <= 0) {
            return 0;
        }
        return (int) ceil;
    }

    public final long b() {
        try {
            return ((Long) this.h.get()).longValue();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return this.g;
        } catch (ExecutionException e) {
            zga.n("Failed to read last ads timestamp.", e);
            return this.g;
        }
    }
}
