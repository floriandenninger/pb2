package defpackage;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abzv implements MediaScannerConnection.OnScanCompletedListener {
    final /* synthetic */ acae a;

    public abzv(acae acaeVar) {
        this.a = acaeVar;
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        this.a.a(uri);
    }
}
