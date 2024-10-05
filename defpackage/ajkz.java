package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajkz implements dbw {
    private final apdb a;
    private final azrw b;
    private final boolean c;

    public ajkz(apdb apdbVar, azrw azrwVar, boolean z) {
        this.a = apdbVar;
        this.b = azrwVar;
        this.c = z;
    }

    @Override // defpackage.dbw
    public final boolean a(final csz cszVar, Object obj, dcl dclVar, final boolean z) {
        if (this.c) {
            ((aksl) this.b.get()).b("GLIDE", "UNKNOWN", true);
        }
        if (!this.a.e || !(obj instanceof avgg)) {
            return false;
        }
        final avgg avggVar = (avgg) obj;
        dclVar.e(new dck() { // from class: ajky
            @Override // defpackage.dck
            public final void g(int i, int i2) {
                Uri E;
                csz cszVar2 = csz.this;
                boolean z2 = z;
                avgg avggVar2 = avggVar;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE) {
                    E = ahbw.E(avggVar2);
                    if (E != null) {
                        E = E.buildUpon().appendQueryParameter("TargetSizeOriginal", "True").build();
                    }
                } else {
                    E = ahbw.C(avggVar2, i, i2);
                }
                ajka ajkaVar = new ajka(cszVar2, E != null ? E.buildUpon().appendQueryParameter("isFirstResource", String.valueOf(z2)).build() : null, "Glide");
                if (cszVar2 != null) {
                    cszVar2.a();
                    for (Throwable th : cszVar2.a()) {
                    }
                }
                ahbw.R(ajkaVar);
            }
        });
        return false;
    }

    @Override // defpackage.dbw
    public final /* bridge */ /* synthetic */ boolean ka(Object obj, Object obj2, int i) {
        if (this.c) {
            aksl akslVar = (aksl) this.b.get();
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            akslVar.b("GLIDE", i2 != 1 ? (i2 == 2 || i2 == 3) ? "DISK" : i2 != 4 ? "UNKNOWN" : "MEMORY" : "NOT_CACHED", false);
        }
        return false;
    }
}
