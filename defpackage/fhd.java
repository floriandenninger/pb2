package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fhd {
    public final WatchDescriptor a;
    public final avgg b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final WeakReference g;

    public fhd() {
    }

    public fhd(WatchDescriptor watchDescriptor, WeakReference weakReference, avgg avggVar, int i, boolean z, boolean z2, boolean z3) {
        this.a = watchDescriptor;
        this.g = weakReference;
        this.b = avggVar;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static fhc b() {
        fhc fhcVar = new fhc();
        fhcVar.a = avgg.a;
        fhcVar.c(false);
        fhcVar.e(false);
        fhcVar.d(0);
        fhcVar.b(false);
        fhcVar.g(null);
        return fhcVar;
    }

    public final View a() {
        return (View) this.g.get();
    }

    public final boolean equals(Object obj) {
        avgg avggVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof fhd) {
            fhd fhdVar = (fhd) obj;
            if (this.a.equals(fhdVar.a) && this.g.equals(fhdVar.g) && ((avggVar = this.b) != null ? avggVar.equals(fhdVar.b) : fhdVar.b == null) && this.c == fhdVar.c && this.d == fhdVar.d && this.e == fhdVar.e && this.f == fhdVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.g.hashCode()) * 1000003;
        avgg avggVar = this.b;
        return ((((((((hashCode ^ (avggVar == null ? 0 : avggVar.hashCode())) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.b);
        int i = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 221 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("AppWatchDescriptor{watchDescriptor=");
        sb.append(valueOf);
        sb.append(", sourceViewWeakReference=");
        sb.append(valueOf2);
        sb.append(", thumbnailDetails=");
        sb.append(valueOf3);
        sb.append(", playbackStartFlag=");
        sb.append(i);
        sb.append(", shouldStartWatchShuffled=");
        sb.append(z);
        sb.append(", overrideExitFullscreenToMaximized=");
        sb.append(z2);
        sb.append(", persistCurrentPlayerViewMode=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
