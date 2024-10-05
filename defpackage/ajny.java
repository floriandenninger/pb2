package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajny {
    public final ammv a;
    public final ammv b;
    public final ammv c;

    public ajny() {
        this.a = amlr.a;
        this.b = amlr.a;
        this.c = amlr.a;
    }

    public ajny(aqrh aqrhVar) {
        ammv ammvVar;
        this.a = (!aqrhVar.c || (aqrhVar.b & 8) == 0) ? amlr.a : ammv.j(Integer.valueOf((int) aqrhVar.f));
        if ((aqrhVar.b & 4) != 0) {
            ammvVar = ammv.j(Float.valueOf(aqrhVar.e));
        } else {
            ammvVar = amlr.a;
        }
        this.b = ammvVar;
        this.c = (aqrhVar.b & 2) != 0 ? ammv.j(Float.valueOf(aqrhVar.d)) : amlr.a;
    }
}
