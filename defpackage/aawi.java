package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawi implements ylb {
    private final azrw a;

    public aawi(azrw azrwVar) {
        this.a = azrwVar;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        try {
            ((aawl) this.a.get()).a();
            return 0;
        } catch (aasx e) {
            zga.d("Scheduled config refresh failed.", e);
            return 2;
        }
    }
}
