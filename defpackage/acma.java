package defpackage;

import android.os.CountDownTimer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acma {
    public final acnp a;
    public final acnh b;
    public CountDownTimer c;
    public boolean d;
    public final acog e;

    public acma(acog acogVar, acnp acnpVar, acnh acnhVar) {
        this.e = acogVar;
        acnpVar.getClass();
        this.a = acnpVar;
        acnhVar.getClass();
        this.b = acnhVar;
        this.c = new aclz(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        abvt.b().n(14, 1, null);
        b();
        this.e.a();
    }

    public final void b() {
        CountDownTimer countDownTimer = this.c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}
