package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vin {
    private final StringBuilder b = new StringBuilder();
    public final ArrayList a = new ArrayList();

    public final vim a() {
        String sb = this.b.toString();
        ArrayList arrayList = this.a;
        return new vim(sb, arrayList.toArray(new Object[arrayList.size()]));
    }

    public final void b(String str) {
        this.b.append(str);
    }

    public final void c(String str) {
        this.a.add(str);
    }
}
