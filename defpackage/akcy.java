package defpackage;

import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akcy implements akch, zcc, zcb {
    private static final int e = (int) TimeUnit.SECONDS.toMillis(12);
    private static final int f = (int) TimeUnit.SECONDS.toMillis(6);
    public zcd c;
    public akcj d;
    private final akcm g;
    private final akda h;
    private View l;
    private boolean m;
    private akcv n;
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    private boolean o = false;
    public final Set a = new CopyOnWriteArraySet();
    public final zig b = new zig(Looper.myLooper(), this);
    private final ViewTreeObserver.OnGlobalLayoutListener k = new akcx(this);

    public akcy(akcm akcmVar, aahd aahdVar, acqz acqzVar) {
        this.g = akcmVar;
        this.h = new akda(this, aahdVar, acqzVar);
    }

    private final Rect l(Rect rect) {
        this.i.set(rect);
        this.l.getLocationInWindow(this.j);
        Rect rect2 = this.i;
        int[] iArr = this.j;
        rect2.offset(iArr[0], iArr[1]);
        return this.i;
    }

    private static boolean m(akcj akcjVar) {
        View view = akcjVar != null ? akcjVar.c : null;
        return view != null && view.isShown();
    }

    @Override // defpackage.akch
    public final /* synthetic */ akci a() {
        return akcj.a();
    }

    @Override // defpackage.akch
    public final void b(akcj akcjVar) {
        if (akcjVar == null || akcjVar != this.d) {
            return;
        }
        f();
    }

    @Override // defpackage.akch
    public final void c(final akcj akcjVar) {
        View view = akcjVar != null ? akcjVar.c : null;
        if (view == null || zev.e(view.getContext()) || this.d != null || i()) {
            return;
        }
        this.d = akcjVar;
        akcm akcmVar = this.g;
        akci a = akcj.a();
        a.a = akcjVar.c;
        a.b = akcjVar.d;
        a.c = akcjVar.e;
        a.j(akcjVar.h);
        a.k(akcjVar.i);
        a.i(akcjVar.j);
        a.c(akcjVar.k);
        a.h(akcjVar.l);
        a.b(akcjVar.n);
        a.e(akcjVar.m);
        apmg apmgVar = akcjVar.f;
        if (apmgVar != null) {
            a.d = apmgVar;
        } else {
            a.d = null;
        }
        apmg apmgVar2 = akcjVar.g;
        if (apmgVar2 != null) {
            a.e = apmgVar2;
        } else {
            a.e = null;
        }
        a.h = new akcs() { // from class: akcw
            @Override // defpackage.akcs
            public final void a(int i) {
                akcy akcyVar = akcy.this;
                akcj akcjVar2 = akcjVar;
                akcyVar.c.d();
                akbl akblVar = akcjVar2.o;
                if (akblVar != null) {
                    akblVar.li(akcjVar2, i);
                }
                akcyVar.b.a();
                Iterator it = akcyVar.a.iterator();
                while (it.hasNext()) {
                    ((akbl) it.next()).li(akcjVar2, i);
                }
            }
        };
        final akcj a2 = a.a();
        View view2 = a2.c;
        View inflate = View.inflate(view2.getContext(), R.layout.tooltip_content_view, null);
        TextView textView = (TextView) inflate.findViewById(R.id.tooltip_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tooltip_description);
        whu.G(textView, a2.d);
        whu.G(textView2, a2.e);
        if (textView.getVisibility() == 8) {
            yny.z(textView2, yny.v(0), ViewGroup.MarginLayoutParams.class);
        }
        TextView textView3 = (TextView) inflate.findViewById(R.id.action_button);
        TextView textView4 = (TextView) inflate.findViewById(R.id.dismiss_button);
        akcm.a(textView3, a2.f);
        akcm.a(textView4, a2.g);
        final akcv akcvVar = new akcv(inflate, view2, a2.j, a2.k, a2.i);
        akcvVar.a.f = ((Boolean) a2.n.e(false)).booleanValue();
        akcmVar.b(textView3, akcvVar, a2.f, 1);
        akcmVar.b(textView4, akcvVar, a2.g, 2);
        float f2 = a2.l;
        akcu akcuVar = akcvVar.a;
        akcuVar.k = f2;
        if (akcuVar.isShown()) {
            akcuVar.requestLayout();
        }
        if (a2.m.h()) {
            akcvVar.a.d(((Integer) a2.m.c()).intValue());
        }
        akcvVar.d(a2.h == 1);
        akcvVar.f(a2.q);
        akcvVar.e(new View.OnClickListener() { // from class: akck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                akcj akcjVar2 = akcj.this;
                akcv akcvVar2 = akcvVar;
                View.OnClickListener onClickListener = akcjVar2.p;
                if (onClickListener != null) {
                    onClickListener.onClick(view3);
                }
                akcvVar2.b(0);
            }
        });
        this.n = akcvVar;
        this.c.c(view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.k);
    }

    public final void d(akcv akcvVar, int i) {
        if (i()) {
            akcvVar.b(i);
            if (akcvVar == this.n) {
                h();
            }
        }
        if (this.o) {
            h();
        }
    }

    @Override // defpackage.zcb
    public final void e(View view) {
        if (view == null) {
            f();
        }
    }

    public final void f() {
        d(this.n, 0);
    }

    public final void g(View view) {
        if (this.m) {
            return;
        }
        this.m = true;
        this.l = view;
        zcd zcdVar = new zcd(view);
        this.c = zcdVar;
        zcdVar.c = this;
        zcdVar.b = this;
    }

    public final void h() {
        View view;
        akcj akcjVar = this.d;
        if (akcjVar != null && (view = akcjVar.c) != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.k);
        }
        this.n = null;
        this.d = null;
        this.o = false;
    }

    public final boolean i() {
        akcv akcvVar = this.n;
        return akcvVar != null && akcvVar.i();
    }

    public final boolean j() {
        return this.n != null && m(this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x015c, code lost:
    
        if ((r2.b & 8) == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0162, code lost:
    
        if ((r11.b & 8192) == 0) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.akci k(defpackage.avhy r11) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akcy.k(avhy):akci");
    }

    @Override // defpackage.zcc
    public final void rV(zby zbyVar) {
        if (this.n == null) {
            return;
        }
        if (!zbyVar.e() || !m(this.d)) {
            f();
            return;
        }
        if (!this.n.i()) {
            akcj akcjVar = this.d;
            Rect l = l(zbyVar.a);
            akbl akblVar = akcjVar.o;
            if (akcjVar.a) {
                if (akblVar != null) {
                    akblVar.lj(akcjVar);
                    akblVar.li(akcjVar, 3);
                }
                for (akbl akblVar2 : this.a) {
                    akblVar2.lj(akcjVar);
                    akblVar2.li(akcjVar, 3);
                }
                h();
                return;
            }
            this.n.g(l);
            int i = akcjVar.b;
            if (i != -2) {
                if (i == -1) {
                    i = f;
                } else if (i == 0) {
                    i = e;
                }
                zig zigVar = this.b;
                zigVar.sendMessageDelayed(zigVar.obtainMessage(1, this.n), i);
            }
            if (akblVar != null) {
                akblVar.lj(akcjVar);
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((akbl) it.next()).lj(akcjVar);
            }
            this.o = true;
            return;
        }
        akcv akcvVar = this.n;
        akcvVar.a.c(l(zbyVar.a));
        akcvVar.a.requestLayout();
        akcvVar.a.invalidate();
    }
}
