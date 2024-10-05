package defpackage;

import com.google.protos.youtube.api.innertube.ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezf implements aaha {
    private final zbi a;

    public ezf(zbi zbiVar) {
        this.a = zbiVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (!apxfVar.pY(ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.showNoConnectionBarCommand)) {
            throw new aahm("Expected a ShowNoConnectionBarCommand, but did not find one.");
        }
        this.a.b();
    }
}
