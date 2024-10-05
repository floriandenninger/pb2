package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.sequencer.state.SequencerState;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fla implements aiml, aihl {
    public final Set a;
    public fkw b = fkw.WATCH_WHILE;
    private final axpg c;
    private final Map d;
    private final Map e;
    private final boolean f;

    public fla(axpg axpgVar, azrw azrwVar, azrw azrwVar2, axpg axpgVar2, axpg axpgVar3, aadw aadwVar) {
        this.c = axpgVar;
        amrw h = amrz.h();
        h.g(fkw.WATCH_WHILE, azrwVar);
        h.g(fkw.REEL, azrwVar2);
        this.d = h.c();
        amrw h2 = amrz.h();
        h2.g(fkw.WATCH_WHILE, axpgVar2);
        h2.g(fkw.REEL, axpgVar3);
        this.e = h2.c();
        this.a = Collections.newSetFromMap(new WeakHashMap());
        aujl aujlVar = aadwVar.b().E;
        this.f = (aujlVar == null ? aujl.a : aujlVar).d;
        asvu asvuVar = aadwVar.b().e;
        if ((asvuVar == null ? asvu.a : asvuVar).ce) {
            return;
        }
        axpgVar2.get();
        axpgVar3.get();
    }

    @Override // defpackage.aihl
    public final aihk a(final PlaybackStartDescriptor playbackStartDescriptor) {
        return (aihk) Optional.ofNullable((axpg) this.e.get(this.b)).map(new Function() { // from class: fkx
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return ((aihl) ((axpg) obj).get()).a(PlaybackStartDescriptor.this);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).orElse(null);
    }

    @Override // defpackage.aiml
    public final aimk b(PlaybackStartDescriptor playbackStartDescriptor) {
        aiml aimlVar = (aiml) Optional.ofNullable((azrw) this.d.get(this.b)).map(evy.e).orElse(null);
        aimlVar.getClass();
        return aimlVar.b(playbackStartDescriptor);
    }

    @Override // defpackage.aiml
    public final aimk c(final SequencerState sequencerState) {
        return (aimk) Optional.ofNullable((azrw) this.d.get(this.b)).map(evy.e).map(new Function() { // from class: fky
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                return ((aiml) obj).c(SequencerState.this);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).orElse(null);
    }

    public final void d(fkz fkzVar) {
        this.a.add(fkzVar);
    }

    public final void e(fkw fkwVar) {
        if (this.b == fkwVar) {
            return;
        }
        this.b = fkwVar;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fkz) it.next()).k(fkwVar);
        }
        if (this.f) {
            return;
        }
        ((ainy) this.c.get()).s();
    }

    @Override // defpackage.aiml
    public final boolean f(PlaybackStartDescriptor playbackStartDescriptor, aimk aimkVar) {
        aiml aimlVar = (aiml) Optional.ofNullable((azrw) this.d.get(this.b)).map(evy.e).orElse(null);
        aimlVar.getClass();
        return aimlVar.f(playbackStartDescriptor, aimkVar);
    }
}
