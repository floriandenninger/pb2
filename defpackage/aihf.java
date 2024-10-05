package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aihf implements amml {
    public final /* synthetic */ aihi a;
    public final /* synthetic */ aigd b;
    private final /* synthetic */ int c;

    public /* synthetic */ aihf(aihi aihiVar, aigd aigdVar, int i) {
        this.c = i;
        this.a = aihiVar;
        this.b = aigdVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            aihi aihiVar = this.a;
            aiip aiipVar = (aiip) obj;
            return aihiVar.a.i(aiipVar.a, aiipVar.c, aiipVar.d, this.b);
        }
        if (i == 1) {
            aihi aihiVar2 = this.a;
            aigd aigdVar = this.b;
            return aihiVar2.b.b((PlaybackStartDescriptor) obj, aigdVar);
        }
        if (i == 2) {
            aihi aihiVar3 = this.a;
            aiip aiipVar2 = (aiip) obj;
            return aihiVar3.a.i(aiipVar2.a, aiipVar2.c, aiipVar2.d, this.b);
        }
        aihi aihiVar4 = this.a;
        aiip aiipVar3 = (aiip) obj;
        return aihiVar4.a.i(aiipVar3.a, aiipVar3.c, aiipVar3.d, this.b);
    }
}
