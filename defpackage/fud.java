package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fud implements akbl {
    final /* synthetic */ avzn a;
    final /* synthetic */ atnc b;
    final /* synthetic */ fue c;

    public fud(fue fueVar, avzn avznVar, atnc atncVar) {
        this.c = fueVar;
        this.a = avznVar;
        this.b = atncVar;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        this.c.b.u(new acqx(this.a.d), null);
        this.c.b.u(new acqx(this.b.e), null);
        fue fueVar = this.c;
        SharedPreferences.Editor edit = fueVar.d.edit();
        edit.putLong(yny.VIDEO_QUALITY_PROMO_LAST_DISPLAYED, fueVar.c.c());
        edit.apply();
    }
}
