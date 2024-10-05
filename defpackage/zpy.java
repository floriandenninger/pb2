package defpackage;

import android.os.AsyncTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpy extends AsyncTask {
    private final zom a;

    public zpy(zom zomVar) {
        this.a = zomVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zom zomVar = this.a;
        yjk.e();
        File file = zomVar.a;
        if (file == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        zom.c(file, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((File) it.next()).delete();
            } catch (SecurityException e) {
                zga.d("Exception in deleting existing file", e);
            }
        }
        return null;
    }
}
