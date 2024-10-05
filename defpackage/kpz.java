package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kpz {
    public final String a;
    public final avgg b;

    public kpz(String str, avgg avggVar) {
        this.a = str;
        this.b = avggVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kpz)) {
            return false;
        }
        kpz kpzVar = (kpz) obj;
        return TextUtils.equals(this.a, kpzVar.a) && amkq.b(this.b, kpzVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
