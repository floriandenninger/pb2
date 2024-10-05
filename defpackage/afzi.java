package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzi implements afzj {
    private final Context a;
    private boolean b = false;

    public afzi(Context context) {
        this.a = context;
    }

    @Override // defpackage.afzj
    public final void a(antg antgVar) {
        if (this.b) {
            return;
        }
        zga.g("Initializing Blocking FirebaseApp client...");
        antc.c(this.a, antgVar);
        this.b = true;
        zga.g("FirebaseApp initialization complete");
    }

    @Override // defpackage.afzj
    public final boolean b() {
        return this.b;
    }
}
