package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akqk implements uuq {
    public final ypa a;
    public final aktq b;
    public final azrh c = azrh.e();

    public akqk(ypa ypaVar, aktq aktqVar) {
        this.a = ypaVar;
        this.b = aktqVar;
    }

    @Override // defpackage.uuq
    public final /* synthetic */ uup a() {
        return uup.a;
    }

    @Override // defpackage.uuq
    public final void b(bact bactVar) {
        avdh avdhVar;
        String str = bactVar.e;
        String str2 = null;
        avdh avdhVar2 = null;
        if (str != null) {
            String str3 = null;
            for (String str4 : str.split(",")) {
                if (str4.length() > 0) {
                    String[] split = str4.split(":");
                    if (split.length == 2) {
                        if ("pcen".equals(split[0])) {
                            str3 = split[1];
                        } else if ("tag".equals(split[0])) {
                            avdhVar2 = avdh.b(Integer.parseInt(split[1]));
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 57);
                        sb.append("Expected a colon-separated key-value pair when parsing '");
                        sb.append(str4);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            avdhVar = avdhVar2;
            str2 = str3;
        } else {
            avdhVar = null;
        }
        aktn aktnVar = new aktn(str2, avdhVar);
        String str5 = aktnVar.a;
        aone builder = bactVar.toBuilder();
        if (str5 == null) {
            builder.copyOnWrite();
            bact bactVar2 = (bact) builder.instance;
            bactVar2.b &= -5;
            bactVar2.e = bact.a.e;
        } else {
            builder.copyOnWrite();
            bact bactVar3 = (bact) builder.instance;
            bactVar3.b |= 4;
            bactVar3.e = str5;
        }
        new uuu(this, aktnVar).b((bact) builder.build());
    }
}
