package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mxe extends mlc {
    public final shf a;
    private final ajoi b;

    public mxe(Context context, ajjz ajjzVar, View view, aahd aahdVar, ohg ohgVar, ajoy ajoyVar, c cVar, shf shfVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(context, ajjzVar, new ajpe(), view, aahdVar, ohgVar, ajoyVar, cVar, null, null, null, null, null, null);
        aahdVar.getClass();
        view.getClass();
        this.b = new ajoi(aahdVar, view);
        this.a = shfVar;
        akbdVar.b(this.i, akbdVar.a(this.i, null));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.i;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.b.c();
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, avzv avzvVar) {
        avwi avwiVar = avzvVar.D;
        if (avwiVar == null) {
            avwiVar = avwi.a;
        }
        apxf apxfVar = null;
        if ((avwiVar.b & 1) != 0) {
            avwi avwiVar2 = avzvVar.D;
            if (avwiVar2 == null) {
                avwiVar2 = avwi.a;
            }
            B(ajokVar, avwiVar2);
            s(ajokVar, null);
        }
        ajoi ajoiVar = this.b;
        acra acraVar = ajokVar.a;
        if ((avzvVar.b & 32768) != 0 && (apxfVar = avzvVar.o) == null) {
            apxfVar = apxf.a;
        }
        ajoiVar.b(acraVar, apxfVar, ajokVar.e(), this);
    }
}
