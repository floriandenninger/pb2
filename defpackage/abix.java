package defpackage;

import com.google.protos.youtube.api.innertube.ToggleConversationActionOuterClass$ToggleConversationAction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abix extends aaco {
    private final ToggleConversationActionOuterClass$ToggleConversationAction a;

    private abix(ammv ammvVar, ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction) {
        super(ammvVar);
        toggleConversationActionOuterClass$ToggleConversationAction.getClass();
        this.a = toggleConversationActionOuterClass$ToggleConversationAction;
    }

    public static abix a(ammv ammvVar, ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction) {
        return new abix(ammvVar, toggleConversationActionOuterClass$ToggleConversationAction);
    }

    public boolean b() {
        return this.a.c;
    }
}
