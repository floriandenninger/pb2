package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bamz {
    public final banj a;
    public final bani b;
    public final bajy c;

    public bamz(banj banjVar, bani baniVar) {
        this.a = banjVar;
        this.b = baniVar;
        this.c = null;
    }

    public bamz(banj banjVar, bani baniVar, bajy bajyVar) {
        this.a = banjVar;
        this.b = baniVar;
        this.c = bajyVar;
    }

    public final String a(bakb bakbVar) {
        banj banjVar = this.a;
        if (banjVar != null) {
            StringBuffer stringBuffer = new StringBuffer(banjVar.a(bakbVar));
            banjVar.c(stringBuffer, bakbVar);
            return stringBuffer.toString();
        }
        throw new UnsupportedOperationException("Printing not supported");
    }
}
