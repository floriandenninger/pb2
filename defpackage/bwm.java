package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwm {
    public View b;
    public final Map a = new HashMap();
    final ArrayList c = new ArrayList();

    @Deprecated
    public bwm() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bwm)) {
            return false;
        }
        bwm bwmVar = (bwm) obj;
        return this.b == bwmVar.b && this.a.equals(bwmVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }

    public bwm(View view) {
        this.b = view;
    }
}
