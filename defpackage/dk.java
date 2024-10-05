package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public abstract class dk extends bxz {
    private final dd a;
    private dn c = null;
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private ce f = null;
    private boolean g;

    @Deprecated
    public dk(dd ddVar) {
        this.a = ddVar;
    }

    @Override // defpackage.bxz
    public final Parcelable a() {
        Bundle bundle;
        if (this.d.size() > 0) {
            bundle = new Bundle();
            Fragment$SavedState[] fragment$SavedStateArr = new Fragment$SavedState[this.d.size()];
            this.d.toArray(fragment$SavedStateArr);
            bundle.putParcelableArray("states", fragment$SavedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.e.size(); i++) {
            ce ceVar = (ce) this.e.get(i);
            if (ceVar != null && ceVar.ar()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.a.L(bundle, "f" + i, ceVar);
            }
        }
        return bundle;
    }

    public abstract ce b(int i);

    @Override // defpackage.bxz
    public Object c(ViewGroup viewGroup, int i) {
        Fragment$SavedState fragment$SavedState;
        ce ceVar;
        if (this.e.size() > i && (ceVar = (ce) this.e.get(i)) != null) {
            return ceVar;
        }
        if (this.c == null) {
            this.c = this.a.k();
        }
        ce b = b(i);
        if (this.d.size() > i && (fragment$SavedState = (Fragment$SavedState) this.d.get(i)) != null) {
            b.ah(fragment$SavedState);
        }
        while (this.e.size() <= i) {
            this.e.add(null);
        }
        b.ai(false);
        b.an(false);
        this.e.set(i, b);
        this.c.p(viewGroup.getId(), b);
        return b;
    }

    @Override // defpackage.bxz
    public void d(ViewGroup viewGroup, int i, Object obj) {
        ce ceVar = (ce) obj;
        if (this.c == null) {
            this.c = this.a.k();
        }
        while (this.d.size() <= i) {
            this.d.add(null);
        }
        this.d.set(i, ceVar.ar() ? this.a.c(ceVar) : null);
        this.e.set(i, null);
        this.c.m(ceVar);
        if (ceVar.equals(this.f)) {
            this.f = null;
        }
    }

    @Override // defpackage.bxz
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.d.clear();
            this.e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.d.add((Fragment$SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    ce g = this.a.g(bundle, str);
                    if (g != null) {
                        while (this.e.size() <= parseInt) {
                            this.e.add(null);
                        }
                        g.ai(false);
                        this.e.set(parseInt, g);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
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
        dn dnVar = this.c;
        if (dnVar != null) {
            if (!this.g) {
                try {
                    this.g = true;
                    dnVar.e();
                } finally {
                    this.g = false;
                }
            }
            this.c = null;
        }
    }

    @Override // defpackage.bxz
    public final void i(ViewGroup viewGroup, Object obj) {
        ce ceVar = (ce) obj;
        ce ceVar2 = this.f;
        if (ceVar != ceVar2) {
            if (ceVar2 != null) {
                ceVar2.ai(false);
                this.f.an(false);
            }
            ceVar.ai(true);
            ceVar.an(true);
            this.f = ceVar;
        }
    }
}
