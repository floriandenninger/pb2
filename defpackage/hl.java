package defpackage;

import android.content.Context;
import android.media.session.MediaSession;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hl extends hk {
    public hl(Context context, String str) {
        super(context, str);
    }

    @Override // defpackage.hi
    public final MediaSession s(Context context, String str) {
        return new MediaSession(context, str, null);
    }
}
