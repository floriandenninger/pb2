package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aewq extends afhv implements afjr {
    public final String d;

    public aewq(ath athVar, String str, String str2) {
        super(athVar, str);
        this.d = str2;
    }

    @Override // defpackage.afjr
    public final String a(boolean z) {
        return true != z ? "staleconfig" : "manifest.unparseable";
    }

    @Override // defpackage.afjr
    public final String b() {
        return this.d;
    }
}
