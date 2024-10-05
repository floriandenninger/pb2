package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acfk {
    public boolean a;
    public boolean b;
    public boolean d;
    public boolean f;
    private final LiveCreationActivity h;
    private boolean i;
    public int c = 0;
    protected final Runnable g = new acfj(this);
    public int e = 1;

    public acfk(LiveCreationActivity liveCreationActivity) {
        this.h = liveCreationActivity;
    }

    public final void a() {
        d(1);
    }

    public final void b(Bundle bundle) {
        this.e = bundle.getInt("stream_control_state");
        this.a = bundle.getBoolean("enablement_complete");
        this.b = bundle.getBoolean("thumbnail_chosen");
        this.d = bundle.getBoolean("live_stream_complete");
        this.f = false;
    }

    public final void c() {
        this.i = true;
        this.h.f.post(this.g);
    }

    final void d(int i) {
        this.e = i;
        c();
    }

    public final void e() {
        this.a = true;
        g();
    }

    public final void f() {
        this.d = true;
        g();
    }

    public final void g() {
        int i = this.e;
        if (i == 1) {
            int i2 = this.c;
            if (i2 == 4 || i2 == 5) {
                d(5);
                return;
            } else {
                if (this.a) {
                    d(2);
                    return;
                }
                return;
            }
        }
        if (i == 2) {
            if (TextUtils.isEmpty(this.h.C.c) || !this.b) {
                return;
            }
            d(3);
            return;
        }
        if (i != 3) {
            return;
        }
        if (this.d) {
            d(5);
        } else if (this.i) {
            this.h.aB();
            this.i = false;
        }
    }
}
