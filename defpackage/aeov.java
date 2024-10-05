package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeov implements aepm, aepw {
    final aeqm a;
    Boolean b;
    pid c;
    private final azrw d;
    private final afhf e;
    private final String f;
    private List g;
    private String h;
    private String i;
    private String j;

    public aeov(Context context, afhf afhfVar, azrw azrwVar, aeqg aeqgVar) {
        afki.a(azrwVar);
        this.d = azrwVar;
        this.e = afhfVar;
        this.f = yjj.k(context);
        this.a = new aeqm(aeqgVar, this);
    }

    static final aze e() {
        try {
            return aze.p(plh.d);
        } catch (Exception e) {
            throw new azj(1, e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int h() {
        char c;
        String b = this.c.b();
        if (b == null) {
            return -1;
        }
        switch (b.hashCode()) {
            case 2405:
                if (b.equals("L1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2406:
                if (b.equals("L2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2407:
                if (b.equals("L3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return 1;
        }
        return c != 2 ? -1 : 3;
    }

    private static aqpb i(Throwable th) {
        if (!(th.getCause() instanceof azi) || !(th.getCause().getCause() instanceof aeqe)) {
            return aqpb.a;
        }
        aeqf aeqfVar = ((aeqe) th.getCause().getCause()).a;
        if (aeqfVar != null) {
            aone createBuilder = aqpb.a.createBuilder();
            String b = aeqfVar.b();
            createBuilder.copyOnWrite();
            aqpb aqpbVar = (aqpb) createBuilder.instance;
            b.getClass();
            aqpbVar.b |= 4;
            aqpbVar.c = b;
            boolean d = aeqfVar.d();
            createBuilder.copyOnWrite();
            aqpb aqpbVar2 = (aqpb) createBuilder.instance;
            aqpbVar2.b |= 8;
            aqpbVar2.d = d;
            return (aqpb) createBuilder.build();
        }
        return aqpb.a;
    }

    private final aqpd j(byte[] bArr, Pair pair, boolean z, int i) {
        Long l = (Long) pair.first;
        Long l2 = (Long) pair.second;
        aone createBuilder = aqpd.a.createBuilder();
        aomf x = aomf.x(bArr);
        createBuilder.copyOnWrite();
        aqpd aqpdVar = (aqpd) createBuilder.instance;
        aqpdVar.b |= 256;
        aqpdVar.k = x;
        long longValue = l.longValue();
        createBuilder.copyOnWrite();
        aqpd aqpdVar2 = (aqpd) createBuilder.instance;
        aqpdVar2.b |= 2;
        aqpdVar2.d = longValue;
        long longValue2 = l2.longValue();
        createBuilder.copyOnWrite();
        aqpd aqpdVar3 = (aqpd) createBuilder.instance;
        aqpdVar3.b |= 4;
        aqpdVar3.e = longValue2;
        String str = this.i;
        createBuilder.copyOnWrite();
        aqpd aqpdVar4 = (aqpd) createBuilder.instance;
        str.getClass();
        aqpdVar4.b |= 16;
        aqpdVar4.g = str;
        String str2 = this.j;
        createBuilder.copyOnWrite();
        aqpd aqpdVar5 = (aqpd) createBuilder.instance;
        str2.getClass();
        aqpdVar5.b |= 32;
        aqpdVar5.h = str2;
        String str3 = this.h;
        createBuilder.copyOnWrite();
        aqpd aqpdVar6 = (aqpd) createBuilder.instance;
        str3.getClass();
        aqpdVar6.b |= 128;
        aqpdVar6.i = str3;
        createBuilder.copyOnWrite();
        aqpd aqpdVar7 = (aqpd) createBuilder.instance;
        aqpdVar7.b |= 8;
        aqpdVar7.f = z;
        createBuilder.copyOnWrite();
        aqpd aqpdVar8 = (aqpd) createBuilder.instance;
        aqpdVar8.b |= 512;
        aqpdVar8.l = i;
        List list = this.g;
        if (list != null) {
            createBuilder.copyOnWrite();
            aqpd aqpdVar9 = (aqpd) createBuilder.instance;
            aonu aonuVar = aqpdVar9.j;
            if (!aonuVar.c()) {
                aqpdVar9.j = aonm.mutableCopy(aonuVar);
            }
            aolo.addAll((Iterable) list, (List) aqpdVar9.j);
        }
        return (aqpd) createBuilder.build();
    }

    private final void k() {
        this.h = null;
        this.g = null;
        this.b = null;
    }

    @Override // defpackage.aepm
    public final aqpd a(aqpd aqpdVar) {
        if ((aqpdVar.b & 256) == 0 || this.h == null) {
            afid.d(afic.DRM, "Requested DRM key id for Offline is null");
            throw new aepi();
        }
        if (!aqpdVar.f) {
            return null;
        }
        this.a.f = 2;
        try {
            try {
                byte[] f = this.c.f(aqpdVar.k.I());
                Pair a = this.c.a(f);
                boolean z = this.a.c;
                int h = h();
                aepg a2 = ((aeph) this.d.get()).a(this.h);
                if (a2 != null) {
                    this.g = a2.b;
                } else {
                    this.g = this.a.d();
                }
                return j(f, a, z, h);
            } catch (ayg e) {
                throw new aepk(e, i(e));
            }
        } finally {
            this.c.c();
        }
    }

    @Override // defpackage.aepm
    public final void b(String str, String str2, String str3, String str4) {
        this.h = str;
        this.i = str3;
        this.j = str4;
        this.g = null;
        this.b = null;
        try {
            aze e = e();
            this.a.f(null, str4, str3, str, str2);
            HashMap aJ = amkq.aJ(1);
            aJ.put("aid", this.f);
            this.c = new pid(aeow.a, e, this.a, aJ);
        } catch (azj e2) {
            afid.b(afic.DRM, "Widevine CDM engine isn't available. Unable to complete license fetch of videoId %s", str);
            throw new aepl(e2, i(e2));
        }
    }

    @Override // defpackage.aepm
    public final boolean d(String str) {
        boolean z;
        String str2 = this.h;
        if (str2 == null || !str2.equals(str) || this.g == null) {
            try {
                return "L1".equals(e().m());
            } catch (azj unused) {
                return false;
            }
        }
        if (this.b == null) {
            try {
                String m = e().m();
                boolean z2 = true;
                if (!this.g.contains(3) && !this.g.contains(4)) {
                    z = false;
                    if ("L1".equals(m) || !z) {
                        z2 = false;
                    }
                    this.b = Boolean.valueOf(z2);
                }
                z = true;
                if ("L1".equals(m)) {
                }
                z2 = false;
                this.b = Boolean.valueOf(z2);
            } catch (azj unused2) {
                this.b = false;
            }
        }
        return this.b.booleanValue();
    }

    @Override // defpackage.aepm
    public final aqpd f(List list, String str) {
        pms pmsVar;
        bih bjzVar;
        bdm bdmVar;
        this.a.f = 1;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            if (formatStreamModel.Q()) {
                axl R = formatStreamModel.R(str);
                axk axkVar = R.d;
                ath athVar = new ath(R.e, axkVar.a, axkVar.b, R.f);
                String str2 = R.a.m;
                if (str2 == null) {
                    bdmVar = null;
                } else {
                    if (str2.startsWith("video/webm") || str2.startsWith("audio/webm") || str2.startsWith("application/webm")) {
                        bjzVar = new bjz();
                    } else {
                        bjzVar = new bkt();
                    }
                    bdmVar = new bdm(bjzVar, 2, R.a);
                }
                bdt bdtVar = new bdt(this.e.a(), athVar, R.a, 0, null, bdmVar);
                for (int i = 0; i < 3; i++) {
                    try {
                        bdtVar.b();
                        pms[] pmsVarArr = bdmVar.a;
                        pmsVar = pmsVarArr.length > 0 ? pmsVarArr[0] : null;
                        bdmVar.c();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (pmsVar == null || pmsVar.q == null || this.h == null) {
            afid.d(afic.DRM, "Requested DRM init data for Offline is null");
            throw new aepi();
        }
        try {
            try {
                byte[] e = this.c.e(pmsVar);
                Pair a = this.c.a(e);
                int h = h();
                this.g = this.a.d();
                return j(e, a, this.a.c, h);
            } catch (ayg e2) {
                throw new aepk(e2, i(e2));
            }
        } finally {
            this.c.c();
        }
    }

    @Override // defpackage.aepm
    public final void g(aqpd aqpdVar, long j) {
        byte[] I;
        int i = aqpdVar.b;
        if ((i & 256) != 0 || (i & 1) != 0) {
            aeqm aeqmVar = this.a;
            aeqmVar.f = 3;
            aeqmVar.e = Long.valueOf(j);
            try {
                try {
                    if ((aqpdVar.b & 256) != 0) {
                        I = aqpdVar.k.I();
                    } else {
                        I = aomf.z(aqpdVar.c).I();
                    }
                    this.c.d(I);
                    return;
                } catch (ayg e) {
                    throw new aepk(e, i(e));
                }
            } finally {
                this.c.c();
                k();
            }
        }
        afid.d(afic.DRM, "Requested DRM key id for Offline is null");
        throw new aepi();
    }

    @Override // defpackage.aepw
    public final void rm() {
    }
}
