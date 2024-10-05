package defpackage;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zul extends AsyncTask {
    private final WeakReference a;

    public zul(ztz ztzVar) {
        this.a = new WeakReference(ztzVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        ztz ztzVar = (ztz) this.a.get();
        if (ztzVar == null) {
            return null;
        }
        final zuf zufVar = ztzVar.h;
        if (zufVar == null) {
            zga.b("Error updateSwazzleAssets cache wrapper is null.");
            return null;
        }
        final Set set = ztzVar.f;
        zufVar.c.execute(new Runnable() { // from class: zud
            @Override // java.lang.Runnable
            public final void run() {
                zuf zufVar2 = zuf.this;
                Set set2 = set;
                zom zomVar = zufVar2.a;
                if (zomVar == null) {
                    return;
                }
                zomVar.a(set2);
            }
        });
        return null;
    }
}
