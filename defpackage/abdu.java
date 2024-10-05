package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abdu extends aaru {
    public asen A;
    public boolean B;
    public atbc C;
    public boolean D;
    public boolean E;
    public int F;
    private String G;
    private String H;
    private final List I;
    public String a;
    public int b;
    public String c;
    public String d;
    public boolean s;
    public asey t;
    public String u;
    public long v;
    public long w;
    public String x;
    public String y;
    public String z;

    public abdu(String str, ajoy ajoyVar, afsx afsxVar, boolean z, Optional optional, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(str, ajoyVar, afsxVar, optional, (byte[]) null, (byte[]) null, (byte[]) null);
        this.b = 0;
        this.s = false;
        this.I = new ArrayList();
        this.v = -1L;
        this.w = -1L;
        this.B = false;
        this.D = false;
        this.E = false;
        this.i = z;
    }

    @Override // defpackage.aaqh
    public final String b() {
        afpi g = g();
        g.c("videoId", this.G);
        g.c("playlistId", this.a);
        g.b("playlistIndex", f(this.b));
        g.c("gamingEventId", null);
        g.c("params", this.H);
        g.c("adParams", this.c);
        g.c("continuation", this.d);
        g.d("isAdPlayback", this.s);
        g.d("mdxUseDevServer", false);
        g.c("forceAdUrls", "null");
        g.c("forceAdGroupId", null);
        g.c("forceViralAdResponseUrl", null);
        g.c("forcePresetAd", null);
        g.d("isAudioOnly", false);
        if (this.F != 0) {
            g.b("autonavState", r1 - 1);
        }
        g.c("serializedThirdPartyEmbedConfig", this.u);
        g.b("playerTimestamp", this.v);
        g.c("lastScrubbedInlinePlaybackId", this.x);
        g.c("lastAudioTurnedOnInlinePlaybackId", this.y);
        g.c("lastAudioTurnedOffInlinePlaybackId", this.z);
        g.d("captionsRequested", this.B);
        g.d("allowAdultContent", this.E);
        g.d("allowControversialContent", this.D);
        return g.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        boolean z = true;
        if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.G) && TextUtils.isEmpty(this.d) && TextUtils.isEmpty(null)) {
            z = false;
        }
        amkq.N(z);
    }

    public final void d(int i) {
        this.I.add(Integer.valueOf(i));
    }

    public final void e(String str) {
        str.getClass();
        this.H = str;
    }

    public final void v(String str) {
        str.getClass();
        this.G = str;
    }

    @Override // defpackage.aaru
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final aone a() {
        aone createBuilder = asfb.a.createBuilder();
        boolean z = this.s;
        createBuilder.copyOnWrite();
        asfb asfbVar = (asfb) createBuilder.instance;
        asfbVar.b |= 256;
        asfbVar.j = z;
        createBuilder.copyOnWrite();
        asfb asfbVar2 = (asfb) createBuilder.instance;
        asfbVar2.b |= 4096;
        asfbVar2.n = false;
        createBuilder.copyOnWrite();
        asfb asfbVar3 = (asfb) createBuilder.instance;
        asfbVar3.b |= 16777216;
        asfbVar3.p = false;
        createBuilder.copyOnWrite();
        asfb asfbVar4 = (asfb) createBuilder.instance;
        asfbVar4.b |= 134217728;
        asfbVar4.r = false;
        boolean z2 = this.B;
        createBuilder.copyOnWrite();
        asfb asfbVar5 = (asfb) createBuilder.instance;
        asfbVar5.c |= 512;
        asfbVar5.A = z2;
        boolean z3 = this.E;
        createBuilder.copyOnWrite();
        asfb asfbVar6 = (asfb) createBuilder.instance;
        asfbVar6.b |= 2048;
        asfbVar6.m = z3;
        boolean z4 = this.D;
        createBuilder.copyOnWrite();
        asfb asfbVar7 = (asfb) createBuilder.instance;
        asfbVar7.b |= 1024;
        asfbVar7.l = z4;
        if (!TextUtils.isEmpty(this.G)) {
            String str = this.G;
            createBuilder.copyOnWrite();
            asfb asfbVar8 = (asfb) createBuilder.instance;
            str.getClass();
            asfbVar8.b |= 2;
            asfbVar8.e = str;
        }
        if (!TextUtils.isEmpty(this.a)) {
            String str2 = this.a;
            createBuilder.copyOnWrite();
            asfb asfbVar9 = (asfb) createBuilder.instance;
            str2.getClass();
            asfbVar9.b |= 4;
            asfbVar9.f = str2;
        }
        if (TextUtils.isEmpty(null)) {
            int i = this.b;
            if (i > 0) {
                createBuilder.copyOnWrite();
                asfb asfbVar10 = (asfb) createBuilder.instance;
                asfbVar10.b |= 64;
                asfbVar10.i = i;
            }
            String str3 = this.H;
            if (str3 != null) {
                createBuilder.copyOnWrite();
                asfb asfbVar11 = (asfb) createBuilder.instance;
                asfbVar11.b |= 16;
                asfbVar11.g = str3;
            }
            String str4 = this.c;
            if (str4 != null) {
                createBuilder.copyOnWrite();
                asfb asfbVar12 = (asfb) createBuilder.instance;
                asfbVar12.b |= 512;
                asfbVar12.k = str4;
            }
            String str5 = this.d;
            if (str5 != null) {
                createBuilder.copyOnWrite();
                asfb asfbVar13 = (asfb) createBuilder.instance;
                asfbVar13.b |= 32;
                asfbVar13.h = str5;
            }
            List list = this.I;
            createBuilder.copyOnWrite();
            asfb asfbVar14 = (asfb) createBuilder.instance;
            aonu aonuVar = asfbVar14.o;
            if (!aonuVar.c()) {
                asfbVar14.o = aonm.mutableCopy(aonuVar);
            }
            aolo.addAll((Iterable) list, (List) asfbVar14.o);
            int i2 = this.F;
            if (i2 != 0 && i2 != 1) {
                createBuilder.copyOnWrite();
                asfb asfbVar15 = (asfb) createBuilder.instance;
                asfbVar15.q = i2 - 1;
                asfbVar15.b |= 67108864;
            }
            asey aseyVar = this.t;
            if (aseyVar != null) {
                createBuilder.copyOnWrite();
                asfb asfbVar16 = (asfb) createBuilder.instance;
                asfbVar16.u = aseyVar;
                asfbVar16.c |= 4;
            }
            String str6 = this.u;
            if (str6 != null) {
                createBuilder.copyOnWrite();
                asfb asfbVar17 = (asfb) createBuilder.instance;
                asfbVar17.c |= 1;
                asfbVar17.t = str6;
            }
            long j = this.v;
            if (j != -1) {
                createBuilder.copyOnWrite();
                asfb asfbVar18 = (asfb) createBuilder.instance;
                asfbVar18.c |= 8;
                asfbVar18.v = j;
            }
            if (!TextUtils.isEmpty(null)) {
                aone createBuilder2 = aqxm.a.createBuilder();
                createBuilder2.copyOnWrite();
                throw null;
            }
            if (!TextUtils.isEmpty(null)) {
                aone createBuilder3 = aqxn.a.createBuilder();
                createBuilder3.copyOnWrite();
                throw null;
            }
            if (TextUtils.isEmpty(null)) {
                if (!TextUtils.isEmpty(this.x)) {
                    String str7 = this.x;
                    createBuilder.copyOnWrite();
                    asfb asfbVar19 = (asfb) createBuilder.instance;
                    str7.getClass();
                    asfbVar19.c |= 32;
                    asfbVar19.w = str7;
                }
                if (!TextUtils.isEmpty(this.y)) {
                    String str8 = this.y;
                    createBuilder.copyOnWrite();
                    asfb asfbVar20 = (asfb) createBuilder.instance;
                    str8.getClass();
                    asfbVar20.c |= 64;
                    asfbVar20.x = str8;
                }
                if (!TextUtils.isEmpty(this.z)) {
                    String str9 = this.z;
                    createBuilder.copyOnWrite();
                    asfb asfbVar21 = (asfb) createBuilder.instance;
                    str9.getClass();
                    asfbVar21.c |= 128;
                    asfbVar21.y = str9;
                }
                asen asenVar = this.A;
                if (asenVar != null) {
                    createBuilder.copyOnWrite();
                    asfb asfbVar22 = (asfb) createBuilder.instance;
                    asfbVar22.z = asenVar;
                    asfbVar22.c |= 256;
                }
                atbc atbcVar = this.C;
                if (atbcVar != null) {
                    createBuilder.copyOnWrite();
                    asfb asfbVar23 = (asfb) createBuilder.instance;
                    asfbVar23.B = atbcVar;
                    asfbVar23.c |= 1024;
                }
                aone createBuilder4 = asex.a.createBuilder();
                long j2 = this.w;
                createBuilder4.copyOnWrite();
                asex asexVar = (asex) createBuilder4.instance;
                asexVar.b = 1 | asexVar.b;
                asexVar.c = j2;
                createBuilder.copyOnWrite();
                asfb asfbVar24 = (asfb) createBuilder.instance;
                asex asexVar2 = (asex) createBuilder4.build();
                asexVar2.getClass();
                asfbVar24.s = asexVar2;
                asfbVar24.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                return createBuilder;
            }
            aone createBuilder5 = aqxn.a.createBuilder();
            createBuilder5.copyOnWrite();
            throw null;
        }
        createBuilder.copyOnWrite();
        throw null;
    }
}
