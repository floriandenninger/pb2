package defpackage;

import java.nio.channels.WritableByteChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axlm implements axlb {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ axlo c;

    public axlm(axlo axloVar, long j, long j2) {
        this.c = axloVar;
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.axlb
    public final long a() {
        return this.b;
    }

    @Override // defpackage.axlb
    public final void b(WritableByteChannel writableByteChannel) {
        this.c.m.d(this.a, this.b, writableByteChannel);
    }
}
