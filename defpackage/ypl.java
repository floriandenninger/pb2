package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ypl extends ContextWrapper {
    private final ypo a;

    public ypl(Context context, ypo ypoVar) {
        super(context);
        this.a = ypoVar;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        return this.a;
    }
}
