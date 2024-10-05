package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fjv implements amml {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ fjv(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                long j = this.a;
                aone builder = ((fkg) obj).toBuilder();
                builder.copyOnWrite();
                fkg fkgVar = (fkg) builder.instance;
                fkgVar.b |= 512;
                fkgVar.m = j;
                return (fkg) builder.build();
            case 1:
                long j2 = this.a;
                aone builder2 = ((fke) obj).toBuilder();
                builder2.copyOnWrite();
                fke fkeVar = (fke) builder2.instance;
                fkeVar.b |= 8;
                fkeVar.f = j2;
                return (fke) builder2.build();
            case 2:
                long j3 = this.a;
                aone builder3 = ((fkg) obj).toBuilder();
                builder3.copyOnWrite();
                fkg fkgVar2 = (fkg) builder3.instance;
                fkgVar2.b |= 256;
                fkgVar2.l = j3;
                return (fkg) builder3.build();
            case 3:
                long j4 = this.a;
                fkg fkgVar3 = (fkg) obj;
                aone builder4 = fkgVar3.toBuilder();
                long j5 = fkgVar3.h;
                builder4.copyOnWrite();
                fkg fkgVar4 = (fkg) builder4.instance;
                fkgVar4.b = 32 | fkgVar4.b;
                fkgVar4.h = j5 + 1;
                builder4.copyOnWrite();
                fkg fkgVar5 = (fkg) builder4.instance;
                fkgVar5.b |= 64;
                fkgVar5.i = j4;
                return (fkg) builder4.build();
            case 4:
                long j6 = this.a;
                aone builder5 = ((lqw) obj).toBuilder();
                builder5.copyOnWrite();
                lqw lqwVar = (lqw) builder5.instance;
                lqwVar.b |= 2;
                lqwVar.d = j6;
                return (lqw) builder5.build();
            case 5:
                long j7 = this.a;
                aone builder6 = ((mgl) obj).toBuilder();
                builder6.copyOnWrite();
                mgl mglVar = (mgl) builder6.instance;
                mglVar.b |= 1;
                mglVar.c = j7;
                return (mgl) builder6.build();
            case 6:
                long j8 = this.a;
                oaz oazVar = (oaz) obj;
                aone createBuilder = oaz.a.createBuilder(oazVar);
                int i = oazVar.d;
                createBuilder.copyOnWrite();
                oaz oazVar2 = (oaz) createBuilder.instance;
                oazVar2.b |= 2;
                oazVar2.d = i + 1;
                createBuilder.copyOnWrite();
                oaz oazVar3 = (oaz) createBuilder.instance;
                oazVar3.b |= 1;
                oazVar3.c = j8;
                return (oaz) createBuilder.build();
            case 7:
                long j9 = this.a;
                aone builder7 = ((awum) obj).toBuilder();
                builder7.copyOnWrite();
                awum awumVar = (awum) builder7.instance;
                awumVar.b |= 1;
                awumVar.c = j9;
                return (awum) builder7.build();
            case 8:
                long j10 = this.a;
                aone builder8 = ((aosc) obj).toBuilder();
                builder8.copyOnWrite();
                aosc aoscVar = (aosc) builder8.instance;
                aoscVar.b = 32 | aoscVar.b;
                aoscVar.h = j10;
                return (aosc) builder8.build();
            case 9:
                long j11 = this.a;
                int i2 = acql.m;
                aone builder9 = ((awuv) obj).toBuilder();
                builder9.copyOnWrite();
                awuv awuvVar = (awuv) builder9.instance;
                awuvVar.b |= 1;
                awuvVar.c = j11;
                return (awuv) builder9.build();
            case 10:
                long j12 = this.a;
                afjh afjhVar = (afjh) obj;
                long j13 = afjhVar.b;
                long j14 = afjhVar.a;
                StringBuilder sb = new StringBuilder(32);
                sb.append((int) j13);
                sb.append("t");
                sb.append(j14 - j12);
                return sb.toString();
            case 11:
                long j15 = this.a;
                aone builder10 = ((awvr) obj).toBuilder();
                builder10.bi("last_playback_start_timestamp", j15);
                return (awvr) builder10.build();
            case 12:
                long j16 = this.a;
                aone builder11 = ((awwf) obj).toBuilder();
                builder11.copyOnWrite();
                awwf awwfVar = (awwf) builder11.instance;
                awwfVar.b |= 8;
                awwfVar.f = j16;
                return (awwf) builder11.build();
            case 13:
                long j17 = this.a;
                aone builder12 = ((awwf) obj).toBuilder();
                builder12.copyOnWrite();
                awwf awwfVar2 = (awwf) builder12.instance;
                awwfVar2.b = 32 | awwfVar2.b;
                awwfVar2.h = j17;
                return (awwf) builder12.build();
            default:
                long j18 = this.a;
                aone builder13 = ((awwj) obj).toBuilder();
                builder13.copyOnWrite();
                awwj awwjVar = (awwj) builder13.instance;
                awwjVar.b |= 2;
                awwjVar.e = j18;
                return (awwj) builder13.build();
        }
    }
}
