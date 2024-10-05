package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fwv implements ajoq {
    private final Activity a;
    private final aahd b;
    private final ajjz c;
    private final ajyg d;

    public fwv(Activity activity, ajjz ajjzVar, ajyg ajygVar, aahd aahdVar) {
        this.a = activity;
        this.c = ajjzVar;
        this.b = aahdVar;
        this.d = ajygVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new fww(this.a, this.c, this.b, this.d, viewGroup);
    }
}
