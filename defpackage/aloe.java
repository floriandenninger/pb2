package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aloe extends alpc {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aloe(Context context) {
        super(new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
        new ammr("AppUpdateListenerRegistry", (char[]) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alpc
    public final void a(Context context, Intent intent) {
        if (context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            Iterator<String> it = intent.getExtras().keySet().iterator();
            while (it.hasNext()) {
                intent.getExtras().get(it.next());
            }
            intent.getIntExtra("install.status", 0);
            intent.getIntExtra("error.code", 0);
            d(new alox(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name")));
            return;
        }
        intent.getStringExtra("package.name");
    }
}
