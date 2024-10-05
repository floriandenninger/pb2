package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czi implements cqp {
    private static final akau d = new akau((char[]) null);
    private final Context a;
    private final List b;
    private final czj c;
    private final akau e;

    public czi(Context context, List list, ctm ctmVar, ctk ctkVar) {
        akau akauVar = d;
        this.a = context.getApplicationContext();
        this.b = list;
        this.c = new czj(ctmVar, ctkVar);
        this.e = akauVar;
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ ctd a(Object obj, int i, int i2, cqn cqnVar) {
        cpe cpeVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        cpf d2 = this.e.d(byteBuffer);
        try {
            ddi.b();
            if (d2.b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            czn cznVar = null;
            int i3 = 0;
            if (d2.e()) {
                cpeVar = d2.c;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < 6; i4++) {
                    sb.append((char) d2.a());
                }
                if (sb.toString().startsWith("GIF")) {
                    d2.c.f = d2.b();
                    d2.c.g = d2.b();
                    int a = d2.a();
                    cpe cpeVar2 = d2.c;
                    cpeVar2.h = (a & 128) != 0;
                    cpeVar2.i = (int) Math.pow(2.0d, (a & 7) + 1);
                    d2.c.j = d2.a();
                    d2.c.k = d2.a();
                    if (d2.c.h && !d2.e()) {
                        cpe cpeVar3 = d2.c;
                        cpeVar3.a = d2.f(cpeVar3.i);
                        cpe cpeVar4 = d2.c;
                        cpeVar4.l = cpeVar4.a[cpeVar4.j];
                    }
                } else {
                    d2.c.b = 1;
                }
                if (!d2.e()) {
                    while (!d2.e()) {
                        int i5 = d2.c.c;
                        int a2 = d2.a();
                        if (a2 == 33) {
                            int a3 = d2.a();
                            if (a3 == 1) {
                                d2.d();
                            } else if (a3 == 249) {
                                d2.c.d = new cpd();
                                d2.a();
                                int a4 = d2.a();
                                cpd cpdVar = d2.c.d;
                                int i6 = (a4 & 28) >> 2;
                                cpdVar.g = i6;
                                if (i6 == 0) {
                                    cpdVar.g = 1;
                                }
                                cpdVar.f = 1 == (a4 & 1);
                                int b = d2.b();
                                if (b < 2) {
                                    b = 10;
                                }
                                cpd cpdVar2 = d2.c.d;
                                cpdVar2.i = b * 10;
                                cpdVar2.h = d2.a();
                                d2.a();
                            } else if (a3 == 254) {
                                d2.d();
                            } else if (a3 == 255) {
                                d2.c();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i7 = 0; i7 < 11; i7++) {
                                    sb2.append((char) d2.a[i7]);
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    do {
                                        d2.c();
                                        byte[] bArr = d2.a;
                                        if (bArr[0] == 1) {
                                            d2.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                        }
                                        if (d2.d > 0) {
                                        }
                                    } while (!d2.e());
                                } else {
                                    d2.d();
                                }
                            } else {
                                d2.d();
                            }
                        } else if (a2 == 44) {
                            cpe cpeVar5 = d2.c;
                            if (cpeVar5.d == null) {
                                cpeVar5.d = new cpd();
                            }
                            d2.c.d.a = d2.b();
                            d2.c.d.b = d2.b();
                            d2.c.d.c = d2.b();
                            d2.c.d.d = d2.b();
                            int a5 = d2.a();
                            int i8 = a5 & 128;
                            int pow = (int) Math.pow(2.0d, (a5 & 7) + 1);
                            cpd cpdVar3 = d2.c.d;
                            cpdVar3.e = (a5 & 64) != 0;
                            if (i8 == 0) {
                                cpdVar3.k = null;
                            } else {
                                cpdVar3.k = d2.f(pow);
                            }
                            d2.c.d.j = d2.b.position();
                            d2.a();
                            d2.d();
                            if (!d2.e()) {
                                cpe cpeVar6 = d2.c;
                                cpeVar6.c++;
                                cpeVar6.e.add(cpeVar6.d);
                            }
                        } else {
                            if (a2 == 59) {
                                break;
                            }
                            d2.c.b = 1;
                        }
                    }
                    cpe cpeVar7 = d2.c;
                    if (cpeVar7.c < 0) {
                        cpeVar7.b = 1;
                    }
                }
                cpeVar = d2.c;
            }
            if (cpeVar.c > 0 && cpeVar.b == 0) {
                Bitmap.Config config = cqnVar.b(czu.a) == cpw.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(cpeVar.g / i2, cpeVar.f / i);
                if (min != 0) {
                    i3 = Integer.highestOneBit(min);
                }
                cpg cpgVar = new cpg(this.c, cpeVar, byteBuffer, Math.max(1, i3));
                if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
                    String valueOf = String.valueOf(config);
                    String valueOf2 = String.valueOf(Bitmap.Config.ARGB_8888);
                    String valueOf3 = String.valueOf(Bitmap.Config.RGB_565);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
                    sb3.append("Unsupported format: ");
                    sb3.append(valueOf);
                    sb3.append(", must be one of ");
                    sb3.append(valueOf2);
                    sb3.append(" or ");
                    sb3.append(valueOf3);
                    throw new IllegalArgumentException(sb3.toString());
                }
                cpgVar.i = config;
                cpgVar.b();
                Bitmap a6 = cpgVar.a();
                if (a6 != null) {
                    cznVar = new czn(new czl(new czk(new czs(cnv.b(this.a), cpgVar, i, i2, cxc.b, a6))));
                }
            }
            return cznVar;
        } finally {
            this.e.e(d2);
        }
    }

    @Override // defpackage.cqp
    public final /* bridge */ /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        return !((Boolean) cqnVar.b(czu.b)).booleanValue() && gm.y(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }
}
