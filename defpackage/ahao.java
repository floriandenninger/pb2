package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahao implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final azrw e;

    public ahao(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
    }

    public static ahao a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5) {
        return new ahao(azrwVar, azrwVar2, azrwVar3, azrwVar4, azrwVar5);
    }

    public static aikl c(Context context, azrw azrwVar, aivq aivqVar, ahbv ahbvVar, azrw azrwVar2) {
        return new aikl(context, azrwVar, aivqVar, ahbvVar.e, azrwVar2);
    }

    @Override // defpackage.azrw
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aikl get() {
        return c((Context) ((axqs) this.a).a, this.b, (aivq) this.c.get(), (ahbv) ((axqs) this.d).a, this.e);
    }
}
