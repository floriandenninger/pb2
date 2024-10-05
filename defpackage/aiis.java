package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiis implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;

    public aiis(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public static aiis b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new aiis(azrwVar, azrwVar2, azrwVar3, azrwVar4);
    }

    public static aiir c(shf shfVar, ajyg ajygVar, ajyw ajywVar, Executor executor) {
        return new aiir(shfVar, ajygVar, ajywVar, executor, null, null);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aiir get() {
        return c((shf) this.a.get(), ((aiju) this.b).get(), ((aijy) this.c).get(), (Executor) this.d.get());
    }
}
