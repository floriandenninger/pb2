package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alr {
    private static final Object k = new Object();
    private static volatile alr l;
    public final ReadWriteLock a;
    public final Set b;
    public int c;
    public final Handler d;
    public final all e;
    final alp f;
    public final boolean g;
    final boolean h;
    final int[] i;
    public final aln j;

    private alr(alm almVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.g = almVar.b;
        this.h = almVar.c;
        this.i = almVar.d;
        this.f = almVar.a;
        this.j = almVar.f;
        this.d = new Handler(Looper.getMainLooper());
        aeb aebVar = new aeb();
        this.b = aebVar;
        Set set = almVar.e;
        if (set != null && !set.isEmpty()) {
            aebVar.addAll(almVar.e);
        }
        alk alkVar = new alk(this);
        this.e = alkVar;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.c = 0;
            reentrantReadWriteLock.writeLock().unlock();
            if (a() == 0) {
                try {
                    alk alkVar2 = alkVar;
                    alq alqVar = new alq(alkVar);
                    alk alkVar3 = alkVar;
                    alp alpVar = alkVar.c.f;
                    synchronized (((ama) alpVar).a) {
                        if (((ama) alpVar).b == null) {
                            ((ama) alpVar).c = new HandlerThread("emojiCompat", 10);
                            ((ama) alpVar).c.start();
                            ((ama) alpVar).b = new Handler(((ama) alpVar).c.getLooper());
                        }
                        ((ama) alpVar).b.post(new alx((ama) alpVar, alqVar));
                    }
                } catch (Throwable unused) {
                    alkVar.c.h();
                }
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public static alr b() {
        alr alrVar;
        synchronized (k) {
            gn.d(l != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            alrVar = l;
        }
        return alrVar;
    }

    public static void f(alm almVar) {
        if (l == null) {
            synchronized (k) {
                if (l == null) {
                    l = new alr(almVar);
                }
            }
        }
    }

    public final int a() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        return d(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public final CharSequence d(CharSequence charSequence, int i, int i2) {
        return g(charSequence, i, i2, Integer.MAX_VALUE);
    }

    public final boolean e() {
        return a() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0104, code lost:
    
        if (r9.c(r17, r5, r0, r6.c()) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0148, code lost:
    
        if (r9.c(r17, r5, r0, r6.b()) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0166, code lost:
    
        ((defpackage.ams) r17).b();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[Catch: all -> 0x016e, TryCatch #0 {all -> 0x016e, blocks: (B:102:0x006b, B:105:0x0070, B:107:0x0074, B:109:0x0083, B:23:0x008e, B:25:0x0098, B:29:0x009e, B:31:0x00aa, B:33:0x00ad, B:37:0x00ba, B:43:0x00c9, B:44:0x00d7, B:47:0x00f0, B:68:0x00fc, B:73:0x0108, B:74:0x010d, B:60:0x0118, B:63:0x011f, B:50:0x0124, B:52:0x012f, B:76:0x0136, B:80:0x0140, B:83:0x014c, B:84:0x0151, B:21:0x0089), top: B:101:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0140 A[Catch: all -> 0x016e, TryCatch #0 {all -> 0x016e, blocks: (B:102:0x006b, B:105:0x0070, B:107:0x0074, B:109:0x0083, B:23:0x008e, B:25:0x0098, B:29:0x009e, B:31:0x00aa, B:33:0x00ad, B:37:0x00ba, B:43:0x00c9, B:44:0x00d7, B:47:0x00f0, B:68:0x00fc, B:73:0x0108, B:74:0x010d, B:60:0x0118, B:63:0x011f, B:50:0x0124, B:52:0x012f, B:76:0x0136, B:80:0x0140, B:83:0x014c, B:84:0x0151, B:21:0x0089), top: B:101:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c A[Catch: all -> 0x016e, TryCatch #0 {all -> 0x016e, blocks: (B:102:0x006b, B:105:0x0070, B:107:0x0074, B:109:0x0083, B:23:0x008e, B:25:0x0098, B:29:0x009e, B:31:0x00aa, B:33:0x00ad, B:37:0x00ba, B:43:0x00c9, B:44:0x00d7, B:47:0x00f0, B:68:0x00fc, B:73:0x0108, B:74:0x010d, B:60:0x0118, B:63:0x011f, B:50:0x0124, B:52:0x012f, B:76:0x0136, B:80:0x0140, B:83:0x014c, B:84:0x0151, B:21:0x0089), top: B:101:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence g(java.lang.CharSequence r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alr.g(java.lang.CharSequence, int, int, int):java.lang.CharSequence");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new alo(arrayList, this.c));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(gp gpVar) {
        gn.h(gpVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            int i = this.c;
            if (i != 1 && i != 2) {
                this.b.add(gpVar);
            }
            Handler handler = this.d;
            gn.h(gpVar, "initCallback cannot be null");
            handler.post(new alo(Arrays.asList(gpVar), i));
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
