package defpackage;

import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acsa {
    public awav a;
    public asuh b;

    public acsa() {
    }

    public acsa(awav awavVar) {
        this.a = awavVar;
    }

    public acsa(InteractionLoggingScreen interactionLoggingScreen, int i) {
        interactionLoggingScreen.getClass();
        int b = interactionLoggingScreen.b(i);
        aone createBuilder = awav.a.createBuilder();
        createBuilder.copyOnWrite();
        awav awavVar = (awav) createBuilder.instance;
        awavVar.b |= 2;
        awavVar.d = i;
        createBuilder.copyOnWrite();
        awav awavVar2 = (awav) createBuilder.instance;
        awavVar2.b |= 8;
        awavVar2.f = b;
        this.a = (awav) createBuilder.build();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(valueOf).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(valueOf);
        return sb.toString();
    }

    @Deprecated
    public acsa(InteractionLoggingScreen interactionLoggingScreen, acrb acrbVar) {
        this(interactionLoggingScreen, acrbVar.Jk);
    }

    public acsa(InteractionLoggingScreen interactionLoggingScreen, acsc acscVar) {
        this(interactionLoggingScreen, acscVar.a);
    }
}
