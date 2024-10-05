package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ypo extends ypp {
    private final ypn b;

    public ypo(PackageManager packageManager, ypn ypnVar) {
        super(packageManager);
        this.b = ypnVar;
    }

    @Override // defpackage.ypp, android.content.pm.PackageManager
    public final ProviderInfo resolveContentProvider(String str, int i) {
        ProviderInfo resolveContentProvider = this.a.resolveContentProvider(str, i);
        ypn ypnVar = this.b;
        if (ypnVar.a(resolveContentProvider, i)) {
            if (resolveContentProvider.metaData == null) {
                zga.m("PatchedPackageManager", "patching ProviderInfo. Metadata was null");
                resolveContentProvider.metaData = new Bundle(ypnVar.b);
            } else {
                zga.m("PatchedPackageManager", "patching ProviderInfo. Metadata was not null");
                resolveContentProvider.metaData.putAll(ypnVar.b);
            }
        }
        if (this.b.a(resolveContentProvider, i)) {
            String valueOf = String.valueOf(resolveContentProvider);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("resolveContentProvider flags: ");
            sb.append(i);
            sb.append(" ret: ");
            sb.append(valueOf);
            zga.m("PatchedPackageManager", sb.toString());
        }
        return resolveContentProvider;
    }
}
