package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum apyk implements aonq {
    COMMENT_POLL_STATUS_UNKNOWN(0),
    COMMENT_POLL_STATUS_NO_VOTE(10),
    COMMENT_POLL_STATUS_VOTE_NO_COMMENT(20),
    COMMENT_POLL_STATUS_VOTE_AND_COMMENT(30),
    COMMENT_POLL_STATUS_VOTING(40);

    public final int f;

    apyk(int i) {
        this.f = i;
    }

    public static aons a() {
        return apqr.t;
    }

    public static apyk b(int i) {
        if (i == 0) {
            return COMMENT_POLL_STATUS_UNKNOWN;
        }
        if (i == 10) {
            return COMMENT_POLL_STATUS_NO_VOTE;
        }
        if (i == 20) {
            return COMMENT_POLL_STATUS_VOTE_NO_COMMENT;
        }
        if (i == 30) {
            return COMMENT_POLL_STATUS_VOTE_AND_COMMENT;
        }
        if (i != 40) {
            return null;
        }
        return COMMENT_POLL_STATUS_VOTING;
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
