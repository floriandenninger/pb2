package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvf extends mvp implements fyu, ypd {
    public ghg i;
    private final ypa j;
    private final aahv k;
    private ayqx l;
    private final fyx m;

    public mvf(aahd aahdVar, ajut ajutVar, Context context, fyx fyxVar, ypa ypaVar, aahv aahvVar, ViewGroup viewGroup) {
        super(aahdVar, ajutVar, context, viewGroup);
        this.j = ypaVar;
        this.k = aahvVar;
        this.m = fyxVar;
    }

    public static boolean l(auvr auvrVar, asno asnoVar) {
        if (auvrVar.c && asnoVar == asno.LIKE) {
            return true;
        }
        return auvrVar.d && asnoVar == asno.DISLIKE;
    }

    private final void n() {
        Object obj = this.l;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.l = null;
        }
    }

    @Override // defpackage.fyu
    public final void a(String str, int i, aqyg aqygVar, aqyg aqygVar2) {
        if (str == null || j() == null) {
            return;
        }
        asnp asnpVar = j().e;
        if (asnpVar == null) {
            asnpVar = asnp.a;
        }
        if (str.equals(asnpVar.c)) {
            if (i != 2) {
                if (i == 3 && !j().d) {
                    return;
                }
            } else if (!j().c) {
                return;
            }
            aone builder = this.f.toBuilder();
            builder.copyOnWrite();
            apmp apmpVar = (apmp) builder.instance;
            aqygVar.getClass();
            apmpVar.h = aqygVar;
            apmpVar.b |= 64;
            builder.copyOnWrite();
            apmp apmpVar2 = (apmp) builder.instance;
            aqygVar2.getClass();
            apmpVar2.n = aqygVar2;
            apmpVar2.b |= 4096;
            this.f = (apmp) builder.build();
            g();
        }
    }

    @Override // defpackage.mkq, defpackage.muz
    public final void b() {
        super.b();
        this.j.m(this);
        n();
    }

    public final auvr j() {
        return (auvr) this.g;
    }

    @Override // defpackage.mvp
    public final void k(auvr auvrVar) {
        super.k(auvrVar);
        ghg ghgVar = this.i;
        String str = null;
        if (ghgVar != null && this.g != null) {
            String b = ghgVar.b();
            asnp asnpVar = ((auvr) this.g).e;
            if (asnpVar == null) {
                asnpVar = asnp.a;
            }
            if (TextUtils.equals(b, asnpVar.c)) {
                m(l((auvr) this.g, this.i.a()));
            } else {
                this.i = null;
            }
        }
        n();
        String str2 = auvrVar.f;
        if (!TextUtils.isEmpty(str2)) {
            if (aalt.j(str2)) {
                str = str2;
            } else if (aalt.i(str2)) {
                str = aalt.e(aalt.a(str2), aalt.b(str2));
            }
        }
        if (str == null) {
            this.j.g(this);
        } else {
            this.l = this.k.c().i(str).L(niy.b).Y(mmt.e).k(asnm.class).ab(ayqr.a()).ax(new ayrs() { // from class: mve
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    mvf mvfVar = mvf.this;
                    mvfVar.m(mvf.l((auvr) mvfVar.g, ((asnm) obj).getLikeStatus()));
                    mvfVar.g();
                }
            });
        }
        auvr auvrVar2 = (auvr) this.g;
        if (auvrVar2.c) {
            this.c.setId(R.id.like_button);
        } else if (auvrVar2.d) {
            this.c.setId(R.id.dislike_button);
        }
        g();
        if (this.e == null) {
            return;
        }
        fyx fyxVar = this.m;
        asnp asnpVar2 = j().e;
        if (asnpVar2 == null) {
            asnpVar2 = asnp.a;
        }
        fys a = fyxVar.a(asnpVar2.c);
        WeakReference weakReference = new WeakReference(this);
        a.e.add(weakReference);
        List list = a.h;
        if (list != null) {
            fys.d(list, amru.q(), amru.q(), amru.r(weakReference), amru.q(), a.b);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ghg.class};
        }
        if (i == 0) {
            ghg ghgVar = (ghg) obj;
            asnp asnpVar = ((auvr) this.g).e;
            if (asnpVar == null) {
                asnpVar = asnp.a;
            }
            if (!TextUtils.equals(asnpVar.c, ghgVar.b())) {
                this.i = null;
                return null;
            }
            m(l((auvr) this.g, ghgVar.a()));
            g();
            this.i = ghgVar;
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.mvp, android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar;
        if (i()) {
            apmp apmpVar = this.f;
            if ((apmpVar.b & 16384) == 0) {
                return;
            }
            apxfVar = apmpVar.p;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apmp apmpVar2 = this.f;
            if ((apmpVar2.b & 512) == 0) {
                return;
            }
            apxfVar = apmpVar2.k;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        this.a.c(apxfVar, hashMap);
    }

    public mvf(aahd aahdVar, ajut ajutVar, Context context, fyx fyxVar, ypa ypaVar, aahv aahvVar, ViewGroup viewGroup, int i, mvo mvoVar) {
        super(aahdVar, ajutVar, context, viewGroup, i, mvoVar);
        this.j = ypaVar;
        this.k = aahvVar;
        this.m = fyxVar;
    }
}
