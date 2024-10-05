package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agqi implements Supplier {
    public final /* synthetic */ agqn a;
    public final /* synthetic */ aarn b;
    public final /* synthetic */ PlaybackStartDescriptor c;
    public final /* synthetic */ String d;
    public final /* synthetic */ aigd e;
    private final /* synthetic */ int f;

    public /* synthetic */ agqi(agqn agqnVar, aarn aarnVar, PlaybackStartDescriptor playbackStartDescriptor, String str, aigd aigdVar, int i) {
        this.f = i;
        this.a = agqnVar;
        this.b = aarnVar;
        this.c = playbackStartDescriptor;
        this.d = str;
        this.e = aigdVar;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.f != 0) {
            agqn agqnVar = this.a;
            return agqnVar.a.a(this.b, this.c, this.d, this.e);
        }
        agqn agqnVar2 = this.a;
        return agqnVar2.a.a(this.b, this.c, this.d, this.e);
    }
}
