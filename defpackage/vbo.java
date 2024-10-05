package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vbo {
    private static final Bundle k = new Bundle();
    public final List a = new ArrayList();
    protected final List b = new ArrayList();
    public vbn c;
    public vbn d;
    public vbn e;
    public vbn f;
    public vbn g;
    public vbn h;
    public vbn i;
    public vbn j;

    public vbo() {
        new HashSet();
        Thread.currentThread().getId();
    }

    public static final String c(vca vcaVar) {
        if (!(vcaVar instanceof vyi)) {
            return null;
        }
        if (vcaVar instanceof vcb) {
            return ((vcb) vcaVar).a();
        }
        return vcaVar.getClass().getName();
    }

    public static final Bundle d(vca vcaVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String c = c(vcaVar);
        return c != null ? bundle.getBundle(c) : k;
    }

    public final void a(vbn vbnVar) {
        this.b.remove(vbnVar);
    }

    public final void b(vbn vbnVar) {
        uqq.j();
        for (int i = 0; i < this.a.size(); i++) {
            vbnVar.a((vca) this.a.get(i));
        }
        this.b.add(vbnVar);
    }
}
