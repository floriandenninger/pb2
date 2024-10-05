package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.common.ui.ScrollToTopLinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lxf {
    static final String a = String.valueOf(lxf.class.getName()).concat(".PRESENT_CONTEXT_KEY");
    public RecyclerView b;
    public ajol c;
    public String d;
    public lxm e;
    private wh f;
    private wf g;

    public static lxf c(ajok ajokVar) {
        Object c = ajokVar != null ? ajokVar.c(a) : null;
        if (c instanceof lxf) {
            return (lxf) c;
        }
        return null;
    }

    public final wf a() {
        if (this.g == null) {
            this.g = new lxe(this);
        }
        return this.g;
    }

    public final wh b() {
        if (this.f == null) {
            this.f = new lxd(this);
        }
        return this.f;
    }

    public final void d() {
        ((ScrollToTopLinearLayoutManager) this.b.n).c = true;
    }
}
