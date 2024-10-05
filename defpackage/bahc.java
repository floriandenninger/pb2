package defpackage;

import java.nio.channels.Channels;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bahc implements bahy {
    final /* synthetic */ bahe a;

    public bahc(bahe baheVar) {
        this.a = baheVar;
    }

    @Override // defpackage.bahy
    public final void a() {
        bahe baheVar = this.a;
        if (baheVar.g == null) {
            baheVar.i.l = 10;
            baheVar.f.setDoOutput(true);
            baheVar.f.connect();
            baheVar.i.l = 12;
            baheVar.h = baheVar.f.getOutputStream();
            baheVar.g = Channels.newChannel(baheVar.h);
        }
        this.a.a.set(0);
        this.a.a(new bahb(this));
    }
}
