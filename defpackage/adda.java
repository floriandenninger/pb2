package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adda {
    public final adij a;
    public ammw b;
    public final adyu d;
    private ammw e;
    public final Object c = new Object();
    private final Object f = new Object();

    public adda(adij adijVar, adyu adyuVar, byte[] bArr, byte[] bArr2) {
        this.a = adijVar;
        this.d = adyuVar;
    }

    public final adcz a(String str) {
        adcz a;
        amkq.E(!TextUtils.isEmpty(str));
        synchronized (this.f) {
            ammw ammwVar = this.e;
            if (ammwVar != null && adeg.c((String) ammwVar.a, str)) {
                a = (adcz) this.e.b;
            }
            a = adcz.a().a();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, adcz adczVar) {
        amkq.E(!TextUtils.isEmpty(str));
        synchronized (this.f) {
            this.e = adczVar == null ? null : ammw.a(str, adczVar);
        }
    }
}
