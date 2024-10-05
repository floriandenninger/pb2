package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class arm extends Service {
    public aqq a;
    final ArrayList b;
    final adz c;
    final arl d;
    public MediaSessionCompat$Token e;

    public arm() {
        new aqp(this, "android.media.session.MediaController", -1, -1, null);
        this.b = new ArrayList();
        this.c = new adz();
        this.d = new arl(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final List a(List list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = -1;
        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i2 != -1) {
            i = i2;
        } else if (i3 == -1) {
            return list;
        }
        int i4 = i3 * i;
        int i5 = i4 + i3;
        if (i < 0 || i3 <= 0 || i4 >= list.size()) {
            return Collections.emptyList();
        }
        if (i5 > list.size()) {
            i5 = list.size();
        }
        return list.subList(i4, i5);
    }

    public static final void c(arb arbVar) {
        arbVar.h = 2;
        arbVar.b(null);
    }

    public abstract void b(arb arbVar);

    public final void d(arb arbVar) {
        arbVar.h = 1;
        b(arbVar);
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract ypn e(String str);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a.a(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new ara(this);
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.a = new ara(this);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.a = new aqx(this);
        } else {
            this.a = new aqu(this);
        }
        this.a.b();
    }
}
