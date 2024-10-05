package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aihi implements aihk, aihd {
    public final aihs a;
    public final aijg b;
    public final aijc c;
    private final zgj d;
    private final aihc e;
    private final aiir f;
    private final aaea g;
    private final Executor h;
    private final aifk i;

    public aihi(zgj zgjVar, aihs aihsVar, aijg aijgVar, aijc aijcVar, aihc aihcVar, aiir aiirVar, aaea aaeaVar, aifk aifkVar, Executor executor) {
        this.d = zgjVar;
        aihsVar.getClass();
        this.a = aihsVar;
        aijgVar.getClass();
        this.b = aijgVar;
        this.c = aijcVar;
        aihcVar.getClass();
        this.e = aihcVar;
        this.f = aiirVar;
        aaeaVar.getClass();
        this.g = aaeaVar;
        this.h = executor;
        aifkVar.getClass();
        this.i = aifkVar;
    }

    @Override // defpackage.aihk
    public final Pair a(PlaybackStartDescriptor playbackStartDescriptor, String str, aigd aigdVar, boolean z) {
        aigd aigdVar2;
        PlaybackStartDescriptor playbackStartDescriptor2;
        aiiq a;
        anhy b;
        aypy a2;
        if (!this.i.n(playbackStartDescriptor) || this.a.f(playbackStartDescriptor)) {
            aigdVar2 = aigdVar;
            playbackStartDescriptor2 = playbackStartDescriptor;
            a = aiir.a(playbackStartDescriptor, aigdVar, this.g, str, new aihf(this, aigdVar2, 3), new aihf(this, aigdVar2, 1), z, this.h);
        } else {
            aarn b2 = this.c.b(playbackStartDescriptor, str, aigdVar);
            aiir aiirVar = this.f;
            if (this.i.o()) {
                a2 = (aypy) this.e.a(b2.l(), new aihh(this, b2, playbackStartDescriptor, str, aigdVar, 0));
            } else {
                a2 = this.c.a(b2, playbackStartDescriptor, str, aigdVar);
            }
            aigdVar2 = aigdVar;
            playbackStartDescriptor2 = playbackStartDescriptor;
            a = aiirVar.b(playbackStartDescriptor, aigdVar, str, a2, new aihf(this, aigdVar, 2), new amml() { // from class: aihe
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    return aihi.this.d((PlaybackStartDescriptor) obj);
                }
            }, z);
        }
        anhy b3 = a.b();
        if (a.a().h()) {
            b = (anhy) a.a().c();
        } else {
            b = this.b.b(playbackStartDescriptor2, aigdVar2);
        }
        return Pair.create(b3, b);
    }

    @Override // defpackage.aihk
    public final anhy b(String str, String str2, PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar, boolean z) {
        aaea aaeaVar = this.g;
        aihf aihfVar = new aihf(this, aigdVar, 0);
        final aijg aijgVar = this.b;
        return aiir.a(playbackStartDescriptor, aigdVar, aaeaVar, str2, aihfVar, new amml() { // from class: aihg
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                return aijg.this.a((PlaybackStartDescriptor) obj);
            }
        }, z, this.h).b();
    }

    @Override // defpackage.aihk
    public final anhy c(PlaybackStartDescriptor playbackStartDescriptor, String str, int i, aigd aigdVar) {
        this.a.d(playbackStartDescriptor, i);
        return this.a.b(playbackStartDescriptor, str, i, null, true, aigdVar);
    }

    @Override // defpackage.aihk
    public final anhy d(PlaybackStartDescriptor playbackStartDescriptor) {
        return this.b.a(playbackStartDescriptor);
    }

    @Override // defpackage.aihd
    public final void g(PlaybackStartDescriptor playbackStartDescriptor, String str, Executor executor, aigd aigdVar) {
        if (this.i.n(playbackStartDescriptor)) {
            if (this.i.o()) {
                String h = playbackStartDescriptor.h(this.d);
                aarn b = this.c.b(playbackStartDescriptor, h, aigdVar);
                this.e.b(b.l(), new aihh(this, b, playbackStartDescriptor, h, aigdVar, 1), executor);
                return;
            }
            return;
        }
        this.a.e(playbackStartDescriptor, str, executor, aigdVar);
    }
}
