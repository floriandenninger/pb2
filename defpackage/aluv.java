package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedFragmentServiceFactoryService;
import com.google.android.youtube.api.service.YouTubeService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aluv extends alvq implements IBinder.DeathRecipient, otc, ouu {
    public static final amsx a = amsx.v("com.examples.youtubeapidemo", "com.examples.youtubeapidemo.materialdesign", "com.google.android.googlequicksearchbox", "com.google.android.apps.magazines", "com.google.android.play.games");
    public final Context b;
    public final Handler c;
    public final String d;
    private volatile osv e;
    private volatile ApiPlayerFactoryService f;
    private volatile EmbedFragmentServiceFactoryService g;
    private yrp h;
    private volatile aluz i;
    private final aoae j;

    static {
        amsx.w("com.examples.youtubeapidemo", "com.examples.youtubeapidemo.materialdesign", "com.google.android.apps.newsstand_exp", "com.google.android.apps.newsstand_internal", "com.google.android.apps.newsstand_staging", "com.google.android.apps.newsstanddev", new String[0]);
    }

    public aluv(Context context, aoae aoaeVar, String str, aluz aluzVar, opn opnVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = context;
        aluzVar.getClass();
        this.i = aluzVar;
        this.c = new Handler(context.getMainLooper());
        aoaeVar.getClass();
        this.j = aoaeVar;
        this.d = str;
        opnVar.getClass();
    }

    private final void i() {
        if (this.e == null || this.f == null || this.g == null) {
            throw new IllegalStateException("YouTubeServiceEntity not initialized");
        }
    }

    @Override // defpackage.otc
    public final void a(final osv osvVar) {
        this.e = osvVar;
        this.h = new yrs(this.b, new azrw() { // from class: aluu
            @Override // defpackage.azrw
            public final Object get() {
                osv osvVar2 = osv.this;
                amsx amsxVar = aluv.a;
                return ((otb) osvVar2).f.l();
            }
        }, ((otb) osvVar).f.o());
        this.f = new ApiPlayerFactoryService(this.b, this.c, this.j, osvVar, null, null, null);
        this.g = new EmbedFragmentServiceFactoryService(this.c, this.j, osvVar, null, null, null);
        aluz aluzVar = this.i;
        if (aluzVar != null) {
            try {
                aluzVar.a.linkToDeath(this, 0);
                aluzVar.a("SUCCESS", this);
            } catch (RemoteException unused) {
            }
        }
        this.j.B(this);
    }

    @Override // defpackage.otc
    public final void b(Exception exc) {
        this.e = null;
        zga.d("Error creating ApiEnvironment", exc);
        if (this.i != null) {
            YouTubeService.a(this.i, otb.l(exc));
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        g();
    }

    @Override // defpackage.ouu
    public final void c() {
        f();
    }

    @Override // defpackage.alvr
    public final IBinder d() {
        i();
        ApiPlayerFactoryService apiPlayerFactoryService = this.f;
        apiPlayerFactoryService.asBinder();
        return apiPlayerFactoryService;
    }

    @Override // defpackage.alvr
    public final IBinder e() {
        i();
        EmbedFragmentServiceFactoryService embedFragmentServiceFactoryService = this.g;
        embedFragmentServiceFactoryService.asBinder();
        return embedFragmentServiceFactoryService;
    }

    public final void f() {
        Object obj = this.h;
        if (obj != null) {
            yrs yrsVar = (yrs) obj;
            yrsVar.a.unregisterReceiver((BroadcastReceiver) obj);
            yrsVar.b.b(yrsVar.c);
            yrsVar.b.b(yrsVar.d);
            this.h = null;
        }
        if (this.e != null) {
            this.e = null;
        }
        this.f = null;
        this.g = null;
        if (this.i != null) {
            this.i.a.unlinkToDeath(this, 0);
            this.i = null;
        }
        this.j.C(this);
        System.gc();
    }

    @Override // defpackage.alvr
    public final void g() {
        this.c.post(new Runnable() { // from class: alut
            @Override // java.lang.Runnable
            public final void run() {
                aluv.this.f();
            }
        });
    }

    @Override // defpackage.alvr
    public final alvp h(alvn alvnVar) {
        i();
        return new alvo(this.c, ((otb) this.e).f.I(), this.e.f(), ((otb) this.e).f.m(), alvnVar, null, null);
    }
}
