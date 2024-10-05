package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum avuu implements aonq {
    USER_MENTION_AUTO_COMPLETE_SOURCE_UNKNOWN(0),
    USER_MENTION_AUTO_COMPLETE_SOURCE_BACKSTAGE_POST(1),
    USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_MENTION_STICKER(2),
    USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER(3),
    USER_MENTION_AUTO_COMPLETE_SOURCE_STUDIO(4);

    public final int f;

    avuu(int i) {
        this.f = i;
    }

    public static aons a() {
        return avts.g;
    }

    public static avuu b(int i) {
        if (i == 0) {
            return USER_MENTION_AUTO_COMPLETE_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return USER_MENTION_AUTO_COMPLETE_SOURCE_BACKSTAGE_POST;
        }
        if (i == 2) {
            return USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_MENTION_STICKER;
        }
        if (i == 3) {
            return USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER;
        }
        if (i != 4) {
            return null;
        }
        return USER_MENTION_AUTO_COMPLETE_SOURCE_STUDIO;
    }

    @Override // defpackage.aonq
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
