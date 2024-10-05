package defpackage;

import j$.util.Map;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aidl implements aesm {
    public volatile ajbv a;
    public final Map c = new HashMap();
    public volatile aidq d;

    public aidl(aypn aypnVar) {
        ayqw ayqwVar = new ayqw();
        final int i = 1;
        final int i2 = 0;
        ayqwVar.d(aypnVar.h(ahbw.e(1)).X(new ayrs(this) { // from class: aidj
            public final /* synthetic */ aidl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    aidl aidlVar = this.a;
                    ahel ahelVar = (ahel) obj;
                    aidlVar.a = ahelVar.a().q();
                    aidlVar.d = ahelVar.a().f();
                    aidlVar.c.clear();
                    return;
                }
                this.a.b((ahcl) obj);
            }
        }));
        ayqwVar.d(ahbw.c(aypnVar, aidf.d).X(new ayrs(this) { // from class: aidj
            public final /* synthetic */ aidl a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    aidl aidlVar = this.a;
                    ahel ahelVar = (ahel) obj;
                    aidlVar.a = ahelVar.a().q();
                    aidlVar.d = ahelVar.a().f();
                    aidlVar.c.clear();
                    return;
                }
                this.a.b((ahcl) obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7 A[Catch: all -> 0x0103, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0012, B:12:0x001a, B:17:0x0028, B:19:0x002e, B:23:0x0039, B:25:0x003d, B:28:0x0043, B:29:0x004d, B:31:0x0053, B:34:0x005f, B:36:0x0076, B:38:0x007c, B:40:0x0084, B:41:0x00b1, B:43:0x00b7, B:44:0x00bc, B:47:0x00ea, B:49:0x00f0, B:50:0x00f7, B:54:0x00c9, B:55:0x00d2, B:57:0x00d8, B:59:0x00e4, B:60:0x0087, B:62:0x008d, B:64:0x0095, B:65:0x0098, B:67:0x009e, B:69:0x00a4, B:71:0x00ac), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0 A[Catch: all -> 0x0103, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0012, B:12:0x001a, B:17:0x0028, B:19:0x002e, B:23:0x0039, B:25:0x003d, B:28:0x0043, B:29:0x004d, B:31:0x0053, B:34:0x005f, B:36:0x0076, B:38:0x007c, B:40:0x0084, B:41:0x00b1, B:43:0x00b7, B:44:0x00bc, B:47:0x00ea, B:49:0x00f0, B:50:0x00f7, B:54:0x00c9, B:55:0x00d2, B:57:0x00d8, B:59:0x00e4, B:60:0x0087, B:62:0x008d, B:64:0x0095, B:65:0x0098, B:67:0x009e, B:69:0x00a4, B:71:0x00ac), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9 A[Catch: all -> 0x0103, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0012, B:12:0x001a, B:17:0x0028, B:19:0x002e, B:23:0x0039, B:25:0x003d, B:28:0x0043, B:29:0x004d, B:31:0x0053, B:34:0x005f, B:36:0x0076, B:38:0x007c, B:40:0x0084, B:41:0x00b1, B:43:0x00b7, B:44:0x00bc, B:47:0x00ea, B:49:0x00f0, B:50:0x00f7, B:54:0x00c9, B:55:0x00d2, B:57:0x00d8, B:59:0x00e4, B:60:0x0087, B:62:0x008d, B:64:0x0095, B:65:0x0098, B:67:0x009e, B:69:0x00a4, B:71:0x00ac), top: B:2:0x0001 }] */
    @Override // defpackage.aesm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.net.Uri a(com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel r5, long r6, long r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aidl.a(com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel, long, long):android.net.Uri");
    }

    public final synchronized void b(ahcl ahclVar) {
        if (ahclVar == null) {
            return;
        }
        ahck e = ahclVar.e();
        String d = e != null ? e.a.d("Serialized-State") : null;
        if (d == null || ahclVar.b() <= 0) {
            return;
        }
        aknd akndVar = (aknd) Map.EL.computeIfAbsent(this.c, Long.valueOf(ahclVar.b()), aidk.a);
        if (ahclVar.h()) {
            akndVar.b = d;
        } else if (!ahclVar.g()) {
            akndVar.a = d;
        } else {
            akndVar.c = d;
        }
    }
}
