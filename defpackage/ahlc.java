package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahlc implements ahld {
    private final /* synthetic */ int c;

    public ahlc(int i) {
        this.c = i;
    }

    @Override // defpackage.ahld
    public final double b() {
        int i = this.c;
        if (i != 0) {
            return i != 1 ? 10000.0d : 1.0d;
        }
        return 1000.0d;
    }

    @Override // defpackage.ahld
    public final boolean d() {
        return this.c != 1;
    }

    @Override // defpackage.ahld
    public final double a(double d) {
        int i = this.c;
        if (i == 0) {
            double doubleValue = ((Double) b.clamp(Double.valueOf(d))).doubleValue();
            return doubleValue <= 0.08333333333333333d ? Math.sqrt(doubleValue * 3.0d) : (Math.log((doubleValue * 12.0d) - 0.28466892d) * 0.17883277d) + 0.55991073d;
        }
        if (i == 1) {
            return Math.pow(((Double) a.clamp(Double.valueOf(d))).doubleValue(), 0.45454545454545453d);
        }
        double doubleValue2 = ((Double) b.clamp(Double.valueOf(d))).doubleValue();
        return Math.pow(((Math.pow(doubleValue2, 0.1593017578125d) * 18.8515625d) + 0.8359375d) / ((Math.pow(doubleValue2, 0.1593017578125d) * 18.6875d) + 1.0d), 78.84375d);
    }

    @Override // defpackage.ahld
    public final double c(double d) {
        double exp;
        double d2;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return Math.pow(((Double) a.clamp(Double.valueOf(d))).doubleValue(), 2.2d);
            }
            double pow = Math.pow(((Double) a.clamp(Double.valueOf(d))).doubleValue(), 0.012683313515655966d);
            return Math.pow(Math.max(0.0d, ((-0.8359375d) + pow) / (18.8515625d - (pow * 18.6875d))), 6.277394636015326d);
        }
        double doubleValue = ((Double) b.clamp(Double.valueOf(d))).doubleValue();
        if (doubleValue <= 0.5d) {
            exp = doubleValue * doubleValue;
            d2 = 3.0d;
        } else {
            exp = Math.exp((doubleValue - 0.55991073d) / 0.17883277d) + 0.28466892d;
            d2 = 12.0d;
        }
        return exp / d2;
    }
}
