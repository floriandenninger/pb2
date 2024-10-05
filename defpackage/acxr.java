package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acxr extends actb {
    private String b;
    private String c;
    private String d;
    private String e;

    public acxr(int i, boolean z) {
        super("mdx_command", i, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.actb
    public final boolean a(ynz ynzVar) {
        boolean a = super.a(ynzVar);
        if ((ynzVar instanceof acxt) && this.d == null) {
            acxt acxtVar = (acxt) ynzVar;
            this.d = acxtVar.b();
            this.e = acxtVar.a();
        }
        return a;
    }

    @Override // defpackage.actb
    public final edb b() {
        g("method_start", this.b);
        g("start_channel_type", this.c);
        g("method_received", this.d);
        g("end_channel_type", this.e);
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.actb
    public final void c(ynz ynzVar, Set set, Set set2) {
        if (ynzVar instanceof acxu) {
            acxu acxuVar = (acxu) ynzVar;
            this.b = acxuVar.b();
            this.c = acxuVar.a();
        }
        super.c(ynzVar, set, set2);
    }
}
