package defpackage;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class hg {
    final Object a = new Object();
    final MediaSession.Callback b = new hf(this);
    WeakReference c = new WeakReference(null);
    he d;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(hh hhVar, Handler handler) {
        if (this.e) {
            boolean z = false;
            this.e = false;
            handler.removeMessages(1);
            PlaybackStateCompat c = hhVar.c();
            long j = c == null ? 0L : c.e;
            if (c != null && c.a == 3) {
                z = true;
            }
            long j2 = 516 & j;
            long j3 = j & 514;
            if (z) {
                if (j3 != 0) {
                    c();
                }
            } else if (j2 != 0) {
                d();
            }
        }
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e(Uri uri, Bundle bundle) {
    }

    public void f() {
    }

    public void g() {
    }

    public void h(long j) {
    }

    public void i(RatingCompat ratingCompat) {
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }

    public boolean m(Intent intent) {
        hh hhVar;
        he heVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.a) {
            hhVar = (hh) this.c.get();
            heVar = this.d;
        }
        if (hhVar == null || heVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
            return false;
        }
        arn d = hhVar.d();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 85) {
            if (keyEvent.getRepeatCount() != 0) {
                a(hhVar, heVar);
            } else if (this.e) {
                heVar.removeMessages(1);
                this.e = false;
                PlaybackStateCompat c = hhVar.c();
                if (((c == null ? 0L : c.e) & 32) != 0) {
                    j();
                }
            } else {
                this.e = true;
                heVar.sendMessageDelayed(heVar.obtainMessage(1, d), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }
        a(hhVar, heVar);
        return false;
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }
}
