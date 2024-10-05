package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aged implements ylb {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public aged(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public aged(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        agsn c;
        agsn c2;
        agsn c3;
        int i = this.c;
        if (i == 0) {
            String string = bundle.getString("identityId");
            if (string == null || (c = aghv.c((agof) this.a.get(), string)) == null) {
                return 1;
            }
            return aghv.b(((agrn) this.b.get()).a(string, c));
        }
        if (i != 1) {
            String string2 = bundle.getString("identityId");
            if (string2 == null || (c3 = aghv.c((agof) this.b.get(), string2)) == null) {
                return 1;
            }
            return ((agtp) this.a.get()).a(string2, c3, bundle.getBoolean("forceSync", false)) != 0 ? 2 : 0;
        }
        String string3 = bundle.getString("identityId");
        if (string3 == null || (c2 = aghv.c((agof) this.a.get(), string3)) == null) {
            return 1;
        }
        return ((agdt) this.b.get()).a(string3, c2) != 0 ? 2 : 0;
    }
}
