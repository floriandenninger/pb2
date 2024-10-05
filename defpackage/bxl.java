package defpackage;

import android.animation.TypeEvaluator;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxl implements TypeEvaluator {
    public static final bxl a = new bxl();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & PrivateKeyType.INVALID) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        double pow4 = Math.pow(((intValue2 >> 16) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        double pow5 = Math.pow(((intValue2 >> 8) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        double pow6 = Math.pow((intValue2 & PrivateKeyType.INVALID) / 255.0f, 2.2d);
        return Integer.valueOf((Math.round((f2 + (f * ((((intValue2 >> 24) & PrivateKeyType.INVALID) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow + ((((float) pow4) - pow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(pow2 + ((((float) pow5) - pow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow3 + ((((float) pow6) - pow3) * f), 0.45454545454545453d)) * 255.0f));
    }
}
