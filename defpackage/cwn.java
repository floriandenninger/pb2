package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwn implements cvz {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    private final cwm b;

    public cwn(cwm cwmVar) {
        this.b = cwmVar;
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ cvy a(Object obj, int i, int i2, cqn cqnVar) {
        Uri uri = (Uri) obj;
        return new cvy(new dcz(uri), this.b.a(uri));
    }

    @Override // defpackage.cvz
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }
}
