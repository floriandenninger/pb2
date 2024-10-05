package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adty {
    public PlayerResponseModel a;
    private int b;

    public adty() {
    }

    public adty(adtz adtzVar) {
        this.b = adtzVar.b;
        this.a = adtzVar.a;
    }

    public final adtz a() {
        int i = this.b;
        if (i == 0) {
            throw new IllegalStateException("Missing required properties: autonavMode");
        }
        return new adtz(i, this.a);
    }

    public final void b(int i) {
        if (i == 0) {
            throw new NullPointerException("Null autonavMode");
        }
        this.b = i;
    }
}
