package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqc implements cqh {
    final /* synthetic */ crk a;
    final /* synthetic */ ctk b;

    public cqc(crk crkVar, ctk ctkVar) {
        this.a = crkVar;
        this.b = ctkVar;
    }

    @Override // defpackage.cqh
    public final ImageHeaderParser$ImageType a(cpz cpzVar) {
        cym cymVar;
        try {
            cymVar = new cym(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                ImageHeaderParser$ImageType c = cpzVar.c(cymVar);
                try {
                    cymVar.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return c;
            } catch (Throwable th) {
                th = th;
                if (cymVar != null) {
                    try {
                        cymVar.close();
                    } catch (IOException unused2) {
                    }
                }
                this.a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cymVar = null;
        }
    }
}
