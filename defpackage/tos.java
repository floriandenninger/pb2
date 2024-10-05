package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tos implements anhh {
    final /* synthetic */ tkv a;
    final /* synthetic */ tov b;

    public tos(tov tovVar, tkv tkvVar) {
        this.b = tovVar;
        this.a = tkvVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        int i = tsx.a;
        try {
            tov tovVar = this.b;
            rwh.aQ(tovVar.a, tovVar.i, this.a, tovVar.g);
        } catch (IOException unused) {
        }
    }
}
