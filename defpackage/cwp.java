package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwp implements cvz {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final cvz b;

    public cwp(cvz cvzVar) {
        this.b = cvzVar;
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        return this.b.a(new cvo(((Uri) obj).toString()), i, i2, cqnVar);
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }
}
