package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vwd implements vwc {
    public String a;
    public long b;
    private final List c = new ArrayList();

    @Override // defpackage.vwc
    public final /* bridge */ /* synthetic */ deb a() {
        return new del(this.a, this.b, this.c);
    }

    public final void b(String str) {
        List list = this.c;
        vlu.n(str);
        list.add(str);
    }
}
