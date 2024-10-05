package defpackage;

import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ira implements zfi {
    public final /* synthetic */ UploadActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ ira(UploadActivity uploadActivity, int i) {
        this.b = i;
        this.a = uploadActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zfi
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.E((astx) obj);
            return;
        }
        if (i == 1) {
            UploadActivity uploadActivity = this.a;
            String b = uploadActivity.k.c().b();
            alas alasVar = alas.a;
            aoot aootVar = ((alau) obj).b;
            if (aootVar.containsKey(b)) {
                alasVar = (alas) aootVar.get(b);
            }
            uploadActivity.ae = alasVar.c;
            int i2 = alasVar.b;
            if ((i2 & 2) != 0) {
                uploadActivity.ah = alasVar.d;
            }
            if ((i2 & 4) != 0) {
                alar alarVar = alasVar.e;
                if (alarVar == null) {
                    alarVar = alar.a;
                }
                uploadActivity.ag = ammv.j(alarVar);
                return;
            }
            return;
        }
        UploadActivity uploadActivity2 = this.a;
        zga.d("Error getting location.", (Throwable) obj);
        uploadActivity2.E(null);
    }
}
