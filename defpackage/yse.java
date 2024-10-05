package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yse {
    public static final yse a = new yse(Collections.emptyList());
    public final Collection b;

    public yse(Collection collection) {
        this.b = collection;
    }

    public static abgu c() {
        return new abgu();
    }

    public final String a(String str) {
        for (Map.Entry entry : this.b) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    public final Map b() {
        ysd ysdVar = new ysd(this.b.size());
        for (Map.Entry entry : this.b) {
            ysdVar.put((String) entry.getKey(), (String) entry.getValue());
        }
        return Collections.unmodifiableMap(ysdVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yse) {
            return this.b.equals(((yse) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
