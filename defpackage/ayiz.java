package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayiz {
    private final ArrayList a = new ArrayList();

    public final void a(Object obj) {
        this.a.add(String.valueOf(obj));
    }

    public final void b(String str, Object obj) {
        ArrayList arrayList = this.a;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        arrayList.add(sb.toString());
    }

    public final String toString() {
        return this.a.toString();
    }
}
