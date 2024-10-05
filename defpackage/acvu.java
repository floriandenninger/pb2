package defpackage;

import java.io.CharArrayWriter;
import org.json.JSONArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acvu {
    private static final String b = "acvu";
    public acvt a;
    private int c;
    private int f = 1;
    private final CharArrayWriter d = new CharArrayWriter();
    private final CharArrayWriter e = new CharArrayWriter();

    public static final void a(int i) {
        if (i == 404) {
            throw new acwm();
        }
        if (i != 200) {
            throw new acwo(i);
        }
    }

    public final void b(char[] cArr) {
        int i;
        int i2;
        adgf a;
        int i3 = 0;
        int length = cArr.length;
        int i4 = 0;
        while (length != 0) {
            int i5 = this.f;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            int i7 = 1;
            if (i6 != 0) {
                if (i6 == 1) {
                    int i8 = this.c;
                    if (length >= i8) {
                        this.f = 1;
                    } else {
                        i8 = length;
                    }
                    this.e.write(cArr, i4, i8);
                    int i9 = this.c - i8;
                    this.c = i9;
                    if (i9 == 0) {
                        acvt acvtVar = this.a;
                        if (acvtVar != null) {
                            String charArrayWriter = this.e.toString();
                            try {
                                String valueOf = String.valueOf(charArrayWriter);
                                if (valueOf.length() != 0) {
                                    "Received chunk:".concat(valueOf);
                                }
                                JSONArray jSONArray = new JSONArray(charArrayWriter);
                                int i10 = 0;
                                while (i10 < jSONArray.length()) {
                                    JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
                                    int i11 = jSONArray2.getInt(i3);
                                    ((acwg) ((acwj) acvtVar).b).h = i11;
                                    JSONArray jSONArray3 = jSONArray2.getJSONArray(i7);
                                    if (jSONArray3.length() > 0) {
                                        if (i11 == 0) {
                                            ((acwg) ((acwj) acvtVar).b).g = jSONArray3.getString(i7);
                                        } else if (i11 == i7) {
                                            ((acwg) ((acwj) acvtVar).b).i = jSONArray3.getString(i7);
                                        } else if (i11 > i7) {
                                            acvy acvyVar = ((acwj) acvtVar).c;
                                            if (jSONArray3.length() != 0 && (a = adgf.a(jSONArray3.getString(i3))) != null) {
                                                acvyVar.a.b.d(new acxt(a, "cloud_bc"));
                                                acsy acsyVar = acvyVar.a.s;
                                                asmn asmnVar = asmn.LATENCY_ACTION_MDX_COMMAND;
                                                aone createBuilder = asmb.a.createBuilder();
                                                aone createBuilder2 = asmg.a.createBuilder();
                                                createBuilder2.copyOnWrite();
                                                asmg asmgVar = (asmg) createBuilder2.instance;
                                                i2 = i8;
                                                try {
                                                    asmgVar.f = 1;
                                                    asmgVar.b |= 8;
                                                    String str = a.an;
                                                    createBuilder2.copyOnWrite();
                                                    asmg asmgVar2 = (asmg) createBuilder2.instance;
                                                    str.getClass();
                                                    asmgVar2.b |= 2;
                                                    asmgVar2.d = str;
                                                    asmg asmgVar3 = (asmg) createBuilder2.build();
                                                    createBuilder.copyOnWrite();
                                                    asmb asmbVar = (asmb) createBuilder.instance;
                                                    asmgVar3.getClass();
                                                    asmbVar.x = asmgVar3;
                                                    asmbVar.c |= 2097152;
                                                    acsyVar.o(asmnVar, (asmb) createBuilder.build());
                                                    acvyVar.a.s.v("mdx_cr", asmn.LATENCY_ACTION_MDX_COMMAND);
                                                    adqo adqoVar = acvyVar.a.h;
                                                    if (adqoVar == null) {
                                                        zga.m(acwa.a, "message received but channelMessageListener is null.");
                                                    } else {
                                                        adqoVar.b(adqz.b(jSONArray3));
                                                    }
                                                    i10++;
                                                    i8 = i2;
                                                    i3 = 0;
                                                    i7 = 1;
                                                } catch (Exception e) {
                                                    e = e;
                                                    zga.f(acwj.a, "Chunk stream error", e);
                                                    this.e.reset();
                                                    i = i2;
                                                    i4 += i;
                                                    length -= i;
                                                    i3 = 0;
                                                }
                                            }
                                        }
                                    }
                                    i2 = i8;
                                    i10++;
                                    i8 = i2;
                                    i3 = 0;
                                    i7 = 1;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i2 = i8;
                            }
                        }
                        i2 = i8;
                        this.e.reset();
                    } else {
                        i2 = i8;
                    }
                    i = i2;
                }
                i = length;
            } else {
                for (int i12 = 0; i12 < length; i12++) {
                    if (cArr[i4 + i12] == '\n') {
                        this.d.write(cArr, i4, i12);
                        String charArrayWriter2 = this.d.toString();
                        try {
                            this.c = Integer.parseInt(charArrayWriter2, 10);
                            this.f = 2;
                            this.d.reset();
                        } catch (NumberFormatException e3) {
                            String str2 = b;
                            String valueOf2 = String.valueOf(charArrayWriter2);
                            zga.f(str2, valueOf2.length() != 0 ? "Error parsing chunk length: ".concat(valueOf2) : new String("Error parsing chunk length: "), e3);
                            this.f = 1;
                            this.d.reset();
                        }
                        i = i12 + 1;
                        break;
                    }
                }
                this.d.write(cArr, i4, length);
                i = length;
            }
            i4 += i;
            length -= i;
            i3 = 0;
        }
    }

    protected final void finalize() {
        if (this.f == 2) {
            zga.m(b, "Lost partial chunk");
        }
    }
}
