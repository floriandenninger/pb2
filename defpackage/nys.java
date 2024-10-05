package defpackage;

import android.os.Build;
import android.os.Bundle;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface nys {
    public static final boolean c;

    static {
        c = Build.VERSION.SDK_INT < 24;
    }

    void b();

    void c();

    void e(Bundle bundle);

    void f(PlaybackStartDescriptor playbackStartDescriptor, boolean z);

    void g(Bundle bundle);

    void h(boolean z);

    void i(boolean z);

    void m(kcy kcyVar);
}
