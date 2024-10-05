package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kcg implements ailf {
    public final Activity a;
    public final nnb b;
    public final aahd c;
    public final acqz d;
    public final ajdh e;
    public aqdt f;
    public ajdf g;

    public kcg(Activity activity, nnb nnbVar, aahd aahdVar, acqz acqzVar, ajdh ajdhVar) {
        this.a = activity;
        this.b = nnbVar;
        this.c = aahdVar;
        this.d = acqzVar;
        this.e = ajdhVar;
    }

    @Override // defpackage.ailf
    public final Activity a() {
        return this.a;
    }

    @Override // defpackage.ailf
    public final void b() {
        ajdf ajdfVar = this.g;
        if (ajdfVar != null) {
            ajdfVar.l();
            this.g = null;
        }
    }
}
