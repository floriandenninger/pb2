package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ffu implements aioa, akrj {
    public String a;
    public String b;

    @Override // defpackage.akrj
    public final void a(String str, Bundle bundle) {
        if (str == null || !str.equals("yt_android_watch")) {
            return;
        }
        bundle.putString("CPN", this.a);
        bundle.putString("video_id", this.b);
    }

    @Override // defpackage.akrj
    public final void b(Bundle bundle) {
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.G().b.Y(new ayrs(this) { // from class: fft
            public final /* synthetic */ ffu a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                String str;
                if (i != 0) {
                    ffu ffuVar = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar != null) {
                        ffuVar.a = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        ffuVar.b = b != null ? b.y() : null;
                        return;
                    }
                    return;
                }
                ffu ffuVar2 = this.a;
                aigr aigrVar = (aigr) obj;
                if (aigrVar == null || (str = aigrVar.g) == null) {
                    return;
                }
                ffuVar2.a = aigrVar.b;
                ffuVar2.b = str;
            }
        }, eoo.i), aiocVar.G().h.Y(new ayrs(this) { // from class: fft
            public final /* synthetic */ ffu a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                String str;
                if (i2 != 0) {
                    ffu ffuVar = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar != null) {
                        ffuVar.a = ahefVar.e();
                        PlayerResponseModel b = ahefVar.b();
                        ffuVar.b = b != null ? b.y() : null;
                        return;
                    }
                    return;
                }
                ffu ffuVar2 = this.a;
                aigr aigrVar = (aigr) obj;
                if (aigrVar == null || (str = aigrVar.g) == null) {
                    return;
                }
                ffuVar2.a = aigrVar.b;
                ffuVar2.b = str;
            }
        }, eoo.i)};
    }
}
