package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class allr {
    private static allr e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new allp(this));
    public allq c;
    public allq d;

    private allr() {
    }

    public static allr a() {
        if (e == null) {
            e = new allr();
        }
        return e;
    }

    public final void b(allq allqVar) {
        int i = allqVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(allqVar);
        Handler handler = this.b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, allqVar), i);
    }

    public final void c() {
        allq allqVar = this.d;
        if (allqVar != null) {
            this.c = allqVar;
            this.d = null;
            allg allgVar = (allg) allqVar.a.get();
            if (allgVar != null) {
                allk.b.sendMessage(allk.b.obtainMessage(0, allgVar.a));
            } else {
                this.c = null;
            }
        }
    }

    public final boolean d(allq allqVar, int i) {
        allg allgVar = (allg) allqVar.a.get();
        if (allgVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(allqVar);
        allk.b.sendMessage(allk.b.obtainMessage(1, i, 0, allgVar.a));
        return true;
    }

    public final void e(allg allgVar) {
        synchronized (this.a) {
            if (g(allgVar)) {
                allq allqVar = this.c;
                if (!allqVar.c) {
                    allqVar.c = true;
                    this.b.removeCallbacksAndMessages(allqVar);
                }
            }
        }
    }

    public final void f(allg allgVar) {
        synchronized (this.a) {
            if (g(allgVar)) {
                allq allqVar = this.c;
                if (allqVar.c) {
                    allqVar.c = false;
                    b(allqVar);
                }
            }
        }
    }

    public final boolean g(allg allgVar) {
        allq allqVar = this.c;
        return allqVar != null && allqVar.a(allgVar);
    }

    public final boolean h(allg allgVar) {
        allq allqVar = this.d;
        return allqVar != null && allqVar.a(allgVar);
    }
}
