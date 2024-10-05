package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public abstract class dg extends bxz {
    private final dd c;
    private boolean e;
    private dn d = null;
    public ce a = null;

    @Deprecated
    public dg(dd ddVar) {
        this.c = ddVar;
    }

    private static String o(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // defpackage.bxz
    public final Parcelable a() {
        return null;
    }

    public abstract ce b(int i);

    @Override // defpackage.bxz
    public final Object c(ViewGroup viewGroup, int i) {
        if (this.d == null) {
            this.d = this.c.k();
        }
        long j = i;
        ce f = this.c.f(o(viewGroup.getId(), j));
        if (f != null) {
            this.d.o(new dm(7, f));
        } else {
            f = b(i);
            this.d.q(viewGroup.getId(), f, o(viewGroup.getId(), j));
        }
        if (f != this.a) {
            f.ai(false);
            f.an(false);
        }
        return f;
    }

    @Override // defpackage.bxz
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        ce ceVar = (ce) obj;
        if (this.d == null) {
            this.d = this.c.k();
        }
        dn dnVar = this.d;
        dd ddVar = ceVar.z;
        if (ddVar == null || ddVar == ((bf) dnVar).a) {
            dnVar.o(new dm(6, ceVar));
            if (ceVar.equals(this.a)) {
                this.a = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + ceVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.bxz
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // defpackage.bxz
    public final void f(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // defpackage.bxz
    public final boolean g(View view, Object obj) {
        return ((ce) obj).O == view;
    }

    @Override // defpackage.bxz
    public final void h() {
        dn dnVar = this.d;
        if (dnVar != null) {
            if (!this.e) {
                try {
                    this.e = true;
                    dnVar.e();
                } finally {
                    this.e = false;
                }
            }
            this.d = null;
        }
    }
}
