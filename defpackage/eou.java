package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class eou implements amml {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ eou(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                boolean z = this.a;
                aone builder = ((eok) obj).toBuilder();
                builder.copyOnWrite();
                eok eokVar = (eok) builder.instance;
                eokVar.b |= 1;
                eokVar.c = true;
                builder.copyOnWrite();
                eok eokVar2 = (eok) builder.instance;
                eokVar2.b |= 128;
                eokVar2.j = true;
                builder.copyOnWrite();
                eok eokVar3 = (eok) builder.instance;
                eokVar3.b |= 8;
                eokVar3.f = z;
                return (eok) builder.build();
            case 1:
                boolean z2 = this.a;
                eok eokVar4 = (eok) obj;
                aone builder2 = eokVar4.toBuilder();
                builder2.copyOnWrite();
                eok eokVar5 = (eok) builder2.instance;
                eokVar5.b |= 1;
                eokVar5.c = z2;
                r1 = eokVar4.l || z2;
                builder2.copyOnWrite();
                eok eokVar6 = (eok) builder2.instance;
                eokVar6.b |= 512;
                eokVar6.l = r1;
                return (eok) builder2.build();
            case 2:
                boolean z3 = this.a;
                aone builder3 = ((fke) obj).toBuilder();
                builder3.copyOnWrite();
                fke fkeVar = (fke) builder3.instance;
                fkeVar.b = 1 | fkeVar.b;
                fkeVar.c = z3;
                return (fke) builder3.build();
            case 3:
                boolean z4 = this.a;
                aone builder4 = ((fke) obj).toBuilder();
                builder4.copyOnWrite();
                fke fkeVar2 = (fke) builder4.instance;
                fkeVar2.b |= 4;
                fkeVar2.e = z4;
                return (fke) builder4.build();
            case 4:
                boolean z5 = this.a;
                aone builder5 = ((fkg) obj).toBuilder();
                builder5.copyOnWrite();
                fkg fkgVar = (fkg) builder5.instance;
                fkgVar.b |= 2;
                fkgVar.d = z5;
                return (fkg) builder5.build();
            case 5:
                boolean z6 = this.a;
                aone builder6 = ((fuk) obj).toBuilder();
                builder6.copyOnWrite();
                fuk fukVar = (fuk) builder6.instance;
                fukVar.b &= -2;
                fukVar.c = fuk.a.c;
                builder6.copyOnWrite();
                fuk fukVar2 = (fuk) builder6.instance;
                fukVar2.b &= -3;
                fukVar2.d = fuk.a.d;
                builder6.copyOnWrite();
                fuk fukVar3 = (fuk) builder6.instance;
                fukVar3.b &= -5;
                fukVar3.e = 0;
                builder6.copyOnWrite();
                fuk fukVar4 = (fuk) builder6.instance;
                fukVar4.b &= -9;
                fukVar4.f = 0L;
                builder6.copyOnWrite();
                fuk fukVar5 = (fuk) builder6.instance;
                fukVar5.b &= -17;
                fukVar5.g = -1L;
                if (!z6) {
                    builder6.copyOnWrite();
                    fuk fukVar6 = (fuk) builder6.instance;
                    fukVar6.b &= -33;
                    fukVar6.h = false;
                } else {
                    builder6.copyOnWrite();
                    fuk fukVar7 = (fuk) builder6.instance;
                    fukVar7.b |= 32;
                    fukVar7.h = true;
                }
                return (fuk) builder6.build();
            case 6:
                boolean z7 = this.a;
                lqu lquVar = (lqu) obj;
                aone builder7 = lquVar.toBuilder();
                lqt lqtVar = lquVar.c;
                if (lqtVar == null) {
                    lqtVar = lqt.a;
                }
                aone builder8 = lqtVar.toBuilder();
                builder8.copyOnWrite();
                lqt lqtVar2 = (lqt) builder8.instance;
                lqtVar2.b |= 1;
                lqtVar2.c = z7;
                builder7.copyOnWrite();
                lqu lquVar2 = (lqu) builder7.instance;
                lqt lqtVar3 = (lqt) builder8.build();
                lqtVar3.getClass();
                lquVar2.c = lqtVar3;
                lquVar2.b |= 1;
                return (lqu) builder7.build();
            case 7:
                boolean z8 = this.a;
                jps jpsVar = (jps) obj;
                if (jpsVar != jps.PLAYABLE && jpsVar != jps.TRANSFER_PAUSED && jpsVar != jps.TRANSFER_IN_PROGRESS && jpsVar != jps.TRANSFER_WAITING_IN_QUEUE && !z8) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 8:
                return new jxh(this.a, ((Boolean) obj).booleanValue());
            case 9:
                boolean z9 = this.a;
                aone builder9 = ((awwk) obj).toBuilder();
                builder9.copyOnWrite();
                awwk awwkVar = (awwk) builder9.instance;
                awwkVar.b |= 4;
                awwkVar.e = z9;
                return (awwk) builder9.build();
            case 10:
                boolean z10 = this.a;
                aone builder10 = ((lox) obj).toBuilder();
                builder10.copyOnWrite();
                lox loxVar = (lox) builder10.instance;
                loxVar.b |= 16;
                loxVar.g = z10;
                return (lox) builder10.build();
            case 11:
                return Boolean.valueOf(this.a);
            case 12:
                boolean z11 = this.a;
                aone builder11 = ((lox) obj).toBuilder();
                builder11.copyOnWrite();
                lox loxVar2 = (lox) builder11.instance;
                loxVar2.b |= 32;
                loxVar2.h = z11;
                return (lox) builder11.build();
            case 13:
                return Boolean.valueOf(this.a);
            case 14:
                boolean z12 = this.a;
                aone builder12 = ((lox) obj).toBuilder();
                builder12.copyOnWrite();
                lox loxVar3 = (lox) builder12.instance;
                loxVar3.b |= 64;
                loxVar3.i = z12;
                return (lox) builder12.build();
            case 15:
                return Boolean.valueOf(this.a);
            case 16:
                boolean z13 = this.a;
                aone builder13 = ((lox) obj).toBuilder();
                builder13.copyOnWrite();
                lox loxVar4 = (lox) builder13.instance;
                loxVar4.b |= 128;
                loxVar4.j = z13;
                return (lox) builder13.build();
            case 17:
                return Boolean.valueOf(this.a);
            case 18:
                boolean z14 = this.a;
                aone builder14 = ((lox) obj).toBuilder();
                builder14.copyOnWrite();
                lox loxVar5 = (lox) builder14.instance;
                loxVar5.b |= 256;
                loxVar5.k = z14;
                return (lox) builder14.build();
            case 19:
                return Boolean.valueOf(this.a);
            default:
                boolean z15 = this.a;
                aone builder15 = ((awvr) obj).toBuilder();
                builder15.copyOnWrite();
                awvr awvrVar = (awvr) builder15.instance;
                awvrVar.b |= 1024;
                awvrVar.s = z15;
                return (awvr) builder15.build();
        }
    }
}
