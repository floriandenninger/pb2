package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amcd {
    public static final AtomicInteger a = new AtomicInteger(123051698);
    public final String b;
    public final adz c = new adz();
    public final adz d = new adz();

    public amcd(String str) {
        amkq.F(!ammx.e(str), "mapKey must be a non-empty, non-null static String unique to the class using CallbackIdMap.");
        this.b = str;
    }

    public final Object a(int i) {
        uqq.j();
        Object obj = this.c.get(Integer.valueOf(i));
        if (obj == null) {
            for (Map.Entry entry : this.d.entrySet()) {
                if (((Integer) entry.getValue()).intValue() == i) {
                    String valueOf = String.valueOf(((Class) entry.getKey()).getName());
                    throw new NullPointerException(valueOf.length() != 0 ? "Callback not re-registered for: ".concat(valueOf) : new String("Callback not re-registered for: "));
                }
            }
        }
        obj.getClass();
        return obj;
    }
}
