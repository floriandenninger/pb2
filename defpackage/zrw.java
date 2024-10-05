package defpackage;

import android.os.AsyncTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zrw extends AsyncTask {
    final /* synthetic */ String a;
    final /* synthetic */ zrx b;

    public zrw(zrx zrxVar, String str) {
        this.b = zrxVar;
        this.a = str;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        this.b.h(this.a);
        return null;
    }
}
