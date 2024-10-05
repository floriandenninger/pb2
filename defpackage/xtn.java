package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xtn implements xum {
    public final xud a;
    public final xun b;
    public final List c = new ArrayList();
    public final amrp d = amru.f();
    public String e;
    public String f;
    public Uri g;
    public amru h;

    public xtn(xud xudVar, xun xunVar) {
        this.a = xudVar;
        this.b = xunVar;
    }

    @Override // defpackage.xum
    public final void a() {
        ammv a = this.a.a(this.g);
        if (a.h()) {
            xug b = ((xuh) a.c()).b();
            b.c(2);
            this.a.g(b.a());
        }
        d();
    }

    @Override // defpackage.xum
    public final void b(String str) {
        ammv a = this.a.a(this.g);
        if (a.h()) {
            xug b = ((xuh) a.c()).b();
            b.c = str;
            b.c(3);
            this.a.g(b.a());
        }
        d();
    }

    @Override // defpackage.xum
    public final void c(Drawable drawable, int i) {
    }

    public final void d() {
        this.g = null;
        if (this.c.isEmpty()) {
            return;
        }
        Uri uri = (Uri) this.c.remove(0);
        this.g = uri;
        ammv a = this.a.a(uri);
        if (a.h()) {
            xug b = ((xuh) a.c()).b();
            b.c(1);
            this.a.g(b.a());
            this.b.c(this.e, this.f, this.g);
            return;
        }
        d();
    }
}
