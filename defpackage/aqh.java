package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqh implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ aqi b;

    public aqh(aqi aqiVar, Object obj) {
        this.b = aqiVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqi aqiVar = this.b;
        Object obj = this.a;
        if (aqiVar.f()) {
            aqiVar.c();
        } else {
            aqiVar.b(obj);
        }
        aqiVar.f = 3;
    }
}
