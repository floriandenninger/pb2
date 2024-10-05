package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class zys implements zyz, ajdg {
    public final acra E;
    private final zza a;
    private final dd b;
    private final Optional c;

    /* JADX INFO: Access modifiers changed from: protected */
    public zys(Context context, dd ddVar, acra acraVar, Optional optional, boolean z, boolean z2, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ReelsBottomSheetDialogRoundCorners", z);
        if (!md()) {
            bundle.putBoolean("ReelsBottomSheetDialogDimBackgroundKey", false);
        }
        bundle.putBoolean("ReelsBottomSheetDialogTopViewKey", lR() != null);
        bundle.putBoolean("ReelsBottomSheetDialoginitExpandedKey", z3);
        bundle.putBoolean("ReelsBottomSheetDialogDraggableKey", true);
        zza zzbVar = z2 ? new zzb() : new zza();
        this.a = zzbVar;
        zzbVar.af(bundle);
        zzbVar.al = context;
        zzbVar.ak = this;
        this.b = ddVar;
        this.E = acraVar;
        this.c = optional;
    }

    @Override // defpackage.zyz
    public final void A() {
        if (H()) {
            this.E.I(3, new acqx(acsb.c(99620)), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B(boolean z) {
        this.a.n(z);
    }

    public final void C(float f) {
        Bundle x = x();
        x.putFloat("ReelsBottomSheetDialogMaxDefaultHeightKey", f);
        this.a.af(x);
    }

    public final void D(float f) {
        Bundle x = x();
        x.putFloat("ReelsBottomSheetDialogMinHeightKey", f);
        this.a.af(x);
    }

    public final void E(boolean z) {
        Bundle x = x();
        x.putBoolean("ReelsBottomSheetDialogDropShadowKey", z);
        this.a.af(x);
    }

    public final void F(String str) {
        Bundle x = x();
        x.putString("ReelsBottomSheetDialogTextureCloseButtonKey", str);
        this.a.af(x);
    }

    public final void G() {
        if (this.a.ar()) {
            return;
        }
        zza zzaVar = this.a;
        zzaVar.am = c();
        if (zzaVar.aj) {
            zzaVar.aI();
        }
        zza zzaVar2 = this.a;
        zzaVar2.an = a();
        if (zzaVar2.aj) {
            zzaVar2.aF();
        }
        zza zzaVar3 = this.a;
        View lR = lR();
        if (lR != null) {
            zzaVar3.ao = lR;
            if (zzaVar3.aj) {
                zzaVar3.aJ();
            }
        }
        zza zzaVar4 = this.a;
        boolean lT = lT();
        zzaVar4.ap = Boolean.valueOf(lT);
        if (zzaVar4.aj) {
            zzaVar4.aG(lT);
        }
        zza zzaVar5 = this.a;
        dd ddVar = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append("ReelsBottomSheetDialog_");
        CharSequence charSequence = zzaVar5.am;
        if (charSequence != null) {
            sb.append(charSequence.toString().replace(" ", ""));
        } else {
            sb.append("NoTitleSet");
        }
        String valueOf = String.valueOf(sb.toString());
        zzaVar5.qi(ddVar, valueOf.length() != 0 ? "ReelsBottomSheetDialog_".concat(valueOf) : new String("ReelsBottomSheetDialog_"));
        zza zzaVar6 = this.a;
        if (zzaVar6.d != null) {
            zzaVar6.n(true);
            this.a.aq = lS();
            this.a.d.setCanceledOnTouchOutside(true);
        }
        Dialog dialog = this.a.d;
        if (dialog != null && dialog.getWindow() != null) {
            this.a.d.getWindow().clearFlags(8);
        }
        if (H()) {
            this.E.D(new acqx(mb()));
            if (lT()) {
                this.E.D(new acqx(acsb.c(99620)));
            }
        }
    }

    protected final boolean H() {
        return (this.E == null || mb() == null) ? false : true;
    }

    public final boolean I() {
        return this.a.av();
    }

    protected abstract View a();

    protected abstract CharSequence c();

    @Override // defpackage.zyz
    public void d() {
        if (H()) {
            this.E.q(new acqx(mb()), null);
            if (lT()) {
                this.E.q(new acqx(acsb.c(99620)), null);
            }
        }
        if (this.c.isPresent()) {
            ((ajdh) this.c.get()).d(this);
        }
    }

    @Override // defpackage.zyz
    public void e() {
        if (H()) {
            this.E.u(new acqx(mb()), null);
            if (lT()) {
                this.E.u(new acqx(acsb.c(99620)), null);
            }
        }
        if (this.c.isPresent()) {
            ((ajdh) this.c.get()).a(this);
        }
    }

    @Override // defpackage.zyz
    public void j() {
    }

    @Override // defpackage.zyz
    public void k() {
    }

    @Override // defpackage.ajdg
    public final void lP() {
        if (this.a.av()) {
            z();
        }
    }

    protected View lR() {
        return null;
    }

    protected boolean lS() {
        return true;
    }

    protected boolean lT() {
        return true;
    }

    protected acsc mb() {
        return acsb.c(99619);
    }

    @Override // defpackage.zyz
    public boolean mc() {
        return false;
    }

    protected boolean md() {
        return true;
    }

    protected final Bundle x() {
        Bundle bundle = this.a.m;
        return bundle == null ? new Bundle() : bundle;
    }

    public final dd y() {
        return this.a.mN();
    }

    public final void z() {
        this.a.dismiss();
    }

    public zys(Context context, dd ddVar, acra acraVar, boolean z, boolean z2) {
        this(context, ddVar, acraVar, Optional.empty(), z, z2, false);
    }
}
