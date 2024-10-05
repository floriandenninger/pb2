package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axrn extends axrj {
    final /* synthetic */ axro d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axrn(axro axroVar, axrh axrhVar) {
        super(axrhVar, null, null, 0L);
        this.d = axroVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axrj
    public final void c(OutputStream outputStream) {
        axro axroVar = this.d;
        axroVar.a = outputStream;
        axroVar.c = 2;
        super.c(outputStream);
        axro axroVar2 = this.d;
        axroVar2.c = 3;
        axroVar2.c();
        this.d.e();
    }
}
