package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkr {
    private adgn a;

    public final adks a() {
        adgn adgnVar = this.a;
        if (adgnVar == null) {
            throw new IllegalStateException("Missing required properties: hardwareDeviceId");
        }
        return new adks(adgnVar);
    }

    public final void b(adgn adgnVar) {
        if (adgnVar == null) {
            throw new NullPointerException("Null hardwareDeviceId");
        }
        this.a = adgnVar;
    }
}
