package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nkt implements fwn {
    public final fka a;
    public View b;
    public boolean c;
    public nkn d;
    private final Context e;
    private final akch f;
    private final fgo g;
    private akcj h;

    public nkt(Context context, fka fkaVar, akch akchVar, fgo fgoVar) {
        this.e = context;
        this.a = fkaVar;
        this.f = akchVar;
        this.g = fgoVar;
    }

    private final akcj g() {
        if (this.h == null) {
            akci a = this.f.a();
            a.a = this.b;
            a.b = this.e.getString(R.string.offline_stub_header_tooltip_tutorial_title);
            a.c = this.e.getString(R.string.offline_stub_header_tooltip_tutorial_subtitle);
            a.i(1);
            a.c(1);
            a.f = new nks(this);
            a.l();
            this.h = a.a();
        }
        return this.h;
    }

    public final void a(View view) {
        this.b = view;
        this.h = null;
        d();
    }

    public final boolean b() {
        return this.a.f();
    }

    @Override // defpackage.fwk
    public final int c() {
        return 5001;
    }

    @Override // defpackage.fwk
    public final void d() {
        this.f.b(g());
    }

    @Override // defpackage.fwk
    public final void e() {
        if (f()) {
            this.f.c(g());
        }
    }

    @Override // defpackage.fwn
    public final boolean f() {
        return this.c && this.b != null && !this.g.k() && b();
    }
}
