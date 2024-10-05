package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mwt implements fxh {
    private ajyf A;
    private ajyf B;
    private RecyclerView C;
    private ajos D;
    private final ajoy E;
    public final fgq a;
    public final zaw b;
    public int c;
    public boolean d = false;
    public boolean e = false;
    public LoadingFrameLayout f;
    public View g;
    public final Set h;
    final Map i;
    public final Map j;
    public mwn k;
    private final Activity l;
    private final azrw m;
    private final azrw n;
    private final gfz o;
    private final int p;
    private final int q;
    private final int r;
    private final ajoy s;
    private mws t;
    private mws u;
    private int v;
    private boolean w;
    private ViewGroup x;
    private ajpd y;
    private GridLayoutManager z;

    public mwt(Activity activity, fxj fxjVar, azrw azrwVar, azrw azrwVar2, fgq fgqVar, ajoy ajoyVar, ajoy ajoyVar2, gfz gfzVar, zaw zawVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.l = activity;
        azrwVar.getClass();
        this.m = azrwVar;
        azrwVar2.getClass();
        this.n = azrwVar2;
        fgqVar.getClass();
        this.a = fgqVar;
        this.E = ajoyVar;
        this.s = ajoyVar2;
        gfzVar.getClass();
        this.o = gfzVar;
        zawVar.getClass();
        this.b = zawVar;
        fxjVar.f(this);
        this.h = new HashSet();
        this.i = new HashMap();
        this.j = new HashMap();
        fxjVar.f(this);
        this.p = activity.getResources().getDimensionPixelSize(R.dimen.topic_picker_gap_between_buttons);
        this.q = activity.getResources().getDimensionPixelSize(R.dimen.topic_picker_empty_space);
        this.r = activity.getResources().getDimensionPixelSize(R.dimen.topic_picker_after_button_gap_width);
    }

    public static final boolean k(avii aviiVar) {
        return aviiVar == null || aviiVar.e.size() == 0;
    }

    private final void l(int i) {
        mws mwsVar;
        int integer = this.l.getResources().getInteger(R.integer.topic_picker_row_span);
        this.v = this.l.getResources().getInteger(R.integer.topic_picker_max_number_of_topics_to_expand);
        this.w = this.l.getResources().getBoolean(R.bool.topic_picker_maintain_complete_rows_on_expansion);
        if (this.z == null) {
            this.z = new GridLayoutManager(integer, null);
        }
        if (i == 2) {
            if (this.u == null) {
                this.u = new mws(integer);
            }
            mwsVar = this.u;
        } else {
            if (this.t == null) {
                this.t = new mws(integer);
            }
            mwsVar = this.t;
        }
        this.z.q(integer);
        this.z.g = mwsVar;
    }

    private static final avih m(avif avifVar) {
        if (avifVar == null || avifVar.b != 46637760) {
            return null;
        }
        return (avih) avifVar.c;
    }

    private static final void n(ajyf ajyfVar, apmh apmhVar, acra acraVar) {
        apmg apmgVar;
        if (apmhVar == null) {
            return;
        }
        if ((apmhVar.b & 1) != 0) {
            apmgVar = apmhVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        ajyfVar.b(apmgVar, acraVar);
    }

    public final void a() {
        this.k = null;
        this.x.removeView(this.g);
        this.g.setVisibility(8);
        this.x.setVisibility(8);
        this.o.m(4);
    }

    public final void b() {
        this.x = yjj.C(this.l);
        View inflate = LayoutInflater.from(this.l).inflate(R.layout.topic_picker, this.x, false);
        this.g = inflate;
        inflate.setVisibility(8);
        this.f = (LoadingFrameLayout) this.g.findViewById(R.id.topic_picker_loading_layout);
        akht akhtVar = (akht) this.m.get();
        gno h = akhtVar.h((TextView) this.g.findViewById(R.id.finish_button));
        this.A = h;
        h.c = new mwp(this, 0);
        gno h2 = akhtVar.h((TextView) this.g.findViewById(R.id.dismiss_button));
        this.B = h2;
        h2.c = new mwp(this, 1, null);
        ajnq ajnqVar = new ajnq();
        this.D = ajnqVar;
        ajnqVar.f(mwu.class, (ajoq) this.n.get());
        this.D.f(mwq.class, mwo.a);
        this.C = (RecyclerView) this.g.findViewById(R.id.topic_container);
        l(this.l.getResources().getConfiguration().orientation);
        this.C.af(this.z);
    }

    public final void c(String str, List list) {
        int i;
        int min;
        mwu mwuVar = (mwu) this.i.get(str);
        int indexOf = this.y.indexOf(mwuVar);
        if (indexOf < 0) {
            zga.b("Topic not found, could not complete expansion");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            mwu mwuVar2 = (mwu) it.next();
            mwu mwuVar3 = (mwu) this.i.get(mwuVar2.a());
            if (mwuVar3 == null || !mwuVar3.b) {
                mwuVar2.e = mwuVar3 != null;
                arrayList.add(mwuVar2);
            }
        }
        int i2 = this.z.b;
        int i3 = mwuVar.f;
        int size = arrayList.size();
        if (this.w) {
            int i4 = this.v;
            min = Math.min(size - (size % i2), i4 - (i4 % i2));
        } else {
            min = Math.min(size, this.v);
        }
        List<mwu> subList = arrayList.subList(0, min);
        int min2 = this.w ? Math.min(((((indexOf - 1) / i2) + 1) * i2) + 1, this.y.size()) : indexOf + 1;
        int i5 = i3 + 1;
        for (mwu mwuVar4 : subList) {
            String a = mwuVar4.a();
            if (mwuVar4.e) {
                this.y.remove(this.i.get(a));
                this.i.remove(a);
            }
            mwuVar4.f = i5;
            this.y.add(min2 + i, mwuVar4);
            this.i.put(a, mwuVar4);
            i++;
        }
        int size2 = (min2 + subList.size()) - 1;
        if (this.z.K() < size2) {
            this.C.aa(size2);
        }
        mwuVar.c = true;
    }

    public final void d(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            avig avigVar = (avig) it.next();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = avigVar.d.iterator();
            while (it2.hasNext()) {
                avih m = m((avif) it2.next());
                if (m != null) {
                    arrayList.add(new mwu(m));
                }
            }
            mwu mwuVar = (mwu) this.i.get(avigVar.b);
            boolean z = avigVar.c;
            if (z && mwuVar == null) {
                return;
            }
            if (!z || !mwuVar.g) {
                this.j.put(avigVar.b, arrayList);
            } else {
                c(avigVar.b, arrayList);
            }
        }
    }

    @Override // defpackage.fxh
    public final void e(Configuration configuration) {
        l(configuration.orientation);
    }

    public final void f() {
        this.f.b(this.l.getApplicationContext().getString(R.string.common_error_generic), false);
    }

    public final void g(avii aviiVar, acra acraVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        apmh apmhVar;
        this.i.clear();
        this.h.clear();
        this.j.clear();
        ajox a = this.s.a(this.D);
        a.h(new ajpd());
        a.rU(new mdu(acraVar, 2));
        this.y = (ajpd) a.f;
        this.C.ac(a);
        ajpd ajpdVar = this.y;
        apmh apmhVar2 = null;
        if ((aviiVar.b & 1) != 0) {
            aqygVar = aviiVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((aviiVar.b & 2) != 0) {
            aqygVar2 = aviiVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        ajpdVar.add(new mwq(b, ajcq.b(aqygVar2)));
        Iterator it = aviiVar.e.iterator();
        while (it.hasNext()) {
            avih m = m((avif) it.next());
            if (m != null) {
                mwu mwuVar = new mwu(m);
                this.y.add(mwuVar);
                this.i.put(mwuVar.a(), mwuVar);
            }
        }
        this.c = aviiVar.k;
        this.d = aviiVar.l;
        d(aviiVar.h);
        aaue aaueVar = (aaue) this.E.a.get();
        aaueVar.getClass();
        acraVar.getClass();
        this.k = new mwn(aaueVar, acraVar, this);
        acraVar.D(new acqx(aviiVar.i));
        acraVar.u(new acqx(aviiVar.i), null);
        ajyf ajyfVar = this.A;
        if ((aviiVar.b & 8) != 0) {
            apmhVar = aviiVar.g;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
        } else {
            apmhVar = null;
        }
        n(ajyfVar, apmhVar, acraVar);
        ajyf ajyfVar2 = this.B;
        if ((aviiVar.b & 4) != 0 && (apmhVar2 = aviiVar.f) == null) {
            apmhVar2 = apmh.a;
        }
        n(ajyfVar2, apmhVar2, acraVar);
        i();
        boolean z = aviiVar.j;
        boolean z2 = this.A.h;
        View findViewById = this.g.findViewById(R.id.topic_container_space_before_buttons);
        View findViewById2 = this.g.findViewById(R.id.topic_container_space_between_buttons);
        yny.z(this.g.findViewById(R.id.topic_container_space_after_buttons), yny.y(z2 ? this.q : this.r, -2), ViewGroup.LayoutParams.class);
        zhh[] zhhVarArr = new zhh[2];
        zhhVarArr[0] = yny.y(this.q, -2);
        zhhVarArr[1] = yny.w(true != z ? 0.0f : 1.0f);
        yny.z(findViewById, yny.h(zhhVarArr), LinearLayout.LayoutParams.class);
        zhh[] zhhVarArr2 = new zhh[2];
        zhhVarArr2[0] = yny.y(z ? this.p : this.q, -2);
        zhhVarArr2[1] = yny.w(true == z ? 1.0f : 0.0f);
        yny.z(findViewById2, yny.h(zhhVarArr2), LinearLayout.LayoutParams.class);
        if (!j()) {
            h();
        }
        this.f.a();
    }

    public final void h() {
        if (this.g == null || this.x == null) {
            return;
        }
        this.o.g(4);
        this.g.bringToFront();
        this.g.setVisibility(0);
        this.x.setVisibility(0);
        this.x.addView(this.g);
    }

    public final void i() {
        this.A.d(!this.h.isEmpty());
    }

    public final boolean j() {
        View view = this.g;
        return view != null && view.getVisibility() == 0 && this.x.getVisibility() == 0 && this.g.getParent() == this.x;
    }
}
