package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahax implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;

    public ahax(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
    }

    public static ahax b(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new ahax(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ahaw get() {
        return new ahaw((Context) ((axqs) this.a).a, (aifs) this.b.get(), (aaoz) this.c.get(), (Executor) this.d.get(), (banw) this.e.get());
    }
}
