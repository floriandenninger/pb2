package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum qll {
    ZWIEBACK(2),
    ANDROID_ID(4),
    GAIA(8),
    ACCOUNT_NAME(16);

    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public final int h;

    static {
        qll qllVar = ZWIEBACK;
        e = EnumSet.allOf(qll.class);
        f = EnumSet.noneOf(qll.class);
        g = EnumSet.of(qllVar);
    }

    qll(int i2) {
        this.h = i2;
    }
}
