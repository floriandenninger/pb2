package defpackage;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class inp extends zys {
    public final ajfh a;
    public final ajdw b;
    public final NestedScrollView c;
    public final ili d;
    public final acqz e;
    public final boolean f;
    public aqyg g;
    public Optional h;
    public int i;
    private final aahd j;

    public inp(dd ddVar, Context context, ajfh ajfhVar, ajdw ajdwVar, aahd aahdVar, ili iliVar, acqz acqzVar, Optional optional, boolean z) {
        super(context, ddVar, null, optional, true, z, true);
        this.i = 0;
        this.a = ajfhVar;
        this.b = ajdwVar;
        this.j = aahdVar;
        this.f = z;
        this.c = new NestedScrollView(context);
        this.d = iliVar;
        this.e = acqzVar;
        this.h = Optional.empty();
    }

    @Override // defpackage.zys
    protected final View a() {
        return this.c;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        aqyg aqygVar = this.g;
        return aqygVar == null ? "" : ajcq.b(aqygVar);
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void d() {
        super.d();
        this.g = null;
        this.b.b(null);
        this.c.removeAllViews();
        if (this.h.isPresent()) {
            this.j.a((apxf) this.h.get());
            this.h = Optional.empty();
        }
        int i = this.i;
        if (i != 0) {
            this.d.c(i);
            this.i = 0;
        }
    }
}
