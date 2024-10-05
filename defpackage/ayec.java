package defpackage;

import android.os.Parcel;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayec extends ayef {
    public final boolean a;
    private Status h;
    private aycd i;

    public ayec(aydz aydzVar, axzj axzjVar, int i, boolean z) {
        super(aydzVar, axzjVar, i);
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ayod, aygf] */
    @Override // defpackage.ayef
    protected final void a(Status status) {
        this.g.a(status, ayge.PROCESSED, new aycd());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ayod, aygf] */
    @Override // defpackage.ayef
    protected final void b() {
        this.f.b(this.i);
        this.f.l(this.h);
        l(ayed.CLOSED);
        this.g.a(this.h, ayge.PROCESSED, this.i);
        n();
    }

    @Override // defpackage.ayef
    public final void c(int i, Parcel parcel) {
        this.h = ayep.a(i, parcel);
        this.i = ayep.f(parcel, this.c);
    }

    @Override // defpackage.ayef
    public final boolean d() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ayod, aygf] */
    @Override // defpackage.ayef
    public final void e(Parcel parcel) {
        aycd f = ayep.f(parcel, this.c);
        this.f.a();
        this.g.c(f);
    }
}
