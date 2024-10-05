package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faz extends actb {
    /* JADX INFO: Access modifiers changed from: protected */
    public faz(int i, boolean z) {
        super("browse", i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.actb
    public final boolean a(ynz ynzVar) {
        boolean a = super.a(ynzVar);
        if (!a || ynzVar.getClass() == fdq.class) {
            return a;
        }
        f("abandoned_browse");
        return true;
    }
}
