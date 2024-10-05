package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ama implements alp {
    public final Object a = new Object();
    public Handler b;
    public HandlerThread c;
    public amb d;
    alq e;
    private final Context f;
    private final aiy g;
    private ContentObserver h;
    private Runnable i;

    public ama(Context context, aiy aiyVar) {
        gn.h(context, "Context cannot be null");
        this.f = context.getApplicationContext();
        this.g = aiyVar;
    }

    private final void b() {
        this.e = null;
        ContentObserver contentObserver = this.h;
        if (contentObserver != null) {
            this.f.getContentResolver().unregisterContentObserver(contentObserver);
            this.h = null;
        }
        synchronized (this.a) {
            this.b.removeCallbacks(this.i);
            HandlerThread handlerThread = this.c;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.b = null;
            this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        long j;
        long j2;
        int i;
        long min;
        try {
            if (this.e != null) {
                try {
                    ajf a = aix.a(this.f, this.g, null);
                    if (a.a != 0) {
                        throw new RuntimeException("fetchFonts failed (" + a.a + ")");
                    }
                    ajg[] ajgVarArr = a.b;
                    if (ajgVarArr == null || ajgVarArr.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    ajg ajgVar = ajgVarArr[0];
                    int i2 = ajgVar.e;
                    if (i2 == 2) {
                        synchronized (this.a) {
                            amb ambVar = this.d;
                            if (ambVar != null) {
                                if (ambVar.b == 0) {
                                    ambVar.b = SystemClock.uptimeMillis();
                                    min = 0;
                                } else {
                                    long uptimeMillis = SystemClock.uptimeMillis() - ambVar.b;
                                    min = uptimeMillis > ambVar.a ? -1L : Math.min(Math.max(uptimeMillis, 1000L), ambVar.a - uptimeMillis);
                                }
                                if (min >= 0) {
                                    Uri uri = ajgVar.a;
                                    synchronized (this.a) {
                                        if (this.h == null) {
                                            aly alyVar = new aly(this, this.b);
                                            this.h = alyVar;
                                            this.f.getContentResolver().registerContentObserver(uri, false, alyVar);
                                        }
                                        if (this.i == null) {
                                            this.i = new alz(this);
                                        }
                                        this.b.postDelayed(this.i, min);
                                    }
                                    return;
                                }
                            }
                            i2 = 2;
                        }
                    }
                    if (i2 == 0) {
                        Typeface b = aim.b(this.f, null, new ajg[]{ajgVar});
                        ByteBuffer g = gl.g(this.f, null, ajgVar.a);
                        if (g != null) {
                            alq alqVar = this.e;
                            ByteBuffer duplicate = g.duplicate();
                            duplicate.order(ByteOrder.BIG_ENDIAN);
                            hm.f(4, duplicate);
                            char c = (char) duplicate.getShort();
                            if (c > 'd') {
                                throw new IOException("Cannot read metadata.");
                            }
                            hm.f(6, duplicate);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= c) {
                                    j = -1;
                                    j2 = -1;
                                    break;
                                }
                                int i4 = duplicate.getInt();
                                hm.f(4, duplicate);
                                j2 = hm.e(duplicate);
                                hm.f(4, duplicate);
                                if (i4 == 1835365473) {
                                    j = -1;
                                    break;
                                }
                                i3++;
                            }
                            if (j2 != j) {
                                hm.f((int) (j2 - duplicate.position()), duplicate);
                                hm.f(12, duplicate);
                                long e = hm.e(duplicate);
                                while (i < e) {
                                    int i5 = duplicate.getInt();
                                    long e2 = hm.e(duplicate);
                                    hm.e(duplicate);
                                    i = (i5 == 1164798569 || i5 == 1701669481) ? 0 : i + 1;
                                    duplicate.position((int) (e2 + j2));
                                    bvj bvjVar = new bvj();
                                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                                    bvjVar.d(duplicate.getInt(duplicate.position()) + duplicate.position(), duplicate);
                                    ame ameVar = new ame(b, bvjVar);
                                    alk alkVar = alqVar.a;
                                    alkVar.b = ameVar;
                                    ame ameVar2 = alkVar.b;
                                    alr alrVar = alkVar.c;
                                    alkVar.a = new alv(ameVar2, alrVar.j, alrVar.h, alrVar.i);
                                    alr alrVar2 = alkVar.c;
                                    ArrayList arrayList = new ArrayList();
                                    alrVar2.a.writeLock().lock();
                                    try {
                                        alrVar2.c = 1;
                                        arrayList.addAll(alrVar2.b);
                                        alrVar2.b.clear();
                                        alrVar2.a.writeLock().unlock();
                                        alrVar2.d.post(new alo(arrayList, alrVar2.c));
                                        b();
                                        return;
                                    } catch (Throwable th) {
                                        alrVar2.a.writeLock().unlock();
                                        throw th;
                                    }
                                }
                            }
                            throw new IOException("Cannot read metadata.");
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new RuntimeException("provider not found", e3);
                }
            }
        } catch (Throwable unused) {
            this.e.a.c.h();
            b();
        }
    }
}
