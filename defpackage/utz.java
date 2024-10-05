package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class utz {
    public final float a;
    public final Random b;

    public utz(Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        amkq.F(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }
}
