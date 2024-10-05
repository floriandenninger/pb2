package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axw extends Handler {
    final /* synthetic */ aye a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axw(aye ayeVar, Looper looper) {
        super(looper);
        this.a = ayeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (axt axtVar : this.a.c) {
            if (Arrays.equals(axtVar.h, bArr)) {
                if (message.what == 2 && axtVar.g == 4) {
                    int i = pts.a;
                    axtVar.g(false);
                    return;
                }
                return;
            }
        }
    }
}
