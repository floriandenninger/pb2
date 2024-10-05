package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gew extends gmh {
    private final aadw b;

    public gew(View view, gmg gmgVar, aadw aadwVar) {
        super(view, gmgVar);
        this.b = aadwVar;
    }

    @Override // defpackage.gmh
    protected final float a() {
        asvu asvuVar = this.b.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aV / 100.0f;
    }

    @Override // defpackage.gmh
    protected final float b() {
        asvu asvuVar = this.b.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        return asvuVar.aW / 100.0f;
    }
}
