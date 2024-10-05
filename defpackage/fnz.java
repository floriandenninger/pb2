package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class fnz implements amml {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ fnz(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                int i = this.a;
                aone builder = ((fof) obj).toBuilder();
                builder.copyOnWrite();
                fof fofVar = (fof) builder.instance;
                fofVar.b |= 32;
                fofVar.i = i;
                return (fof) builder.build();
            case 1:
                int i2 = this.a;
                aone builder2 = ((fof) obj).toBuilder();
                builder2.copyOnWrite();
                fof fofVar2 = (fof) builder2.instance;
                fofVar2.b |= 16;
                fofVar2.h = i2;
                return (fof) builder2.build();
            case 2:
                int i3 = this.a;
                aone builder3 = ((fof) obj).toBuilder();
                builder3.copyOnWrite();
                fof fofVar3 = (fof) builder3.instance;
                fofVar3.b |= 4;
                fofVar3.e = i3;
                return (fof) builder3.build();
            case 3:
                int i4 = this.a;
                aone builder4 = ((fnx) obj).toBuilder();
                builder4.copyOnWrite();
                fnx fnxVar = (fnx) builder4.instance;
                fnxVar.b |= 1;
                fnxVar.c = i4;
                return (fnx) builder4.build();
            case 4:
                int i5 = this.a;
                fzf fzfVar = (fzf) obj;
                int i6 = maw.l;
                fzfVar.c(i5);
                return fzfVar;
            case 5:
                int i7 = this.a;
                aone builder5 = ((zoh) obj).toBuilder();
                builder5.copyOnWrite();
                ((zoh) builder5.instance).b = i7;
                return (zoh) builder5.build();
            case 6:
                int i8 = this.a;
                aone builder6 = ((aosc) obj).toBuilder();
                builder6.copyOnWrite();
                aosc aoscVar = (aosc) builder6.instance;
                aoscVar.b |= 16;
                aoscVar.g = i8;
                return (aosc) builder6.build();
            case 7:
                int i9 = this.a;
                aone builder7 = ((awuv) obj).toBuilder();
                builder7.copyOnWrite();
                awuv awuvVar = (awuv) builder7.instance;
                awuvVar.b |= 16;
                awuvVar.g = i9;
                return (awuv) builder7.build();
            case 8:
                return new anjr(obj, this.a, null);
            default:
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
                playerResponseModel.d.b("PLAYER_RESPONSE_SOURCE_KEY", this.a);
                return playerResponseModel;
        }
    }
}
