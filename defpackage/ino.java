package defpackage;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ino extends zys {
    public final NestedScrollView a;
    public final hxp b;
    public Optional c;
    public ayqx d;
    public final RecyclerView e;
    public Optional f;
    public final Context g;
    public final acqz h;
    public final ajvb i;
    public final ajxj j;
    public final aaue k;
    public final ajlx l;
    public final sxw m;
    public aqyg n;
    public final lwk o;
    private final aahd p;
    private final aaqz q;
    private final afsy r;

    public ino(dd ddVar, Context context, aahd aahdVar, hxp hxpVar, acqz acqzVar, ajvb ajvbVar, ajxj ajxjVar, lwk lwkVar, aaue aaueVar, ajlx ajlxVar, sxw sxwVar, aaqz aaqzVar, afsy afsyVar, byte[] bArr, byte[] bArr2) {
        super(context, ddVar, null, Optional.empty(), true, false, true);
        this.p = aahdVar;
        this.b = hxpVar;
        this.g = context;
        this.h = acqzVar;
        this.i = ajvbVar;
        this.j = ajxjVar;
        this.o = lwkVar;
        this.k = aaueVar;
        this.l = ajlxVar;
        this.m = sxwVar;
        this.q = aaqzVar;
        this.r = afsyVar;
        this.a = new NestedScrollView(context);
        this.f = Optional.empty();
        this.c = Optional.empty();
        this.d = aynu.d();
        this.e = new RecyclerView(LayoutInflater.from(context).getContext());
    }

    @Override // defpackage.zys
    protected final View a() {
        return this.a;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        aqyg aqygVar = this.n;
        return aqygVar == null ? "" : ajcq.b(aqygVar);
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void d() {
        super.d();
        this.n = null;
        this.a.removeAllViews();
        if (this.c.isPresent()) {
            ((ajwi) this.c.get()).h();
            this.c = Optional.empty();
        }
        if (this.f.isPresent()) {
            this.p.a((apxf) this.f.get());
            this.f = Optional.empty();
        }
    }

    public final synchronized void l(hxn hxnVar) {
        if (hxnVar.a.f() != null) {
            if ((hxnVar.a.a.b & 33554432) != 0) {
                aaqz aaqzVar = this.q;
                afsx c = this.r.c();
                aqzg aqzgVar = hxnVar.a.a.w;
                if (aqzgVar == null) {
                    aqzgVar = aqzg.a;
                }
                arnd arndVar = hxnVar.a.a.c;
                if (arndVar == null) {
                    arndVar = arnd.a;
                }
                aaqzVar.a(c, aqzgVar, arndVar);
            }
            if (this.c.isPresent()) {
                ((ajwi) this.c.get()).h();
                ((ajwi) this.c.get()).M(hxnVar.a.f());
                return;
            }
            return;
        }
        afsi.b(2, 24, "browseResponseModel without section list");
        z();
    }
}
