package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class krm extends aivc implements fnp {
    public final axpg a;
    public final ajdw b;
    public final int c;
    public krl d;
    public aqrf e;
    public ViewGroup f;
    public ViewGroup g;
    public View h;
    public int i;
    public int j;
    public aoyy k;
    public ajds l;
    private final aahd m;
    private fhg n;

    public krm(Context context, axpg axpgVar, ajdw ajdwVar, aahd aahdVar, int i) {
        super(context);
        this.b = ajdwVar;
        aahdVar.getClass();
        this.m = aahdVar;
        axpgVar.getClass();
        this.a = axpgVar;
        this.c = i;
        d();
    }

    private final Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        return hashMap;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void d() {
        this.l = null;
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.g.removeAllViews();
            this.f.setVisibility(8);
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.f = null;
            this.g = null;
            this.h = null;
        }
        if (this.e != null) {
            this.b.b(null);
            this.e = null;
        }
        this.i = 0;
        this.j = 0;
        this.k = null;
    }

    public final void e() {
        fhg fhgVar = this.n;
        if (fhgVar == null || this.k == null) {
            return;
        }
        if (fhgVar.l()) {
            this.m.d(this.k.d, f());
        } else if (this.n.b()) {
            this.m.d(this.k.b, f());
        } else {
            this.m.d(this.k.c, f());
        }
    }

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return fkc.d(fhgVar);
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        fhg fhgVar2 = this.n;
        if (fhgVar2 == null || fhgVar != fhgVar2) {
            this.n = fhgVar;
            e();
        }
    }
}
