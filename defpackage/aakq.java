package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aakq {
    public final aals a;
    private final aahv b;
    private final aais c;
    private final aakn d;

    public aakq(aahv aahvVar, aais aaisVar, aakn aaknVar, aals aalsVar) {
        this.b = aahvVar;
        this.c = aaisVar;
        this.d = aaknVar;
        this.a = aalsVar;
    }

    private static aalc b(aakv aakvVar, aoqa aoqaVar) {
        if (aakvVar instanceof aalk) {
            return ((aalk) aakvVar).d(aoqaVar);
        }
        String valueOf = String.valueOf(aakvVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
        sb.append("EntityStore does not implement FrameworkRestrictedStoreAccess: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.afsx r12, defpackage.aqty r13) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aakq.a(afsx, aqty):void");
    }
}
