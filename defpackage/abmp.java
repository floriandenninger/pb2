package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abmp extends abma {
    private final ajkj j;

    public abmp(Context context, acqz acqzVar, aahd aahdVar, ajjs ajjsVar) {
        super(context, acqzVar, aahdVar, ajjsVar);
        this.j = new ajkj(ajjsVar, this.c);
    }

    @Override // defpackage.abma, defpackage.ablz, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.j.a();
    }

    @Override // defpackage.ablz
    public final void p(avgg avggVar) {
        this.j.k(avggVar);
    }

    @Override // defpackage.ablz
    protected final boolean q() {
        return true;
    }
}
