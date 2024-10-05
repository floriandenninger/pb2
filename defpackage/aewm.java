package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aewm extends afhv implements afjr {
    public final String d;

    public aewm(ath athVar, long j) {
        super(athVar, "x-segment-lmt");
        StringBuilder sb = new StringBuilder(23);
        sb.append("sq.");
        sb.append(j);
        this.d = sb.toString();
    }

    @Override // defpackage.afjr
    public final String a(boolean z) {
        return "manifestless.lmt";
    }

    @Override // defpackage.afjr
    public final String b() {
        return this.d;
    }
}
