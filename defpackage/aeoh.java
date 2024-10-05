package defpackage;

import com.youtube.libraries.bandwidth.BandwidthSampleGenerator;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.TensorImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeoh implements aeny {
    public final String a;
    public final aeot b;
    public long h;
    private final aaea m;
    private final affe n;
    private final acpl o;
    private final ByteBuffer p;
    private float r;
    private int s;
    private baoa t;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public final ArrayDeque d = new ArrayDeque();
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    private final aef q = new aef(3);

    public aeoh(aaea aaeaVar, affe affeVar, acpl acplVar, ByteBuffer byteBuffer, String str, aeot aeotVar) {
        this.m = aaeaVar;
        this.n = affeVar;
        this.o = acplVar;
        this.p = byteBuffer;
        this.a = str;
        this.b = aeotVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(int i, acpl acplVar) {
        aone createBuilder = avey.a.createBuilder();
        createBuilder.copyOnWrite();
        avey aveyVar = (avey) createBuilder.instance;
        aveyVar.d = i - 1;
        aveyVar.b |= 2;
        createBuilder.copyOnWrite();
        avey aveyVar2 = (avey) createBuilder.instance;
        aveyVar2.c = 1;
        aveyVar2.b = 1 | aveyVar2.b;
        avey aveyVar3 = (avey) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).dL(aveyVar3);
        acplVar.c((arpp) a.build());
    }

    private static float[][] e(ArrayDeque arrayDeque, int i) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) float.class, 1, i);
        Iterator it = arrayDeque.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fArr[0][i2] = ((Float) it.next()).floatValue();
            i2++;
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final BandwidthSampleGenerator a(String str) {
        if (this.q.c(str) == null) {
            BandwidthSampleGenerator create = BandwidthSampleGenerator.create(this.r, this.s, new aeog(this));
            if (create != null) {
                this.q.d(str, create);
            }
        }
        return (BandwidthSampleGenerator) this.q.c(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2 A[Catch: IllegalArgumentException -> 0x043d, TryCatch #0 {IllegalArgumentException -> 0x043d, blocks: (B:42:0x00a6, B:46:0x00b6, B:50:0x00db, B:52:0x00ea, B:54:0x00f2, B:56:0x00f5, B:60:0x00c2, B:63:0x00c7, B:68:0x00fa, B:70:0x0101, B:72:0x0109, B:76:0x028d, B:78:0x0113, B:79:0x011a, B:81:0x011b, B:83:0x0122, B:85:0x012d, B:87:0x0140, B:89:0x0144, B:91:0x014d, B:93:0x0157, B:95:0x015e, B:97:0x0167, B:99:0x016b, B:101:0x0174, B:103:0x017e, B:105:0x0185, B:107:0x0192, B:109:0x0196, B:111:0x019f, B:113:0x01a9, B:115:0x01b0, B:117:0x01bd, B:119:0x01c1, B:121:0x01ca, B:123:0x01d4, B:125:0x01db, B:127:0x01e8, B:129:0x01ec, B:131:0x01f5, B:133:0x01ff, B:135:0x0206, B:138:0x0213, B:139:0x0237, B:141:0x0238, B:142:0x0259, B:143:0x0132, B:144:0x025a, B:146:0x0266, B:148:0x026d, B:150:0x0272, B:152:0x0278, B:154:0x0282, B:156:0x0288, B:159:0x0291, B:160:0x02b4, B:162:0x02b5, B:165:0x02c9, B:167:0x02ce, B:169:0x02d2, B:171:0x02d5, B:174:0x02d8, B:175:0x02e0, B:177:0x02e6, B:180:0x02f2, B:235:0x0306, B:240:0x030f, B:241:0x0316, B:183:0x0317, B:195:0x031e, B:197:0x0329, B:199:0x033c, B:228:0x0340, B:202:0x034a, B:225:0x034e, B:205:0x035c, B:222:0x0360, B:208:0x036f, B:219:0x0373, B:211:0x0382, B:213:0x0386, B:216:0x0395, B:217:0x03b9, B:231:0x03ba, B:232:0x03dc, B:233:0x032e, B:186:0x03dd, B:188:0x03e9, B:192:0x03f0, B:193:0x0414, B:244:0x0415, B:251:0x0435, B:252:0x043c), top: B:41:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5 A[SYNTHETIC] */
    @Override // defpackage.aeny
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b() {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeoh.b():float");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0080. Please report as an issue. */
    public final boolean c() {
        atcl atclVar = this.m.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        apks apksVar = atclVar.e;
        if (apksVar == null) {
            apksVar = apks.a;
        }
        if ((apksVar.b & 16) != 0 && this.p.capacity() != 0) {
            try {
                this.n.a();
                TensorFlowLite.a();
                apkt apktVar = apksVar.e;
                if (apktVar == null) {
                    apktVar = apkt.a;
                }
                this.r = apktVar.d;
                this.s = apktVar.e;
                try {
                    baoa baoaVar = new baoa(this.p.order(ByteOrder.nativeOrder()));
                    this.t = baoaVar;
                    acpl acplVar = this.o;
                    baoaVar.c();
                    if (baoaVar.a.d.length == 1) {
                        baoaVar.c();
                        if (baoaVar.a.b(0).b.length == 1) {
                            int a = baoaVar.a();
                            int i = 0;
                            boolean z = false;
                            while (true) {
                                char c = 65535;
                                if (i < a) {
                                    baob b = baoaVar.b(i);
                                    String b2 = b.b();
                                    switch (b2.hashCode()) {
                                        case 94224491:
                                            if (b2.equals("bytes")) {
                                                c = 1;
                                                break;
                                            }
                                            break;
                                        case 174449897:
                                            if (b2.equals("onesie_seconds")) {
                                                c = 4;
                                                break;
                                            }
                                            break;
                                        case 1500729522:
                                            if (b2.equals("samples_since_last_onesie_sample")) {
                                                c = 0;
                                                break;
                                            }
                                            break;
                                        case 1525800736:
                                            if (b2.equals("head_seconds")) {
                                                c = 3;
                                                break;
                                            }
                                            break;
                                        case 1970096767:
                                            if (b2.equals("seconds")) {
                                                c = 2;
                                                break;
                                            }
                                            break;
                                    }
                                    if (c == 0) {
                                        int i2 = ((TensorImpl) b).c;
                                        int[] iArr = bany.a;
                                        if (i2 == 0) {
                                            throw null;
                                        }
                                        if (i2 != 4) {
                                            d(7, acplVar);
                                        } else {
                                            z = true;
                                            i++;
                                        }
                                    } else if (c == 1) {
                                        int i3 = ((TensorImpl) b).c;
                                        int[] iArr2 = bany.a;
                                        if (i3 == 0) {
                                            throw null;
                                        }
                                        if (i3 != 1) {
                                            d(7, acplVar);
                                        } else {
                                            this.i = b.a();
                                            i++;
                                        }
                                    } else if (c == 2) {
                                        int i4 = ((TensorImpl) b).c;
                                        int[] iArr3 = bany.a;
                                        if (i4 == 0) {
                                            throw null;
                                        }
                                        if (i4 != 1) {
                                            d(7, acplVar);
                                        } else {
                                            this.j = b.a();
                                            i++;
                                        }
                                    } else if (c != 3) {
                                        if (c != 4) {
                                            d(9, acplVar);
                                        } else {
                                            int i5 = ((TensorImpl) b).c;
                                            int[] iArr4 = bany.a;
                                            if (i5 == 0) {
                                                throw null;
                                            }
                                            if (i5 != 1) {
                                                d(7, acplVar);
                                            } else {
                                                this.l = b.a();
                                            }
                                        }
                                        i++;
                                    } else {
                                        int i6 = ((TensorImpl) b).c;
                                        int[] iArr5 = bany.a;
                                        if (i6 == 0) {
                                            throw null;
                                        }
                                        if (i6 != 1) {
                                            d(7, acplVar);
                                        } else {
                                            this.k = b.a();
                                            i++;
                                        }
                                    }
                                } else {
                                    if (z || this.i != -1 || this.j != -1 || this.k != -1 || this.l != -1) {
                                        try {
                                            baoa baoaVar2 = this.t;
                                            baoaVar2.c();
                                            baoaVar2.a.c();
                                            return true;
                                        } catch (IllegalStateException unused) {
                                            d(6, this.o);
                                            return false;
                                        }
                                    }
                                    d(8, acplVar);
                                }
                            }
                        }
                    }
                    d(7, acplVar);
                    return false;
                } catch (IllegalArgumentException unused2) {
                    d(5, this.o);
                    return false;
                }
            } catch (UnsatisfiedLinkError unused3) {
                d(15, this.o);
            }
        }
        return false;
    }

    @Override // defpackage.aeny
    public final void f(float f) {
    }

    @Override // defpackage.aeny
    public final void g() {
        String str = this.a;
        if (str == null) {
            return;
        }
        aeot aeotVar = this.b;
        aeos aeosVar = null;
        if (aeotVar.b()) {
            synchronized (aeotVar) {
                aeos aeosVar2 = (aeos) aeotVar.b.get();
                if (str.equals(aeosVar2.g)) {
                    aeosVar = aeos.a(aeosVar2);
                }
            }
        }
        if (aeosVar == null) {
            return;
        }
        Iterator it = aeosVar.b.iterator();
        while (it.hasNext()) {
            float floatValue = ((Float) it.next()).floatValue();
            if (this.f.size() >= this.k && !this.f.isEmpty()) {
                this.f.removeFirst();
            }
            this.f.addLast(Float.valueOf(floatValue));
        }
        Iterator it2 = aeosVar.e.iterator();
        while (it2.hasNext()) {
            float floatValue2 = ((Float) it2.next()).floatValue();
            if (this.g.size() >= this.l && !this.g.isEmpty()) {
                this.g.removeFirst();
            }
            this.g.addLast(Float.valueOf(floatValue2));
        }
        Iterator it3 = aeosVar.d.iterator();
        while (it3.hasNext()) {
            float floatValue3 = ((Float) it3.next()).floatValue();
            if (this.d.size() >= this.i && !this.d.isEmpty()) {
                this.d.removeFirst();
            }
            this.d.addLast(Float.valueOf(floatValue3));
        }
        Iterator it4 = aeosVar.c.iterator();
        while (it4.hasNext()) {
            float floatValue4 = ((Float) it4.next()).floatValue();
            if (this.e.size() >= this.j && !this.e.isEmpty()) {
                this.e.removeFirst();
            }
            this.e.addLast(Float.valueOf(floatValue4));
        }
        this.h = aeosVar.f;
    }

    @Override // defpackage.aeny
    public final void h() {
    }

    @Override // defpackage.aeny
    public final boolean i() {
        return true;
    }

    @Override // defpackage.aeny
    public final int j() {
        return 6;
    }
}
