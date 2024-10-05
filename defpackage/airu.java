package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class airu implements afgj {
    public final /* synthetic */ airx a;
    private final /* synthetic */ int b;

    public /* synthetic */ airu(airx airxVar, int i) {
        this.b = i;
        this.a = airxVar;
    }

    @Override // defpackage.afgj
    public final String a(long j) {
        if (this.b != 0) {
            long d = this.a.a.d();
            StringBuilder sb = new StringBuilder(27);
            double d2 = d - j;
            Double.isNaN(d2);
            sb.append(d2 / 1000.0d);
            sb.append(";pi");
            return sb.toString();
        }
        long d3 = this.a.a.d();
        StringBuilder sb2 = new StringBuilder(27);
        double d4 = d3 - j;
        Double.isNaN(d4);
        sb2.append(d4 / 1000.0d);
        sb2.append(";su");
        return sb2.toString();
    }
}
