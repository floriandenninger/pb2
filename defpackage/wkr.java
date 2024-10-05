package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkr implements aaha {
    private final aaxn a;

    public wkr(aaxn aaxnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        aaxnVar.getClass();
        this.a = aaxnVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aaxn aaxnVar = this.a;
        aatq aatqVar = new aatq(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        aatp aatpVar = (aatp) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", aatp.class);
        aatqVar.a = Long.valueOf(((Long) yjj.u(map, "KEY_IDV_REQUEST_ID", Long.class)).longValue());
        aatqVar.b = (String) yjj.u(map, "KEY_VERIFICATION_CODE", String.class);
        aatqVar.c = (String) yjj.u(map, "KEY_PARAMS", String.class);
        this.a.b.e(aatqVar, new aato(aatpVar));
    }
}
