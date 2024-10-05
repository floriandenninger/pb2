package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dvv extends ContextWrapper {
    public final dvw a;
    public final dvx b;

    public dvv(Context context) {
        super(context);
        this.a = new dvw(context);
        this.b = new dvx(context.getResources());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.b;
    }
}
