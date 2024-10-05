package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bant implements bans {
    @Override // defpackage.bans
    public final Set a() {
        return Collections.singleton("UTC");
    }

    @Override // defpackage.bans
    public final bajn b(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return bajn.a;
        }
        return null;
    }
}
