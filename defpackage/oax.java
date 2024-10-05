package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oax extends fks implements fwk, fgp {
    public static final long a = TimeUnit.HOURS.toMillis(1);
    public final oja b;
    public final akch c;
    public final shf d;
    public final aok e;
    public final aili f;
    private final fgq g;

    public oax(fln flnVar, fgq fgqVar, oja ojaVar, shf shfVar, aili ailiVar, akch akchVar, aok aokVar, byte[] bArr) {
        super(flnVar);
        this.g = fgqVar;
        this.b = ojaVar;
        this.d = shfVar;
        this.f = ailiVar;
        this.c = akchVar;
        this.e = aokVar;
    }

    @Override // defpackage.fwk
    public final int c() {
        throw null;
    }

    @Override // defpackage.fwk
    public final void d() {
    }

    @Override // defpackage.fwk
    public final void e() {
        throw null;
    }

    @Override // defpackage.flm
    public final void kG() {
        this.g.j(this);
    }

    @Override // defpackage.flm
    public final void kH() {
        this.g.i(this);
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        if (fhgVar2 != fhg.WATCH_WHILE_MINIMIZED || fhgVar == fhg.NONE) {
            return;
        }
        ynm.o(this.e, this.f.a.a(), llq.s, new zfi() { // from class: oav
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ojb ojbVar;
                oan oanVar;
                oax oaxVar = oax.this;
                oaz oazVar = (oaz) obj;
                if (oazVar == null || oazVar.d >= 2) {
                    return;
                }
                shf shfVar = oaxVar.d;
                long j = oazVar.c;
                if ((j > 0 && shfVar.c() - j < oax.a) || (ojbVar = oaxVar.b.a) == null || (oanVar = ((DefaultWatchPanelViewController) ojbVar).j) == null) {
                    return;
                }
                akch akchVar = oaxVar.c;
                View view = ((oad) oanVar).d;
                String string = view.getResources().getString(R.string.floaty_bar_tutorial_description);
                akci a2 = oaxVar.c.a();
                a2.a = view;
                a2.c = string;
                a2.i(1);
                a2.c(3);
                a2.f = new oaw(oaxVar);
                akchVar.c(a2.a());
            }
        });
    }
}
