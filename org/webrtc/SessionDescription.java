package org.webrtc;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SessionDescription {
    public final Type a;
    public final String b;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER,
        ROLLBACK;

        public static Type fromCanonicalForm(String str) {
            return (Type) valueOf(Type.class, str.toUpperCase(Locale.US));
        }
    }

    public SessionDescription(Type type, String str) {
        this.a = type;
        this.b = str;
    }

    String getDescription() {
        return this.b;
    }

    String getTypeInCanonicalForm() {
        return this.a.name().toLowerCase(Locale.US);
    }
}
