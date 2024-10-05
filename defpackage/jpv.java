package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpv implements jpi {
    private final Context a;
    private final aahv b;
    private final jpf c;
    private final axzg d;
    private final axzf e;
    private final c f;
    private final c g;
    private final ajoy h;
    private final ajoy i;

    public jpv(Context context, aahv aahvVar, ajoy ajoyVar, c cVar, ajoy ajoyVar2, c cVar2, jpf jpfVar, axzf axzfVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = context;
        this.b = aahvVar;
        this.i = ajoyVar;
        this.f = cVar;
        this.h = ajoyVar2;
        this.g = cVar2;
        this.c = jpfVar;
        this.e = axzfVar;
        this.d = axzgVar;
    }

    private final List i(String str, amml ammlVar) {
        return (List) this.b.c().f(fhe.t(str)).g(awja.class).P().s(jif.n).Y(new aipp(ammlVar, 1)).L(iub.k).av().X();
    }

    private final Set j(List list, amml... ammlVarArr) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            for (int i = 0; i < 4; i++) {
                hashSet.add(this.i.G((String) ammlVarArr[i].apply(str)));
            }
        }
        return hashSet;
    }

    @Override // defpackage.jpi
    public final int a() {
        return 156;
    }

    @Override // defpackage.jpi
    public final int b() {
        return 141;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r16 == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    @Override // defpackage.jpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ defpackage.jpg c(defpackage.aakt r20, java.lang.String r21, defpackage.jph r22) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpv.c(aakt, java.lang.String, jph):jpg");
    }

    @Override // defpackage.jpi
    public final ammv d(String str) {
        awas z = etx.z(str, this.d);
        return z == null ? amlr.a : ammv.j(fhe.g(z.c));
    }

    @Override // defpackage.jpi
    public final amsx e(String str) {
        awas z = etx.z(str, this.d);
        if (z == null) {
            return amvs.a;
        }
        String str2 = z.c;
        String g = fhe.g(str2);
        String t = fhe.t(str2);
        List i = i(str2, jpt.e);
        if (this.e.k()) {
            amsv i2 = amsx.i();
            i2.c(this.i.G(g));
            i2.c(this.i.G(t));
            i2.c(this.f.i());
            i2.c(this.h.F());
            i2.j(j(i, jpt.b, jpt.a, jpt.d, jpt.c));
            Iterator it = i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (jpf.q((atre) this.b.c().f(fhe.q((String) it.next())).g(atre.class).X())) {
                    i2.c(this.g.k());
                    break;
                }
            }
            return i2.g();
        }
        amsv i3 = amsx.i();
        i3.c(this.i.G(g));
        i3.c(this.i.G(t));
        i3.c(this.f.i());
        i3.c(this.h.F());
        i3.j(j(i, jpt.b, jpt.a, jpt.d, jpt.c));
        return i3.g();
    }

    @Override // defpackage.jpi
    public final Class f() {
        return awig.class;
    }

    @Override // defpackage.jpi
    public final Class g() {
        return aqmi.class;
    }

    @Override // defpackage.jpi
    public final aajc h(String str) {
        return new aajc(2, str);
    }
}
