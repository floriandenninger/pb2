package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czm implements cqq {
    @Override // defpackage.cpx
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, cqn cqnVar) {
        try {
            ddc.e(((czl) ((ctd) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.cqq
    public final int b() {
        return 1;
    }
}
