package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qqs {
    public qqu a;
    public qqu b;
    public qql c;
    public Feature[] d;
    public int e;
    private final Runnable f = omm.c;

    public final qqt a() {
        qip.ap(this.a != null, "Must set register function");
        qip.ap(this.b != null, "Must set unregister function");
        qip.ap(this.c != null, "Must set holder");
        qip.az(this.c.b, "Key must not be null");
        return new qqt(new qqr(this, this.c, this.d, this.e), new qrh(this), this.f);
    }
}
