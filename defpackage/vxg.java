package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import java.io.OutputStream;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxg extends Thread {
    public volatile Exception a;
    private final Context b;
    private final OutputStream c;
    private final Uri d;
    private final long e;
    private final Uri f;
    private final long g;
    private final float h;
    private final long i;
    private final long j;
    private final boolean k;
    private final vtz l;

    public vxg(Context context, OutputStream outputStream, Uri uri, long j, Uri uri2, long j2, float f, long j3, long j4, boolean z, vtz vtzVar) {
        amkq.E(j3 >= 0);
        context.getClass();
        this.b = context;
        this.c = outputStream;
        this.d = uri;
        this.e = j;
        uri2.getClass();
        this.f = uri2;
        this.g = j2;
        this.h = f;
        this.j = j3;
        this.i = j4;
        this.k = z;
        this.l = vtzVar;
    }

    private static oyr a(Context context, Uri uri, boolean z, int i) {
        if (z) {
            return new pcg(uri, new pfv(context, pgz.l(context, "AudioMPEG")), new pft(65536), i, new pbz[0]);
        }
        return new oxo(context, uri);
    }

    private static vuf b(oyr oyrVar, vuc vucVar) {
        vuf vufVar = new vuf(oyrVar);
        vufVar.a = vucVar;
        return vufVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        Date date = new Date(0L);
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        oxk s = opn.s();
        oxk s2 = opn.s();
        vxe vxeVar = new vxe(s, s2, myLooper);
        s.e(new vxf(this, s2, s, myLooper, 1, null));
        s2.e(new vxf(this, s, s2, myLooper, 0));
        vub vubVar = new vub(new vtx(new vue(this.c, date, vxeVar)), this.j, this.l);
        Uri uri = this.d;
        if (uri != null) {
            s.g(b(a(this.b, uri, this.k, 16777216), vubVar.b(this.e, 1.0f - this.h, Long.MAX_VALUE)));
            s.l(true);
        }
        vuf b = b(a(this.b, this.f, this.k, 1310720), vubVar.b(this.g, this.h, this.i));
        vubVar.a = vua.STARTED;
        s2.g(b);
        s2.l(true);
        Looper.loop();
    }
}
