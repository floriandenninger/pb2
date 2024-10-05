package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acxl extends ji {
    final /* synthetic */ acxm a;

    public acxl(acxm acxmVar) {
        this.a = acxmVar;
    }

    @Override // defpackage.ji
    public final void k(bpv bpvVar) {
        final List a = ((adch) this.a.c.get()).a();
        this.a.d.execute(new Runnable() { // from class: acxk
            @Override // java.lang.Runnable
            public final void run() {
                acxl acxlVar = acxl.this;
                List list = a;
                acxm acxmVar = acxlVar.a;
                acxmVar.f = acxmVar.a(list);
            }
        });
    }
}
