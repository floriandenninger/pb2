package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aabh extends vw {
    private final Context d;
    private final boolean e;
    private List f = null;
    private aabn g;
    private aabq h;

    public aabh(Context context, boolean z) {
        this.d = context;
        this.e = z;
    }

    @Override // defpackage.vw
    public final int b() {
        List list = this.f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.vw
    public final int c(int i) {
        return ((aaaa) this.f.get(i)).b.ordinal();
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        return this.g.a(this.d, viewGroup, zzz.values()[i], this.e);
    }

    @Override // defpackage.vw
    public final long mu(int i) {
        return i;
    }

    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        this.g.b(this.d, (aaaa) this.f.get(i), wvVar, this.h);
    }

    public final void w(List list, aabn aabnVar, aabq aabqVar) {
        this.g = aabnVar;
        aabqVar.getClass();
        this.h = aabqVar;
        if (this.f != list) {
            list.getClass();
            this.f = list;
            mw();
        }
    }
}
