package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ffv extends ajjj {
    public ffv(Context context) {
        super(context);
    }

    @Override // defpackage.ajjj
    /* renamed from: a */
    public final Drawable b(byte[] bArr) {
        int length = bArr.length;
        if ((length >= 21 && bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80 && bArr[12] == 86 && bArr[13] == 80 && bArr[14] == 56 && bArr[15] == 88 && (bArr[20] & 2) != 0) || (length >= 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70)) {
            FrameSequence frameSequence = null;
            try {
                frameSequence = FrameSequence.decodeByteArray(bArr);
            } catch (IllegalArgumentException e) {
                e = e;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Error decoding GIF or WebP. ");
                sb.append(valueOf);
                zga.b(sb.toString());
            } catch (IllegalStateException e2) {
                e = e2;
                String valueOf2 = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                sb2.append("Error decoding GIF or WebP. ");
                sb2.append(valueOf2);
                zga.b(sb2.toString());
            } catch (UnsatisfiedLinkError unused) {
                zga.b("Error loading rastermill native library.");
            }
            if (frameSequence != null) {
                FrameSequenceDrawable frameSequenceDrawable = new FrameSequenceDrawable(frameSequence);
                frameSequenceDrawable.setLoopBehavior(2);
                return frameSequenceDrawable;
            }
        }
        return c(bArr);
    }

    @Override // defpackage.ajjj, defpackage.afri
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return b((byte[]) obj);
    }
}
