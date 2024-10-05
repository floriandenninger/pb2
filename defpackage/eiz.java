package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eiz implements vzp {
    public static final Set a;

    static {
        HashSet hashSet = new HashSet(wkk.b);
        hashSet.add("https://www.googleapis.com/auth/accounts.reauth");
        hashSet.add("https://www.googleapis.com/auth/assistant-sdk-prototype");
        a = Collections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.vzp
    public final Set a() {
        return a;
    }
}
