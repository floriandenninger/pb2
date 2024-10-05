package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zyx extends algb {
    final /* synthetic */ zza a;

    public zyx(zza zzaVar) {
        this.a = zzaVar;
    }

    @Override // defpackage.algb
    public final void b(View view, int i) {
        View view2;
        zza zzaVar = this.a;
        if (zzaVar.af == null || (view2 = zzaVar.ae) == null) {
            return;
        }
        if (i == 3) {
            int height = view2.getHeight();
            zza zzaVar2 = this.a;
            if (height >= zzaVar2.au) {
                zzaVar2.af.setElevation(zzaVar2.at);
                return;
            }
        }
        this.a.af.setElevation(0.0f);
    }

    @Override // defpackage.algb
    public final void mx(View view, float f) {
    }
}
