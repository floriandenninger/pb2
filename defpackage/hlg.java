package defpackage;

import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hlg implements zwl {
    final /* synthetic */ hli a;

    public hlg(hli hliVar) {
        this.a = hliVar;
    }

    @Override // defpackage.zwl
    public final void a() {
    }

    @Override // defpackage.zwl
    public final void b(zwo zwoVar, int i) {
        Object x = zwoVar.x(i);
        hlh hlhVar = this.a.d;
        if (hlhVar == null || x == null) {
            return;
        }
        hlhVar.g((DeviceLocalFile) x);
    }
}
