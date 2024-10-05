package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksc implements azrw {
    private final /* synthetic */ int a;

    public aksc(int i) {
        this.a = i;
    }

    public static final Set a() {
        Set set = wkk.b;
        if (set != null) {
            return set;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        return this.a != 0 ? a() : ThreadLocalRandom.current();
    }
}
