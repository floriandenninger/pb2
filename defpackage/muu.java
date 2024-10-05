package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class muu extends mkq implements View.OnLongClickListener, ypd {
    public final Set i;
    public String j;
    public final aadw k;
    private final ypa l;
    private final ysy m;
    private final SharedPreferences n;
    private final aahv o;
    private final ayqi p;
    private ayqx q;

    public muu(aahd aahdVar, ajut ajutVar, Context context, ypa ypaVar, aahv aahvVar, aadw aadwVar, ayqi ayqiVar, ysy ysyVar, SharedPreferences sharedPreferences, ViewGroup viewGroup, int i, mvo mvoVar) {
        super(aahdVar, ajutVar, context, viewGroup, i, mvoVar);
        this.j = "";
        this.l = ypaVar;
        this.o = aahvVar;
        this.k = aadwVar;
        this.p = ayqiVar;
        this.m = ysyVar;
        this.n = sharedPreferences;
        this.i = new aeb();
    }

    private final String p() {
        apxf apxfVar = ((auvn) this.g).c;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (!apxfVar.pY(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint)) {
            return null;
        }
        apxf apxfVar2 = ((auvn) this.g).c;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        return ((AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint) apxfVar2.pX(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint)).b;
    }

    @Override // defpackage.mkq, defpackage.muz
    public final void b() {
        super.b();
        this.l.m(this);
        k();
    }

    @Override // defpackage.mkq
    public final int c() {
        return R.color.slim_meta_data_toggle_button_nonchanging;
    }

    @Override // defpackage.mkq
    public final int d() {
        return R.color.slim_meta_data_toggle_button_selected_nonchanging;
    }

    @Override // defpackage.mkq
    protected final /* bridge */ /* synthetic */ apmp e(Object obj) {
        apmh apmhVar = ((auvn) obj).d;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmp apmpVar = apmhVar.d;
        return apmpVar == null ? apmp.a : apmpVar;
    }

    @Override // defpackage.mkq
    public final boolean i() {
        return this.f.e;
    }

    public final arej j() {
        Object obj = this.g;
        if (obj == null) {
            return null;
        }
        apmh apmhVar = ((auvn) obj).d;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmp apmpVar = apmhVar.d;
        if (apmpVar == null) {
            apmpVar = apmp.a;
        }
        apmo apmoVar = apmpVar.j;
        if (apmoVar == null) {
            apmoVar = apmo.a;
        }
        if (apmoVar.b != 102716411) {
            return null;
        }
        apmh apmhVar2 = ((auvn) this.g).d;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmp apmpVar2 = apmhVar2.d;
        if (apmpVar2 == null) {
            apmpVar2 = apmp.a;
        }
        apmo apmoVar2 = apmpVar2.j;
        if (apmoVar2 == null) {
            apmoVar2 = apmo.a;
        }
        if (apmoVar2.b == 102716411) {
            return (arej) apmoVar2.c;
        }
        return arej.a;
    }

    public final void k() {
        Object obj = this.q;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.q = null;
        }
    }

    public final void l() {
        String f = aalt.f(231, this.j);
        aahu c = this.o.c();
        c.f(f).g(aumv.class).c(new fiy(c, 5)).Q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z) {
        apmp apmpVar = this.f;
        if (apmpVar.e == z) {
            return;
        }
        aone builder = apmpVar.toBuilder();
        builder.copyOnWrite();
        apmp apmpVar2 = (apmp) builder.instance;
        apmpVar2.b |= 8;
        apmpVar2.e = z;
        this.f = (apmp) builder.build();
        g();
    }

    public final void n(auvn auvnVar) {
        String p;
        super.h(auvnVar);
        if (this.g != null) {
            if (o(this.j)) {
                m(!this.i.isEmpty());
            } else {
                l();
                k();
                this.i.clear();
                this.j = p();
            }
        }
        if ((auvnVar.b & 1) != 0) {
            this.c.setOnLongClickListener(this);
        }
        if (evr.aU(this.k) && (p = p()) != null) {
            this.q = this.o.c().i(aalt.f(231, p)).L(khf.u).Y(mmt.d).k(aumv.class).ab(this.p).ax(new ayrs() { // from class: mut
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    muu.this.m(!((aumv) obj).getPlaylistIds().isEmpty());
                }
            });
        }
        this.l.g(this);
        g();
    }

    public final boolean o(String str) {
        return TextUtils.equals(p(), str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar;
        if (i()) {
            this.n.edit().putString("add_to_long_press_hint_trigger_video_id", p()).apply();
        }
        if (this.m.o() && !i() && !this.f.u) {
            m(true);
        }
        if (i()) {
            apmp apmpVar = this.f;
            if ((apmpVar.b & 16384) != 0) {
                apxfVar = apmpVar.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                this.a.c(apxfVar, hashMap);
            }
        } else {
            apmp apmpVar2 = this.f;
            if ((apmpVar2.b & 512) != 0) {
                apxfVar = apmpVar2.k;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                this.a.c(apxfVar, hashMap2);
            }
        }
        apmp apmpVar3 = this.f;
        if ((apmpVar3.b & 1024) != 0) {
            apxf apxfVar2 = apmpVar3.l;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
            this.a.c(apxfVar2, hashMap3);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if ((((auvn) this.g).b & 1) == 0) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        aahd aahdVar = this.a;
        apxf apxfVar = ((auvn) this.g).c;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, hashMap);
        return true;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{kwl.class, abbe.class, abbf.class, abbi.class, aftm.class, afto.class};
            case 0:
                kwl kwlVar = (kwl) obj;
                if (evr.aU(this.k) || !o(kwlVar.a)) {
                    return null;
                }
                this.i.clear();
                m(false);
                return null;
            case 1:
                abbe abbeVar = (abbe) obj;
                if (evr.aU(this.k) || !o(abbeVar.b)) {
                    return null;
                }
                m(!this.i.isEmpty());
                return null;
            case 2:
                abbf abbfVar = (abbf) obj;
                if (evr.aU(this.k) || !o(abbfVar.b)) {
                    return null;
                }
                this.i.add(abbfVar.a);
                m(!this.i.isEmpty());
                return null;
            case 3:
                abbi abbiVar = (abbi) obj;
                if (evr.aU(this.k) || !o(abbiVar.d)) {
                    return null;
                }
                this.i.remove(abbiVar.a);
                m(!this.i.isEmpty());
                return null;
            case 4:
                l();
                k();
                this.j = "";
                return null;
            case 5:
                l();
                k();
                this.j = "";
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
