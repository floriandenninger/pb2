package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hiq {
    public float a = 0.5f;

    public hiq() {
    }

    public hiq(byte[] bArr) {
    }

    public final void a(float f) {
        if (f < 0.0f || f > 1.0f) {
            zga.b("Volume balance is not between 0 and 1 inclusive.");
        } else {
            this.a = f;
        }
    }
}
