package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdapterResponseInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class puo {
    private final List a = new ArrayList();
    private final pxk b;

    public puo(pxk pxkVar) {
        this.b = pxkVar;
        if (((Boolean) pyi.x.e()).booleanValue()) {
            try {
                Parcel po = pxkVar.po(3, pxkVar.pn());
                ArrayList<AdapterResponseInfoParcel> createTypedArrayList = po.createTypedArrayList(AdapterResponseInfoParcel.CREATOR);
                po.recycle();
                if (createTypedArrayList == null) {
                    return;
                }
                for (AdapterResponseInfoParcel adapterResponseInfoParcel : createTypedArrayList) {
                    puj pujVar = adapterResponseInfoParcel != null ? new puj(adapterResponseInfoParcel) : null;
                    if (pujVar != null) {
                        this.a.add(pujVar);
                    }
                }
            } catch (RemoteException e) {
                qbi.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
    }

    public final JSONObject a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        String str2 = null;
        try {
            pxk pxkVar = this.b;
            Parcel po = pxkVar.po(2, pxkVar.pn());
            str = po.readString();
            po.recycle();
        } catch (RemoteException e) {
            qbi.e("Could not forward getResponseId to ResponseInfo.", e);
            str = null;
        }
        if (str == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", str);
        }
        try {
            pxk pxkVar2 = this.b;
            Parcel po2 = pxkVar2.po(1, pxkVar2.pn());
            String readString = po2.readString();
            po2.recycle();
            str2 = readString;
        } catch (RemoteException e2) {
            qbi.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
        }
        if (str2 == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", str2);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((puj) it.next()).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
