package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpa extends ammk {
    @Override // defpackage.ammk
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        axbw axbwVar = (axbw) obj;
        avww avwwVar = avww.COMMENT_STICKER_SOURCE_UNKNOWN;
        int ordinal = axbwVar.ordinal();
        if (ordinal == 0) {
            return avww.COMMENT_STICKER_SOURCE_UNKNOWN;
        }
        if (ordinal == 1) {
            return avww.COMMENT_STICKER_SOURCE_STORY_COMMENTS;
        }
        if (ordinal == 2) {
            return avww.COMMENT_STICKER_SOURCE_VOD_COMMENTS;
        }
        if (ordinal == 3) {
            return avww.COMMENT_STICKER_SOURCE_STORY_CAMERA;
        }
        String valueOf = String.valueOf(axbwVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown enum value: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.ammk
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        avww avwwVar = (avww) obj;
        axbw axbwVar = axbw.COMMENT_STICKER_SOURCE_UNKNOWN;
        int ordinal = avwwVar.ordinal();
        if (ordinal == 0) {
            return axbw.COMMENT_STICKER_SOURCE_UNKNOWN;
        }
        if (ordinal == 1) {
            return axbw.COMMENT_STICKER_SOURCE_STORY_COMMENTS;
        }
        if (ordinal == 2) {
            return axbw.COMMENT_STICKER_SOURCE_VOD_COMMENTS;
        }
        if (ordinal == 3) {
            return axbw.COMMENT_STICKER_SOURCE_STORY_CAMERA;
        }
        String valueOf = String.valueOf(avwwVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown enum value: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
