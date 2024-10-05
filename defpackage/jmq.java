package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jmq {
    public final jmu a;
    public final jmu b;
    public final jmu c;

    public jmq(jmu jmuVar, jmu jmuVar2, jmu jmuVar3) {
        this.a = jmuVar;
        this.b = jmuVar2;
        this.c = jmuVar3;
    }

    public final anhy a(jmt jmtVar) {
        if (jmtVar.a() == agnv.class) {
            return this.a.a(jmtVar);
        }
        if (jmtVar.a() == awil.class) {
            return this.b.a(jmtVar);
        }
        if (jmtVar.a() == asxs.class) {
            return this.c.a(jmtVar);
        }
        String valueOf = String.valueOf(jmtVar.a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
        sb.append("CompositeDownloadStateChecker.getVideoDisplayStateAsync does not have support for ");
        sb.append(valueOf);
        throw new UnsupportedOperationException(sb.toString());
    }
}
