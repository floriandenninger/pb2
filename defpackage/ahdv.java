package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahdv {
    public static final ahdv a = new ahdv(aigk.NEW, null, null, null);
    private final aigk b;
    private final PlayerResponseModel c;
    private final WatchNextResponseModel d;
    private final apxf e;

    public ahdv(aigk aigkVar, PlayerResponseModel playerResponseModel, WatchNextResponseModel watchNextResponseModel, apxf apxfVar) {
        this.b = aigkVar;
        this.c = playerResponseModel;
        this.d = watchNextResponseModel;
        this.e = apxfVar;
    }

    public WatchNextResponseModel a() {
        return this.d;
    }

    public PlayerResponseModel b() {
        return this.c;
    }

    public aigk c() {
        return this.b;
    }

    public apxf d() {
        return this.e;
    }
}
