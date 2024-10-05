package defpackage;

import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zwe implements zwl {
    final /* synthetic */ zwh a;

    public zwe(zwh zwhVar) {
        this.a = zwhVar;
    }

    @Override // defpackage.zwl
    public final void a() {
    }

    @Override // defpackage.zwl
    public final void b(zwo zwoVar, int i) {
        Object x = zwoVar.x(i);
        zwg zwgVar = this.a.ae;
        if (zwgVar == null || x == null) {
            return;
        }
        zwgVar.aL((DeviceLocalFile) x);
    }
}
