package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class uuj {
    private final bacs a;

    public uuj(bacs bacsVar) {
        this.a = bacsVar;
    }

    public abstract long a(String str);

    public abstract bacs b(Long l);

    public abstract boolean c();

    public final bacs d() {
        aone builder = e(null).toBuilder();
        builder.copyOnWrite();
        bacs bacsVar = (bacs) builder.instance;
        bacsVar.b |= 2;
        bacsVar.c = -1L;
        return (bacs) builder.build();
    }

    public final bacs e(Long l) {
        int d = badf.d(this.a.d);
        if (d == 0 || d != 5) {
            return this.a;
        }
        if (l == null || l.longValue() == this.a.c) {
            return this.a;
        }
        aone createBuilder = bacs.a.createBuilder();
        int d2 = badf.d(this.a.d);
        if (d2 == 0) {
            d2 = 1;
        }
        createBuilder.copyOnWrite();
        bacs bacsVar = (bacs) createBuilder.instance;
        bacsVar.d = d2 - 1;
        bacsVar.b |= 4;
        long longValue = l.longValue();
        createBuilder.copyOnWrite();
        bacs bacsVar2 = (bacs) createBuilder.instance;
        bacsVar2.b |= 2;
        bacsVar2.c = longValue;
        return (bacs) createBuilder.build();
    }
}
