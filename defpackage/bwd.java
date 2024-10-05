package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bwd implements Cloneable {
    public ArrayList j;
    public ArrayList k;
    public lo n;
    private static final int[] p = {2, 1, 3, 4};
    private static final ll x = new ll();
    private static final ThreadLocal q = new ThreadLocal();
    private final String r = getClass().getName();
    public long a = -1;
    public long b = -1;
    public TimeInterpolator c = null;
    final ArrayList d = new ArrayList();
    final ArrayList e = new ArrayList();
    private ArrayList s = null;
    public bwn f = new bwn();
    public bwn g = new bwn();
    bwk h = null;
    public final int[] i = p;
    final ArrayList l = new ArrayList();
    private int t = 0;
    private boolean u = false;
    private boolean v = false;
    public ArrayList m = null;
    private ArrayList w = new ArrayList();
    public ll o = x;

    private static boolean I(bwm bwmVar, bwm bwmVar2, String str) {
        Object obj = bwmVar.a.get(str);
        Object obj2 = bwmVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private static void e(bwn bwnVar, View view, bwm bwmVar) {
        bwnVar.a.put(view, bwmVar);
        int id = view.getId();
        if (id >= 0) {
            if (bwnVar.b.indexOfKey(id) >= 0) {
                bwnVar.b.put(id, null);
            } else {
                bwnVar.b.put(id, view);
            }
        }
        String w = jw.w(view);
        if (w != null) {
            if (bwnVar.d.containsKey(w)) {
                bwnVar.d.put(w, null);
            } else {
                bwnVar.d.put(w, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (bwnVar.c.a(itemIdAtPosition) >= 0) {
                    View view2 = (View) bwnVar.c.f(itemIdAtPosition);
                    if (view2 != null) {
                        jw.U(view2, false);
                        bwnVar.c.k(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                jw.U(view, true);
                bwnVar.c.k(itemIdAtPosition, view);
            }
        }
    }

    private final void f(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.s;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            if (view.getParent() instanceof ViewGroup) {
                bwm bwmVar = new bwm(view);
                if (z) {
                    c(bwmVar);
                } else {
                    b(bwmVar);
                }
                bwmVar.c.add(this);
                l(bwmVar);
                if (z) {
                    e(this.f, view, bwmVar);
                } else {
                    e(this.g, view, bwmVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public static adz g() {
        ThreadLocal threadLocal = q;
        adz adzVar = (adz) threadLocal.get();
        if (adzVar != null) {
            return adzVar;
        }
        adz adzVar2 = new adz();
        threadLocal.set(adzVar2);
        return adzVar2;
    }

    public final void A() {
        ArrayList arrayList = this.s;
        Integer valueOf = Integer.valueOf(R.id.button_container);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(valueOf)) {
            arrayList.add(valueOf);
        }
        this.s = arrayList;
    }

    public final void B(bwc bwcVar) {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(bwcVar);
        if (this.m.size() == 0) {
            this.m = null;
        }
    }

    public void C(long j) {
        this.b = j;
    }

    public void D(TimeInterpolator timeInterpolator) {
        this.c = timeInterpolator;
    }

    public void E() {
    }

    public void F(long j) {
        this.a = j;
    }

    public void G(lo loVar) {
        this.n = null;
    }

    public void H(ll llVar) {
        if (llVar == null) {
            this.o = x;
        } else {
            this.o = llVar;
        }
    }

    public Animator a(ViewGroup viewGroup, bwm bwmVar, bwm bwmVar2) {
        return null;
    }

    public abstract void b(bwm bwmVar);

    public abstract void c(bwm bwmVar);

    public String[] d() {
        return null;
    }

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public bwd clone() {
        try {
            bwd bwdVar = (bwd) super.clone();
            bwdVar.w = new ArrayList();
            bwdVar.f = new bwn();
            bwdVar.g = new bwn();
            bwdVar.j = null;
            bwdVar.k = null;
            return bwdVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bwm i(View view, boolean z) {
        bwk bwkVar = this.h;
        if (bwkVar != null) {
            return bwkVar.i(view, z);
        }
        ArrayList arrayList = z ? this.j : this.k;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            bwm bwmVar = (bwm) arrayList.get(i);
            if (bwmVar == null) {
                return null;
            }
            if (bwmVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (bwm) (z ? this.k : this.j).get(i);
        }
        return null;
    }

    public final bwm j(View view, boolean z) {
        bwk bwkVar = this.h;
        if (bwkVar != null) {
            return bwkVar.j(view, z);
        }
        return (bwm) (z ? this.f : this.g).a.get(view);
    }

    public String k(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.b != -1) {
            str2 = str2 + "dur(" + this.b + ") ";
        }
        if (this.a != -1) {
            str2 = str2 + "dly(" + this.a + ") ";
        }
        if (this.c != null) {
            str2 = str2 + "interp(" + this.c + ") ";
        }
        if (this.d.size() <= 0 && this.e.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.d.size() > 0) {
            for (int i = 0; i < this.d.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.d.get(i);
            }
        }
        if (this.e.size() > 0) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.e.get(i2);
            }
        }
        return str3 + ")";
    }

    public void l(bwm bwmVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(ViewGroup viewGroup, boolean z) {
        n(z);
        if (this.d.size() > 0 || this.e.size() > 0) {
            for (int i = 0; i < this.d.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.d.get(i)).intValue());
                if (findViewById != null) {
                    bwm bwmVar = new bwm(findViewById);
                    if (z) {
                        c(bwmVar);
                    } else {
                        b(bwmVar);
                    }
                    bwmVar.c.add(this);
                    l(bwmVar);
                    if (z) {
                        e(this.f, findViewById, bwmVar);
                    } else {
                        e(this.g, findViewById, bwmVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                View view = (View) this.e.get(i2);
                bwm bwmVar2 = new bwm(view);
                if (z) {
                    c(bwmVar2);
                } else {
                    b(bwmVar2);
                }
                bwmVar2.c.add(this);
                l(bwmVar2);
                if (z) {
                    e(this.f, view, bwmVar2);
                } else {
                    e(this.g, view, bwmVar2);
                }
            }
            return;
        }
        f(viewGroup, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z) {
        if (z) {
            this.f.a.clear();
            this.f.b.clear();
            this.f.c.j();
        } else {
            this.g.a.clear();
            this.g.b.clear();
            this.g.c.j();
        }
    }

    public void o(ViewGroup viewGroup, bwn bwnVar, bwn bwnVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        bwm bwmVar;
        int i;
        Animator animator2;
        bwm bwmVar2;
        adz g = g();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            bwm bwmVar3 = (bwm) arrayList.get(i2);
            bwm bwmVar4 = (bwm) arrayList2.get(i2);
            if (bwmVar3 != null && !bwmVar3.c.contains(this)) {
                bwmVar3 = null;
            }
            if (bwmVar4 != null && !bwmVar4.c.contains(this)) {
                bwmVar4 = null;
            }
            if ((bwmVar3 != null || bwmVar4 != null) && (bwmVar3 == null || bwmVar4 == null || v(bwmVar3, bwmVar4))) {
                Animator a = a(viewGroup, bwmVar3, bwmVar4);
                if (a != null) {
                    if (bwmVar4 != null) {
                        View view2 = bwmVar4.b;
                        String[] d = d();
                        if (d != null) {
                            bwm bwmVar5 = new bwm(view2);
                            bwm bwmVar6 = (bwm) bwnVar2.a.get(view2);
                            if (bwmVar6 != null) {
                                int i3 = 0;
                                while (i3 < d.length) {
                                    Map map = bwmVar5.a;
                                    Animator animator3 = a;
                                    String str = d[i3];
                                    map.put(str, bwmVar6.a.get(str));
                                    i3++;
                                    a = animator3;
                                    d = d;
                                }
                            }
                            animator2 = a;
                            int i4 = g.j;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    bwmVar2 = bwmVar5;
                                    break;
                                }
                                bwb bwbVar = (bwb) g.get((Animator) g.f(i5));
                                if (bwbVar.c != null && bwbVar.a == view2 && bwbVar.b.equals(this.r) && bwbVar.c.equals(bwmVar5)) {
                                    bwmVar2 = bwmVar5;
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            animator2 = a;
                            bwmVar2 = null;
                        }
                        view = view2;
                        bwmVar = bwmVar2;
                        animator = animator2;
                    } else {
                        view = bwmVar3.b;
                        animator = a;
                        bwmVar = null;
                    }
                    if (animator != null) {
                        i = size;
                        g.put(animator, new bwb(view, this.r, this, bwr.e(viewGroup), bwmVar));
                        this.w.add(animator);
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = (Animator) this.w.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((sparseIntArray.valueAt(i6) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p() {
        int i = this.t - 1;
        this.t = i;
        if (i == 0) {
            ArrayList arrayList = this.m;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.m.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((bwc) arrayList2.get(i2)).a(this);
                }
            }
            for (int i3 = 0; i3 < this.f.c.c(); i3++) {
                View view = (View) this.f.c.h(i3);
                if (view != null) {
                    jw.U(view, false);
                }
            }
            for (int i4 = 0; i4 < this.g.c.c(); i4++) {
                View view2 = (View) this.g.c.h(i4);
                if (view2 != null) {
                    jw.U(view2, false);
                }
            }
            this.v = true;
        }
    }

    public void q(ViewGroup viewGroup) {
        adz g = g();
        int i = g.j;
        if (viewGroup == null || i == 0) {
            return;
        }
        bxb e = bwr.e(viewGroup);
        adz adzVar = new adz(g);
        g.clear();
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            bwb bwbVar = (bwb) adzVar.i(i);
            if (bwbVar.a != null && e.equals(bwbVar.e)) {
                ((Animator) adzVar.f(i)).end();
            }
        }
    }

    public void r(View view) {
        if (this.v) {
            return;
        }
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                ((Animator) this.l.get(size)).pause();
            }
        }
        ArrayList arrayList = this.m;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.m.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((bwc) arrayList2.get(i)).c();
            }
        }
        this.u = true;
    }

    public void s(View view) {
        if (this.u) {
            if (!this.v) {
                int size = this.l.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((Animator) this.l.get(size)).resume();
                    }
                }
                ArrayList arrayList = this.m;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.m.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((bwc) arrayList2.get(i)).d();
                    }
                }
            }
            this.u = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        u();
        adz g = g();
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (g.containsKey(animator)) {
                u();
                if (animator != null) {
                    animator.addListener(new bvz(this, g));
                    long j = this.b;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.a;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.c;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new bwa(this));
                    animator.start();
                }
            }
        }
        this.w.clear();
        p();
    }

    public final String toString() {
        return k("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u() {
        if (this.t == 0) {
            ArrayList arrayList = this.m;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.m.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((bwc) arrayList2.get(i)).e();
                }
            }
            this.v = false;
        }
        this.t++;
    }

    public boolean v(bwm bwmVar, bwm bwmVar2) {
        if (bwmVar != null && bwmVar2 != null) {
            String[] d = d();
            if (d != null) {
                for (String str : d) {
                    if (I(bwmVar, bwmVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = bwmVar.a.keySet().iterator();
                while (it.hasNext()) {
                    if (I(bwmVar, bwmVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w(View view) {
        int id = view.getId();
        ArrayList arrayList = this.s;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            return (this.d.size() == 0 && this.e.size() == 0) || this.d.contains(Integer.valueOf(id)) || this.e.contains(view);
        }
        return false;
    }

    public final void x(bwc bwcVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(bwcVar);
    }

    public void y(int i) {
        this.d.add(Integer.valueOf(i));
    }

    public void z(View view) {
        this.e.add(view);
    }
}
