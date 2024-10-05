package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zfa implements axqr {
    private final azrw a;

    public zfa(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static zfa b(azrw azrwVar) {
        return new zfa(azrwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zez get() {
        return new zez((Context) ((axqs) this.a).a);
    }
}
