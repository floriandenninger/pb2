package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ub extends xu {
    private static TimeInterpolator l;
    ArrayList a;
    ArrayList b;
    ArrayList c;
    ArrayList d;
    ArrayList e;
    ArrayList f;
    ArrayList g;
    private ArrayList m;
    private ArrayList n;
    private ArrayList o;
    private ArrayList p;

    public ub() {
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    private final void A(wv wvVar) {
        if (l == null) {
            l = new ValueAnimator().getInterpolator();
        }
        wvVar.a.animate().setInterpolator(l);
        b(wvVar);
    }

    private final boolean B(tz tzVar, wv wvVar) {
        if (tzVar.b == wvVar) {
            tzVar.b = null;
        } else {
            if (tzVar.a != wvVar) {
                return false;
            }
            tzVar.a = null;
        }
        wvVar.a.setAlpha(1.0f);
        wvVar.a.setTranslationX(0.0f);
        wvVar.a.setTranslationY(0.0f);
        l(wvVar);
        return true;
    }

    static final void k(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((wv) list.get(size)).a.animate().cancel();
            }
        }
    }

    private final void y(List list, wv wvVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            tz tzVar = (tz) list.get(size);
            if (B(tzVar, wvVar) && tzVar.a == null && tzVar.b == null) {
                list.remove(tzVar);
            }
        }
    }

    private final void z(tz tzVar) {
        wv wvVar = tzVar.a;
        if (wvVar != null) {
            B(tzVar, wvVar);
        }
        wv wvVar2 = tzVar.b;
        if (wvVar2 != null) {
            B(tzVar, wvVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (j()) {
            return;
        }
        m();
    }

    @Override // defpackage.vz
    public final void b(wv wvVar) {
        View view = wvVar.a;
        view.animate().cancel();
        int size = this.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((ua) this.o.get(size)).a == wvVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                l(wvVar);
                this.o.remove(size);
            }
        }
        y(this.p, wvVar);
        if (this.m.remove(wvVar)) {
            view.setAlpha(1.0f);
            l(wvVar);
        }
        if (this.n.remove(wvVar)) {
            view.setAlpha(1.0f);
            l(wvVar);
        }
        int size2 = this.c.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.c.get(size2);
            y(arrayList, wvVar);
            if (arrayList.isEmpty()) {
                this.c.remove(size2);
            }
        }
        int size3 = this.b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.b.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((ua) arrayList2.get(size4)).a == wvVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    l(wvVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.b.remove(size3);
                    }
                }
            }
        }
        int size5 = this.a.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.a.get(size5);
                if (arrayList3.remove(wvVar)) {
                    view.setAlpha(1.0f);
                    l(wvVar);
                    if (arrayList3.isEmpty()) {
                        this.a.remove(size5);
                    }
                }
            } else {
                this.f.remove(wvVar);
                this.d.remove(wvVar);
                this.g.remove(wvVar);
                this.e.remove(wvVar);
                a();
                return;
            }
        }
    }

    @Override // defpackage.vz
    public final void c() {
        int size = this.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ua uaVar = (ua) this.o.get(size);
            View view = uaVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            l(uaVar.a);
            this.o.remove(size);
        }
        int size2 = this.m.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            l((wv) this.m.get(size2));
            this.m.remove(size2);
        }
        int size3 = this.n.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            wv wvVar = (wv) this.n.get(size3);
            wvVar.a.setAlpha(1.0f);
            l(wvVar);
            this.n.remove(size3);
        }
        int size4 = this.p.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                z((tz) this.p.get(size4));
            }
        }
        this.p.clear();
        if (!j()) {
            return;
        }
        int size5 = this.b.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.b.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    ua uaVar2 = (ua) arrayList.get(size6);
                    View view2 = uaVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    l(uaVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.b.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.a.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.a.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    wv wvVar2 = (wv) arrayList2.get(size8);
                    wvVar2.a.setAlpha(1.0f);
                    l(wvVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.a.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.c.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.c.get(size9);
                int size10 = arrayList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        z((tz) arrayList3.get(size10));
                        if (arrayList3.isEmpty()) {
                            this.c.remove(arrayList3);
                        }
                    }
                }
            } else {
                k(this.f);
                k(this.e);
                k(this.d);
                k(this.g);
                m();
                return;
            }
        }
    }

    @Override // defpackage.vz
    public final void d() {
        boolean isEmpty = this.m.isEmpty();
        boolean z = !isEmpty;
        boolean z2 = !this.o.isEmpty();
        boolean isEmpty2 = this.p.isEmpty();
        boolean z3 = !isEmpty2;
        boolean z4 = !this.n.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                wv wvVar = (wv) arrayList.get(i);
                View view = wvVar.a;
                ViewPropertyAnimator animate = view.animate();
                this.f.add(wvVar);
                animate.setDuration(120L).alpha(0.0f).setListener(new tu(this, wvVar, animate, view)).start();
                i++;
            }
            this.m.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.o);
                this.b.add(arrayList2);
                this.o.clear();
                tt ttVar = new tt(this, arrayList2, 1);
                if (z) {
                    jw.I(((ua) arrayList2.get(0)).a.a, ttVar, 120L);
                } else {
                    ttVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.p);
                this.c.add(arrayList3);
                this.p.clear();
                tt ttVar2 = new tt(this, arrayList3, 0);
                if (z) {
                    jw.I(((tz) arrayList3.get(0)).a.a, ttVar2, 120L);
                } else {
                    ttVar2.run();
                }
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.n);
                this.a.add(arrayList4);
                this.n.clear();
                tt ttVar3 = new tt(this, arrayList4, 2);
                if (z || z2 || z3) {
                    jw.I(((wv) arrayList4.get(0)).a, ttVar3, (true == isEmpty ? 0L : 120L) + Math.max(z2 ? this.i : 0L, true != isEmpty2 ? 250L : 0L));
                } else {
                    ttVar3.run();
                }
            }
        }
    }

    @Override // defpackage.xu
    public final boolean e(wv wvVar) {
        A(wvVar);
        wvVar.a.setAlpha(0.0f);
        this.n.add(wvVar);
        return true;
    }

    @Override // defpackage.xu
    public final boolean f(wv wvVar, wv wvVar2, int i, int i2, int i3, int i4) {
        if (wvVar == wvVar2) {
            return g(wvVar, i, i2, i3, i4);
        }
        float translationX = wvVar.a.getTranslationX();
        float translationY = wvVar.a.getTranslationY();
        float alpha = wvVar.a.getAlpha();
        A(wvVar);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        wvVar.a.setTranslationX(translationX);
        wvVar.a.setTranslationY(translationY);
        wvVar.a.setAlpha(alpha);
        if (wvVar2 != null) {
            A(wvVar2);
            wvVar2.a.setTranslationX(-i5);
            wvVar2.a.setTranslationY(-i6);
            wvVar2.a.setAlpha(0.0f);
        }
        this.p.add(new tz(wvVar, wvVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.xu
    public final boolean g(wv wvVar, int i, int i2, int i3, int i4) {
        View view = wvVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) wvVar.a.getTranslationY());
        A(wvVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                l(wvVar);
                return false;
            }
            i5 = 0;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.o.add(new ua(wvVar, translationX, translationY, i3, i4));
        return true;
    }

    @Override // defpackage.xu
    public boolean h(wv wvVar) {
        A(wvVar);
        this.m.add(wvVar);
        return true;
    }

    @Override // defpackage.vz
    public final boolean i(wv wvVar, List list) {
        return !list.isEmpty() || o(wvVar);
    }

    @Override // defpackage.vz
    public final boolean j() {
        return (this.n.isEmpty() && this.p.isEmpty() && this.o.isEmpty() && this.m.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    public ub(byte[] bArr) {
        this();
        x();
    }

    public ub(char[] cArr) {
        this();
        x();
    }
}
