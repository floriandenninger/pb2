package defpackage;

import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rha implements Runnable {
    final /* synthetic */ EventParcel a;
    final /* synthetic */ String b;
    final /* synthetic */ rff c;

    public rha(rff rffVar, EventParcel eventParcel, String str) {
        this.c = rffVar;
        this.a = eventParcel;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.w();
        this.c.a.B(this.a, this.b);
    }
}
