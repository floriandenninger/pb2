package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgj implements Iterable {
    public static final adgj a = new adgj(Collections.emptyMap());
    public final Map b;

    public adgj() {
        this(new HashMap());
    }

    public final void a(String str, String str2) {
        this.b.put(str, str2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adgj) {
            return this.b.equals(((adgj) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new adgh(this);
    }

    public final String toString() {
        return TextUtils.join(", ", this);
    }

    public adgj(Map map) {
        this.b = new HashMap(map);
    }
}
