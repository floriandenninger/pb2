package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.FragmentState;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dj {
    public final dl a;
    public final ce b;
    private final cs d;
    private boolean e = false;
    public int c = -1;

    public dj(cs csVar, dl dlVar, ce ceVar) {
        this.d = csVar;
        this.a = dlVar;
        this.b = ceVar;
    }

    public dj(cs csVar, dl dlVar, ce ceVar, FragmentState fragmentState) {
        this.d = csVar;
        this.a = dlVar;
        this.b = ceVar;
        ceVar.i = null;
        ceVar.j = null;
        ceVar.y = 0;
        ceVar.v = false;
        ceVar.r = false;
        ce ceVar2 = ceVar.n;
        ceVar.o = ceVar2 != null ? ceVar2.l : null;
        ceVar.n = null;
        Bundle bundle = fragmentState.m;
        if (bundle != null) {
            ceVar.h = bundle;
        } else {
            ceVar.h = new Bundle();
        }
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        ce ceVar = this.b;
        ceVar.mQ(bundle);
        ceVar.ab.c(bundle);
        Parcelable b = ceVar.B.b();
        if (b != null) {
            bundle.putParcelable("android:support:fragments", b);
        }
        this.d.j(this.b, bundle, false);
        if (true == bundle.isEmpty()) {
            bundle = null;
        }
        if (this.b.O != null) {
            g();
        }
        if (this.b.i != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.b.i);
        }
        if (this.b.j != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.b.j);
        }
        if (!this.b.Q) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.b.Q);
        }
        return bundle;
    }

    public final void b() {
        View view;
        View view2;
        dl dlVar = this.a;
        ce ceVar = this.b;
        ViewGroup viewGroup = ceVar.N;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = dlVar.a.indexOf(ceVar);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= dlVar.a.size()) {
                            break;
                        }
                        ce ceVar2 = (ce) dlVar.a.get(indexOf);
                        if (ceVar2.N == viewGroup && (view = ceVar2.O) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ce ceVar3 = (ce) dlVar.a.get(i2);
                    if (ceVar3.N == viewGroup && (view2 = ceVar3.O) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        ce ceVar4 = this.b;
        ceVar4.N.addView(ceVar4.O, i);
    }

    final void c() {
        String str;
        if (this.b.u) {
            return;
        }
        if (dd.W(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.b);
        }
        ce ceVar = this.b;
        LayoutInflater mf = ceVar.mf(ceVar.h);
        ce ceVar2 = this.b;
        ViewGroup viewGroup = ceVar2.N;
        if (viewGroup == null) {
            int i = ceVar2.E;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.b + " for a container view with no id");
                }
                viewGroup = (ViewGroup) ceVar2.z.n.a(i);
                if (viewGroup == null) {
                    ce ceVar3 = this.b;
                    if (!ceVar3.w) {
                        try {
                            str = ceVar3.qX().getResourceName(this.b.E);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.b.E) + " (" + str + ") for fragment " + this.b);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    anf.f(this.b, viewGroup);
                }
            }
        }
        ce ceVar4 = this.b;
        ceVar4.N = viewGroup;
        ceVar4.lO(mf, viewGroup, ceVar4.h);
        View view = this.b.O;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            ce ceVar5 = this.b;
            ceVar5.O.setTag(R.id.fragment_container_view_tag, ceVar5);
            if (viewGroup != null) {
                b();
            }
            ce ceVar6 = this.b;
            if (ceVar6.G) {
                ceVar6.O.setVisibility(8);
            }
            if (jw.aj(this.b.O)) {
                jw.K(this.b.O);
            } else {
                View view2 = this.b.O;
                view2.addOnAttachStateChangeListener(new di(view2));
            }
            this.b.ab();
            cs csVar = this.d;
            ce ceVar7 = this.b;
            csVar.m(ceVar7, ceVar7.O, ceVar7.h, false);
            int visibility = this.b.O.getVisibility();
            this.b.qY().l = this.b.O.getAlpha();
            ce ceVar8 = this.b;
            if (ceVar8.N != null && visibility == 0) {
                View findFocus = ceVar8.O.findFocus();
                if (findFocus != null) {
                    this.b.ag(findFocus);
                    if (dd.W(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("requestFocus: Saved focused view ");
                        sb2.append(findFocus);
                        sb2.append(" for Fragment ");
                        sb2.append(this.b);
                    }
                }
                this.b.O.setAlpha(0.0f);
            }
        }
        this.b.g = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        ce ceVar = this.b;
        if (ceVar.u && ceVar.v && !ceVar.x) {
            if (dd.W(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.b);
            }
            ce ceVar2 = this.b;
            ceVar2.lO(ceVar2.mf(ceVar2.h), null, this.b.h);
            View view = this.b.O;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                ce ceVar3 = this.b;
                ceVar3.O.setTag(R.id.fragment_container_view_tag, ceVar3);
                ce ceVar4 = this.b;
                if (ceVar4.G) {
                    ceVar4.O.setVisibility(8);
                }
                this.b.ab();
                cs csVar = this.d;
                ce ceVar5 = this.b;
                csVar.m(ceVar5, ceVar5.O, ceVar5.h, false);
                this.b.g = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x052d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0773, code lost:
    
        if (r6 != false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x052d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 2434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj.e():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(ClassLoader classLoader) {
        Bundle bundle = this.b.h;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        ce ceVar = this.b;
        ceVar.i = ceVar.h.getSparseParcelableArray("android:view_state");
        ce ceVar2 = this.b;
        ceVar2.j = ceVar2.h.getBundle("android:view_registry_state");
        ce ceVar3 = this.b;
        ceVar3.o = ceVar3.h.getString("android:target_state");
        ce ceVar4 = this.b;
        if (ceVar4.o != null) {
            ceVar4.p = ceVar4.h.getInt("android:target_req_state", 0);
        }
        ce ceVar5 = this.b;
        Boolean bool = ceVar5.k;
        if (bool != null) {
            ceVar5.Q = bool.booleanValue();
            this.b.k = null;
        } else {
            ceVar5.Q = ceVar5.h.getBoolean("android:user_visible_hint", true);
        }
        ce ceVar6 = this.b;
        if (ceVar6.Q) {
            return;
        }
        ceVar6.P = true;
    }

    final void g() {
        if (this.b.O == null) {
            return;
        }
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Saving view state for fragment ");
            sb.append(this.b);
            sb.append(" with view ");
            sb.append(this.b.O);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.b.O.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.b.i = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.b.Y.b.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.b.j = bundle;
    }

    public dj(cs csVar, dl dlVar, ClassLoader classLoader, cn cnVar, FragmentState fragmentState) {
        this.d = csVar;
        this.a = dlVar;
        ce c = cnVar.c(fragmentState.a);
        Bundle bundle = fragmentState.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        c.af(fragmentState.j);
        c.l = fragmentState.b;
        c.u = fragmentState.c;
        c.w = true;
        c.D = fragmentState.d;
        c.E = fragmentState.e;
        c.F = fragmentState.f;
        c.I = fragmentState.g;
        c.s = fragmentState.h;
        c.H = fragmentState.i;
        c.G = fragmentState.k;
        c.W = aoe.values()[fragmentState.l];
        Bundle bundle2 = fragmentState.m;
        if (bundle2 != null) {
            c.h = bundle2;
        } else {
            c.h = new Bundle();
        }
        this.b = c;
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(c);
        }
    }
}
