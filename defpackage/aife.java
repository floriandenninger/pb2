package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aife {
    public final zgj a;
    public final aipn b;
    public final aiih c;
    public String d = null;
    public final aimx e;

    public aife(zgj zgjVar, aipn aipnVar, aypn aypnVar, aypn aypnVar2, aiih aiihVar, aimx aimxVar) {
        this.a = zgjVar;
        this.b = aipnVar;
        this.c = aiihVar;
        this.e = aimxVar;
        final int i = 1;
        aypnVar.X(new ayrs(this) { // from class: aifc
            public final /* synthetic */ aife a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    aife aifeVar = this.a;
                    ahen ahenVar = (ahen) obj;
                    String str = aifeVar.d;
                    if (str == null || !TextUtils.equals(str, ahenVar.b())) {
                        return;
                    }
                    aifeVar.d = null;
                    return;
                }
                aife aifeVar2 = this.a;
                ahel ahelVar = (ahel) obj;
                ahelVar.a();
                String str2 = aifeVar2.d;
                if (str2 == null || !str2.equals(ahelVar.a().Z())) {
                    return;
                }
                PlaybackStartDescriptor g = ahelVar.a().g();
                aiih aiihVar2 = aifeVar2.c;
                PlayerResponseModel c = ahelVar.a().c();
                aiihVar2.l(aigk.VIDEO_LOADING);
                aiihVar2.o = g;
                aiihVar2.n = null;
                aiihVar2.q = null;
                aiihVar2.p = c;
                aiihVar2.l(aigk.VIDEO_PLAYBACK_LOADED);
                aifeVar2.c.t(ahelVar.a().Z(), new aifd(aifeVar2));
                aifeVar2.d = null;
            }
        });
        final int i2 = 0;
        aypnVar2.X(new ayrs(this) { // from class: aifc
            public final /* synthetic */ aife a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    aife aifeVar = this.a;
                    ahen ahenVar = (ahen) obj;
                    String str = aifeVar.d;
                    if (str == null || !TextUtils.equals(str, ahenVar.b())) {
                        return;
                    }
                    aifeVar.d = null;
                    return;
                }
                aife aifeVar2 = this.a;
                ahel ahelVar = (ahel) obj;
                ahelVar.a();
                String str2 = aifeVar2.d;
                if (str2 == null || !str2.equals(ahelVar.a().Z())) {
                    return;
                }
                PlaybackStartDescriptor g = ahelVar.a().g();
                aiih aiihVar2 = aifeVar2.c;
                PlayerResponseModel c = ahelVar.a().c();
                aiihVar2.l(aigk.VIDEO_LOADING);
                aiihVar2.o = g;
                aiihVar2.n = null;
                aiihVar2.q = null;
                aiihVar2.p = c;
                aiihVar2.l(aigk.VIDEO_PLAYBACK_LOADED);
                aifeVar2.c.t(ahelVar.a().Z(), new aifd(aifeVar2));
                aifeVar2.d = null;
            }
        });
    }
}
