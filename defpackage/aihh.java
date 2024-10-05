package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aihh implements Supplier {
    public final /* synthetic */ aihi a;
    public final /* synthetic */ aarn b;
    public final /* synthetic */ PlaybackStartDescriptor c;
    public final /* synthetic */ String d;
    public final /* synthetic */ aigd e;
    private final /* synthetic */ int f;

    public /* synthetic */ aihh(aihi aihiVar, aarn aarnVar, PlaybackStartDescriptor playbackStartDescriptor, String str, aigd aigdVar, int i) {
        this.f = i;
        this.a = aihiVar;
        this.b = aarnVar;
        this.c = playbackStartDescriptor;
        this.d = str;
        this.e = aigdVar;
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        if (this.f != 0) {
            aihi aihiVar = this.a;
            return aihiVar.c.a(this.b, this.c, this.d, this.e);
        }
        aihi aihiVar2 = this.a;
        return aihiVar2.c.a(this.b, this.c, this.d, this.e);
    }
}
