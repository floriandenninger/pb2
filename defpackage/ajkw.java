package defpackage;

import android.media.MediaCodecList;
import com.google.android.youtube.R;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoderFactory;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajkw implements amnv {
    private final /* synthetic */ int e;
    public static final /* synthetic */ ajkw d = new ajkw(3);
    public static final /* synthetic */ ajkw c = new ajkw(2);
    public static final /* synthetic */ ajkw b = new ajkw(1);
    public static final /* synthetic */ ajkw a = new ajkw(0);

    private /* synthetic */ ajkw(int i) {
        this.e = i;
    }

    @Override // defpackage.amnv
    public final Object get() {
        int i = this.e;
        if (i == 0) {
            return cos.b(R.anim.fade_in_glide);
        }
        if (i == 1) {
            cos cosVar = new cos();
            cosVar.c(dcq.b);
            return cosVar;
        }
        if (i == 2) {
            return new MediaCodecList(1).getCodecInfos();
        }
        List list = InternalMediaCodecVideoEncoderFactory.a;
        return new MediaCodecList(1).getCodecInfos();
    }
}
