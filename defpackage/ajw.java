package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajw extends InputConnectionWrapper {
    final /* synthetic */ ajy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajw(InputConnection inputConnection, ajy ajyVar) {
        super(inputConnection, false);
        this.a = ajyVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ajy ajyVar = this.a;
        akc akcVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            akcVar = new akc(new ajz(inputContentInfo));
        }
        if (ajyVar.a(akcVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
