package defpackage;

import android.os.Build;
import java.lang.ref.Reference;
import java.util.UUID;
import org.chromium.net.CellularSignalStrengthError;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amii extends amhg {
    private final amjx c;
    private final amih d;
    private final shf e;
    private final int f;
    private final boolean g;

    private amii(amjx amjxVar, amii amiiVar) {
        super(amjxVar.a, amiiVar, amjxVar.c);
        this.c = amjxVar;
        this.d = amiiVar.d;
        this.e = amiiVar.e;
        this.f = amiiVar.f;
        this.g = amiiVar.g;
    }

    private final int h() {
        return ((int) (this.g ? this.e.g() : this.e.d())) - this.f;
    }

    public final int d() {
        return this.c.d;
    }

    public final amjm e() {
        return ((amjz) this.d).a().d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        return new defpackage.amii(r3, r4);
     */
    @Override // defpackage.amir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.amir f(java.lang.String r5, defpackage.amip r6) {
        /*
            r4 = this;
            amih r0 = r4.d
            amjx r1 = r4.c
            int r2 = r4.h()
            amjx r3 = new amjx
            r3.<init>(r1, r5, r2, r6)
        Ld:
            r5 = r0
            amjz r5 = (defpackage.amjz) r5
            java.util.concurrent.atomic.AtomicReference r6 = r5.c
            java.lang.Object r6 = r6.get()
            amjx r6 = (defpackage.amjx) r6
            int r1 = r6.d
            int r1 = r1 + 1
            r2 = 500(0x1f4, float:7.0E-43)
            if (r1 < r2) goto L37
            r5 = -1
            r6 = 0
            r3.b(r5, r6)
            monitor-enter(r0)
            r5 = r0
            amjz r5 = (defpackage.amjz) r5     // Catch: java.lang.Throwable -> L34
            int r5 = r5.e     // Catch: java.lang.Throwable -> L34
            int r5 = r5 + 1
            r6 = r0
            amjz r6 = (defpackage.amjz) r6     // Catch: java.lang.Throwable -> L34
            r6.e = r5     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            goto L42
        L34:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r5
        L37:
            r3.b(r1, r6)
            java.util.concurrent.atomic.AtomicReference r5 = r5.c
            boolean r5 = r5.compareAndSet(r6, r3)
            if (r5 == 0) goto Ld
        L42:
            amii r5 = new amii
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amii.f(java.lang.String, amip):amir");
    }

    @Override // defpackage.amir
    public final void g(boolean z) {
        int h = h();
        amjx amjxVar = this.c;
        int i = h - amjxVar.b;
        amkq.N(!amjxVar.c());
        amjxVar.f = (true != z ? 0 : 1073741824) | CellularSignalStrengthError.ERROR_NOT_SUPPORTED | (i & 1073741823);
        if (Build.VERSION.SDK_INT >= 28) {
            Reference.reachabilityFence(this);
        }
    }

    public amii(amjx amjxVar, UUID uuid, amih amihVar, shf shfVar, long j, boolean z) {
        super(amjxVar.a, uuid, amjxVar.c);
        this.c = amjxVar;
        this.d = amihVar;
        this.e = shfVar;
        this.f = (int) j;
        this.g = z;
    }
}
