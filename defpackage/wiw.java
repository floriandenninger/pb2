package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wiw implements ylb {
    public final Set a = new HashSet();

    @Override // defpackage.ylb
    public final int a(Bundle bundle) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wiv) it.next()).b();
        }
        return 0;
    }
}
