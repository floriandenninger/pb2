package defpackage;

import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class yer implements aaha {
    private final aarr a;
    protected final ydn r;
    public final zaw s;
    protected final aahd t;
    protected final aben u;
    public yfb v;
    public final aoae w;

    public yer(ydn ydnVar, zaw zawVar, aahd aahdVar, aoae aoaeVar, aben abenVar, aarr aarrVar, byte[] bArr, byte[] bArr2) {
        this.r = ydnVar;
        this.s = zawVar;
        this.t = aahdVar;
        this.w = aoaeVar;
        this.u = abenVar;
        this.a = aarrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(apxf apxfVar, Map map) {
        ydl ydlVar = (ydl) yjj.u(map, "OnYpcTransactionListener", ydl.class);
        if (ydlVar != null) {
            this.r.j = ydlVar;
        }
        this.v = (yfb) yjj.u(map, "YpcTransactionListener", yfb.class);
        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) apxfVar.pX(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
        if (this.v == null && (ypcGetCartEndpoint$YPCGetCartEndpoint.b & 2) != 0) {
            this.v = new yeq(this);
        }
        yfb yfbVar = this.v;
        if (yfbVar != null) {
            this.r.m = new yep(yfbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(asfy asfyVar, apxf apxfVar) {
        this.r.b(asfyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(apxf apxfVar) {
        if (apxfVar == null || !apxfVar.pY(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)) {
            return;
        }
        YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) apxfVar.pX(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
        if (ypcGetCartEndpoint$YPCGetCartEndpoint.c.isEmpty()) {
            if ((ypcGetCartEndpoint$YPCGetCartEndpoint.b & 2) == 0 || ypcGetCartEndpoint$YPCGetCartEndpoint.d.d() <= 0) {
                if (ypcGetCartEndpoint$YPCGetCartEndpoint.j.isEmpty()) {
                    if (ypcGetCartEndpoint$YPCGetCartEndpoint.m.isEmpty()) {
                        return;
                    }
                    ydn ydnVar = this.r;
                    String str = ypcGetCartEndpoint$YPCGetCartEndpoint.m;
                    avit avitVar = ypcGetCartEndpoint$YPCGetCartEndpoint.l;
                    if (avitVar == null) {
                        avitVar = avit.a;
                    }
                    aomf aomfVar = apxfVar.c;
                    abei b = this.u.b();
                    b.d = abei.i(str);
                    b.c = avitVar;
                    b.l(aomfVar);
                    ydnVar.g(b);
                    return;
                }
                ydn ydnVar2 = this.r;
                String str2 = ypcGetCartEndpoint$YPCGetCartEndpoint.j;
                long j = ypcGetCartEndpoint$YPCGetCartEndpoint.k;
                avit avitVar2 = ypcGetCartEndpoint$YPCGetCartEndpoint.l;
                if (avitVar2 == null) {
                    avitVar2 = avit.a;
                }
                aomf aomfVar2 = apxfVar.c;
                abei b2 = this.u.b();
                b2.e(str2);
                b2.b = j;
                b2.c = avitVar2;
                b2.l(aomfVar2);
                ydnVar2.g(b2);
                return;
            }
            if (!ypcGetCartEndpoint$YPCGetCartEndpoint.e.isEmpty()) {
                ydn ydnVar3 = this.r;
                String str3 = ypcGetCartEndpoint$YPCGetCartEndpoint.e;
                byte[] I = ypcGetCartEndpoint$YPCGetCartEndpoint.d.I();
                aomf aomfVar3 = apxfVar.c;
                abei b3 = this.u.b();
                b3.d(I);
                if (b3.s == null) {
                    b3.s = apmu.a.createBuilder();
                }
                aone aoneVar = b3.s;
                aoneVar.copyOnWrite();
                apmu apmuVar = (apmu) aoneVar.instance;
                apmu apmuVar2 = apmu.a;
                str3.getClass();
                apmuVar.c = 5;
                apmuVar.d = str3;
                b3.l(aomfVar3);
                ydnVar3.g(b3);
                return;
            }
            ydn ydnVar4 = this.r;
            byte[] I2 = ypcGetCartEndpoint$YPCGetCartEndpoint.d.I();
            long j2 = ypcGetCartEndpoint$YPCGetCartEndpoint.f;
            String str4 = ypcGetCartEndpoint$YPCGetCartEndpoint.g;
            asrh asrhVar = ypcGetCartEndpoint$YPCGetCartEndpoint.h;
            if (asrhVar == null) {
                asrhVar = asrh.a;
            }
            aomf aomfVar4 = apxfVar.c;
            abei b4 = this.u.b();
            b4.d(I2);
            if (b4.s == null) {
                b4.s = apmu.a.createBuilder();
            }
            aone aoneVar2 = b4.s;
            aoneVar2.copyOnWrite();
            apmu apmuVar3 = (apmu) aoneVar2.instance;
            apmu apmuVar4 = apmu.a;
            apmuVar3.b |= 2;
            apmuVar3.f = j2;
            if (asrhVar != null) {
                if (b4.s == null) {
                    b4.s = apmu.a.createBuilder();
                }
                aone aoneVar3 = b4.s;
                aoneVar3.copyOnWrite();
                apmu apmuVar5 = (apmu) aoneVar3.instance;
                apmuVar5.d = asrhVar;
                apmuVar5.c = 4;
            } else {
                if (b4.s == null) {
                    b4.s = apmu.a.createBuilder();
                }
                aone aoneVar4 = b4.s;
                aoneVar4.copyOnWrite();
                apmu apmuVar6 = (apmu) aoneVar4.instance;
                str4.getClass();
                apmuVar6.c = 3;
                apmuVar6.d = str4;
            }
            b4.l(aomfVar4);
            ydnVar4.g(b4);
            return;
        }
        ydn ydnVar5 = this.r;
        String str5 = ypcGetCartEndpoint$YPCGetCartEndpoint.c;
        aomf aomfVar5 = apxfVar.c;
        abei b5 = this.u.b();
        b5.a = abei.i(str5);
        b5.l(aomfVar5);
        ydnVar5.g(b5);
    }

    @Override // defpackage.aaha
    public void kE(apxf apxfVar, Map map) {
        awgh awghVar;
        awgh awghVar2;
        b(apxfVar, map);
        asfy asfyVar = null;
        if (apxfVar.pY(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)) {
            YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) apxfVar.pX(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
            awgg awggVar = ypcGetCartEndpoint$YPCGetCartEndpoint.i;
            if (awggVar == null) {
                awggVar = awgg.a;
            }
            if (awggVar.b == 95698847) {
                awghVar = (awgh) awggVar.c;
            } else {
                awghVar = awgh.a;
            }
            if ((awghVar.b & 1) != 0) {
                aarr aarrVar = this.a;
                awgg awggVar2 = ypcGetCartEndpoint$YPCGetCartEndpoint.i;
                if (awggVar2 == null) {
                    awggVar2 = awgg.a;
                }
                if (awggVar2.b == 95698847) {
                    awghVar2 = (awgh) awggVar2.c;
                } else {
                    awghVar2 = awgh.a;
                }
                asfyVar = (asfy) aarrVar.a(awghVar2.c.I(), asfy.a);
            }
        }
        if (asfyVar == null) {
            e(apxfVar);
        } else {
            c(asfyVar, apxfVar);
        }
    }
}
