package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajxs implements uyu {
    private final axpg a;
    private final ajdw b;
    private final acra c;
    private final aqrf d;

    public ajxs(axpg axpgVar, ajdw ajdwVar, acra acraVar, aqrf aqrfVar) {
        this.a = axpgVar;
        this.b = ajdwVar;
        this.c = acraVar;
        this.d = aqrfVar;
    }

    public final View a() {
        this.b.b(null);
        ajok ajokVar = new ajok();
        ajokVar.a(this.c);
        this.b.oB(ajokVar, ajds.a(this.d));
        return this.b.a();
    }

    @Override // defpackage.uyu
    public final int b() {
        return 0;
    }

    @Override // defpackage.uyu
    public final boolean e() {
        return true;
    }
}
