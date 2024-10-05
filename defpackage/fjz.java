package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fjz implements amml {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ fjz(String str, int i) {
        this.b = i;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                String str = this.a;
                fkg fkgVar = (fkg) obj;
                fkb fkbVar = fkb.a;
                aoot aootVar = fkgVar.j;
                if (aootVar.containsKey(str)) {
                    fkbVar = (fkb) aootVar.get(str);
                }
                aone builder = fkbVar.toBuilder();
                aone builder2 = fkgVar.toBuilder();
                builder.copyOnWrite();
                fkb fkbVar2 = (fkb) builder.instance;
                fkbVar2.b &= -2;
                fkbVar2.c = false;
                builder.copyOnWrite();
                fkb fkbVar3 = (fkb) builder.instance;
                fkbVar3.b &= -3;
                fkbVar3.d = 0L;
                builder2.i(str, (fkb) builder.build());
                return (fkg) builder2.build();
            case 1:
                String str2 = this.a;
                aone builder3 = ((fkg) obj).toBuilder();
                builder3.copyOnWrite();
                fkg fkgVar2 = (fkg) builder3.instance;
                str2.getClass();
                fkgVar2.b |= 1;
                fkgVar2.c = str2;
                return (fkg) builder3.build();
            case 2:
                String str3 = this.a;
                fkb fkbVar4 = fkb.a;
                aoot aootVar2 = ((fkg) obj).j;
                if (aootVar2.containsKey(str3)) {
                    fkbVar4 = (fkb) aootVar2.get(str3);
                }
                return Boolean.valueOf(fkbVar4.f);
            case 3:
                String str4 = this.a;
                fkb fkbVar5 = fkb.a;
                aoot aootVar3 = ((fkg) obj).j;
                if (aootVar3.containsKey(str4)) {
                    fkbVar5 = (fkb) aootVar3.get(str4);
                }
                return Boolean.valueOf(fkbVar5.e);
            case 4:
                String str5 = this.a;
                lqw lqwVar = (lqw) obj;
                aone builder4 = lqwVar.toBuilder();
                lqx lqxVar = lqwVar.c;
                if (lqxVar == null) {
                    lqxVar = lqx.a;
                }
                aone builder5 = lqxVar.toBuilder();
                builder5.copyOnWrite();
                lqx lqxVar2 = (lqx) builder5.instance;
                str5.getClass();
                lqxVar2.b |= 1;
                lqxVar2.c = str5;
                builder4.copyOnWrite();
                lqw lqwVar2 = (lqw) builder4.instance;
                lqx lqxVar3 = (lqx) builder5.build();
                lqxVar3.getClass();
                lqwVar2.c = lqxVar3;
                lqwVar2.b |= 1;
                return (lqw) builder4.build();
            case 5:
                String str6 = this.a;
                aone builder6 = ((gnh) obj).toBuilder();
                builder6.copyOnWrite();
                gnh gnhVar = (gnh) builder6.instance;
                str6.getClass();
                gnhVar.b |= 8;
                gnhVar.f = str6;
                return (gnh) builder6.build();
            case 6:
                String str7 = this.a;
                aone builder7 = ((idr) obj).toBuilder();
                builder7.copyOnWrite();
                idr idrVar = (idr) builder7.instance;
                str7.getClass();
                idrVar.k = str7;
                return (idr) builder7.build();
            case 7:
                String str8 = this.a;
                aone builder8 = ((idr) obj).toBuilder();
                builder8.copyOnWrite();
                idr idrVar2 = (idr) builder8.instance;
                str8.getClass();
                idrVar2.l = str8;
                return (idr) builder8.build();
            case 8:
                String str9 = this.a;
                aone builder9 = ((idr) obj).toBuilder();
                builder9.copyOnWrite();
                idr idrVar3 = (idr) builder9.instance;
                str9.getClass();
                idrVar3.m = str9;
                return (idr) builder9.build();
            case 9:
                String str10 = this.a;
                aone builder10 = ((fkh) obj).toBuilder();
                builder10.copyOnWrite();
                fkh fkhVar = (fkh) builder10.instance;
                str10.getClass();
                fkhVar.b |= 1;
                fkhVar.c = str10;
                return (fkh) builder10.build();
            case 10:
                String str11 = this.a;
                aone builder11 = ((lox) obj).toBuilder();
                builder11.copyOnWrite();
                lox loxVar = (lox) builder11.instance;
                loxVar.b |= 2;
                loxVar.d = str11;
                return (lox) builder11.build();
            case 11:
                return (tkv) Collections.unmodifiableMap(((tlb) obj).b).get(this.a);
            case 12:
                return (tle) Collections.unmodifiableMap(((tlb) obj).c).get(this.a);
            case 13:
                String str12 = this.a;
                aone builder12 = ((tlb) obj).toBuilder();
                builder12.y(str12);
                return (tlb) builder12.build();
            case 14:
                return (tlh) Collections.unmodifiableMap(((tlj) obj).b).get(this.a);
            case 15:
                String str13 = this.a;
                aone builder13 = ((tlj) obj).toBuilder();
                builder13.A(str13);
                return (tlj) builder13.build();
            case 16:
                String str14 = this.a;
                uvs uvsVar = uwo.a;
                uwa uwaVar = uwa.a;
                aoot aootVar4 = ((uwe) obj).b;
                if (aootVar4.containsKey(str14)) {
                    uwaVar = (uwa) aootVar4.get(str14);
                }
                return uwaVar.c;
            case 17:
                String str15 = this.a;
                uvs uvsVar2 = uwo.a;
                uwa uwaVar2 = uwa.a;
                str15.getClass();
                aoot aootVar5 = ((uwe) obj).b;
                if (aootVar5.containsKey(str15)) {
                    uwaVar2 = (uwa) aootVar5.get(str15);
                }
                return uwaVar2.d;
            case 18:
                String str16 = this.a;
                uvs uvsVar3 = uwo.a;
                aone createBuilder = uwe.a.createBuilder();
                for (Map.Entry entry : Collections.unmodifiableMap(((uwe) obj).b).entrySet()) {
                    uwa uwaVar3 = (uwa) entry.getValue();
                    aone createBuilder2 = uwa.a.createBuilder();
                    if (!uwaVar3.d.equals(str16)) {
                        String str17 = uwaVar3.d;
                        createBuilder2.copyOnWrite();
                        uwa uwaVar4 = (uwa) createBuilder2.instance;
                        str17.getClass();
                        uwaVar4.b |= 1;
                        uwaVar4.d = str17;
                    }
                    for (String str18 : uwaVar3.c) {
                        if (!str18.equals(str16)) {
                            createBuilder2.D(str18);
                        }
                    }
                    createBuilder.E((String) entry.getKey(), (uwa) createBuilder2.build());
                }
                return (uwe) createBuilder.build();
            case 19:
                String str19 = this.a;
                uvs uvsVar4 = uwo.a;
                aone builder14 = ((uwe) obj).toBuilder();
                builder14.copyOnWrite();
                ((uwe) builder14.instance).a().remove(str19);
                return (uwe) builder14.build();
            default:
                String str20 = this.a;
                uwe uweVar = (uwe) obj;
                uvs uvsVar5 = uwo.a;
                uwa uwaVar5 = uwa.a;
                str20.getClass();
                aoot aootVar6 = uweVar.b;
                if (aootVar6.containsKey(str20)) {
                    uwaVar5 = (uwa) aootVar6.get(str20);
                }
                aone builder15 = uwaVar5.toBuilder();
                if (!Collections.unmodifiableList(((uwa) builder15.instance).c).contains("")) {
                    builder15.D("");
                }
                aone builder16 = uweVar.toBuilder();
                builder15.copyOnWrite();
                uwa uwaVar6 = (uwa) builder15.instance;
                uwaVar6.b |= 1;
                uwaVar6.d = "";
                builder16.E(str20, (uwa) builder15.build());
                return (uwe) builder16.build();
        }
    }
}
