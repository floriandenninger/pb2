package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhp extends cnq {
    public static final awyy a;
    public final awyy c;

    static {
        aone createBuilder = awyy.a.createBuilder();
        createBuilder.copyOnWrite();
        ((awyy) createBuilder.instance).b = 2;
        a = (awyy) createBuilder.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zhp(defpackage.cnq r5) {
        /*
            r4 = this;
            cnh r0 = r5.b
            java.lang.Throwable r1 = r5.getCause()
        L6:
            boolean r2 = r1 instanceof defpackage.cnq
            if (r2 == 0) goto L16
            if (r0 != 0) goto L16
            r0 = r1
            cnq r0 = (defpackage.cnq) r0
            cnh r0 = r0.b
            java.lang.Throwable r1 = r1.getCause()
            goto L6
        L16:
            r4.<init>(r0)
            if (r0 == 0) goto L79
            cnh r0 = r4.b
            java.util.List r0 = r0.d
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            cnf r1 = (defpackage.cnf) r1
            java.lang.String r2 = r1.a
            java.lang.String r3 = "Content-Type"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L23
            java.lang.String r2 = r1.b
            java.lang.String r3 = "application/x-protobuf"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L50
            ammv r0 = r4.c()
            awyy r1 = defpackage.zhp.a
            java.lang.Object r0 = r0.e(r1)
            awyy r0 = (defpackage.awyy) r0
            goto L76
        L50:
            java.lang.String r1 = r1.b
            java.lang.String r2 = "application/json"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L23
            ammv r0 = r4.a()
            awyy r1 = defpackage.zhp.a
            java.lang.Object r0 = r0.e(r1)
            awyy r0 = (defpackage.awyy) r0
            goto L76
        L67:
            ammv r0 = r4.c()
            zho r1 = new zho
            r1.<init>()
            java.lang.Object r0 = r0.d(r1)
            awyy r0 = (defpackage.awyy) r0
        L76:
            r4.c = r0
            goto L7d
        L79:
            awyy r0 = defpackage.zhp.a
            r4.c = r0
        L7d:
            r4.initCause(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhp.<init>(cnq):void");
    }

    private final ammv c() {
        try {
            return ammv.j((awyy) aonm.parseFrom(awyy.a, this.b.b, aomw.b()));
        } catch (aoob e) {
            zga.n("Could not parse proto error payload.", e);
            return amlr.a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final ammv a() {
        char c;
        int i;
        int i2;
        try {
            try {
                JSONObject optJSONObject = new JSONObject(new String(this.b.b, "UTF-8")).optJSONObject("error");
                if (optJSONObject != null) {
                    aone createBuilder = awyy.a.createBuilder();
                    String optString = optJSONObject.optString("message");
                    createBuilder.copyOnWrite();
                    awyy awyyVar = (awyy) createBuilder.instance;
                    optString.getClass();
                    awyyVar.c = optString;
                    String optString2 = optJSONObject.optString("status");
                    if (TextUtils.isEmpty(optString2)) {
                        i2 = 2;
                    } else {
                        switch (optString2.hashCode()) {
                            case -1842427240:
                                if (optString2.equals("DATA_LOSS")) {
                                    c = 16;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1711692763:
                                if (optString2.equals("INVALID_ARGUMENT")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1416305653:
                                if (optString2.equals("PERMISSION_DENIED")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1031784143:
                                if (optString2.equals("CANCELLED")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1025686472:
                                if (optString2.equals("RESOURCE_EXHAUSTED")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -849706474:
                                if (optString2.equals("UNAUTHENTICATED")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -476794961:
                                if (optString2.equals("ABORTED")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -376214182:
                                if (optString2.equals("DEADLINE_EXCEEDED")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2524:
                                if (optString2.equals("OK")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 433141802:
                                if (optString2.equals("UNKNOWN")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 573789423:
                                if (optString2.equals("UNRECOGNIZED")) {
                                    c = 17;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 695165606:
                                if (optString2.equals("OUT_OF_RANGE")) {
                                    c = '\f';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 979228314:
                                if (optString2.equals("FAILED_PRECONDITION")) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1023286998:
                                if (optString2.equals("NOT_FOUND")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1353037501:
                                if (optString2.equals("INTERNAL")) {
                                    c = 14;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1487498288:
                                if (optString2.equals("UNAVAILABLE")) {
                                    c = 15;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1661336131:
                                if (optString2.equals("ALREADY_EXISTS")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1854913705:
                                if (optString2.equals("UNIMPLEMENTED")) {
                                    c = '\r';
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                i = 2;
                                break;
                            case 1:
                                i = 3;
                                break;
                            case 2:
                                i = 4;
                                break;
                            case 3:
                                i = 5;
                                break;
                            case 4:
                                i = 6;
                                break;
                            case 5:
                                i = 7;
                                break;
                            case 6:
                                i = 8;
                                break;
                            case 7:
                                i = 9;
                                break;
                            case '\b':
                                i = 18;
                                break;
                            case '\t':
                                i = 10;
                                break;
                            case '\n':
                                i = 11;
                                break;
                            case 11:
                                i = 12;
                                break;
                            case '\f':
                                i = 13;
                                break;
                            case '\r':
                                i = 14;
                                break;
                            case 14:
                                i = 15;
                                break;
                            case 15:
                                i = 16;
                                break;
                            case 16:
                                i = 17;
                                break;
                            case 17:
                                i = 1;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        if (i == 1) {
                            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                        }
                        i2 = i - 2;
                    }
                    createBuilder.copyOnWrite();
                    ((awyy) createBuilder.instance).b = i2;
                    return ammv.j((awyy) createBuilder.build());
                }
            } catch (UnsupportedEncodingException e) {
                e = e;
                zga.n("Could not parse json error payload.", e);
                return amlr.a;
            } catch (JSONException e2) {
                e = e2;
                zga.n("Could not parse json error payload.", e);
                return amlr.a;
            }
        } catch (UnsupportedEncodingException | JSONException e3) {
            e = e3;
        }
        return amlr.a;
    }

    public final List b() {
        return this.c.d;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b != null ? this.c.c : super.getMessage();
    }
}
