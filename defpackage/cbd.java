package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cbd {
    public final ComponentName a;

    static {
        ajbh.S("SystemJobInfoConverter");
    }

    public cbd(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
