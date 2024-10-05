package defpackage;

import android.media.VolumeProvider;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arr {
    public static void a(VolumeProvider volumeProvider, int i) {
        volumeProvider.setCurrentVolume(i);
    }

    public static void b(View view, apu apuVar) {
        view.setTag(R.id.view_tree_view_model_store_owner, apuVar);
    }
}
