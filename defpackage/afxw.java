package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afxw {
    public final ylf a;
    public final ajoy b;
    private final agcm c;
    private final axzf d;

    public afxw(ajoy ajoyVar, axzf axzfVar, ylf ylfVar, agcm agcmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = ajoyVar;
        this.d = axzfVar;
        this.a = ylfVar;
        this.c = agcmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final aooy aooyVar) {
        Boolean bool;
        aqvj aqvjVar = this.d.a.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45352805L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352805L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352805L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            agcm agcmVar = this.c;
            final String q = yjk.q();
            ynm.j(anfq.h(anfq.h(anfq.h(agcmVar.a.b(new amml() { // from class: agck
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    String str = q;
                    aooy aooyVar2 = aooyVar;
                    basi basiVar = (basi) obj;
                    if (basiVar.b.size() > 100) {
                        throw new IllegalStateException("Too many payloads");
                    }
                    aone builder = basiVar.toBuilder();
                    aomf byteString = aooyVar2.toByteString();
                    str.getClass();
                    byteString.getClass();
                    builder.copyOnWrite();
                    ((basi) builder.instance).a().put(str, byteString);
                    return (basi) builder.build();
                }
            }, angq.a), new wgs(q, 19), angq.a), new afxv(aooyVar, 0), angq.a), new amml() { // from class: afxu
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    afxw.this.a.e("notification_processing", 0L, false, 0, (Bundle) obj, null, false);
                    return true;
                }
            }, angq.a), angq.a, new ynk() { // from class: afxt
                @Override // defpackage.zfi
                /* renamed from: b */
                public final void a(Throwable th) {
                    afxw afxwVar = afxw.this;
                    aooy aooyVar2 = aooyVar;
                    afsi.c(2, 7, "Scheduling notification processing failed", th);
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("com.google.android.libraries.youtube.notification.pref.notification_renderer", aooyVar2.toByteArray());
                    bundle.putString("renderer_class_name", aooyVar2.getClass().getName());
                    afxwVar.b.v("notification_processing", bundle);
                }
            });
        } else {
            Bundle bundle = new Bundle();
            bundle.putByteArray("com.google.android.libraries.youtube.notification.pref.notification_renderer", aooyVar.toByteArray());
            bundle.putString("renderer_class_name", aooyVar.getClass().getName());
            this.b.v("notification_processing", bundle);
        }
    }
}
