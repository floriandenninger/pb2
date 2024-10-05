package defpackage;

import com.google.android.libraries.youtube.player.model.WatchDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oob implements nnh {
    final /* synthetic */ ooc a;

    public oob(ooc oocVar) {
        this.a = oocVar;
    }

    @Override // defpackage.nnh
    public final void aK(fhd fhdVar) {
        WatchDescriptor watchDescriptor = fhdVar.a;
        this.a.b.p = watchDescriptor.g();
        this.a.b.p = watchDescriptor.g();
    }

    @Override // defpackage.nnh
    public final void aM() {
        if (!this.a.t.f()) {
            this.a.j.f(new fem());
        }
        this.a.E.b();
    }
}
