package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekt implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;

    public aekt(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
    }

    public static aekt b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new aekt(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5);
    }

    public static aekm c(ExecutorService executorService, ExecutorService executorService2, shf shfVar, aaea aaeaVar, aadw aadwVar) {
        return new aekm(executorService, executorService2, shfVar, aaeaVar, aadwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aekm get() {
        return c((ExecutorService) this.a.get(), (ExecutorService) this.b.get(), (shf) this.c.get(), (aaea) this.d.get(), (aadw) this.e.get());
    }
}
