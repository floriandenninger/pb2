package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@wux(a = xdr.class)
/* loaded from: classes4.dex */
public final class wuz implements wuy {
    @Override // defpackage.wuy
    public final String a() {
        return "0";
    }

    @Override // defpackage.wuy
    public final String b(xcp xcpVar) {
        InstreamAdBreak instreamAdBreak = (InstreamAdBreak) xcpVar.c(xdr.class);
        return instreamAdBreak.b() == xfn.MID_ROLL ? Long.toString(TimeUnit.MILLISECONDS.toSeconds(instreamAdBreak.a())) : "0";
    }
}
