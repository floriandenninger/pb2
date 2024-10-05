package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zyw extends algj {
    final /* synthetic */ zza a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyw(zza zzaVar, Context context, int i) {
        super(context, i);
        this.a = zzaVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        zyz zyzVar = this.a.ak;
        if ((zyzVar == null || !zyzVar.mc()) && this.a.aq) {
            cancel();
        }
    }
}
