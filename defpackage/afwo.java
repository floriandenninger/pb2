package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afwo implements ynl {
    public final /* synthetic */ yvo a;
    private final /* synthetic */ int b;

    public /* synthetic */ afwo(yvo yvoVar, int i) {
        this.b = i;
        this.a = yvoVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        String str;
        if (this.b == 0) {
            yvo yvoVar = this.a;
            cnm cnmVar = (cnm) obj;
            if (cnmVar.c()) {
                yvoVar.ql(cnmVar.a);
                return;
            }
            cnq cnqVar = cnmVar.c;
            if (cnqVar != null) {
                yvoVar.o(cnqVar);
                return;
            } else {
                yvoVar.o(new cnq("Non-successful response with no error"));
                return;
            }
        }
        yvo yvoVar2 = this.a;
        if (((Boolean) obj).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Basic CURL command:");
            try {
                for (Map.Entry entry : yvoVar2.f().entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(str3).length());
                    sb2.append("-H \"");
                    sb2.append(str2);
                    sb2.append(":");
                    sb2.append(str3);
                    sb2.append("\" ");
                    sb.append(sb2.toString());
                }
                String m = yvoVar2.m();
                StringBuilder sb3 = new StringBuilder(String.valueOf(m).length() + 2);
                sb3.append("'");
                sb3.append(m);
                sb3.append("'");
                sb.append(sb3.toString());
                str = sb.toString();
            } catch (cnb e) {
                zga.d("Auth failure.", e);
                str = "Received exception while trying to get logs.";
            }
            zga.g(str);
        }
    }
}
