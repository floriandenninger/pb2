package defpackage;

import java.util.Calendar;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class run {
    public static final /* synthetic */ int a = 0;
    private static final Calendar b = Calendar.getInstance();

    static {
        new HashMap();
    }

    public static Calendar a() {
        return (Calendar) b.clone();
    }
}
