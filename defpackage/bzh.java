package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bzh {
    public final bzd a(bzj bzjVar) {
        return b(Collections.singletonList(bzjVar));
    }

    public abstract bzd b(List list);

    public abstract bzd c(String str, int i, List list);

    public abstract void d(String str);

    public abstract void e(String str);

    public abstract bzd f(String str, int i, bzj bzjVar);

    public final bzd g(String str, int i, bzj bzjVar) {
        return c(str, i, Collections.singletonList(bzjVar));
    }
}
