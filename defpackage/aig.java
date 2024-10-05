package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aig {
    public static void a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, null);
    }

    public static void b(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
