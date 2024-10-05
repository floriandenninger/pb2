package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azoy extends ayqi {
    private static final azpb c = new azpb("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final ThreadFactory b = c;

    @Override // defpackage.ayqi
    public final ayqh a() {
        return new azoz(this.b);
    }
}
