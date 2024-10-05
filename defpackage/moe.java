package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class moe implements View.OnClickListener {
    final /* synthetic */ ajok a;
    final /* synthetic */ auoi b;
    final /* synthetic */ mog c;

    public moe(mog mogVar, ajok ajokVar, auoi auoiVar) {
        this.c = mogVar;
        this.a = ajokVar;
        this.b = auoiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        auoj auojVar;
        lxt lxtVar = (lxt) this.a.c("avatar_selection_listener");
        auoi auoiVar = this.b;
        if (auoiVar.e == 11) {
            auojVar = (auoj) auoiVar.f;
        } else {
            auojVar = auoj.a;
        }
        if (auojVar.b != 60487319 || lxtVar == null) {
            auoi auoiVar2 = this.b;
            if (auoiVar2.e == 6) {
                this.c.a.c((apxf) auoiVar2.f, null);
                return;
            }
            return;
        }
        aone builder = this.b.toBuilder();
        lxtVar.a.s(builder);
        this.c.b = (auoi) builder.build();
    }
}
