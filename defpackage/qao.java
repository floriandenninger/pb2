package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qao extends ecq implements qap {
    private final qcf a;

    public qao() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    private final void b(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.m.getBundle(this.a.getClass().getName()) != null) {
            return;
        }
        new Bundle();
    }

    private static void c(String str) {
        String valueOf = String.valueOf(str);
        qbi.f(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException e) {
            qbi.d(e);
            throw new RemoteException();
        }
    }

    private static void d(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.f) {
            return;
        }
        pvy.c();
        qbg.e();
    }

    private static void e(String str, AdRequestParcel adRequestParcel) {
        String str2 = adRequestParcel.u;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    public final void a(String str, AdRequestParcel adRequestParcel, qvf qvfVar) {
        try {
            c(str);
            b(adRequestParcel);
            d(adRequestParcel);
            Location location = adRequestParcel.k;
            int i = adRequestParcel.g;
            int i2 = adRequestParcel.t;
            e(str, adRequestParcel);
            throw null;
        } catch (Throwable th) {
            qbi.e("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    public qao(qcf qcfVar) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.a = qcfVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0487, code lost:
    
        if (r9.equals("banner") != false) goto L258;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean dispatchTransaction(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qao.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
