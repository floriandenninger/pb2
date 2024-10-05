package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeeo {
    private final aeeq a;
    private final Executor b;
    private final aeet c;
    private final aeei d;

    public aeeo(aeei aeeiVar, aeeq aeeqVar, Executor executor, aeet aeetVar) {
        aeeiVar.getClass();
        this.d = aeeiVar;
        aeeqVar.getClass();
        this.a = aeeqVar;
        executor.getClass();
        this.b = executor;
        aeetVar.getClass();
        this.c = aeetVar;
    }

    public final void a(PlayerResponseModel playerResponseModel, long j, long j2, aeen aeenVar) {
        b(playerResponseModel, j, j2, aeenVar, null);
    }

    public final aeem b(PlayerResponseModel playerResponseModel, long j, long j2, aeen aeenVar, afkm afkmVar) {
        VideoStreamingData videoStreamingData = playerResponseModel.c;
        if (videoStreamingData != null && !videoStreamingData.B() && j2 > 0) {
            ArrayList arrayList = new ArrayList(2);
            try {
                aeeu c = this.a.c(playerResponseModel.c, playerResponseModel.c(), playerResponseModel.c().aR(), this.c.c(true, playerResponseModel.c(), null, afkmVar));
                FormatStreamModel[] formatStreamModelArr = c.b;
                if (formatStreamModelArr.length > 0 && !formatStreamModelArr[0].J()) {
                    arrayList.add(formatStreamModelArr[0]);
                }
                FormatStreamModel formatStreamModel = c.c;
                if (formatStreamModel != null && !formatStreamModel.J()) {
                    arrayList.add(formatStreamModel);
                }
            } catch (aeew unused) {
            }
            if (!arrayList.isEmpty()) {
                String y = playerResponseModel.y();
                amkq.E(!arrayList.isEmpty());
                aeem aeemVar = new aeem(this.d, y, arrayList, j, j2, aeenVar);
                this.b.execute(aeemVar.g);
                return aeemVar;
            }
            aeenVar.i(2);
        }
        return null;
    }
}
