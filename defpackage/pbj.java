package defpackage;

import android.media.MediaCrypto;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pbj {
    public final MediaCrypto a;

    public pbj(MediaCrypto mediaCrypto) {
        this.a = mediaCrypto;
    }

    public final boolean a(String str) {
        return this.a.requiresSecureDecoderComponent(str);
    }
}
