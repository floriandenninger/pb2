package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qkx implements qlb {
    final /* synthetic */ qla a;

    public qkx(qla qlaVar) {
        this.a = qlaVar;
    }

    @Override // defpackage.qlb
    public final void a(long j, int i, Object obj) {
        if (i != 0) {
            this.a.D.a(new IOException("storing session is timeout"));
        }
    }

    @Override // defpackage.qlb
    public final void b(long j) {
        this.a.D.b(null);
    }
}
