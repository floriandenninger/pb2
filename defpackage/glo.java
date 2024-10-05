package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class glo implements afwx {
    final /* synthetic */ String a;
    final /* synthetic */ glq b;

    public glo(glq glqVar, String str) {
        this.b = glqVar;
        this.a = str;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.b.c.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        this.b.d.f(new gli(this.a));
        whu.K(this.b.a, R.string.delete_playlist_done, 1);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
