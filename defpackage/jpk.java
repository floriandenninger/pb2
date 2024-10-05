package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpk implements jpi {
    private final Context a;
    private final aahv b;
    private final aais c;
    private final axzg d;
    private final ajoy e;

    public jpk(Context context, aahv aahvVar, aais aaisVar, ajoy ajoyVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = context;
        this.b = aahvVar;
        this.c = aaisVar;
        this.e = ajoyVar;
        this.d = axzgVar;
    }

    @Override // defpackage.jpi
    public final int a() {
        return 137;
    }

    @Override // defpackage.jpi
    public final int b() {
        return 199;
    }

    @Override // defpackage.jpi
    public final /* bridge */ /* synthetic */ jpg c(aakt aaktVar, String str, jph jphVar) {
        awjp b;
        asxd asxdVar = (asxd) aaktVar;
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = aqny.a.createBuilder();
        createBuilder.copyOnWrite();
        aqny aqnyVar = (aqny) createBuilder.instance;
        aqnyVar.c |= 1;
        aqnyVar.d = str;
        aqnv aqnvVar = new aqnv(createBuilder);
        if (asxdVar != null && (b = asxdVar.b()) != null) {
            awic f = b.f();
            avgg thumbnail = b.getThumbnail();
            aone aoneVar = aqnvVar.a;
            aoneVar.copyOnWrite();
            aqny aqnyVar2 = (aqny) aoneVar.instance;
            thumbnail.getClass();
            aqnyVar2.e = thumbnail;
            aqnyVar2.c |= 2;
            String title = b.getTitle();
            aone aoneVar2 = aqnvVar.a;
            aoneVar2.copyOnWrite();
            aqny aqnyVar3 = (aqny) aoneVar2.instance;
            title.getClass();
            aqnyVar3.c |= 4;
            aqnyVar3.f = title;
            String title2 = f == null ? "" : f.getTitle();
            aone aoneVar3 = aqnvVar.a;
            aoneVar3.copyOnWrite();
            aqny aqnyVar4 = (aqny) aoneVar3.instance;
            title2.getClass();
            aqnyVar4.c |= 8;
            aqnyVar4.g = title2;
            Integer lengthSeconds = b.getLengthSeconds();
            aone aoneVar4 = aqnvVar.a;
            int intValue = lengthSeconds.intValue();
            aoneVar4.copyOnWrite();
            aqny aqnyVar5 = (aqny) aoneVar4.instance;
            aqnyVar5.c |= 16;
            aqnyVar5.h = intValue;
            String charSequence = wbs.ay(this.a.getResources(), zhq.i(b.getLengthSeconds().intValue())).toString();
            aone aoneVar5 = aqnvVar.a;
            aoneVar5.copyOnWrite();
            aqny aqnyVar6 = (aqny) aoneVar5.instance;
            charSequence.getClass();
            aqnyVar6.c |= 32;
            aqnyVar6.i = charSequence;
            aong aongVar = (aong) awas.a.createBuilder();
            String videoId = b.getVideoId();
            aongVar.copyOnWrite();
            awas awasVar = (awas) aongVar.instance;
            videoId.getClass();
            awasVar.b |= 1;
            awasVar.c = videoId;
            aongVar.copyOnWrite();
            awas awasVar2 = (awas) aongVar.instance;
            awasVar2.b |= 2;
            awasVar2.d = 155;
            String f2 = fhe.f((awas) aongVar.build());
            aone aoneVar6 = aqnvVar.a;
            aoneVar6.copyOnWrite();
            aqny aqnyVar7 = (aqny) aoneVar6.instance;
            f2.getClass();
            aqnyVar7.c |= 64;
            aqnyVar7.j = f2;
            String videoId2 = b.getVideoId();
            aone aoneVar7 = aqnvVar.a;
            aoneVar7.copyOnWrite();
            aqny aqnyVar8 = (aqny) aoneVar7.instance;
            videoId2.getClass();
            aqnyVar8.c |= 128;
            aqnyVar8.k = videoId2;
            String str2 = b.getLocalizedStrings().c;
            aone aoneVar8 = aqnvVar.a;
            aoneVar8.copyOnWrite();
            aqny aqnyVar9 = (aqny) aoneVar8.instance;
            str2.getClass();
            aqnyVar9.c |= 256;
            aqnyVar9.l = str2;
            List<aqll> formats = asxdVar.getFormats();
            if (formats != null && !formats.isEmpty()) {
                for (aqll aqllVar : formats) {
                    aone aoneVar9 = aqnvVar.a;
                    aoneVar9.copyOnWrite();
                    aqny aqnyVar10 = (aqny) aoneVar9.instance;
                    aqllVar.getClass();
                    aony aonyVar = aqnyVar10.m;
                    if (!aonyVar.c()) {
                        aqnyVar10.m = aonm.mutableCopy(aonyVar);
                    }
                    aqnyVar10.m.add(aqllVar);
                }
            }
            aomf scoringTrackingParams = asxdVar.getScoringTrackingParams();
            aone aoneVar10 = aqnvVar.a;
            aoneVar10.copyOnWrite();
            aqny aqnyVar11 = (aqny) aoneVar10.instance;
            scoringTrackingParams.getClass();
            aqnyVar11.c |= 512;
            aqnyVar11.n = scoringTrackingParams;
        }
        return jpg.a(aqnvVar.a(this.b.c()));
    }

    @Override // defpackage.jpi
    public final ammv d(String str) {
        awas z = etx.z(str, this.d);
        return z == null ? amlr.a : ammv.j(fhe.v(z.c));
    }

    @Override // defpackage.jpi
    public final amsx e(String str) {
        aair c = this.c.c();
        awas z = etx.z(str, this.d);
        if (z == null) {
            return amvs.a;
        }
        String str2 = z.c;
        String v = fhe.v(str2);
        String y = fhe.y(str2);
        HashSet ap = amkq.ap(this.e.E(v), this.e.E(y));
        awjp awjpVar = (awjp) c.f(y).g(awjp.class).X();
        String g = awjpVar != null ? awjpVar.g() : null;
        if (g != null) {
            ap.add(this.e.E(g));
        }
        return amsx.p(ap);
    }

    @Override // defpackage.jpi
    public final Class f() {
        return asxd.class;
    }

    @Override // defpackage.jpi
    public final Class g() {
        return aqnx.class;
    }

    @Override // defpackage.jpi
    public final aajc h(String str) {
        return new aajc(1, str);
    }
}
