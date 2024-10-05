package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yjy implements axqr {
    private final azrw a;

    public yjy(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static yjy a(azrw azrwVar) {
        return new yjy(azrwVar);
    }

    public static tru c(Executor executor) {
        return new tru(executor, null);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final tru get() {
        return c((Executor) this.a.get());
    }
}
