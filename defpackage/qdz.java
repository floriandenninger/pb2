package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qdz implements qnu {
    public static final qdz a = new qdz(new Bundle());
    public final Bundle b;

    public qdz(Bundle bundle) {
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qdz)) {
            return false;
        }
        Bundle bundle = this.b;
        Bundle bundle2 = ((qdz) obj).b;
        if (bundle.size() == bundle2.size()) {
            Set<String> keySet = bundle.keySet();
            if (keySet.containsAll(bundle2.keySet())) {
                for (String str : keySet) {
                    if (!qar.j(bundle.get(str), bundle2.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}
