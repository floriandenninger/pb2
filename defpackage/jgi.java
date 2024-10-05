package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jgi implements ahxt {
    public final ahxr a;
    private Optional b = Optional.empty();

    public jgi(ahxr ahxrVar) {
        this.a = ahxrVar;
    }

    @Override // defpackage.ahxt
    public final void e(boolean z) {
    }

    @Override // defpackage.ahxt
    public final void g(boolean z) {
    }

    @Override // defpackage.ahxt
    public final void j(SubtitleTrack subtitleTrack) {
    }

    @Override // defpackage.ahxt
    public final void l(ahxs ahxsVar) {
        amkq.N(!this.b.isPresent());
        this.b = Optional.ofNullable(ahxsVar);
    }

    @Override // defpackage.ahxt
    public final void q(final List list) {
        this.b.ifPresent(new Consumer() { // from class: jgh
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                jgi.this.a.b(list, (ahxs) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }
}
