package defpackage;

import android.content.Context;
import com.facebook.litho.ComponentTree;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dss {
    public int a = -1;
    public float b = 4.0f;
    public dhe c;
    public boolean d;
    public boolean e;
    public int f;
    public List g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public dsj o;
    public boolean p;
    public boolean q;
    public drm r;
    public dkb s;
    public ajzp t;

    public dss() {
        Field field = dsx.a;
        this.h = true;
        this.i = false;
        boolean z = doa.a;
        this.j = doa.l;
        this.k = -1;
        this.l = doa.j;
        this.m = doa.k;
        this.n = true;
        this.p = false;
        this.q = false;
    }

    public final dsx a(dhe dheVar) {
        ComponentTree componentTree;
        ComponentTree componentTree2;
        this.c = new dhe(dheVar.b, dheVar.c, dheVar.l, dheVar.n(), (byte[]) null, (byte[]) null, (byte[]) null);
        boolean z = false;
        this.h = this.h && ((componentTree2 = dheVar.j) == null || componentTree2.j);
        if (this.n && ((componentTree = dheVar.j) == null || componentTree.k)) {
            z = true;
        }
        this.n = z;
        ComponentTree componentTree3 = dheVar.j;
        if (this.r == null) {
            Context context = dheVar.b;
            this.r = new drm(1);
        }
        return new dsx(this);
    }
}
