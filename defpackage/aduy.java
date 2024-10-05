package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduy implements axqr {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public aduy(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public aduy(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public static aduy a(azrw azrwVar, azrw azrwVar2) {
        return new aduy(azrwVar, azrwVar2, 0);
    }

    public static afhe c(ammv ammvVar, afhe afheVar) {
        return (afhe) ammvVar.e(afheVar);
    }

    public static aduy d(azrw azrwVar, azrw azrwVar2) {
        return new aduy(azrwVar, azrwVar2, 1, null);
    }

    public static afhe e(final ajkn ajknVar, final SharedPreferences sharedPreferences) {
        final byte[] bArr = null;
        return new afhe(sharedPreferences, bArr) { // from class: adux
            public final /* synthetic */ SharedPreferences a;

            @Override // defpackage.afhe
            public final ate a(ate ateVar) {
                return new bgm(ajkn.this.e(this.a).getEncoded(), ateVar);
            }
        };
    }

    public final afhe b() {
        return this.c != 0 ? c((ammv) ((axqs) this.b).a, ((aduy) this.a).b()) : e(((zfj) this.a).get(), (SharedPreferences) this.b.get());
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        return this.c != 0 ? b() : b();
    }
}
