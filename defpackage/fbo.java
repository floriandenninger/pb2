package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbo extends actb {
    /* JADX INFO: Access modifiers changed from: protected */
    public fbo(int i, boolean z) {
        super("inline_playback", i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.actb
    public final boolean a(ynz ynzVar) {
        boolean a = super.a(ynzVar);
        if (!a || ynzVar.getClass() == ahde.class) {
            return a;
        }
        f("abandoned_inline_playback");
        return true;
    }
}
