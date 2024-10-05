package defpackage;

import android.graphics.ImageDecoder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxa implements cqp {
    final cyd a;
    private final ctm b;

    public cxa() {
        this.a = cyd.a();
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        return true;
    }

    @Override // defpackage.cqp
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ctd a(ImageDecoder.Source source, int i, int i2, cqn cqnVar) {
        return new cxg(ImageDecoder.decodeBitmap(source, new cwz(this, i, i2, cqnVar.b(cxx.d) != null && ((Boolean) cqnVar.b(cxx.d)).booleanValue(), (cpw) cqnVar.b(cxx.a), (cxu) cqnVar.b(cxu.f), (cqo) cqnVar.b(cxx.b))), this.b);
    }

    public cxa(byte[] bArr) {
        this.a = cyd.a();
        this.b = new ctn();
    }
}
