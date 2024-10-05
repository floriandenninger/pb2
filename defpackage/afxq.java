package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afxq implements afzo {
    public final ContentResolver a;
    private final aaea b;
    private final Context c;
    private final ScheduledExecutorService d;
    private final agaf e;

    public afxq(Context context, aaea aaeaVar, ScheduledExecutorService scheduledExecutorService, agaf agafVar) {
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        ContentResolver contentResolver = applicationContext.getContentResolver();
        contentResolver.getClass();
        this.a = contentResolver;
        aaeaVar.getClass();
        this.b = aaeaVar;
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
        agafVar.getClass();
        this.e = agafVar;
    }

    private final atog b() {
        arfd a = this.b.a();
        if (a == null) {
            return atog.a;
        }
        atog atogVar = a.p;
        return atogVar == null ? atog.a : atogVar;
    }

    private final String c() {
        ComponentName component;
        Intent launchIntentForPackage = this.c.getPackageManager().getLaunchIntentForPackage(this.c.getPackageName());
        if (launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null) {
            return null;
        }
        return component.getClassName();
    }

    private final void d(String str, int i) {
        ynm.j(this.e.j(str, i), new Executor() { // from class: afxp
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                afxq.this.a();
            }
        }, new ynk() { // from class: afxn
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                afxq afxqVar = afxq.this;
                zga.d("Failed to save the bade count.", th);
                afxqVar.a();
            }
        });
    }

    private static final boolean e(String str) {
        return str.equals("FEshared") || str.equals("FEnotifications_inbox");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afxq.a():void");
    }

    @Override // defpackage.afzo
    public final void l(String str) {
        if (e(str)) {
            d(str, 0);
        }
    }

    @Override // defpackage.afzo
    public final void o(String str, boolean z, int i) {
        if (e(str)) {
            d(str, i);
        }
    }
}
