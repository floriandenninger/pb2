package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahr implements Runnable {
    final /* synthetic */ ahu a;
    final /* synthetic */ Object b;

    public ahr(ahu ahuVar, Object obj) {
        this.a = ahuVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a = this.b;
    }
}
