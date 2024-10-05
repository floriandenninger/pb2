package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abmu implements ajoq {
    final /* synthetic */ abmv a;

    public abmu(abmv abmvVar) {
        this.a = abmvVar;
    }

    @Override // defpackage.ajoq
    public final ajom b(ViewGroup viewGroup) {
        abmv abmvVar = this.a;
        ajyw ajywVar = abmvVar.b;
        Context context = (Context) ajywVar.c.get();
        context.getClass();
        aahd aahdVar = (aahd) ajywVar.a.get();
        aahdVar.getClass();
        return new abky(context, aahdVar, ajywVar.b, abmvVar);
    }
}
