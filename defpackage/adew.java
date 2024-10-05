package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adew extends adel {
    public static final String ae = zga.a("MDX.MdxMediaRouteChooserDialogFragment");
    public bph af;
    public azrw ag;
    public adcu ah;
    public adbu ai;
    public ypa aj;
    public adeg ak;
    public acwr al;
    public acwp am;
    public azrw an;
    public boolean ao;
    public azrw ap;
    public acun aq;
    public acxi ar;
    public acqz as;
    public Executor at;
    public adee au;
    public jdb av;
    private bnp aw;

    @Override // defpackage.bnq
    public final bnp aG(Context context) {
        adev adevVar = new adev(context, (adlj) this.ag.get(), this.ai, this.ao, this.aj, this.ap, this.an, this.ah, this.ak, this.al, this.am, this.ar, this.aq, this.as.mM(), this.at, this.au);
        this.aw = adevVar;
        adevVar.f(this.af);
        this.aw.setCanceledOnTouchOutside(true);
        return this.aw;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        jdb jdbVar = this.av;
        if (jdbVar != null) {
            jdj jdjVar = jdbVar.a;
            if (jdjVar.l) {
                jdjVar.f.b((atcd) jdjVar.m.orElse(null), "LR notification route selection canceled.", atbf.MDX_NOTIFICATION_GEL_ACTION_USER_CANCELLED);
            }
            jdjVar.g();
        }
    }

    @Override // defpackage.bv
    public final void qh(dd ddVar, String str) {
        try {
            dn k = ddVar.k();
            k.r(this, str);
            k.a();
        } catch (IllegalStateException unused) {
        }
    }
}
