package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alm {
    final alp a;
    boolean b;
    public boolean c;
    public int[] d;
    public Set e;
    final aln f = new alt();

    /* JADX INFO: Access modifiers changed from: protected */
    public alm(alp alpVar) {
        this.a = alpVar;
    }

    public final void a() {
        this.b = true;
    }

    public final void b(gp gpVar) {
        Set set = this.e;
        if (set != null) {
            set.remove(gpVar);
        }
    }
}
