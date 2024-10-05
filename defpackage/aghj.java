package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghj {
    public final zgj a;
    public final String b;
    public final agvh c;
    private final azrw d;
    private final aghi e;
    private final aguh f;

    public aghj(zgj zgjVar, String str, azrw azrwVar, aghi aghiVar, aguh aguhVar, agvh agvhVar) {
        this.a = zgjVar;
        this.b = str;
        this.d = azrwVar;
        this.e = aghiVar;
        this.f = aguhVar;
        this.c = agvhVar;
    }

    private final void i(String str, int i, agmx agmxVar) {
        yjk.e();
        this.c.c(this.b, str, i, agmxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(String str) {
        return String.format(Locale.US, "%s:%s:thumb", this.b, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b(String str) {
        return String.format(Locale.US, "%s:%s:master", this.b, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c(String str) {
        return String.format(Locale.US, "%s:%s", this.b, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str, boolean z) {
        zhq.m(str);
        yjk.e();
        agny agnyVar = new agny();
        agtw.X(agnyVar, str);
        agtw.V(agnyVar, 2);
        agtw.E(agnyVar, z);
        agtw.S(agnyVar, this.a.a());
        i(a(str), 100, agnyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str) {
        this.c.j(String.format(Locale.US, "%s:%s:ad", this.b, str), 512);
    }

    public final void f(String str) {
        this.c.j(str, 512);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(String str) {
        f(c(str));
        f(b(str));
    }

    public final void h(String str, String str2, String str3, atrx atrxVar, String str4, int i, agno agnoVar, int i2, boolean z, boolean z2, boolean z3) {
        atqq r;
        yjk.e();
        String b = b(str);
        this.f.d();
        ammv a = this.f.a(b);
        if (a.h() && (((agtu) a.c()).d() || ((agtu) a.c()).b())) {
            return;
        }
        aghi aghiVar = this.e;
        agny agnyVar = new agny();
        agtw.M(agnyVar, ahab.a(atrxVar, 360));
        if (str4 != null) {
            agtw.K(agnyVar, str4);
        }
        agtw.an(agnyVar, i);
        byte[] i3 = aghiVar.f.i(str);
        if (i3 == null) {
            i3 = aaef.b;
        }
        agtw.z(agnyVar, i3);
        agtw.X(agnyVar, str);
        agtw.G(agnyVar, 1 == (i2 ^ 1));
        agtw.O(agnyVar, agnoVar == agno.DEFER_FOR_DISCOUNTED_DATA);
        agtw.E(agnyVar, z2);
        agtw.D(agnyVar, z3);
        agtw.S(agnyVar, aghiVar.a.a());
        if (str2 != null) {
            agtw.N(agnyVar, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            agtw.Y(agnyVar, str3);
        }
        if (z) {
            aghiVar.b.b(str);
        }
        agtw.R(agnyVar, aghiVar.c.c());
        agtw.T(agnyVar, aghiVar.d.b);
        agtw.I(agnyVar, aghiVar.d.c);
        agtw.x(agnyVar, aghiVar.d.d);
        agtw.J(agnyVar, aghiVar.d.e);
        arfd a2 = aghiVar.e.a();
        atph atphVar = a2.g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        if (atphVar.i) {
            atph atphVar2 = a2.g;
            if (atphVar2 == null) {
                atphVar2 = atph.a;
            }
            agtw.L(agnyVar, atphVar2.j);
        }
        PlayerResponseModel m = aghiVar.f.m(str);
        if (m != null && (r = m.r()) != null) {
            aomf aomfVar = r.k;
            if (!aomfVar.H()) {
                agtw.H(agnyVar, aomfVar.I());
            }
        }
        agtw.V(agnyVar, 4);
        aone createBuilder = atqv.a.createBuilder();
        createBuilder.copyOnWrite();
        atqv atqvVar = (atqv) createBuilder.instance;
        str.getClass();
        atqvVar.b |= 1;
        atqvVar.d = str;
        int i4 = true != z2 ? 2 : 4;
        createBuilder.copyOnWrite();
        atqv atqvVar2 = (atqv) createBuilder.instance;
        atqvVar2.h = i4 - 1;
        atqvVar2.b |= 16;
        createBuilder.copyOnWrite();
        atqv atqvVar3 = (atqv) createBuilder.instance;
        atqvVar3.t = atrxVar.k;
        atqvVar3.b |= 1048576;
        int b2 = agnoVar.b();
        createBuilder.copyOnWrite();
        atqv atqvVar4 = (atqv) createBuilder.instance;
        atqvVar4.r = b2 - 1;
        atqvVar4.b |= 65536;
        createBuilder.copyOnWrite();
        atqv atqvVar5 = (atqv) createBuilder.instance;
        atqvVar5.x = 4;
        atqvVar5.c |= 2;
        createBuilder.copyOnWrite();
        atqv atqvVar6 = (atqv) createBuilder.instance;
        atqvVar6.g = 1;
        atqvVar6.b |= 8;
        String s = agtw.s(agnyVar);
        if (s != null) {
            createBuilder.copyOnWrite();
            atqv atqvVar7 = (atqv) createBuilder.instance;
            atqvVar7.b = 2 | atqvVar7.b;
            atqvVar7.e = s;
        }
        String o = agtw.o(agnyVar);
        if (o != null) {
            createBuilder.copyOnWrite();
            atqv atqvVar8 = (atqv) createBuilder.instance;
            atqvVar8.b |= 524288;
            atqvVar8.s = o;
        }
        byte[] ak = agtw.ak(agnyVar);
        if (ak != null) {
            aomf x = aomf.x(ak);
            createBuilder.copyOnWrite();
            atqv atqvVar9 = (atqv) createBuilder.instance;
            atqvVar9.c |= 32;
            atqvVar9.z = x;
        }
        ((agmu) this.d.get()).c((atqv) createBuilder.build());
        i(b, 1 != i2 ? 200 : 150, agnyVar);
    }
}
