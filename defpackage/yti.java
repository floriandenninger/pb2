package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yti {
    public Collection a;
    private boolean b;

    public final synchronized void a(Collection collection) {
        this.a = collection;
        this.b = true;
    }

    public final synchronized boolean b() {
        return this.b;
    }
}
