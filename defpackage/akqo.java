package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akqo {
    private final Context d;
    private final int e;
    private final int f;
    private final int g;
    private final long h;
    private final int i;
    private final String j;
    private final String k;
    private final String l;
    private final int m;
    private int o;
    private int p;
    private final ysy q;
    private boolean r;
    public boolean a = true;
    private int n = 0;
    public int b = 1;
    public int c = 2;

    public akqo(Context context, ysy ysyVar) {
        SystemClock.elapsedRealtime();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        SystemClock.elapsedRealtime();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = memoryInfo.totalMem;
        SystemClock.elapsedRealtime();
        int i = Build.VERSION.SDK_INT;
        String str = Build.VERSION.INCREMENTAL;
        String str2 = Build.FINGERPRINT;
        SystemClock.elapsedRealtime();
        String property = System.getProperty("os.arch");
        SystemClock.elapsedRealtime();
        this.m = zgx.a(context);
        SystemClock.elapsedRealtime();
        this.d = context;
        this.e = displayMetrics.densityDpi;
        this.f = displayMetrics.heightPixels;
        this.g = displayMetrics.widthPixels;
        this.h = j / 1024;
        this.i = i;
        this.j = str;
        this.k = str2;
        this.l = property;
        this.q = ysyVar;
    }

    private final void e() {
        try {
            this.r = uon.c(this.d);
        } catch (Throwable unused) {
        }
    }

    public final void a(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        int intExtra2 = intent.getIntExtra("plugged", -1);
        if (intExtra != 5 && intExtra != 2) {
            this.b = 2;
        } else if (intExtra2 == 1) {
            this.b = 4;
        } else if (intExtra2 == 2) {
            this.b = 3;
        } else if (intExtra2 == 4) {
            this.b = 5;
        } else {
            this.b = 1;
        }
        int aO = aobq.aO(intent.getIntExtra("health", 1));
        this.c = aO;
        if (aO == 0) {
            this.c = 2;
        }
    }

    public final boolean b() {
        e();
        return this.r;
    }

    public final void c(aone aoneVar) {
        NetworkInfo d = this.q.d();
        if (d == null) {
            this.o = 0;
            this.p = NetworkInfo.State.DISCONNECTED.ordinal();
        } else {
            this.o = d.getType();
            this.p = d.getState().ordinal();
        }
        this.n = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay().getRotation();
        e();
        avdd avddVar = ((avdg) aoneVar.instance).e;
        if (avddVar == null) {
            avddVar = avdd.a;
        }
        aone builder = avddVar.toBuilder();
        boolean z = this.a;
        builder.copyOnWrite();
        avdd avddVar2 = (avdd) builder.instance;
        avddVar2.b |= 1;
        avddVar2.c = z;
        int i = this.n;
        builder.copyOnWrite();
        avdd avddVar3 = (avdd) builder.instance;
        avddVar3.b |= 2;
        avddVar3.d = i;
        int i2 = this.o;
        builder.copyOnWrite();
        avdd avddVar4 = (avdd) builder.instance;
        avddVar4.b |= 4;
        avddVar4.e = i2;
        int i3 = this.p;
        builder.copyOnWrite();
        avdd avddVar5 = (avdd) builder.instance;
        avddVar5.b |= 8;
        avddVar5.f = i3;
        int i4 = this.b;
        builder.copyOnWrite();
        avdd avddVar6 = (avdd) builder.instance;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        avddVar6.g = i5;
        avddVar6.b |= 16;
        boolean z2 = this.r;
        builder.copyOnWrite();
        avdd avddVar7 = (avdd) builder.instance;
        avddVar7.b |= 32;
        avddVar7.h = z2;
        aoneVar.copyOnWrite();
        avdg avdgVar = (avdg) aoneVar.instance;
        avdd avddVar8 = (avdd) builder.build();
        avddVar8.getClass();
        avdgVar.e = avddVar8;
        avdgVar.b |= 4;
    }

    public final void d(aone aoneVar) {
        avde avdeVar = ((avdg) aoneVar.instance).d;
        if (avdeVar == null) {
            avdeVar = avde.a;
        }
        aone builder = avdeVar.toBuilder();
        int i = this.e;
        builder.copyOnWrite();
        avde avdeVar2 = (avde) builder.instance;
        avdeVar2.b |= 1;
        avdeVar2.c = i;
        int i2 = this.f;
        builder.copyOnWrite();
        avde avdeVar3 = (avde) builder.instance;
        avdeVar3.b |= 2;
        avdeVar3.d = i2;
        int i3 = this.g;
        builder.copyOnWrite();
        avde avdeVar4 = (avde) builder.instance;
        avdeVar4.b |= 4;
        avdeVar4.e = i3;
        long j = this.h;
        builder.copyOnWrite();
        avde avdeVar5 = (avde) builder.instance;
        avdeVar5.b |= 8;
        avdeVar5.f = j;
        int i4 = this.i;
        builder.copyOnWrite();
        avde avdeVar6 = (avde) builder.instance;
        avdeVar6.b |= 16;
        avdeVar6.g = i4;
        String str = this.j;
        builder.copyOnWrite();
        avde avdeVar7 = (avde) builder.instance;
        str.getClass();
        avdeVar7.b |= 32;
        avdeVar7.h = str;
        String str2 = this.k;
        builder.copyOnWrite();
        avde avdeVar8 = (avde) builder.instance;
        str2.getClass();
        avdeVar8.b |= 512;
        avdeVar8.k = str2;
        String str3 = this.l;
        builder.copyOnWrite();
        avde avdeVar9 = (avde) builder.instance;
        str3.getClass();
        avdeVar9.b |= 64;
        avdeVar9.i = str3;
        int i5 = this.m;
        builder.copyOnWrite();
        avde avdeVar10 = (avde) builder.instance;
        avdeVar10.b |= 128;
        avdeVar10.j = i5;
        aoneVar.copyOnWrite();
        avdg avdgVar = (avdg) aoneVar.instance;
        avde avdeVar11 = (avde) builder.build();
        avdeVar11.getClass();
        avdgVar.d = avdeVar11;
        avdgVar.b |= 2;
    }
}
