package defpackage;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fam implements Runnable {
    final /* synthetic */ fan a;

    public fam(fan fanVar) {
        this.a = fanVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (this.a) {
                fan fanVar = this.a;
                owf owfVar = fanVar.c;
                fao faoVar = fanVar.b;
                byte[] byteArray = owfVar.toByteArray();
                anaf.t(faoVar.a);
                anaf.u(byteArray, faoVar.a);
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(this.a.b.a.getAbsolutePath());
            zga.n(valueOf.length() != 0 ? "Failed to write offline response to ".concat(valueOf) : new String("Failed to write offline response to "), e);
        }
    }
}
