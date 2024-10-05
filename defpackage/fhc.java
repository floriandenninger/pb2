package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fhc {
    public avgg a;
    private WatchDescriptor b;
    private WeakReference c;
    private Integer d;
    private Boolean e;
    private Boolean f;
    private Boolean g;

    public final fhd a() {
        WeakReference weakReference;
        Integer num;
        WatchDescriptor watchDescriptor = this.b;
        if (watchDescriptor == null || (weakReference = this.c) == null || (num = this.d) == null || this.e == null || this.f == null || this.g == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" watchDescriptor");
            }
            if (this.c == null) {
                sb.append(" sourceViewWeakReference");
            }
            if (this.d == null) {
                sb.append(" playbackStartFlag");
            }
            if (this.e == null) {
                sb.append(" shouldStartWatchShuffled");
            }
            if (this.f == null) {
                sb.append(" overrideExitFullscreenToMaximized");
            }
            if (this.g == null) {
                sb.append(" persistCurrentPlayerViewMode");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        fhd fhdVar = new fhd(watchDescriptor, weakReference, this.a, num.intValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue());
        fhdVar.a.getClass();
        return fhdVar;
    }

    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void e(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void f(WatchDescriptor watchDescriptor) {
        if (watchDescriptor == null) {
            throw new NullPointerException("Null watchDescriptor");
        }
        this.b = watchDescriptor;
    }

    public final void g(View view) {
        this.c = new WeakReference(view);
    }
}
