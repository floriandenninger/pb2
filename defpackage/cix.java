package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cix implements ciw {
    public final List a;

    public cix(Object obj) {
        this(Collections.singletonList(new clt(obj)));
    }

    public cix(List list) {
        this.a = list;
    }

    @Override // defpackage.ciw
    public final List b() {
        return this.a;
    }

    @Override // defpackage.ciw
    public final boolean c() {
        return this.a.isEmpty() || (this.a.size() == 1 && ((clt) this.a.get(0)).e());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
