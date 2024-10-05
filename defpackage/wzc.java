package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wzc implements wza {
    protected final Context a;
    protected final amnv b;
    final AtomicBoolean c;
    final boolean d;
    final byte[] e;
    public final String f;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wzc(android.content.Context r7, java.lang.String r8, final defpackage.apck r9, final java.lang.String r10, final java.lang.String r11, final defpackage.wyx r12, boolean r13, boolean r14, int r15) {
        /*
            r6 = this;
            r6.<init>()
            r8.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r7.getClass()
            r6.a = r7
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean
            r7.<init>(r13)
            r6.c = r7
            r6.d = r14
            int r15 = r15 + (-1)
            r7 = 3
            r13 = 2
            r14 = 1
            if (r15 == r14) goto L2c
            if (r15 == r13) goto L2d
            if (r15 == r7) goto L2a
            r7 = 0
            goto L6a
        L2a:
            r7 = 4
            goto L2d
        L2c:
            r7 = 2
        L2d:
            dvj r13 = defpackage.dvj.a
            aone r13 = r13.createBuilder()
            dvk r15 = defpackage.dvk.a
            aone r15 = r15.createBuilder()
            r15.copyOnWrite()
            aonm r0 = r15.instance
            dvk r0 = (defpackage.dvk) r0
            int r7 = r7 + (-1)
            r0.c = r7
            int r7 = r0.b
            r7 = r7 | r14
            r0.b = r7
            r13.copyOnWrite()
            aonm r7 = r13.instance
            dvj r7 = (defpackage.dvj) r7
            aonm r15 = r15.build()
            dvk r15 = (defpackage.dvk) r15
            r15.getClass()
            r7.c = r15
            int r15 = r7.b
            r14 = r14 | r15
            r7.b = r14
            aonm r7 = r13.build()
            dvj r7 = (defpackage.dvj) r7
            byte[] r7 = r7.toByteArray()
        L6a:
            r6.e = r7
            java.lang.String r7 = "a."
            int r13 = r8.length()
            if (r13 == 0) goto L79
            java.lang.String r7 = r7.concat(r8)
            goto L7f
        L79:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r7)
            r7 = r8
        L7f:
            r6.f = r7
            wzb r7 = new wzb
            r0 = r7
            r1 = r6
            r2 = r12
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>()
            amnv r7 = defpackage.amkq.x(r7)
            r6.b = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzc.<init>(android.content.Context, java.lang.String, apck, java.lang.String, java.lang.String, wyx, boolean, boolean, int):void");
    }

    protected static String h(int i) {
        String valueOf = String.valueOf(String.format(Locale.ROOT, "%02d", Integer.valueOf(i)));
        return valueOf.length() != 0 ? "go/asr".concat(valueOf) : new String("go/asr");
    }

    private final String i(pux puxVar, byte[] bArr) {
        if (bArr != null) {
            return puxVar.a(this.a, bArr);
        }
        return puxVar.a(this.a, null);
    }

    @Override // defpackage.wza
    public final String a(String str) {
        if (this.d) {
            return "";
        }
        try {
            return ((pux) this.b.get()).a.a(qve.a(this.a), str);
        } catch (RemoteException unused) {
            return h(15);
        }
    }

    @Override // defpackage.wza
    public String b() {
        yjk.e();
        try {
            pux puxVar = (pux) this.b.get();
            String i = i(puxVar, this.e);
            if (this.c.get()) {
                synchronized (this.c) {
                    if (this.c.get()) {
                        String i2 = i(puxVar, this.e);
                        this.c.set(false);
                        i = i2;
                    }
                }
            }
            return TextUtils.isEmpty(i) ? h(14) : i;
        } catch (RemoteException unused) {
            return h(15);
        } catch (Throwable unused2) {
            return h(13);
        }
    }

    @Override // defpackage.wza
    public final String c() {
        try {
            return ((pux) this.b.get()).a.g();
        } catch (RemoteException unused) {
            return "ms";
        }
    }

    @Override // defpackage.wza
    public final String d() {
        return this.f;
    }

    @Override // defpackage.wza
    public void e(Executor executor) {
    }

    @Override // defpackage.wza
    public void f() {
    }

    @Override // defpackage.wza
    public final void g(MotionEvent motionEvent) {
        if (this.d) {
            return;
        }
        try {
            ((pux) this.b.get()).a.h(qve.a(motionEvent));
        } catch (Exception unused) {
        }
    }
}
