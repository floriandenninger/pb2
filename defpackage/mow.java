package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mow extends kwy {
    private final ajoi o;

    public mow(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, int i, ajop ajopVar, ajut ajutVar) {
        super(context, ajjzVar, ajuwVar, i, ajutVar);
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
    public final void oB(ajok ajokVar, arcx arcxVar) {
        apxf apxfVar;
        ajoi ajoiVar = this.o;
        acra acraVar = ajokVar.a;
        if ((arcxVar.b & 16) != 0) {
            apxfVar = arcxVar.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
    }
}
