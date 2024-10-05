package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class otl {
    final /* synthetic */ otp a;

    public otl(otp otpVar) {
        this.a = otpVar;
    }

    public final void a(final PlaybackStartDescriptor playbackStartDescriptor) {
        this.a.u.execute(new Runnable() { // from class: otk
            @Override // java.lang.Runnable
            public final void run() {
                otl otlVar = otl.this;
                PlaybackStartDescriptor playbackStartDescriptor2 = playbackStartDescriptor;
                otp otpVar = otlVar.a;
                otpVar.k(playbackStartDescriptor2, otpVar.f);
            }
        });
    }
}
