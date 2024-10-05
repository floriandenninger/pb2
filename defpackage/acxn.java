package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acxn extends actb {
    private String b;

    public acxn(int i, boolean z) {
        super("mdx_cast", i, z);
        this.b = "unknown";
    }

    @Override // defpackage.actb
    public final edb b() {
        g("method_start", this.b);
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.actb
    public final void c(ynz ynzVar, Set set, Set set2) {
        if (ynzVar instanceof acxp) {
            this.b = "play";
        } else if (ynzVar instanceof acxo) {
            this.b = "pause";
        } else if (ynzVar instanceof acxq) {
            this.b = "seekTo";
        }
        super.c(ynzVar, set, set2);
    }
}
