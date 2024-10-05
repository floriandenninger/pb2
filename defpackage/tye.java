package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tye {
    public final String a;
    public final int b;
    private final String c;
    private final int d;
    private final int e;

    public tye() {
    }

    public tye(String str, int i, int i2, int i3, String str2) {
        this.c = str;
        this.b = i;
        this.d = i2;
        this.e = i3;
        this.a = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.tye a(android.content.Intent r8) {
        /*
            tyc r0 = new tyc
            r0.<init>()
            java.lang.String r1 = "casp"
            java.lang.String r1 = r8.getStringExtra(r1)
            r0.b = r1
            java.lang.String r1 = "google.original_priority"
            java.lang.String r1 = r8.getStringExtra(r1)
            int r1 = c(r1)
            r0.d = r1
            java.lang.String r1 = "google.delivered_priority"
            java.lang.String r1 = r8.getStringExtra(r1)
            int r1 = c(r1)
            r0.e = r1
            java.lang.String r1 = "message_type"
            java.lang.String r1 = r8.getStringExtra(r1)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 != 0) goto L32
        L30:
            r2 = 1
            goto L71
        L32:
            int r5 = r1.hashCode()
            switch(r5) {
                case -2062414158: goto L58;
                case 102161: goto L4e;
                case 814694033: goto L44;
                case 814800675: goto L3a;
                default: goto L39;
            }
        L39:
            goto L62
        L3a:
            java.lang.String r5 = "send_event"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L62
            r1 = 2
            goto L63
        L44:
            java.lang.String r5 = "send_error"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L62
            r1 = 3
            goto L63
        L4e:
            java.lang.String r5 = "gcm"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L62
            r1 = 0
            goto L63
        L58:
            java.lang.String r5 = "deleted_messages"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L62
            r1 = 1
            goto L63
        L62:
            r1 = -1
        L63:
            if (r1 == 0) goto L70
            if (r1 == r4) goto L71
            if (r1 == r3) goto L6e
            if (r1 == r2) goto L6c
            goto L30
        L6c:
            r2 = 5
            goto L71
        L6e:
            r2 = 4
            goto L71
        L70:
            r2 = 2
        L71:
            r0.c = r2
            java.lang.String r1 = "google.message_id"
            java.lang.String r8 = r8.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L81
            r0.a = r8
        L81:
            tye r8 = new tye
            java.lang.String r3 = r0.a
            int r4 = r0.c
            int r5 = r0.d
            int r6 = r0.e
            java.lang.String r7 = r0.b
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tye.a(android.content.Intent):tye");
    }

    private static int c(String str) {
        char c;
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1039745817) {
            if (hashCode == 3202466 && str.equals("high")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("normal")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            return c != 1 ? 1 : 3;
        }
        return 2;
    }

    private static int d(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? 1 : 3;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aohi b() {
        /*
            r6 = this;
            aohi r0 = defpackage.aohi.a
            aone r0 = r0.createBuilder()
            int r1 = r6.d
            r0.copyOnWrite()
            aonm r2 = r0.instance
            aohi r2 = (defpackage.aohi) r2
            int r1 = d(r1)
            int r1 = r1 + (-1)
            r2.e = r1
            int r1 = r2.b
            r3 = 4
            r1 = r1 | r3
            r2.b = r1
            int r1 = r6.e
            r0.copyOnWrite()
            aonm r2 = r0.instance
            aohi r2 = (defpackage.aohi) r2
            int r1 = d(r1)
            int r1 = r1 + (-1)
            r2.f = r1
            int r1 = r2.b
            r1 = r1 | 8
            r2.b = r1
            int r1 = r6.b
            r2 = 3
            r4 = 2
            r5 = 1
            if (r1 != 0) goto L3d
        L3b:
            r3 = 1
            goto L4d
        L3d:
            int r1 = r1 + (-1)
            if (r1 == r5) goto L4c
            if (r1 == r4) goto L4a
            if (r1 == r2) goto L4d
            if (r1 == r3) goto L48
            goto L3b
        L48:
            r3 = 5
            goto L4d
        L4a:
            r3 = 3
            goto L4d
        L4c:
            r3 = 2
        L4d:
            r0.copyOnWrite()
            aonm r1 = r0.instance
            aohi r1 = (defpackage.aohi) r1
            int r3 = r3 + (-1)
            r1.d = r3
            int r2 = r1.b
            r2 = r2 | r4
            r1.b = r2
            java.lang.String r1 = r6.c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L78
            java.lang.String r1 = r6.c
            r0.copyOnWrite()
            aonm r2 = r0.instance
            aohi r2 = (defpackage.aohi) r2
            r1.getClass()
            int r3 = r2.b
            r3 = r3 | r5
            r2.b = r3
            r2.c = r1
        L78:
            aonm r0 = r0.build()
            aohi r0 = (defpackage.aohi) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tye.b():aohi");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tye) {
            tye tyeVar = (tye) obj;
            String str = this.c;
            if (str != null ? str.equals(tyeVar.c) : tyeVar.c == null) {
                int i = this.b;
                if (i != 0 ? i == tyeVar.b : tyeVar.b == 0) {
                    int i2 = this.d;
                    if (i2 != 0 ? i2 == tyeVar.d : tyeVar.d == 0) {
                        int i3 = this.e;
                        if (i3 != 0 ? i3 == tyeVar.e : tyeVar.e == 0) {
                            String str2 = this.a;
                            String str3 = tyeVar.a;
                            if (str2 != null ? str2.equals(str3) : str3 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.c;
        int i = this.b;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "SEND_ERROR" : "SEND_EVENT" : "DELETED" : "MESSAGE" : "MESSAGE_TYPE_UNSPECIFIED";
        String a = tyo.a(this.d);
        String a2 = tyo.a(this.e);
        String str3 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 90 + str2.length() + a.length() + a2.length() + String.valueOf(str3).length());
        sb.append("GcmMessage{messageId=");
        sb.append(str);
        sb.append(", messageType=");
        sb.append(str2);
        sb.append(", priorityOriginal=");
        sb.append(a);
        sb.append(", priorityDelivered=");
        sb.append(a2);
        sb.append(", chimePayload=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        int i = this.b;
        if (i == 0) {
            i = 0;
        }
        int i2 = (hashCode ^ i) * 1000003;
        int i3 = this.d;
        if (i3 == 0) {
            i3 = 0;
        }
        int i4 = (i2 ^ i3) * 1000003;
        int i5 = this.e;
        if (i5 == 0) {
            i5 = 0;
        }
        int i6 = (i4 ^ i5) * 1000003;
        String str2 = this.a;
        return i6 ^ (str2 != null ? str2.hashCode() : 0);
    }
}
