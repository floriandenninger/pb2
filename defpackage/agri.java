package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface agri {
    WatchNextResponseModel a(WatchNextResponseModel watchNextResponseModel, Context context, agng agngVar, List list, int i, String str, byte[] bArr, aphg aphgVar);

    WatchNextResponseModel b(Context context, agnp agnpVar, String str, byte[] bArr);

    WatchNextResponseModel c(Context context, agng agngVar, List list, int i, String str, byte[] bArr, aphg aphgVar);

    WatchNextResponseModel g(WatchNextResponseModel watchNextResponseModel, Context context, agng agngVar, List list, int i, PlaybackStartDescriptor playbackStartDescriptor, aphg aphgVar);

    WatchNextResponseModel h(Context context, agnp agnpVar, PlaybackStartDescriptor playbackStartDescriptor);

    WatchNextResponseModel i(Context context, agng agngVar, List list, int i, PlaybackStartDescriptor playbackStartDescriptor, aphg aphgVar);

    void n();
}
