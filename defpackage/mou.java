package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mou extends kwy {
    private final ajoi o;

    public mou(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, int i, ajop ajopVar, ajut ajutVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(context, ajjzVar, ajuwVar, i, ajutVar, null, null, ajoyVar, null, null, null, null, null);
        this.o = new ajoi(aahdVar, ajopVar);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.kwy, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.o.c();
    }

    @Override // defpackage.ajom
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, arct arctVar) {
        apxf apxfVar;
        ajoi ajoiVar = this.o;
        acra acraVar = ajokVar.a;
        if ((arctVar.b & 512) != 0) {
            apxfVar = arctVar.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
    }
}
