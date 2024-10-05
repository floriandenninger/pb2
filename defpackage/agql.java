package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agql implements amml {
    public final /* synthetic */ agqn a;
    public final /* synthetic */ aigd b;
    private final /* synthetic */ int c;

    public /* synthetic */ agql(agqn agqnVar, aigd aigdVar, int i) {
        this.c = i;
        this.a = agqnVar;
        this.b = aigdVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            return this.a.f((PlaybackStartDescriptor) obj, this.b);
        }
        if (i == 1) {
            agqn agqnVar = this.a;
            aigd aigdVar = this.b;
            return agqnVar.c.b((PlaybackStartDescriptor) obj, aigdVar);
        }
        if (i == 2) {
            agqn agqnVar2 = this.a;
            aiip aiipVar = (aiip) obj;
            return agqnVar2.b.i(aiipVar.a, aiipVar.c, aiipVar.d, this.b);
        }
        agqn agqnVar3 = this.a;
        aiip aiipVar2 = (aiip) obj;
        return agqnVar3.b.i(aiipVar2.a, aiipVar2.c, aiipVar2.d, this.b);
    }
}
