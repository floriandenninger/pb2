package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vfk {
    public final Context a;
    public final anib b;
    public String c;
    public Set d;
    public vfj g;
    private boolean h = false;
    public boolean e = false;
    public amnv f = gzp.l;

    public vfk(Context context, anib anibVar) {
        this.a = context;
        this.b = anibVar;
    }

    public final vfn a() {
        boolean z = true;
        if (!this.h && this.d == null) {
            z = false;
        }
        amkq.F(z, "Must specify either forKeys(...) or forAllKeys() before calling build().");
        return new vfn(this);
    }

    public final void b() {
        this.e = true;
    }

    public final void c() {
        this.d = null;
        this.h = true;
    }

    public final void d(String... strArr) {
        amkq.F(strArr != null, "Cannot call forKeys() with null argument");
        amsv i = amsx.i();
        i.i(strArr);
        amsx g = i.g();
        amkq.F(g.size() == strArr.length, "Duplicate keys specified");
        this.d = g;
        this.h = false;
    }

    public final void e(vfl vflVar) {
        this.g = new vfj(vflVar);
    }
}
