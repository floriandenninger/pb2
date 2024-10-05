package defpackage;

import com.google.android.gms.cast.CastDevice;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adak implements aarz {
    public adlm a;

    static {
        zga.a("MDX.innertube");
    }

    @Override // defpackage.aarz
    public final void a(aone aoneVar) {
        army armyVar;
        adlm adlmVar = this.a;
        if (adlmVar == null || adlmVar.a() == 2) {
            return;
        }
        armz armzVar = ((arnb) aoneVar.instance).d;
        if (armzVar == null) {
            armzVar = armz.a;
        }
        aone builder = armzVar.toBuilder();
        adlm adlmVar2 = this.a;
        String str = null;
        if (adlmVar2 != null && adlmVar2.a() != 2) {
            str = adlmVar2.t();
        }
        if ("tvlite".equals(str)) {
            armyVar = army.TVLITE;
        } else if ("xbox".equals(str)) {
            armyVar = army.XBOX;
        } else if (adlmVar2 == null || !adlmVar2.ab()) {
            armyVar = army.TVHTML5;
        } else {
            armyVar = army.TVHTML5_AUDIO;
        }
        String.valueOf(String.valueOf(armyVar)).length();
        builder.copyOnWrite();
        armz armzVar2 = (armz) builder.instance;
        armzVar2.p = armyVar.ay;
        armzVar2.b |= 16777216;
        adgb k = adlmVar.k();
        if (k instanceof adfy) {
            adfy adfyVar = (adfy) k;
            String str2 = adfyVar.f;
            if (str2 != null) {
                builder.copyOnWrite();
                armz armzVar3 = (armz) builder.instance;
                armzVar3.b = Integer.MIN_VALUE | armzVar3.b;
                armzVar3.s = str2;
            }
            String str3 = adfyVar.g;
            if (str3 != null) {
                builder.copyOnWrite();
                armz armzVar4 = (armz) builder.instance;
                armzVar4.c |= 2;
                armzVar4.u = str3;
            }
            String str4 = adfyVar.i;
            if (str4 != null) {
                builder.copyOnWrite();
                armz armzVar5 = (armz) builder.instance;
                armzVar5.c |= 32;
                armzVar5.w = str4;
            }
            String str5 = adfyVar.f;
            String str6 = adfyVar.g;
            String str7 = adfyVar.i;
            String.valueOf(str5).length();
            String.valueOf(str6).length();
            String.valueOf(str7).length();
        } else if (k instanceof adfu) {
            CastDevice castDevice = ((adfu) k).a;
            builder.copyOnWrite();
            armz armzVar6 = (armz) builder.instance;
            armzVar6.b = Integer.MIN_VALUE | armzVar6.b;
            armzVar6.s = "Google Inc.";
            String str8 = castDevice.e;
            builder.copyOnWrite();
            armz armzVar7 = (armz) builder.instance;
            str8.getClass();
            armzVar7.c |= 2;
            armzVar7.u = str8;
            String str9 = castDevice.f;
            builder.copyOnWrite();
            armz armzVar8 = (armz) builder.instance;
            str9.getClass();
            armzVar8.c |= 32;
            armzVar8.w = str9;
            String str10 = castDevice.e;
            String str11 = castDevice.f;
            String.valueOf(str10).length();
            String.valueOf(str11).length();
        }
        armz armzVar9 = (armz) builder.build();
        aoneVar.copyOnWrite();
        arnb arnbVar = (arnb) aoneVar.instance;
        armzVar9.getClass();
        arnbVar.d = armzVar9;
        arnbVar.b |= 2;
    }
}
