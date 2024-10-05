package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class et implements Iterable {
    public final ArrayList a = new ArrayList();
    public final Context b;

    private et(Context context) {
        this.b = context;
    }

    public static et a(Context context) {
        return new et(context);
    }

    public final void b(Intent intent) {
        this.a.add(intent);
    }

    public final void c(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent c = ej.c(this.b, componentName);
            while (c != null) {
                this.a.add(size, c);
                c = ej.c(this.b, c.getComponent());
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
