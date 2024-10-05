package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdv implements ajom {
    private final ajdw a;

    public ajdv(ajdw ajdwVar) {
        this.a = ajdwVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a.a();
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.b(ajosVar);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        ajds ajdsVar = (ajds) obj;
        ajdw ajdwVar = this.a;
        ajdwVar.a = ajdsVar;
        ajdwVar.e(ajokVar, ajdsVar, ajdsVar.b().c);
    }
}
