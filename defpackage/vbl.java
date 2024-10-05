package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vbl implements vbn {
    final /* synthetic */ Bundle a;
    private final /* synthetic */ int b;

    public vbl(Bundle bundle, int i) {
        this.b = i;
        this.a = bundle;
    }

    @Override // defpackage.vbn
    public final void a(vca vcaVar) {
        int i = this.b;
        if (i == 0) {
            if (vcaVar instanceof vbg) {
                vbo.d(vcaVar, this.a).getClass();
                ((vbg) vcaVar).a();
                return;
            }
            return;
        }
        if (i == 1) {
            if (vcaVar instanceof vbc) {
                vbo.d(vcaVar, this.a);
                ((vbc) vcaVar).a();
                return;
            }
            return;
        }
        if (i == 2) {
            if (vcaVar instanceof vyi) {
                ((vyi) vcaVar).a(vbo.d(vcaVar, this.a));
                return;
            }
            return;
        }
        if (vcaVar instanceof vyi) {
            Bundle bundle = new Bundle();
            ((vyi) vcaVar).e(bundle);
            String c = vbo.c(vcaVar);
            c.getClass();
            this.a.putBundle(c, bundle);
        }
    }
}
