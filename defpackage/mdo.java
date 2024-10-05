package defpackage;

import android.view.View;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mdo implements Callable {
    public final /* synthetic */ ayqi a;
    public final /* synthetic */ View b;
    public final /* synthetic */ axzg c;
    private final /* synthetic */ int d;

    public /* synthetic */ mdo(axzg axzgVar, ayqi ayqiVar, View view, int i, byte[] bArr) {
        this.d = i;
        this.c = axzgVar;
        this.a = ayqiVar;
        this.b = view;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.d == 0) {
            axzg axzgVar = this.c;
            return axzgVar.l().ab(this.a).ax(new mbg(this.b, 2));
        }
        axzg axzgVar2 = this.c;
        return axzgVar2.l().ab(this.a).ax(new mbg(this.b, 0));
    }
}
