package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;
import j$.util.Optional;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class wgs implements amml {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ wgs(String str, int i) {
        this.b = i;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amml
    public final Object apply(Object obj) {
        aone builder;
        int i = 0;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((awul) obj).d.containsKey(this.a));
            case 1:
                return Optional.ofNullable((aoqa) Collections.unmodifiableMap(((awul) obj).h).get(this.a));
            case 2:
                String str = this.a;
                Map unmodifiableMap = Collections.unmodifiableMap(((awul) obj).g);
                if (unmodifiableMap.containsKey(str)) {
                    return (Long) unmodifiableMap.get(str);
                }
                return null;
            case 3:
                String str2 = this.a;
                aone builder2 = ((awul) obj).toBuilder();
                builder2.copyOnWrite();
                ((awul) builder2.instance).a().remove(str2);
                return (awul) builder2.build();
            case 4:
                String str3 = this.a;
                aone builder3 = ((awul) obj).toBuilder();
                builder3.bc(str3);
                return (awul) builder3.build();
            case 5:
                String str4 = this.a;
                aone builder4 = ((awul) obj).toBuilder();
                builder4.copyOnWrite();
                awul awulVar = (awul) builder4.instance;
                awulVar.b |= 4;
                awulVar.f = str4;
                return (awul) builder4.build();
            case 6:
                String str5 = this.a;
                aone builder5 = ((awul) obj).toBuilder();
                builder5.copyOnWrite();
                awul awulVar2 = (awul) builder5.instance;
                awulVar2.b |= 1;
                awulVar2.c = str5;
                return (awul) builder5.build();
            case 7:
                String str6 = this.a;
                for (alyk alykVar : (List) obj) {
                    if (str6.equals(alykVar.b.c)) {
                        return alykVar.a;
                    }
                }
                throw new IllegalStateException(str6.length() != 0 ? "UserId didn't map to Account: ".concat(str6) : new String("UserId didn't map to Account: "));
            case 8:
                String str7 = this.a;
                aone builder6 = ((aosg) obj).toBuilder();
                builder6.copyOnWrite();
                aosg aosgVar = (aosg) builder6.instance;
                str7.getClass();
                aosgVar.b |= 1;
                aosgVar.c = str7;
                return (aosg) builder6.build();
            case 9:
                String str8 = this.a;
                aone builder7 = ((awuq) obj).toBuilder();
                builder7.be(zoy.e(str8), 1);
                return (awuq) builder7.build();
            case 10:
                String str9 = this.a;
                aone builder8 = ((awuq) obj).toBuilder();
                builder8.be(zoy.e(str9), 2);
                return (awuq) builder8.build();
            case 11:
                String str10 = this.a;
                awuq awuqVar = (awuq) obj;
                if (awuqVar != null) {
                    str10.getClass();
                    aoot aootVar = awuqVar.d;
                    if (aootVar.containsKey(str10)) {
                        i = ((Integer) aootVar.get(str10)).intValue();
                    }
                }
                return Integer.valueOf(i);
            case 12:
                String str11 = this.a;
                aosc aoscVar = (aosc) obj;
                if (TextUtils.isEmpty(str11)) {
                    return aosc.a;
                }
                aone builder9 = aoscVar.toBuilder();
                builder9.copyOnWrite();
                aosc aoscVar2 = (aosc) builder9.instance;
                str11.getClass();
                aoscVar2.b |= 1;
                aoscVar2.c = str11;
                return (aosc) builder9.build();
            case 13:
                String str12 = this.a;
                awvd awvdVar = (awvd) obj;
                int i2 = aczv.d;
                String.format("createPromptRecord= id=%s ignoredCount=%s", awvdVar.c, Integer.valueOf(awvdVar.d));
                if (awvdVar.c.equals(str12)) {
                    return awvdVar;
                }
                aone createBuilder = awvd.a.createBuilder();
                createBuilder.copyOnWrite();
                awvd awvdVar2 = (awvd) createBuilder.instance;
                str12.getClass();
                awvdVar2.b = 1 | awvdVar2.b;
                awvdVar2.c = str12;
                createBuilder.copyOnWrite();
                awvd awvdVar3 = (awvd) createBuilder.instance;
                awvdVar3.b = 2 | awvdVar3.b;
                awvdVar3.d = 0;
                return (awvd) createBuilder.build();
            case 14:
                String str13 = this.a;
                awvf awvfVar = (awvf) obj;
                if (awvfVar != null) {
                    builder = awvfVar.toBuilder();
                } else {
                    builder = awvf.a.createBuilder();
                }
                builder.copyOnWrite();
                awvf awvfVar2 = (awvf) builder.instance;
                str13.getClass();
                awvfVar2.b |= 1;
                awvfVar2.c = str13;
                return (awvf) builder.build();
            case 15:
                String str14 = this.a;
                int i3 = TvSignInControllerImpl.o;
                aone builder10 = ((awvi) obj).toBuilder();
                builder10.copyOnWrite();
                awvi awviVar = (awvi) builder10.instance;
                str14.getClass();
                aony aonyVar = awviVar.b;
                if (!aonyVar.c()) {
                    awviVar.b = aonm.mutableCopy(aonyVar);
                }
                awviVar.b.add(str14);
                return (awvi) builder10.build();
            case 16:
                String str15 = this.a;
                aone builder11 = ((awvr) obj).toBuilder();
                builder11.copyOnWrite();
                ((awvr) builder11.instance).a().clear();
                builder11.copyOnWrite();
                awvr awvrVar = (awvr) builder11.instance;
                str15.getClass();
                awvrVar.b |= 128;
                awvrVar.p = str15;
                return (awvr) builder11.build();
            case 17:
                String str16 = this.a;
                aone builder12 = ((awwa) obj).toBuilder();
                str16.getClass();
                builder12.copyOnWrite();
                ((awwa) builder12.instance).c().remove(str16);
                str16.getClass();
                builder12.copyOnWrite();
                ((awwa) builder12.instance).f().remove(str16);
                str16.getClass();
                builder12.copyOnWrite();
                ((awwa) builder12.instance).d().remove(str16);
                str16.getClass();
                builder12.copyOnWrite();
                ((awwa) builder12.instance).g().remove(str16);
                str16.getClass();
                builder12.copyOnWrite();
                ((awwa) builder12.instance).a().remove(str16);
                str16.getClass();
                builder12.copyOnWrite();
                ((awwa) builder12.instance).e().remove(str16);
                str16.getClass();
                builder12.copyOnWrite();
                ((awwa) builder12.instance).b().remove(str16);
                return (awwa) builder12.build();
            case 18:
                String str17 = this.a;
                aone builder13 = ((awwf) obj).toBuilder();
                builder13.copyOnWrite();
                awwf awwfVar = (awwf) builder13.instance;
                str17.getClass();
                awwfVar.b |= 4;
                awwfVar.e = str17;
                return (awwf) builder13.build();
            case 19:
                return this.a;
            default:
                String str18 = this.a;
                aomf aomfVar = (aomf) Collections.unmodifiableMap(((basi) obj).b).get(str18);
                if (aomfVar != null) {
                    return aomfVar;
                }
                throw new IllegalArgumentException(String.format("%s payload id is not found", str18));
        }
    }
}
