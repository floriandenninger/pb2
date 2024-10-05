package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uhd extends ng {
    public uhd(Context context, int i) {
        super(context, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ng, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            window.setLayout(-1, -2);
        }
    }
}
