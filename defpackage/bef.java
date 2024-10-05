package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bef extends asm {
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final SparseArray v;
    public final SparseBooleanArray w;

    @Deprecated
    public bef() {
        this.v = new SparseArray();
        this.w = new SparseBooleanArray();
        d();
    }

    private final void d() {
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = true;
    }

    public final bee b() {
        return new bee(this);
    }

    public final void c(asn asnVar) {
        super.a(asnVar);
    }

    public bef(Context context) {
        CaptioningManager captioningManager;
        int i = pts.a;
        if ((pts.a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.n = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.m = amru.r(locale.toLanguageTag());
            }
        }
        Point v = pts.v(context);
        int i2 = v.x;
        int i3 = v.y;
        this.e = i2;
        this.f = i3;
        this.g = true;
        this.v = new SparseArray();
        this.w = new SparseBooleanArray();
        d();
    }

    public bef(bee beeVar) {
        super(beeVar);
        int i = beeVar.y;
        this.q = beeVar.z;
        boolean z = beeVar.A;
        this.r = beeVar.B;
        this.s = beeVar.C;
        boolean z2 = beeVar.D;
        boolean z3 = beeVar.E;
        boolean z4 = beeVar.F;
        this.t = beeVar.G;
        boolean z5 = beeVar.H;
        this.u = beeVar.I;
        SparseArray sparseArray = beeVar.f148J;
        SparseArray sparseArray2 = new SparseArray();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray2.put(sparseArray.keyAt(i2), new HashMap((Map) sparseArray.valueAt(i2)));
        }
        this.v = sparseArray2;
        this.w = beeVar.K.clone();
    }
}
