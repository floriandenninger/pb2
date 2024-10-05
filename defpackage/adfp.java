package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.libraries.youtube.mdx.mediaroute.service.RemotePlaybackControlsService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfp {
    public static final /* synthetic */ int c = 0;
    private static final String d = zga.a("MDX.RemoteStarter");
    public boolean a;
    public boolean b;
    private final Context e;
    private final azrw f;
    private boolean i;
    private boolean j;
    private final ServiceConnection k = new adfm();
    private final adls l = new adfn(this);
    private final adlr m = new adfo(this);
    private final Handler g = new Handler();
    private final Runnable h = new Runnable() { // from class: adfl
        @Override // java.lang.Runnable
        public final void run() {
            adfp.this.d();
        }
    };

    public adfp(Context context, azrw azrwVar) {
        this.e = context;
        this.f = azrwVar;
    }

    public final void a() {
        if (this.j) {
            return;
        }
        adlt adltVar = (adlt) this.f.get();
        adltVar.j(this.l);
        adltVar.i(this.m);
        this.j = true;
    }

    public final void b() {
        c(0L);
    }

    public final void c(long j) {
        this.g.removeCallbacks(this.h);
        Intent intent = new Intent(this.e, (Class<?>) RemotePlaybackControlsService.class);
        if (this.a || this.b) {
            if (this.i) {
                return;
            }
            boolean bindService = this.e.bindService(intent, this.k, 1);
            this.i = bindService;
            if (bindService) {
                return;
            }
            zga.c(d, "failed binding to remote playback control service");
            return;
        }
        if (this.i) {
            if (j > 0) {
                this.g.postDelayed(this.h, j);
            } else {
                d();
            }
        }
    }

    public final void d() {
        this.e.unbindService(this.k);
        this.i = false;
    }
}
