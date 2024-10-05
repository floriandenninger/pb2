package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aewl extends atn implements afjr {
    public final String d;

    public aewl(int i, long j, ath athVar) {
        super(athVar, 2);
        StringBuilder sb = new StringBuilder(40);
        sb.append("http.");
        sb.append(i);
        sb.append(";sq.");
        sb.append(j);
        this.d = sb.toString();
    }

    @Override // defpackage.afjr
    public final String a(boolean z) {
        return "net.nocontent";
    }

    @Override // defpackage.afjr
    public final String b() {
        return this.d;
    }
}
