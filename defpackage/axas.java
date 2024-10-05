package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axas {
    public final awzw a;

    public axas(awzw awzwVar) {
        this.a = awzwVar;
    }

    public final axam a(String str, awzx awzxVar, awzu awzuVar, String str2, axar axarVar) {
        boolean z = true;
        if (!amkq.e("POST", "put") && !amkq.e("POST", "post")) {
            z = false;
        }
        amkq.E(z);
        if (awzuVar.a() == -1 || awzuVar.a() >= 0) {
            return new axak(str, "POST", awzxVar, awzuVar, str2, this.a, axarVar, false);
        }
        return new axag(str, awzxVar, awzuVar, str2, this.a, axarVar);
    }
}
