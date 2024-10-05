package defpackage;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zuj extends AsyncTask {
    private final WeakReference a;
    private final Set b;

    public zuj(ztz ztzVar, Set set) {
        this.a = new WeakReference(ztzVar);
        this.b = set;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        ztz ztzVar = (ztz) this.a.get();
        if (ztzVar == null) {
            return null;
        }
        ztzVar.f(this.b);
        return null;
    }
}
