package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fjw implements amml {
    private final /* synthetic */ int s;
    public static final /* synthetic */ fjw r = new fjw(20);
    public static final /* synthetic */ fjw q = new fjw(19);
    public static final /* synthetic */ fjw p = new fjw(18);
    public static final /* synthetic */ fjw o = new fjw(16);
    public static final /* synthetic */ fjw n = new fjw(15);
    public static final /* synthetic */ fjw m = new fjw(14);
    public static final /* synthetic */ fjw l = new fjw(13);
    public static final /* synthetic */ fjw k = new fjw(12);
    public static final /* synthetic */ fjw j = new fjw(11);
    public static final /* synthetic */ fjw i = new fjw(10);
    public static final /* synthetic */ fjw h = new fjw(9);
    public static final /* synthetic */ fjw g = new fjw(8);
    public static final /* synthetic */ fjw f = new fjw(7);
    public static final /* synthetic */ fjw e = new fjw(6);
    public static final /* synthetic */ fjw d = new fjw(5);
    public static final /* synthetic */ fjw c = new fjw(4);
    public static final /* synthetic */ fjw b = new fjw(3);
    public static final /* synthetic */ fjw a = new fjw(2);

    public /* synthetic */ fjw(int i2) {
        this.s = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.s) {
            case 0:
                aone builder = ((fkg) obj).toBuilder();
                builder.copyOnWrite();
                fkg fkgVar = (fkg) builder.instance;
                fkgVar.b |= 16;
                fkgVar.g = true;
                return (fkg) builder.build();
            case 1:
                aone builder2 = ((fkg) obj).toBuilder();
                builder2.copyOnWrite();
                fkg fkgVar2 = (fkg) builder2.instance;
                fkgVar2.b |= 8;
                fkgVar2.f = true;
                return (fkg) builder2.build();
            case 2:
                return Boolean.valueOf(((fke) obj).c);
            case 3:
                return Boolean.valueOf(((fke) obj).e);
            case 4:
                return Boolean.valueOf(1 == (((fke) obj).b & 1));
            case 5:
                return Boolean.valueOf(((fkg) obj).g);
            case 6:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                amsx amsxVar = fkr.a;
                aone createBuilder = fke.a.createBuilder();
                sharedPreferences.getClass();
                fkq fkqVar = new fkq(sharedPreferences, 1);
                sharedPreferences.getClass();
                fkq fkqVar2 = new fkq(sharedPreferences, 0);
                sharedPreferences.getClass();
                fkr.g(createBuilder, fkqVar, fkqVar2, new fkn(sharedPreferences));
                int[] K = fav.K();
                for (int i2 = 0; i2 < 2; i2++) {
                    int i3 = K[i2];
                    String e2 = fkr.e(i3);
                    if (sharedPreferences.contains(e2)) {
                        int i4 = i3 - 1;
                        if (i3 == 0) {
                            throw null;
                        }
                        createBuilder.g(i4, sharedPreferences.getLong(e2, 0L));
                    }
                }
                return (fke) createBuilder.build();
            case 7:
                aone aoneVar = (aone) obj;
                amsx amsxVar2 = fkr.a;
                aoneVar.copyOnWrite();
                fke fkeVar = (fke) aoneVar.instance;
                fke fkeVar2 = fke.a;
                fkeVar.b |= 16;
                fkeVar.h = 1;
                return aoneVar;
            case 8:
                amsx amsxVar3 = fkr.a;
                return Boolean.valueOf(((fke) obj).h > 0);
            case 9:
                aone aoneVar2 = (aone) obj;
                amsx amsxVar4 = fkr.a;
                aoneVar2.copyOnWrite();
                fkg fkgVar3 = (fkg) aoneVar2.instance;
                fkg fkgVar4 = fkg.a;
                fkgVar3.b |= 1024;
                fkgVar3.n = 1;
                return aoneVar2;
            case 10:
                amsx amsxVar5 = fkr.a;
                return Boolean.valueOf(((fkg) obj).n > 0);
            case 11:
                aone aoneVar3 = (aone) obj;
                aoneVar3.copyOnWrite();
                fof fofVar = (fof) aoneVar3.instance;
                fof fofVar2 = fof.a;
                fofVar.b |= 8;
                fofVar.g = true;
                return aoneVar3;
            case 12:
                return Boolean.valueOf(((fof) obj).g);
            case 13:
                return ((aioc) obj).V();
            case 14:
                return ((ajbl) obj).C();
            case 15:
                fuk fukVar = (fuk) obj;
                fum fumVar = new fum();
                fumVar.a = fukVar.c;
                fumVar.b = fukVar.d;
                fumVar.c = Integer.valueOf(fukVar.e);
                fumVar.d = Long.valueOf(fukVar.f);
                fumVar.e = Long.valueOf(fukVar.g);
                fumVar.f = Boolean.valueOf(fukVar.h);
                Integer num = fumVar.c;
                if (num == null || fumVar.d == null || fumVar.e == null || fumVar.f == null) {
                    StringBuilder sb = new StringBuilder();
                    if (fumVar.c == null) {
                        sb.append(" playlistIndex");
                    }
                    if (fumVar.d == null) {
                        sb.append(" videoStartTime");
                    }
                    if (fumVar.e == null) {
                        sb.append(" lastCrashTimestamp");
                    }
                    if (fumVar.f == null) {
                        sb.append(" lastTimeShown");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                return new fun(fumVar.a, fumVar.b, num.intValue(), fumVar.d.longValue(), fumVar.e.longValue(), fumVar.f.booleanValue());
            case 16:
                lqt lqtVar = ((lqu) obj).c;
                if (lqtVar == null) {
                    lqtVar = lqt.a;
                }
                return Boolean.valueOf(lqtVar.c);
            case 17:
                lqw lqwVar = (lqw) obj;
                aone builder3 = lqwVar.toBuilder();
                lqx lqxVar = lqwVar.c;
                if (lqxVar == null) {
                    lqxVar = lqx.a;
                }
                aone builder4 = lqxVar.toBuilder();
                builder4.copyOnWrite();
                lqx lqxVar2 = (lqx) builder4.instance;
                lqxVar2.b = 2 | lqxVar2.b;
                lqxVar2.d = true;
                builder3.copyOnWrite();
                lqw lqwVar2 = (lqw) builder3.instance;
                lqx lqxVar3 = (lqx) builder4.build();
                lqxVar3.getClass();
                lqwVar2.c = lqxVar3;
                lqwVar2.b |= 1;
                return (lqw) builder3.build();
            case 18:
                return Long.valueOf(((lqw) obj).d);
            case 19:
                lqx lqxVar4 = ((lqw) obj).c;
                if (lqxVar4 == null) {
                    lqxVar4 = lqx.a;
                }
                return Boolean.valueOf(lqxVar4.d);
            default:
                lqx lqxVar5 = ((lqw) obj).c;
                if (lqxVar5 == null) {
                    lqxVar5 = lqx.a;
                }
                return lqxVar5.c;
        }
    }
}
