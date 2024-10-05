package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afjl {
    public static final aqvp a;
    private final amnv b;
    private final Random c = new Random();

    static {
        aone createBuilder = aqvp.a.createBuilder();
        createBuilder.copyOnWrite();
        aqvp aqvpVar = (aqvp) createBuilder.instance;
        aqvpVar.b |= 1;
        aqvpVar.c = 1000;
        createBuilder.copyOnWrite();
        aqvp aqvpVar2 = (aqvp) createBuilder.instance;
        aqvpVar2.b |= 4;
        aqvpVar2.e = 5000;
        createBuilder.copyOnWrite();
        aqvp aqvpVar3 = (aqvp) createBuilder.instance;
        aqvpVar3.b |= 2;
        aqvpVar3.d = 2.0f;
        createBuilder.copyOnWrite();
        aqvp aqvpVar4 = (aqvp) createBuilder.instance;
        aqvpVar4.b |= 8;
        aqvpVar4.f = 0.0f;
        a = (aqvp) createBuilder.build();
    }

    public afjl(amnv amnvVar) {
        this.b = new afjk(amkq.x(new afjk(amnvVar, 0)), 2);
    }

    public final int a(int i) {
        aqvp aqvpVar = (aqvp) this.b.get();
        double d = aqvpVar.e;
        double d2 = aqvpVar.c;
        double pow = Math.pow(aqvpVar.d, Math.max(0, i - 1));
        Double.isNaN(d2);
        double min = Math.min(d, d2 * pow);
        float nextFloat = aqvpVar.f * (this.c.nextFloat() - 0.5f);
        double d3 = nextFloat + nextFloat;
        Double.isNaN(d3);
        long round = Math.round(d3 * min);
        int i2 = aqvpVar.e;
        double d4 = round;
        Double.isNaN(d4);
        return Math.min(i2, (int) (min + d4));
    }
}
