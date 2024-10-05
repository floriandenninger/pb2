package defpackage;

import android.webkit.JavascriptInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adsn {
    final /* synthetic */ adso a;

    public adsn(adso adsoVar) {
        this.a = adsoVar;
    }

    @JavascriptInterface
    public void consentFlowCompleted(boolean z) {
        acsc c;
        if (z) {
            c = acsb.c(36385);
        } else {
            c = acsb.c(36386);
        }
        this.a.e.I(3, new acqx(c), null);
        String str = true != z ? "denied" : "completed";
        adso adsoVar = this.a;
        adsoVar.d.a(adsoVar.h, str);
        this.a.c(!z ? 1 : 0, null);
    }
}
