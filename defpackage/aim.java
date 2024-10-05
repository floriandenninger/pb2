package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aim {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, ajg[] ajgVarArr) {
        return fq.b(context, cancellationSignal, ajgVarArr, 0);
    }
}
