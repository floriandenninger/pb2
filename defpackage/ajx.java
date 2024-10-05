package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajx extends InputConnectionWrapper {
    final /* synthetic */ ajy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajx(InputConnection inputConnection, ajy ajyVar) {
        super(inputConnection, false);
        this.a = ajyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.os.ResultReceiver] */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.os.ResultReceiver] */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z;
        ?? r4;
        ajy ajyVar = this.a;
        if (bundle != null) {
            ?? r2 = 0;
            r2 = 0;
            if (!TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str);
            }
            try {
                r4 = (ResultReceiver) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                try {
                    Uri uri = (Uri) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                    Uri uri2 = (Uri) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                    int i = bundle.getInt(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    Bundle bundle2 = (Bundle) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                    if (uri != null && clipDescription != null) {
                        r2 = ajyVar.a(new akc(uri, clipDescription, uri2), i, bundle2);
                    }
                    if (r4 != 0) {
                        r4.send(r2, null);
                    }
                    if (r2 != 0) {
                        return true;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (r4 != 0) {
                        r4.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r4 = 0;
            }
        }
        return super.performPrivateCommand(str, bundle);
    }
}
