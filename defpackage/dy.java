package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dy {
    public int A;
    public Notification B;
    public RemoteViews C;
    public RemoteViews D;
    public String E;
    public long F;
    public int G;
    boolean H;
    public Notification I;

    /* renamed from: J, reason: collision with root package name */
    @Deprecated
    public ArrayList f191J;
    public Context a;
    public ArrayList b;
    public ArrayList c;
    ArrayList d;
    CharSequence e;
    CharSequence f;
    public PendingIntent g;
    Bitmap h;
    CharSequence i;
    public int j;
    public int k;
    public boolean l;
    boolean m;
    public ea n;
    CharSequence o;
    public CharSequence[] p;
    int q;
    int r;
    boolean s;
    public String t;
    public boolean u;
    public String v;
    public boolean w;
    public String x;
    public Bundle y;
    public int z;

    @Deprecated
    public dy(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static CharSequence d(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    private final void x(int i, boolean z) {
        if (z) {
            Notification notification = this.I;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.I;
            notification2.flags = (i ^ (-1)) & notification2.flags;
        }
    }

    public final long a() {
        if (this.l) {
            return this.I.when;
        }
        return 0L;
    }

    public final Notification b() {
        return new eb(this).a();
    }

    public final Bundle c() {
        if (this.y == null) {
            this.y = new Bundle();
        }
        return this.y;
    }

    public final void e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new dv(i, charSequence, pendingIntent));
    }

    public final void f(dv dvVar) {
        if (dvVar != null) {
            this.b.add(dvVar);
        }
    }

    public final void g(boolean z) {
        x(16, z);
    }

    public final void h(RemoteViews remoteViews) {
        this.I.contentView = remoteViews;
    }

    public final void i(CharSequence charSequence) {
        this.i = d(charSequence);
    }

    public final void j(CharSequence charSequence) {
        this.f = d(charSequence);
    }

    public final void k(CharSequence charSequence) {
        this.e = d(charSequence);
    }

    public final void l(int i) {
        this.I.defaults = i;
        if ((i & 4) != 0) {
            this.I.flags |= 1;
        }
    }

    public final void m(PendingIntent pendingIntent) {
        this.I.deleteIntent = pendingIntent;
    }

    public final void n(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double d = dimensionPixelSize;
                double max = Math.max(1, bitmap.getWidth());
                Double.isNaN(d);
                Double.isNaN(max);
                double d2 = d / max;
                double d3 = dimensionPixelSize2;
                double max2 = Math.max(1, bitmap.getHeight());
                Double.isNaN(d3);
                Double.isNaN(max2);
                double min = Math.min(d2, d3 / max2);
                double width = bitmap.getWidth();
                Double.isNaN(width);
                int ceil = (int) Math.ceil(width * min);
                double height = bitmap.getHeight();
                Double.isNaN(height);
                bitmap = Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
            }
        }
        this.h = bitmap;
    }

    public final void o(boolean z) {
        x(2, z);
    }

    public final void p() {
        x(8, true);
    }

    public final void q(int i, int i2, boolean z) {
        this.q = i;
        this.r = i2;
        this.s = z;
    }

    public final void r(int i) {
        this.I.icon = i;
    }

    public final void s(ea eaVar) {
        if (this.n != eaVar) {
            this.n = eaVar;
            if (eaVar == null || eaVar.b == this) {
                return;
            }
            eaVar.b = this;
            dy dyVar = eaVar.b;
            if (dyVar != null) {
                dyVar.s(eaVar);
            }
        }
    }

    public final void t(CharSequence charSequence) {
        this.o = d(charSequence);
    }

    public final void u(CharSequence charSequence) {
        this.I.tickerText = d(charSequence);
    }

    public final void v(long[] jArr) {
        this.I.vibrate = jArr;
    }

    public final void w(long j) {
        this.I.when = j;
    }

    public dy(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.l = true;
        this.w = false;
        this.z = 0;
        this.A = 0;
        this.G = 0;
        Notification notification = new Notification();
        this.I = notification;
        this.a = context;
        this.E = str;
        notification.when = System.currentTimeMillis();
        this.I.audioStreamType = -1;
        this.k = 0;
        this.f191J = new ArrayList();
        this.H = true;
    }
}
