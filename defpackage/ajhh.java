package defpackage;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajhh {
    public final String a;
    private final Object b;
    private final ajhf c;
    private final amrz d;

    private ajhh(String str, Object obj, ajhf ajhfVar, amrz amrzVar) {
        this.a = str;
        this.b = obj;
        this.c = ajhfVar;
        this.d = amrzVar;
    }

    public static ajhh c(String str, Object obj, ajhf ajhfVar) {
        return new ajhh(str, obj, ajhfVar, null);
    }

    public static ajhh d(String str, Object obj, ajhf ajhfVar, amrz amrzVar) {
        return new ajhh(str, obj, ajhfVar, amrzVar);
    }

    private final void e(Object obj, Object obj2) {
        this.c.a(obj, obj2);
    }

    public final void a(Object obj) {
        this.c.a(obj, this.b);
    }

    public final void b(JSONObject jSONObject, Object obj, String str) {
        String valueOf = String.valueOf(str);
        String str2 = this.a;
        String concat = str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf);
        if (jSONObject.has(concat)) {
            amrz amrzVar = this.d;
            if (amrzVar != null) {
                Object obj2 = amrzVar.get(jSONObject.getString(concat));
                if (obj2 == null) {
                    StringBuilder sb = new StringBuilder("null".length() + 22);
                    sb.append("Invalid mapped value: ");
                    sb.append("null");
                    throw new ajhg(sb.toString());
                }
                e(obj, obj2);
                return;
            }
            Object obj3 = this.b;
            if (obj3 instanceof String) {
                e(obj, jSONObject.getString(concat));
                return;
            }
            if (obj3 instanceof Integer) {
                e(obj, Integer.valueOf(jSONObject.getInt(concat)));
                return;
            }
            if (obj3 instanceof Long) {
                e(obj, Long.valueOf(jSONObject.getLong(concat)));
                return;
            }
            if (obj3 instanceof Float) {
                e(obj, Float.valueOf((float) jSONObject.getDouble(concat)));
            } else if (obj3 instanceof Double) {
                e(obj, Double.valueOf(jSONObject.getDouble(concat)));
            } else if (obj3 instanceof Boolean) {
                e(obj, Boolean.valueOf(jSONObject.getBoolean(concat)));
            }
        }
    }
}
