package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ldz implements View.OnClickListener {
    final /* synthetic */ lea a;

    public ldz(lea leaVar) {
        this.a = leaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lea leaVar = this.a;
        aqsp aqspVar = leaVar.b;
        if (aqspVar == null || (aqspVar.b & 8) == 0) {
            return;
        }
        aone builder = aqspVar.toBuilder();
        lea leaVar2 = this.a;
        acra acraVar = leaVar2.c.a;
        apxf apxfVar = leaVar2.b.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        apxf h = acraVar.h(apxfVar);
        builder.copyOnWrite();
        aqsp aqspVar2 = (aqsp) builder.instance;
        h.getClass();
        aqspVar2.f = h;
        aqspVar2.b |= 8;
        leaVar.b = (aqsp) builder.build();
        lea leaVar3 = this.a;
        aahd aahdVar = leaVar3.a;
        apxf apxfVar2 = leaVar3.b.f;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aahdVar.c(apxfVar2, null);
    }
}
