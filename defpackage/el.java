package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class el extends en {
    private final dj g;

    public el(int i, int i2, dj djVar, aio aioVar) {
        super(i, i2, djVar.b, aioVar);
        this.g = djVar;
    }

    @Override // defpackage.en
    public final void a() {
        super.a();
        this.g.e();
    }

    @Override // defpackage.en
    public final void b() {
        if (this.f == 2) {
            ce ceVar = this.g.b;
            View findFocus = ceVar.O.findFocus();
            if (findFocus != null) {
                ceVar.ag(findFocus);
                if (dd.W(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Saved focused view ");
                    sb.append(findFocus);
                    sb.append(" for Fragment ");
                    sb.append(ceVar);
                }
            }
            View K = this.a.K();
            if (K.getParent() == null) {
                this.g.b();
                K.setAlpha(0.0f);
            }
            if (K.getAlpha() == 0.0f && K.getVisibility() == 0) {
                K.setVisibility(4);
            }
            cb cbVar = ceVar.R;
            K.setAlpha(cbVar == null ? 1.0f : cbVar.l);
        }
    }
}
