package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jzv implements kbi {
    private final azrw a;
    private final azrw b;

    public jzv(azrw azrwVar, azrw azrwVar2) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    @Override // defpackage.kbi
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jzu a(ammv ammvVar) {
        Context context = (Context) this.a.get();
        context.getClass();
        aahv aahvVar = (aahv) this.b.get();
        aahvVar.getClass();
        return new jzu(context, aahvVar, ammvVar);
    }
}
