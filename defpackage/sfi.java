package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sfi implements anhh {
    private final /* synthetic */ int a;

    public sfi(int i) {
        this.a = i;
    }

    @Override // defpackage.anhh
    public final /* synthetic */ void b(Object obj) {
        int i = this.a;
        if (i == 0) {
            try {
                ((AutoCloseable) obj).close();
                return;
            } catch (Exception e) {
                qg(e);
                return;
            }
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
            return;
        }
        if (i == 3) {
            int i2 = tsx.a;
        } else {
            if (i == 4) {
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                Log.e("OneGoogle", "Failed to grant account access to app");
                return;
            }
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        int i = this.a;
        if (i == 0) {
            ((amxh) ((amxh) ((amxh) sfj.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/utils/FutureHelper$1", "onFailure", (char) 31, "FutureHelper.java")).q("Failed to close future closeable.");
            return;
        }
        if (i == 1) {
            ((amxh) ((amxh) ((amxh) sbw.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/FaceViewerManager$2", "onFailure", (char) 239, "FaceViewerManager.java")).q("Failed to create cronet engine.");
            return;
        }
        if (i == 2) {
            ((amyf) ((amyf) ((amyf) tik.a.f()).h(th)).i("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "lambda$provideEventResultHandler$1", 26, "FloggerResultDaggerModule.java")).o();
            return;
        }
        if (i == 3) {
            tsx.h("%s: Failed to commitToFlagSnapshot: %s", "MobileDataDownloadBuilder", th);
        } else if (i == 4) {
            Log.w("OneGoogle", "Failed to grant account access to app", th);
        } else {
            if (th instanceof ulh) {
                return;
            }
            Log.w("OneGoogle", "Failed to load owner avatar", th);
        }
    }
}
