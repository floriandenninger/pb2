package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iky implements ykl {
    final /* synthetic */ Optional a;
    final /* synthetic */ ilb b;

    public iky(ilb ilbVar, Optional optional) {
        this.b = ilbVar;
        this.a = optional;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.a.ifPresent(gfd.n);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ilb ilbVar = this.b;
        ilbVar.d.a(ilbVar.f, (Bitmap) obj2);
        if (this.a.isPresent()) {
            iha ihaVar = (iha) this.a.get();
            if (ihaVar.c.a.u != 2) {
                return;
            }
            ihaVar.a.g();
            ihaVar.c.j(ihaVar.b);
        }
    }
}
