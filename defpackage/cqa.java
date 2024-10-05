package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqa implements cqh {
    final /* synthetic */ InputStream a;

    public cqa(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.cqh
    public final ImageHeaderParser$ImageType a(cpz cpzVar) {
        try {
            return cpzVar.c(this.a);
        } finally {
            this.a.reset();
        }
    }
}
