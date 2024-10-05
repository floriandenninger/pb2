package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kfa implements kel {
    final /* synthetic */ kfc a;

    public kfa(kfc kfcVar) {
        this.a = kfcVar;
    }

    @Override // defpackage.kel
    public final void a() {
        kfc kfcVar = this.a;
        if (kfcVar.d) {
            mh mhVar = new mh(kfcVar.a, R.style.Theme_YouTube_Light_Dialog);
            mhVar.n(R.string.varispeed_unavailable_title);
            mhVar.f(R.string.varispeed_unavailable_message);
            mhVar.k(R.string.ok, null);
            mhVar.b().show();
            return;
        }
        kfcVar.c.c(kfcVar.a);
    }
}
