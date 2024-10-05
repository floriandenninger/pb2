package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.text.DecimalFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahcr {
    private static final avve[] a = new avve[0];
    private final boolean b;
    private final avve[] c;
    private final float d;

    public ahcr(boolean z, PlayerResponseModel playerResponseModel, float f) {
        this.b = z;
        this.c = d(playerResponseModel);
        this.d = f;
    }

    public static avve[] d(PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            return a;
        }
        PlayerConfigModel c = playerResponseModel.c();
        avvf avvfVar = c.c.t;
        if (avvfVar == null) {
            avvfVar = avvf.a;
        }
        if (avvfVar.b.size() == 0) {
            DecimalFormat decimalFormat = new DecimalFormat("0.0#");
            avve[] avveVarArr = new avve[7];
            for (int i = 0; i < 7; i++) {
                aone createBuilder = avve.a.createBuilder();
                float f = PlayerConfigModel.a[i];
                aong aongVar = (aong) aqyg.a.createBuilder();
                aong aongVar2 = (aong) aqyi.a.createBuilder();
                String format = decimalFormat.format(f);
                aongVar2.copyOnWrite();
                aqyi aqyiVar = (aqyi) aongVar2.instance;
                format.getClass();
                aqyiVar.b |= 1;
                aqyiVar.c = format;
                aongVar.ck((aqyi) aongVar2.build());
                createBuilder.copyOnWrite();
                avve avveVar = (avve) createBuilder.instance;
                aqyg aqygVar = (aqyg) aongVar.build();
                aqygVar.getClass();
                avveVar.c = aqygVar;
                avveVar.b |= 1;
                createBuilder.copyOnWrite();
                avve avveVar2 = (avve) createBuilder.instance;
                avveVar2.b |= 2;
                avveVar2.d = f;
                avveVarArr[i] = (avve) createBuilder.build();
            }
            return avveVarArr;
        }
        avvf avvfVar2 = c.c.t;
        if (avvfVar2 == null) {
            avvfVar2 = avvf.a;
        }
        return (avve[]) avvfVar2.b.toArray(new avve[0]);
    }

    public float a() {
        return this.d;
    }

    public String b() {
        for (avve avveVar : this.c) {
            if (avveVar.d == this.d) {
                aqyg aqygVar = avveVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                return ((aqyi) aqygVar.c.get(0)).c;
            }
        }
        return null;
    }

    public avve[] c() {
        return this.c;
    }
}
