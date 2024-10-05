package defpackage;

import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqf implements cqg {
    final /* synthetic */ crk a;
    final /* synthetic */ ctk b;

    public cqf(crk crkVar, ctk ctkVar) {
        this.a = crkVar;
        this.b = ctkVar;
    }

    @Override // defpackage.cqg
    public final int a(cpz cpzVar) {
        cym cymVar;
        try {
            cymVar = new cym(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                int a = cpzVar.a(cymVar, this.b);
                try {
                    cymVar.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return a;
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
