package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vzs implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final /* synthetic */ int d;

    public vzs(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i) {
        this.d = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        return this.d != 0 ? a() : a();
    }

    public final afvb a() {
        if (this.d == 0) {
            return wbs.g((Context) ((axqs) this.a).a, (afqb) this.b.get(), (aftj) this.c.get());
        }
        return wbs.f((Context) ((axqs) this.a).a, (afqb) this.b.get(), (aftj) this.c.get());
    }
}
