package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ypm extends ev {
    private final int a = R.xml.file_provider_exported_paths;

    @Override // defpackage.ev, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        PackageManager packageManager = context.getPackageManager();
        XmlResourceParser loadXmlMetaData = packageManager.resolveContentProvider(providerInfo.authority, 128).loadXmlMetaData(packageManager, "android.support.FILE_PROVIDER_PATHS");
        boolean z = loadXmlMetaData == null || Build.VERSION.SDK_INT <= 23;
        if (z) {
            boolean z2 = loadXmlMetaData == null;
            StringBuilder sb = new StringBuilder(55);
            sb.append("isPatchingNecessary returned true and in == null: ");
            sb.append(z2);
            zga.m("FileProviderCompat", sb.toString());
        }
        if (z) {
            Bundle bundle = new Bundle(1);
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", this.a);
            context = new ypl(context, new ypo(context.getPackageManager(), new ypn(providerInfo.authority, bundle)));
        }
        try {
            super.attachInfo(context, providerInfo);
        } catch (IllegalArgumentException e) {
            StringBuilder sb2 = new StringBuilder(49);
            sb2.append("patch needed: ");
            sb2.append(z);
            sb2.append(" but we still got an exception");
            zga.f("FileProviderCompat", sb2.toString(), e);
            throw e;
        }
    }
}
