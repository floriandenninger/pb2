package defpackage;

import com.google.android.libraries.youtube.ads.model.LocalVideoAd;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class woz {
    public final azrw a;
    public final aifw b;
    public final azrw c;
    public final azrw d;
    public final azrw e;

    public woz(azrw azrwVar, aifw aifwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        this.a = azrwVar;
        this.b = aifwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.e = azrwVar4;
    }

    public static final int a(xgh xghVar, xev xevVar) {
        if (xevVar.g(apac.LAYOUT_TYPE_MEDIA, xdu.class) && (xevVar.e(xdu.class) instanceof LocalVideoAd)) {
            return 1;
        }
        return (xevVar.g(apac.LAYOUT_TYPE_MEDIA, xdy.class, xea.class) && xghVar.c() == apae.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM) ? 2 : 0;
    }
}
