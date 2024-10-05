package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahql implements ahqd {
    private final azrw a;
    private final /* synthetic */ int b;

    public ahql(azrw azrwVar, int i, byte[] bArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public ahql(azrw azrwVar, int i) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    @Override // defpackage.ahqd
    public final /* synthetic */ ahqe a(ahpe ahpeVar) {
        if (this.b != 0) {
            ((Context) this.a.get()).getClass();
            return new ahqc(ahpeVar);
        }
        ((Context) this.a.get()).getClass();
        return new ahqk(ahpeVar);
    }
}
