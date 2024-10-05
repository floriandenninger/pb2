package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ojw extends fks implements fgp {
    private final Activity a;
    private final fgq b;
    private boolean c;

    public ojw(Activity activity, fln flnVar, fgq fgqVar) {
        super(flnVar);
        this.a = activity;
        this.b = fgqVar;
    }

    @Override // defpackage.flm
    public final void kG() {
        this.b.j(this);
    }

    @Override // defpackage.flm
    public final void kH() {
        this.b.i(this);
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        boolean b = fhgVar2.b();
        boolean z = this.c && fhgVar == fhg.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED && fhgVar2 == fhg.WATCH_WHILE_MINIMIZED;
        if (b || z) {
            whu.B(this.a);
        }
        this.c = fhgVar == fhg.WATCH_WHILE_MAXIMIZED && fhgVar2 == fhg.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED;
    }
}
