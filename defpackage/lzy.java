package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lzy implements View.OnClickListener, fzd, fzs, fzk {
    public View.OnLongClickListener a;
    private final akbu b;
    private final LayoutInflater c;
    private final Resources d;
    private final acra e;
    private final apmg f;
    private final aahd g;
    private final ajut h;
    private final akcp i;
    private final List j;
    private final afzp k;
    private ImageView l;
    private String m;
    private int n;
    private View o;
    private mje p;
    private final mdb q;

    public lzy(aahd aahdVar, ajut ajutVar, akbu akbuVar, Context context, mda mdaVar, akcp akcpVar, afzp afzpVar, acra acraVar, apmg apmgVar, List list) {
        this.b = akbuVar;
        this.c = LayoutInflater.from(context);
        this.d = context.getResources();
        this.g = aahdVar;
        this.h = ajutVar;
        this.i = akcpVar;
        this.e = acraVar;
        this.f = apmgVar;
        this.q = mdaVar.b();
        this.j = list;
        this.k = afzpVar;
    }

    @Override // defpackage.fzd
    public final void a(zau zauVar, int i) {
        if (i == wbs.Q(this.l.getContext(), R.attr.ytIconActiveOther)) {
            ImageView imageView = this.l;
            imageView.setImageDrawable(zauVar.b(imageView.getDrawable(), wbs.Q(this.l.getContext(), R.attr.ytTextPrimary)));
        } else {
            ImageView imageView2 = this.l;
            imageView2.setImageDrawable(zauVar.b(imageView2.getDrawable(), i));
        }
    }

    @Override // defpackage.fzs
    public final void e(String str) {
        this.m = str;
    }

    @Override // defpackage.fzs
    public final void f() {
        this.n = 10349;
    }

    @Override // defpackage.fze
    public final int g() {
        return this.q.a();
    }

    @Override // defpackage.fze
    public final int h() {
        return 0;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return this;
    }

    @Override // defpackage.fze
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return true;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        arej arejVar;
        if (this.o == null) {
            View inflate = this.c.inflate(R.layout.mobile_topbar_button_item, (ViewGroup) null, false);
            this.o = inflate;
            this.l = (ImageView) inflate.findViewById(R.id.menu_item_view);
            this.p = new mje(zce.b((ViewStub) this.o.findViewById(R.id.new_content_dot), View.class), zce.b((ViewStub) this.o.findViewById(R.id.new_content_count), TextView.class));
        }
        menuItem.setShowAsAction(2);
        ajut ajutVar = this.h;
        arfs arfsVar = this.f.g;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        arfr b = arfr.b(arfsVar.c);
        if (b == null) {
            b = arfr.UNKNOWN;
        }
        this.l.setImageDrawable(this.d.getDrawable(ajutVar.a(b)));
        this.l.setContentDescription(o());
        this.l.setOnClickListener(this);
        View.OnLongClickListener onLongClickListener = this.a;
        if (onLongClickListener != null) {
            this.l.setOnLongClickListener(onLongClickListener);
        }
        menuItem.setActionView(this.o);
        apmg apmgVar = this.f;
        if ((apmgVar.b & 4096) != 0) {
            arel arelVar = apmgVar.m;
            if (arelVar == null) {
                arelVar = arel.a;
            }
            if (arelVar.b == 102716411) {
                akbu akbuVar = this.b;
                arel arelVar2 = this.f.m;
                if (arelVar2 == null) {
                    arelVar2 = arel.a;
                }
                if (arelVar2.b == 102716411) {
                    arejVar = (arej) arelVar2.c;
                } else {
                    arejVar = arej.a;
                }
                ImageView imageView = this.l;
                arel arelVar3 = this.f.m;
                if (arelVar3 == null) {
                    arelVar3 = arel.a;
                }
                akbuVar.b(arejVar, imageView, arelVar3, this.e);
            }
        }
        apmg apmgVar2 = this.f;
        if ((apmgVar2.b & 2048) != 0) {
            this.i.d(apmgVar2.k, this.l);
        }
        if (this.j.isEmpty()) {
            return;
        }
        final mje mjeVar = this.p;
        afzp afzpVar = this.k;
        List list = this.j;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(afzpVar.b(str).y().G().n());
        }
        afly aflyVar = new afly(9);
        int i = aypn.a;
        aysw.c(i, "bufferSize");
        aywb aywbVar = new aywb(arrayList, aflyVar, i);
        ayrv ayrvVar = aynu.j;
        Object obj = mjeVar.c;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            mjeVar.c = null;
        }
        mjeVar.c = aywbVar.X(new ayrs() { // from class: mjd
            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                String format;
                mje mjeVar2 = mje.this;
                afzv afzvVar = (afzv) obj2;
                if (mjeVar2.b.a() != null) {
                    if (afzvVar.c || afzvVar.b <= 0) {
                        whu.I(mjeVar2.b.a(), false);
                    } else {
                        whu.I(mjeVar2.b.a(), true);
                        TextView textView = (TextView) mjeVar2.b.a();
                        if (afzvVar.b <= 9) {
                            format = String.format(Locale.getDefault(), "%d", Integer.valueOf(afzvVar.b));
                        } else {
                            format = String.format(Locale.getDefault(), "%d+", 9);
                        }
                        textView.setText(format);
                    }
                }
                if (mjeVar2.a.a() != null) {
                    whu.I(mjeVar2.a.a(), !(afzvVar.c || afzvVar.b > 0 || !afzvVar.a));
                }
            }
        });
    }

    @Override // defpackage.fze
    public final boolean m() {
        return false;
    }

    @Override // defpackage.fzk
    public final int n() {
        return this.q.a + 1000;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        aott aottVar = this.f.s;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        aots aotsVar = aottVar.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        if ((aotsVar.b & 2) != 0) {
            aott aottVar2 = this.f.s;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar2 = aottVar2.c;
            if (aotsVar2 == null) {
                aotsVar2 = aots.a;
            }
            return aotsVar2.c;
        }
        aots aotsVar3 = this.f.r;
        if (aotsVar3 == null) {
            aotsVar3 = aots.a;
        }
        if ((aotsVar3.b & 2) == 0) {
            return "";
        }
        aots aotsVar4 = this.f.r;
        if (aotsVar4 == null) {
            aotsVar4 = aots.a;
        }
        return aotsVar4.c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apmg apmgVar = this.f;
        if ((apmgVar.b & 1048576) != 0) {
            this.e.I(3, new acqx(apmgVar.t), null);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("parent_csn", this.m);
        hashMap.put("parent_ve_type", Integer.valueOf(this.n));
        apmg apmgVar2 = this.f;
        if ((apmgVar2.b & 32768) != 0) {
            aahd aahdVar = this.g;
            apxf apxfVar = apmgVar2.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, hashMap);
        }
        apmg apmgVar3 = this.f;
        if ((apmgVar3.b & 8192) != 0) {
            aahd aahdVar2 = this.g;
            apxf apxfVar2 = apmgVar3.n;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar2.c(apxfVar2, hashMap);
        }
        apmg apmgVar4 = this.f;
        if ((apmgVar4.b & 16384) != 0) {
            aahd aahdVar3 = this.g;
            apxf apxfVar3 = apmgVar4.o;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            aahdVar3.c(apxfVar3, hashMap);
        }
    }
}
