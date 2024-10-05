package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anlt {
    public static final Logger a = Logger.getLogger(anlt.class.getName());
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private anlt() {
    }

    public static boolean a() {
        return b.get();
    }
}
