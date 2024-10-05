package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abrj implements Runnable {
    final /* synthetic */ Callable a;
    final /* synthetic */ abrn b;
    private final /* synthetic */ int c;

    public abrj(abrn abrnVar, Callable callable, int i) {
        this.c = i;
        this.b = abrnVar;
        this.a = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            abrm abrmVar = this.b.b;
            Callable callable = this.a;
            try {
                synchronized (abrmVar) {
                    abrmVar.f.add(((abrg) callable).a);
                }
                return;
            } catch (Exception e) {
                abrmVar.a(e);
                return;
            }
        }
        abrm abrmVar2 = this.b.b;
        Callable callable2 = this.a;
        try {
            synchronized (abrmVar2) {
                abrmVar2.e = ((abrh) callable2).a;
            }
        } catch (Exception e2) {
            abrmVar2.a(e2);
        }
    }
}
