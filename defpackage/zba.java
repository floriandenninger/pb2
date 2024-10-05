package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zba extends Handler implements View.OnSystemUiVisibilityChangeListener {
    public View a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean g;
    public boolean h;
    private final Window i;
    private final zam k;
    private int j = 1;
    public boolean f = true;

    public zba(Window window, zam zamVar) {
        this.i = window;
        zamVar.getClass();
        this.k = zamVar;
    }

    private final void c() {
        if (this.a == null) {
            return;
        }
        removeMessages(0);
        int i = this.b;
        int i2 = this.c;
        boolean z = true;
        boolean z2 = i2 == 2 && this.j == 0 && !this.g;
        int i3 = i & 7;
        boolean z3 = i3 == 7;
        boolean z4 = i2 == 2 && this.j == 0 && this.g;
        boolean z5 = (i & 1) == 1 && i3 != 7;
        if (z2 == z3 && z4 == z5) {
            z = false;
        }
        if (this.h || !z) {
            return;
        }
        sendEmptyMessageDelayed(0, 2500L);
    }

    public final void a() {
        int i;
        if (this.a == null) {
            return;
        }
        c();
        int i2 = this.c;
        if (i2 == 2 || i2 == 1) {
            int i3 = this.j;
            i = 1536;
            if (i3 == 0) {
                i = 1536 | (true != this.g ? 7 : 1);
            } else if (i3 == 2) {
                i = 1540;
            }
            if (this.e) {
                i |= 4096;
            }
            if (this.f) {
                i |= 256;
            }
        } else {
            i = 0;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (!this.d || this.c == 0) {
                this.i.getAttributes().layoutInDisplayCutoutMode = 0;
            } else {
                this.i.getAttributes().layoutInDisplayCutoutMode = 1;
            }
        }
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Boolean.valueOf(this.c == 2);
        objArr[2] = Boolean.valueOf(this.j == 0);
        objArr[3] = Boolean.valueOf(this.e);
        objArr[4] = Boolean.valueOf(this.g);
        String.format("FSUI setSystemUiVisibility 0x%08x [fullscreen=%s hideSysUi=%s immersive=%s lowprofile=%s]", objArr);
        this.a.setSystemUiVisibility(i);
        this.k.a.f();
    }

    public final void b(int i) {
        this.j = i;
        removeMessages(0);
        a();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 0) {
            return;
        }
        a();
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int i2 = i & 2;
        if (((this.b & 2) == 0) != (i2 == 0)) {
            zam zamVar = this.k;
            if (i2 == 0) {
                zao zaoVar = zamVar.a;
                if (!zaoVar.i) {
                    Iterator it = zaoVar.e.iterator();
                    while (it.hasNext()) {
                        ((zbk) it.next()).w();
                    }
                }
            }
        }
        this.b = i;
        c();
    }
}
