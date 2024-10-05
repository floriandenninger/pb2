package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wjs implements wje, wia, wib, wid, wic {
    private final Context b;
    public final View d;
    public final ajpd e;
    public wjf f;
    private final acra g;
    private final whu a = new whu();
    protected final whl c = new whl();

    public wjs(Context context, zaw zawVar, acra acraVar, ajjz ajjzVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2) {
        this.b = context;
        this.g = acraVar;
        this.d = b(context);
        ajpd ajpdVar = new ajpd();
        this.e = ajpdVar;
        whw whwVar = new whw(context, zawVar, acraVar, ajjzVar.b(), this, this, this);
        whwVar.a(aatd.class);
        ajoa e = ajoyVar.e(whwVar.a);
        e.h(ajpdVar);
        c().setAdapter((ListAdapter) e);
    }

    @Override // defpackage.wia
    public final void a(aata aataVar) {
        wjf wjfVar = this.f;
        if (wjfVar != null) {
            wjfVar.a(aataVar);
        }
    }

    public View b(Context context) {
        ListView listView = new ListView(context);
        listView.setId(R.id.account_list);
        listView.setBackgroundColor(wbs.W(context, R.attr.ytBrandBackgroundSolid).orElse(0));
        return listView;
    }

    protected ListView c() {
        return (ListView) this.d;
    }

    protected ajpd d() {
        return this.e;
    }

    protected void e() {
        this.e.add(this.a);
    }

    protected void f() {
        this.e.add(this.c);
        this.e.add(this.a);
    }

    @Override // defpackage.wje
    public void g(wck wckVar) {
        Throwable th;
        aatb a;
        this.e.clear();
        d().clear();
        Context context = this.b;
        ajpd ajpdVar = this.e;
        ajpd d = d();
        aatd aatdVar = wckVar.b;
        Iterator it = aatdVar.c().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((aatc) it.next()).a() != null) {
                i++;
            }
        }
        amru o = amru.o(aatdVar.c());
        aovm a2 = aatdVar.a();
        if (a2 != null) {
            ajpdVar.add(a2);
            int size = o.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                aatc aatcVar = (aatc) o.get(i2);
                i2++;
                if (!aatcVar.b) {
                    ajpdVar.addAll(aatcVar.c());
                    break;
                }
            }
            aqrh b = aatdVar.b();
            if (b != null) {
                aone builder = b.toBuilder();
                float integer = (b.b & 4) != 0 ? b.e : context.getResources().getInteger(R.integer.account_switcher_separator_padding_dp);
                builder.copyOnWrite();
                aqrh aqrhVar = (aqrh) builder.instance;
                aqrhVar.b |= 4;
                aqrhVar.e = integer;
                ajpdVar.add(new ajny((aqrh) builder.build()));
            }
            if (o.size() > 1) {
                ajpdVar.add(new wie());
            }
        }
        int size2 = o.size();
        Throwable th2 = null;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size2; i3++) {
            aatc aatcVar2 = (aatc) o.get(i3);
            if (i > 1 && (a = aatcVar2.a()) != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a.b);
            } else if (aatcVar2.b) {
                ajpdVar.addAll(aatcVar2.c());
            }
        }
        d.addAll(aatdVar.d());
        if (i > 1) {
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext() && (th = (Throwable) it2.next()) != null) {
                    Class<?> cls = th.getClass();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!cls.equals(((Throwable) it2.next()).getClass())) {
                                break;
                            }
                        } else {
                            th2 = th;
                            break;
                        }
                    }
                }
            }
            ajpdVar.add(aatb.a(th2));
        }
        e();
        Iterator it3 = wckVar.a.iterator();
        while (it3.hasNext()) {
            ((acqq) this.g).D(new acqx(((aati) it3.next()).a.e.I()));
        }
    }

    @Override // defpackage.wib
    public final void i(aatb aatbVar) {
        wjf wjfVar = this.f;
        if (wjfVar != null) {
            Intent intent = aatbVar.a;
            wjq wjqVar = (wjq) wjfVar;
            if (intent != null) {
                wjqVar.b.startActivity(intent);
            } else {
                wjqVar.c();
            }
        }
    }

    @Override // defpackage.wic
    public final void j() {
        wjf wjfVar = this.f;
        if (wjfVar != null) {
            ((wjq) wjfVar).b();
        }
    }

    @Override // defpackage.wid
    public final void k() {
        wjf wjfVar = this.f;
        if (wjfVar != null) {
            wjq wjqVar = (wjq) wjfVar;
            wjqVar.c.j(wjqVar.b, wjqVar.d);
        }
    }

    @Override // defpackage.wje
    public final void l(String str) {
        whu.L(this.b, str, 1);
    }

    @Override // defpackage.wje
    public final void m() {
        this.e.clear();
        d().clear();
        f();
    }
}
