package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqe implements cqg {
    final /* synthetic */ InputStream a;
    final /* synthetic */ ctk b;

    public cqe(InputStream inputStream, ctk ctkVar) {
        this.a = inputStream;
        this.b = ctkVar;
    }

    @Override // defpackage.cqg
    public final int a(cpz cpzVar) {
        try {
            return cpzVar.a(this.a, this.b);
        } finally {
            this.a.reset();
        }
    }
}
