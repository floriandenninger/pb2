package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aejs implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;

    public aejs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
    }

    public static aejs b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aejs(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5);
    }

    public static aejq c(shf shfVar, afhs afhsVar, aypn aypnVar, aypn aypnVar2, Executor executor) {
        return new aejq(shfVar, afhsVar, aypnVar, aypnVar2, executor);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aejq get() {
        return c((shf) this.a.get(), (afhs) this.b.get(), (aypn) this.c.get(), (aypn) this.d.get(), (Executor) this.e.get());
    }
}
