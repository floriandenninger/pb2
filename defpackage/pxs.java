package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pxs {
    public final pzs a;
    public final pvp b;
    public final pup c;
    public final pvz d;
    public puh[] e;
    public pwt f;
    public String g;
    public final ViewGroup h;
    public dwp i;
    public dwp j;

    public pxs(ViewGroup viewGroup) {
        pvp pvpVar = pvp.a;
        this.a = new pzs();
        this.c = new pup();
        this.d = new pxr(this);
        this.h = viewGroup;
        this.b = pvpVar;
        this.f = null;
        new AtomicBoolean(false);
    }

    public static AdSizeParcel b(Context context, puh[] puhVarArr) {
        int length = puhVarArr.length;
        for (int i = 0; i <= 0; i++) {
            if (puhVarArr[i].equals(puh.b)) {
                return new AdSizeParcel("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        AdSizeParcel adSizeParcel = new AdSizeParcel(context, puhVarArr);
        adSizeParcel.j = false;
        return adSizeParcel;
    }

    public final pxn a() {
        pwt pwtVar = this.f;
        if (pwtVar != null) {
            try {
                return pwtVar.f();
            } catch (RemoteException e) {
                qbi.i("#007 Could not call remote method.", e);
            }
        }
        return null;
    }
}
