package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfy {
    final /* synthetic */ rgc a;
    private final String b;
    private final Bundle c;
    private Bundle d;

    public rfy(rgc rgcVar) {
        this.a = rgcVar;
        qip.ax("default_event_parameters");
        this.b = "default_event_parameters";
        this.c = new Bundle();
    }

    public final Bundle a() {
        char c;
        if (this.d == null) {
            String string = this.a.a().getString(this.b, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c = 1;
                                }
                                c = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c = 0;
                                }
                                c = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c = 2;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else {
                                this.a.aF().c.b("Unrecognized persisted bundle type. Type", string3);
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.a.aF().c.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.d = bundle;
                } catch (JSONException unused2) {
                    this.a.aF().c.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.d == null) {
                this.d = this.c;
            }
        }
        return this.d;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.a.a().edit();
        if (bundle.size() == 0) {
            edit.remove(this.b);
        } else {
            String str = this.b;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.a.aF().c.b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.a.aF().c.b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.d = bundle;
    }
}
