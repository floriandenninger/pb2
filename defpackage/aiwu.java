package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiwu implements aiwt {
    private aiwt a;

    public final synchronized void a(aiwt aiwtVar) {
        this.a = aiwtVar;
    }

    @Override // defpackage.aiwt
    public final synchronized void aK(afih afihVar) {
        aiwt aiwtVar = this.a;
        if (aiwtVar != null) {
            aiwtVar.aK(afihVar);
        }
    }
}
