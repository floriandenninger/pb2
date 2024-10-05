package defpackage;

import android.os.AsyncTask;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ztm extends AsyncTask {
    private final WeakReference a;
    private final WeakReference b;
    private final WeakReference c;

    public ztm(ztz ztzVar, avxs avxsVar, Set set) {
        this.a = new WeakReference(ztzVar);
        this.b = new WeakReference(avxsVar);
        this.c = new WeakReference(set);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        ztz ztzVar = (ztz) this.a.get();
        avxs avxsVar = (avxs) this.b.get();
        Set set = (Set) this.c.get();
        if (ztzVar == null || avxsVar == null || set == null) {
            return null;
        }
        aony<String> aonyVar = avxsVar.f;
        yjk.e();
        ztzVar.g();
        if (aonyVar != null && !aonyVar.isEmpty()) {
            String.valueOf(String.valueOf(aonyVar)).length();
            for (String str : aonyVar) {
                File file = new File(ztzVar.a, str);
                if (file.exists()) {
                    synchronized (ztzVar.d) {
                        try {
                            file.delete();
                            String.valueOf(str).length();
                            ztzVar.e.remove(str);
                        } catch (SecurityException e) {
                            String valueOf = String.valueOf(str);
                            zga.d(valueOf.length() != 0 ? "unable to delete asset: ".concat(valueOf) : new String("unable to delete asset: "), e);
                        }
                    }
                }
            }
        }
        ztzVar.f(set);
        return null;
    }
}
