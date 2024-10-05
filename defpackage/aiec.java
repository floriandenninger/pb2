package defpackage;

import android.graphics.BitmapRegionDecoder;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiec implements ykl {
    final /* synthetic */ aiee a;

    public aiec(aiee aieeVar) {
        this.a = aieeVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        acsx acsxVar = this.a.l;
        if (acsxVar != null) {
            acsxVar.c("thsb0_ne");
            this.a.l = null;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("Failed to load video storyboard mosaic at: ");
        sb.append(valueOf);
        zga.n(sb.toString(), exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        byte[] bArr = (byte[]) obj2;
        try {
            acsx acsxVar = this.a.l;
            if (acsxVar != null) {
                acsxVar.c("thsb0_nr");
            }
            this.a.b.put(uri, BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, true));
        } catch (IOException unused) {
        }
    }
}
