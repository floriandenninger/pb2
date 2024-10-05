package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aarg {
    aonm d;
    final amml e;
    final amml f;
    final amml g;
    final aonm h;
    final byte i;
    public long b = -1;
    public long c = -1;
    public String a = "";

    public aarg(amml ammlVar, amml ammlVar2, amml ammlVar3, aonm aonmVar, byte b) {
        this.e = ammlVar;
        this.f = ammlVar2;
        this.g = ammlVar3;
        this.h = aonmVar;
        this.d = aonmVar;
        this.i = b;
    }

    public final String a() {
        return Base64.encodeToString(this.d.toByteArray(), 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b = -1L;
        this.a = "";
        this.d = this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(OutputStream outputStream) {
        aone createBuilder = aplg.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        aplg aplgVar = (aplg) createBuilder.instance;
        str.getClass();
        aplgVar.b |= 2;
        aplgVar.d = str;
        long j = this.b;
        createBuilder.copyOnWrite();
        aplg aplgVar2 = (aplg) createBuilder.instance;
        aplgVar2.b |= 1;
        aplgVar2.c = j;
        aplg aplgVar3 = (aplg) createBuilder.build();
        outputStream.write(this.i);
        aarf.b(outputStream, aplgVar3);
        aarf.b(outputStream, this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(arbv arbvVar, long j) {
        String d = ammx.d((String) this.g.apply(arbvVar));
        if (this.a.equals(d)) {
            return false;
        }
        if (d.length() > 0) {
            this.a = d;
        }
        aomf aomfVar = (aomf) this.f.apply(arbvVar);
        Object obj = null;
        if (aomfVar == null || aomfVar.d() <= 0) {
            String str = (String) this.e.apply(arbvVar);
            if (!TextUtils.isEmpty(str)) {
                obj = adyu.du(adyu.dw(str), this.h.getParserForType());
            }
        } else {
            try {
                obj = this.h.getParserForType().h(aomfVar);
            } catch (aoob e) {
                aarh.e("Failed parse BytesSerialized", e);
            }
        }
        if (obj != null) {
            this.b = j;
            this.d = (aonm) obj;
        }
        return obj != null || d.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(aarf aarfVar) {
        aplg aplgVar = (aplg) aarfVar.a(aplg.a);
        if (aplgVar != null) {
            this.a = aplgVar.d;
            aooy a = aarfVar.a(this.h);
            if (a != null) {
                this.b = aplgVar.c;
                this.d = (aonm) a;
            }
        }
    }

    public final String toString() {
        return this.h.getClass().toString();
    }
}
