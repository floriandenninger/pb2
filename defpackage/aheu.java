package defpackage;

import android.animation.TypeEvaluator;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aheu implements TypeEvaluator {
    public static final aheu a = new aheu(1);
    private final /* synthetic */ int b;

    public aheu(int i) {
        this.b = i;
    }

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        if (this.b == 0) {
            Long l = (Long) obj;
            double longValue = l.longValue();
            double d = f;
            double longValue2 = ((Long) obj2).longValue() - l.longValue();
            Double.isNaN(d);
            Double.isNaN(longValue2);
            Double.isNaN(longValue);
            return Long.valueOf((long) (longValue + (d * longValue2)));
        }
        int intValue = ((Integer) obj).intValue();
        int i = (intValue >> 24) & PrivateKeyType.INVALID;
        int i2 = (intValue >> 16) & PrivateKeyType.INVALID;
        int i3 = (intValue >> 8) & PrivateKeyType.INVALID;
        int i4 = intValue & PrivateKeyType.INVALID;
        int intValue2 = ((Integer) obj2).intValue();
        return Integer.valueOf(((i + ((int) ((((intValue2 >> 24) & PrivateKeyType.INVALID) - i) * f))) << 24) | ((i2 + ((int) ((((intValue2 >> 16) & PrivateKeyType.INVALID) - i2) * f))) << 16) | ((i3 + ((int) ((((intValue2 >> 8) & PrivateKeyType.INVALID) - i3) * f))) << 8) | (i4 + ((int) (f * ((intValue2 & PrivateKeyType.INVALID) - i4)))));
    }
}
