package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axgu implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ axha b;

    public axgu(axha axhaVar, String str) {
        this.b = axhaVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        axgs axgsVar = this.b.h;
        if (axgsVar != null) {
            axgsVar.c(this.a);
        }
    }
}
