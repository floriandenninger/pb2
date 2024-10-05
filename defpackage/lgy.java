package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgy implements akew {
    private final aaea a;
    private final Context b;
    private final azrw c;
    private final aamb d;
    private final axzg e;

    public lgy(aaea aaeaVar, Context context, azrw azrwVar, aamb aambVar, axzg axzgVar, byte[] bArr) {
        this.a = aaeaVar;
        this.b = context;
        this.c = azrwVar;
        this.d = aambVar;
        this.e = axzgVar;
    }

    @Override // defpackage.akew
    public final int a() {
        if (evr.Z(this.a)) {
            return yjk.K(this.b.getResources().getDisplayMetrics(), evr.w(this.a) == 4 ? 36 : 32);
        }
        return -1;
    }

    @Override // defpackage.akew
    public final int b() {
        if (evr.Z(this.a)) {
            return yjk.K(this.b.getResources().getDisplayMetrics(), evr.w(this.a) == 4 ? 64 : 56);
        }
        return -1;
    }

    @Override // defpackage.akew
    public final boolean c() {
        if (evr.Z(this.a) && !this.d.a()) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            ayrz.c((AtomicReference) this.e.a.a.Y(axzd.m).B().as(false).V(new lgx(atomicBoolean, 0)));
            if (!atomicBoolean.get()) {
                return true;
            }
            atmk b = ((akmu) this.c.get()).b();
            if (b != atmk.EFFECTIVE_CONNECTION_TYPE_SLOW_2G && b != atmk.EFFECTIVE_CONNECTION_TYPE_2G && b != atmk.EFFECTIVE_CONNECTION_TYPE_3G && b != atmk.EFFECTIVE_CONNECTION_TYPE_OFFLINE) {
                return true;
            }
        }
        return false;
    }
}
