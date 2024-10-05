package defpackage;

import android.view.View;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akco extends WeakReference {
    public final String a;

    public akco(String str, View view, ReferenceQueue referenceQueue) {
        super(view, referenceQueue);
        this.a = str;
    }

    public akco(View view, ReferenceQueue referenceQueue, String str) {
        super(view, referenceQueue);
        this.a = str;
    }
}
