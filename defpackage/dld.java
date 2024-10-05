package defpackage;

import com.facebook.yoga.YogaNative;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dld {
    public static volatile dlc a;
    public static volatile dlb b;
    public static final dus c;

    static {
        dus dusVar = new dus();
        YogaNative.jni_YGConfigSetUseWebDefaults(dusVar.a, true);
        c = dusVar;
    }
}
