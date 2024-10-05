package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cam {
    final Context a;
    final ccd b;
    final bym c;
    final WorkDatabase d;
    final String e;
    List f;
    final cfa g;

    public cam(Context context, bym bymVar, cfa cfaVar, ccd ccdVar, WorkDatabase workDatabase, String str) {
        new abm();
        this.a = context.getApplicationContext();
        this.g = cfaVar;
        this.b = ccdVar;
        this.c = bymVar;
        this.d = workDatabase;
        this.e = str;
    }
}
