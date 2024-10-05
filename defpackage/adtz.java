package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtz {
    public final PlayerResponseModel a;
    public final int b;

    public adtz() {
    }

    public adtz(int i, PlayerResponseModel playerResponseModel) {
        this.b = i;
        this.a = playerResponseModel;
    }

    public final adty a() {
        return new adty(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adtz)) {
            return false;
        }
        adtz adtzVar = (adtz) obj;
        int i = this.b;
        int i2 = adtzVar.b;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            PlayerResponseModel playerResponseModel = this.a;
            PlayerResponseModel playerResponseModel2 = adtzVar.a;
            if (playerResponseModel != null ? playerResponseModel.equals(playerResponseModel2) : playerResponseModel2 == null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String bX = adyu.bX(this.b);
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(bX.length() + 41 + String.valueOf(valueOf).length());
        sb.append("MdxAutonavState{autonavMode=");
        sb.append(bX);
        sb.append(", nextVideo=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            throw null;
        }
        int i2 = (i ^ 1000003) * 1000003;
        PlayerResponseModel playerResponseModel = this.a;
        return i2 ^ (playerResponseModel == null ? 0 : playerResponseModel.hashCode());
    }
}
