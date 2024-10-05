package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class badp {
    private static final AtomicReference a = new AtomicReference();

    private badp() {
    }

    public static badp a() {
        return (badp) a.get();
    }

    public abstract String b();

    public abstract boolean c();
}
