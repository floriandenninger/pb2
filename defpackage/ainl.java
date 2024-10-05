package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ainl extends ajar, ahbd, aivk {
    void a(aims aimsVar);

    boolean b();

    @Override // defpackage.ajar
    void d(PlaybackStartDescriptor playbackStartDescriptor);

    void e(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar);

    void f(PlaybackServiceState playbackServiceState);

    void g(PlaybackServiceState playbackServiceState, aigd aigdVar);

    void h(int i);

    void i(boolean z);

    boolean j(aims aimsVar);

    void k(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, PlayerResponseModel playerResponseModel);
}
