package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azac implements Callable {
    private final /* synthetic */ int a;

    public azac(int i) {
        this.a = i;
    }

    public static final List a() {
        return new ArrayList(16);
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.a;
        if (i == 0) {
            return new azaf();
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2) {
            return azra.a;
        }
        if (i != 3) {
            return i != 4 ? azrd.a : azrc.a;
        }
        return azrb.a;
    }
}
