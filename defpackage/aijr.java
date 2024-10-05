package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijr extends aaru {
    public String A;
    public String B;
    public long C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f55J;
    public String K;
    public String L;
    public int M;
    public int N;
    public int O;
    public int P;
    public atww Q;
    public afft R;
    public final List S;
    public boolean T;
    public atbc U;
    public int V;
    public int W;
    public int X;
    public int Y;
    private final aifk Z;
    public final Set a;
    private final Set aa;
    private String ab;
    private Integer ac;
    private String ad;
    private final ajkn ae;
    public String b;
    public String c;
    public String d;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public String x;
    public aryp y;
    public aryq z;

    public aijr(ajoy ajoyVar, afsx afsxVar, ajkn ajknVar, Set set, aifk aifkVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super("player", ajoyVar, afsxVar, 3, (byte[]) null, (byte[]) null, (byte[]) null);
        this.s = -1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.aa = new HashSet();
        this.B = "";
        this.C = -1L;
        this.D = -1;
        this.E = 0;
        this.F = 0;
        this.G = false;
        this.H = false;
        this.I = "";
        this.f55J = false;
        this.ac = null;
        this.V = 1;
        this.W = 1;
        this.X = 1;
        this.L = "";
        this.M = -1;
        this.N = -1;
        this.O = 0;
        this.P = -1;
        this.Y = 1;
        this.S = new ArrayList();
        this.ae = ajknVar;
        this.a = new HashSet(set);
        this.Z = aifkVar;
    }

    @Override // defpackage.aaqh
    public final String b() {
        String str = this.ab;
        if (str != null) {
            return str;
        }
        afpi g = g();
        if (this.Z.k()) {
            g.c("clickTrackingParams", "shared");
        } else {
            g.d("autoplay", this.G);
            g.d(ahbw.AUTONAV, this.H);
        }
        g.c("videoId", this.b);
        g.c("playlistId", i(this.d));
        g.b("playlistIndex", f(this.s));
        g.c("playerParams", i(this.c));
        g.b("dataExpiredForSeconds", f(this.P));
        g.d("isOfflineRequest", this.v);
        int i = this.Y;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        g.b("offlineDownloadUserChoice", i2);
        g.b("offlineStorageFormat", 0L);
        g.e("offlineSharingWrappedKey", aaef.a);
        g.d("scriptedPlay", this.f55J);
        g.c("serializedThirdPartyEmbedConfig", this.x);
        Iterator it = this.aa.iterator();
        while (it.hasNext()) {
            ((aijq) it.next()).a(g);
        }
        String a = g.a();
        this.ab = a;
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        this.b.getClass();
        zhq.m(this.k);
        aone u = u();
        amkq.N((((arnb) u.instance).b & 256) != 0);
        armt armtVar = ((arnb) u.instance).j;
        if (armtVar == null) {
            armtVar = armt.a;
        }
        boolean z = false;
        for (askp askpVar : armtVar.b) {
            if (askpVar.e.equals("ms") && askpVar.c == 2) {
                z = true;
            }
        }
        amkq.N(z);
        if ((((arnb) u.instance).b & 2) == 0) {
            if (!this.w) {
                amkq.N(true);
                if (this.ac == null) {
                    amkq.N(this.v || this.j);
                }
            } else {
                if (this.v) {
                    return;
                }
                zhq.m(this.L);
            }
        }
    }

    public final void d(aijq aijqVar) {
        this.aa.add(aijqVar);
    }

    public final void e(int i) {
        this.ac = Integer.valueOf(i);
    }

    @Override // defpackage.aaqh
    public final Map j() {
        if (this.f == null) {
            super.j();
            if (this.ad == null) {
                this.ad = this.ae.b(9);
            }
            this.f.put("id", this.b);
            this.f.put("t", this.ad);
        }
        return this.f;
    }

    @Override // defpackage.aaru
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = aryo.a.createBuilder();
        boolean z = this.u;
        createBuilder.copyOnWrite();
        aryo aryoVar = (aryo) createBuilder.instance;
        aryoVar.b |= 8;
        aryoVar.f = z;
        boolean z2 = this.t;
        createBuilder.copyOnWrite();
        aryo aryoVar2 = (aryo) createBuilder.instance;
        aryoVar2.b |= 4;
        aryoVar2.e = z2;
        boolean z3 = this.v;
        createBuilder.copyOnWrite();
        aryo aryoVar3 = (aryo) createBuilder.instance;
        aryoVar3.b |= 32;
        aryoVar3.h = z3;
        if (!TextUtils.isEmpty(this.b)) {
            String str = this.b;
            createBuilder.copyOnWrite();
            aryo aryoVar4 = (aryo) createBuilder.instance;
            str.getClass();
            aryoVar4.b |= 2;
            aryoVar4.d = str;
        }
        if (!TextUtils.isEmpty(this.K)) {
            String str2 = this.K;
            createBuilder.copyOnWrite();
            aryo aryoVar5 = (aryo) createBuilder.instance;
            str2.getClass();
            aryoVar5.b |= 1048576;
            aryoVar5.o = str2;
        }
        aone createBuilder2 = atwv.a.createBuilder();
        if (!TextUtils.isEmpty(this.c)) {
            String str3 = this.c;
            createBuilder.copyOnWrite();
            aryo aryoVar6 = (aryo) createBuilder.instance;
            str3.getClass();
            aryoVar6.b |= 2048;
            aryoVar6.k = str3;
        }
        if (!TextUtils.isEmpty(this.d)) {
            String str4 = this.d;
            createBuilder.copyOnWrite();
            aryo aryoVar7 = (aryo) createBuilder.instance;
            str4.getClass();
            aryoVar7.b |= 256;
            aryoVar7.i = str4;
            int i = this.s;
            if (i >= 0) {
                createBuilder.copyOnWrite();
                aryo aryoVar8 = (aryo) createBuilder.instance;
                aryoVar8.b |= 512;
                aryoVar8.j = i;
            }
        }
        if (!this.w) {
            aone createBuilder3 = atws.a.createBuilder();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((aijk) it.next()).a(createBuilder3);
            }
            if (!TextUtils.isEmpty(this.B)) {
                String str5 = this.B;
                createBuilder3.copyOnWrite();
                atws atwsVar = (atws) createBuilder3.instance;
                str5.getClass();
                atwsVar.b |= 2;
                atwsVar.d = str5;
            }
            long j = this.C;
            if (j != -1) {
                createBuilder3.copyOnWrite();
                atws atwsVar2 = (atws) createBuilder3.instance;
                atwsVar2.b |= 8;
                atwsVar2.f = j;
            }
            int i2 = this.D;
            if (i2 != -1) {
                createBuilder3.copyOnWrite();
                atws atwsVar3 = (atws) createBuilder3.instance;
                atwsVar3.b |= 4;
                atwsVar3.e = i2;
            }
            int i3 = this.F;
            if (i3 != -1) {
                createBuilder3.copyOnWrite();
                atws atwsVar4 = (atws) createBuilder3.instance;
                atwsVar4.b |= 16;
                atwsVar4.g = i3;
            }
            Integer num = this.ac;
            if (num != null && num.intValue() != -1) {
                int intValue = this.ac.intValue();
                createBuilder3.copyOnWrite();
                atws atwsVar5 = (atws) createBuilder3.instance;
                atwsVar5.b |= 64;
                atwsVar5.i = intValue;
            }
            int i4 = this.M;
            if (i4 != -1) {
                createBuilder3.copyOnWrite();
                atws atwsVar6 = (atws) createBuilder3.instance;
                atwsVar6.b |= 128;
                atwsVar6.j = i4;
            }
            int i5 = this.N;
            if (i5 != -1) {
                createBuilder3.copyOnWrite();
                atws atwsVar7 = (atws) createBuilder3.instance;
                atwsVar7.b |= 256;
                atwsVar7.k = i5;
            }
            int i6 = this.O;
            createBuilder3.copyOnWrite();
            atws atwsVar8 = (atws) createBuilder3.instance;
            atwsVar8.b |= 512;
            atwsVar8.l = i6;
            boolean z4 = this.G;
            createBuilder3.copyOnWrite();
            atws atwsVar9 = (atws) createBuilder3.instance;
            atwsVar9.b |= 4096;
            atwsVar9.n = z4;
            boolean z5 = this.H;
            createBuilder3.copyOnWrite();
            atws atwsVar10 = (atws) createBuilder3.instance;
            atwsVar10.b |= 33554432;
            atwsVar10.q = z5;
            String str6 = this.I;
            createBuilder3.copyOnWrite();
            atws atwsVar11 = (atws) createBuilder3.instance;
            str6.getClass();
            atwsVar11.b |= 16384;
            atwsVar11.p = str6;
            boolean z6 = this.f55J;
            createBuilder3.copyOnWrite();
            atws atwsVar12 = (atws) createBuilder3.instance;
            atwsVar12.b |= 2048;
            atwsVar12.m = z6;
            int i7 = this.E;
            createBuilder3.copyOnWrite();
            atws atwsVar13 = (atws) createBuilder3.instance;
            atwsVar13.b |= 32;
            atwsVar13.h = i7;
            if (this.U != null) {
                aone createBuilder4 = atwt.a.createBuilder();
                atbc atbcVar = this.U;
                createBuilder4.copyOnWrite();
                atwt atwtVar = (atwt) createBuilder4.instance;
                atbcVar.getClass();
                atwtVar.c = atbcVar;
                atwtVar.b |= 8;
                atwt atwtVar2 = (atwt) createBuilder4.build();
                createBuilder3.copyOnWrite();
                atws atwsVar14 = (atws) createBuilder3.instance;
                atwtVar2.getClass();
                atwsVar14.r = atwtVar2;
                atwsVar14.b |= 268435456;
            }
            createBuilder2.copyOnWrite();
            atwv atwvVar = (atwv) createBuilder2.instance;
            atws atwsVar15 = (atws) createBuilder3.build();
            atwsVar15.getClass();
            atwvVar.c = atwsVar15;
            atwvVar.b |= 1;
            if (this.R != null) {
                aone createBuilder5 = aryt.a.createBuilder();
                aomf x = aomf.x(this.R.b);
                createBuilder5.copyOnWrite();
                aryt arytVar = (aryt) createBuilder5.instance;
                arytVar.b |= 1;
                arytVar.c = x;
                aryt arytVar2 = (aryt) createBuilder5.build();
                createBuilder.copyOnWrite();
                aryo aryoVar9 = (aryo) createBuilder.instance;
                arytVar2.getClass();
                aryoVar9.r = arytVar2;
                aryoVar9.b |= 8388608;
            }
        } else {
            aone createBuilder6 = aoxj.a.createBuilder();
            int i8 = this.V;
            createBuilder6.copyOnWrite();
            aoxj aoxjVar = (aoxj) createBuilder6.instance;
            int i9 = i8 - 1;
            if (i8 == 0) {
                throw null;
            }
            aoxjVar.c = i9;
            aoxjVar.b |= 1;
            int i10 = this.W;
            createBuilder6.copyOnWrite();
            aoxj aoxjVar2 = (aoxj) createBuilder6.instance;
            int i11 = i10 - 1;
            if (i10 == 0) {
                throw null;
            }
            aoxjVar2.d = i11;
            aoxjVar2.b |= 2;
            int i12 = this.X;
            createBuilder6.copyOnWrite();
            aoxj aoxjVar3 = (aoxj) createBuilder6.instance;
            int i13 = i12 - 1;
            if (i12 != 0) {
                aoxjVar3.e = i13;
                aoxjVar3.b |= 4;
                String str7 = this.L;
                createBuilder6.copyOnWrite();
                aoxj aoxjVar4 = (aoxj) createBuilder6.instance;
                str7.getClass();
                aoxjVar4.b |= 16;
                aoxjVar4.f = str7;
                aoxj aoxjVar5 = (aoxj) createBuilder6.build();
                createBuilder2.copyOnWrite();
                atwv atwvVar2 = (atwv) createBuilder2.instance;
                aoxjVar5.getClass();
                atwvVar2.d = aoxjVar5;
                atwvVar2.b |= 2;
            } else {
                throw null;
            }
        }
        if (this.P != -1) {
            aone createBuilder7 = atwx.a.createBuilder();
            int i14 = this.P;
            createBuilder7.copyOnWrite();
            atwx atwxVar = (atwx) createBuilder7.instance;
            atwxVar.b |= 1;
            atwxVar.c = i14;
            atwx atwxVar2 = (atwx) createBuilder7.build();
            createBuilder2.copyOnWrite();
            atwv atwvVar3 = (atwv) createBuilder2.instance;
            atwxVar2.getClass();
            atwvVar3.f = atwxVar2;
            atwvVar3.b |= 8;
        }
        atww atwwVar = this.Q;
        if (atwwVar != null) {
            createBuilder2.copyOnWrite();
            atwv atwvVar4 = (atwv) createBuilder2.instance;
            atwvVar4.e = atwwVar;
            atwvVar4.b |= 4;
        }
        if (this.Y != 1) {
            aone createBuilder8 = atwu.a.createBuilder();
            int i15 = this.Y;
            createBuilder8.copyOnWrite();
            atwu atwuVar = (atwu) createBuilder8.instance;
            int i16 = i15 - 1;
            if (i15 == 0) {
                throw null;
            }
            atwuVar.c = i16;
            atwuVar.b |= 1;
            createBuilder8.copyOnWrite();
            atwu atwuVar2 = (atwu) createBuilder8.instance;
            atwuVar2.d = 0;
            atwuVar2.b |= 4;
            createBuilder2.copyOnWrite();
            atwv atwvVar5 = (atwv) createBuilder2.instance;
            atwu atwuVar3 = (atwu) createBuilder8.build();
            atwuVar3.getClass();
            atwvVar5.g = atwuVar3;
            atwvVar5.b |= 16;
        }
        createBuilder.copyOnWrite();
        aryo aryoVar10 = (aryo) createBuilder.instance;
        atwv atwvVar6 = (atwv) createBuilder2.build();
        atwvVar6.getClass();
        aryoVar10.g = atwvVar6;
        aryoVar10.b |= 16;
        List list = this.S;
        createBuilder.copyOnWrite();
        aryo aryoVar11 = (aryo) createBuilder.instance;
        aonu aonuVar = aryoVar11.l;
        if (!aonuVar.c()) {
            aryoVar11.l = aonm.mutableCopy(aonuVar);
        }
        aolo.addAll((Iterable) list, (List) aryoVar11.l);
        String str8 = this.x;
        if (str8 != null) {
            createBuilder.copyOnWrite();
            aryo aryoVar12 = (aryo) createBuilder.instance;
            aryoVar12.b |= 65536;
            aryoVar12.m = str8;
        }
        aryp arypVar = this.y;
        if (arypVar != null) {
            createBuilder.copyOnWrite();
            aryo aryoVar13 = (aryo) createBuilder.instance;
            aryoVar13.q = arypVar;
            aryoVar13.b |= 4194304;
        }
        String str9 = this.A;
        if (str9 != null) {
            createBuilder.copyOnWrite();
            aryo aryoVar14 = (aryo) createBuilder.instance;
            aryoVar14.b |= 524288;
            aryoVar14.n = str9;
        }
        aryq aryqVar = this.z;
        if (aryqVar != null) {
            createBuilder.copyOnWrite();
            aryo aryoVar15 = (aryo) createBuilder.instance;
            aryoVar15.s = aryqVar;
            aryoVar15.b |= 16777216;
        }
        if (this.T) {
            createBuilder.copyOnWrite();
            aryo aryoVar16 = (aryo) createBuilder.instance;
            aryoVar16.b |= 2097152;
            aryoVar16.p = true;
        }
        return createBuilder;
    }
}
