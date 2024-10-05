package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akvp implements anhh {
    final /* synthetic */ akvq a;
    private final /* synthetic */ int b;

    public akvp(akvq akvqVar, int i) {
        this.b = i;
        this.a = akvqVar;
    }

    @Override // defpackage.anhh
    public final /* synthetic */ void b(Object obj) {
        int i = this.b;
        if (i == 0) {
        } else if (i != 1) {
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        int i = this.b;
        if (i == 0) {
            this.a.p.e("Failed to cancel upload job.", th);
            zga.f("UploadEngine", "Failed to cancel upload job.", th);
        } else if (i == 1) {
            this.a.p.e("Failed to update feedback only job.", th);
            zga.f("UploadEngine", "Failed to update feedback only job.", th);
        } else {
            if (th instanceof CancellationException) {
                return;
            }
            this.a.p.e("Failed to get pending uploads.", th);
            zga.f("UploadEngine", "Failed to get pending uploads.", th);
        }
    }
}
