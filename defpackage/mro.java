package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mro implements ajom {
    private final gma a;

    public mro(Context context, gma gmaVar) {
        this.a = gmaVar;
        gmaVar.c(new View(context));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        this.a.e(ajokVar);
    }
}
