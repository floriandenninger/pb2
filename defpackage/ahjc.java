package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahjc extends ahga {
    public final ahjo e;
    public ahil f;
    public ahjs g;
    public ahjs h;
    public float i;
    private final ahkv j;
    private final azrw k;

    public ahjc(ahki ahkiVar, ahkv ahkvVar, azrw azrwVar) {
        super(new ahhp(ahkvVar.clone(), 1.0f, 1.0f));
        this.j = ahkvVar;
        this.k = azrwVar;
        ahjo a = ahkiVar.b.a(ahkvVar.clone(), 0.0f, 4.0f);
        this.e = a;
        a.B(true, false);
        a.A(2.0f);
        a.h(17);
        a.l(0.0f, 0.1f, 0.0f);
    }

    public static ahjp a(Bitmap bitmap, ahku ahkuVar, ahjc ahjcVar) {
        ahjp ahjpVar = new ahjp(bitmap, ahkuVar, ahjcVar.j.clone(), ahjcVar.k);
        ahjpVar.d = 0.3f;
        ahjpVar.a(new ahif(ahjpVar, 0.1f, 0.2f));
        return ahjpVar;
    }

    public static ahku b(float f, boolean z) {
        return ahku.a(f, 4.0f, z ? ahku.b : ahku.c);
    }
}
