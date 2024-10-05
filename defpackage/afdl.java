package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afdl extends afcr {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private int E;
    private String F;
    private String G;
    private int H;
    private int I;

    /* renamed from: J, reason: collision with root package name */
    private final Handler f43J;
    public final aeru c;
    public final afkg d;
    public avzr e;
    private final aenf f;
    private final ysy g;
    private final PlayerConfigModel h;
    private final adxr i;
    private final amnv j;
    private final float k;
    private final float l;
    private final boolean m;
    private final int n;
    private final amnv o;
    private final afdk p;
    private final String q;
    private final String r;
    private final afig s;
    private int t;
    private int u;
    private final afkn v;
    private long w;
    private float x;
    private boolean y;
    private aeex z;

    public afdl(aenf aenfVar, ysy ysyVar, PlayerConfigModel playerConfigModel, adxr adxrVar, boolean z, afkn afknVar, aeex aeexVar, amnv amnvVar, float f, float f2, String str, String str2, afhs afhsVar, amnv amnvVar2, afig afigVar, aesa aesaVar, aeru aeruVar) {
        super(afhsVar, aesaVar);
        this.D = Integer.MAX_VALUE;
        this.E = 0;
        this.F = "";
        this.G = "";
        this.H = 0;
        this.I = 0;
        this.f43J = new Handler(Looper.getMainLooper());
        this.c = aeruVar;
        this.f = aenfVar;
        this.g = ysyVar;
        this.h = playerConfigModel;
        this.i = adxrVar;
        this.m = z;
        afkm afkmVar = (afkm) afknVar.get();
        this.t = afkmVar.c;
        this.u = afkmVar.d;
        this.v = afknVar;
        this.z = aeexVar;
        this.j = amnvVar;
        this.k = f;
        this.l = f2;
        this.x = 1.0f;
        this.q = str;
        this.w = Long.MIN_VALUE;
        this.A = false;
        this.n = afhsVar.aq();
        this.o = amnvVar2;
        this.r = str2;
        this.p = (afhsVar.g.h() && ((awvs) ((ywr) afhsVar.g.c()).c()).c) ? new afdi() : new afdj();
        this.s = afigVar;
        afkg afkgVar = afhsVar.h;
        this.d = afkgVar;
        this.e = afkgVar.b(str2);
        if (afkgVar.f() && aeruVar != null) {
            aeruVar.z(this.e);
        }
        this.C = false;
    }

    static final aeqp j(List list, afcp afcpVar) {
        if (!list.isEmpty()) {
            afcq afcqVar = (afcq) list.get(0);
            long j = afcqVar.c;
            long j2 = afcqVar.b;
            aeso aesoVar = new aeso();
            aesoVar.a(j - j2);
            aesoVar.b(afcpVar.a());
            return aesoVar.c();
        }
        aeso aesoVar2 = new aeso();
        aesoVar2.a(10000000L);
        aesoVar2.b(afcpVar.a());
        return aesoVar2.c();
    }

    private final float k() {
        return avzr.VIDEO_QUALITY_SETTING_HIGHER_QUALITY.equals(this.e) ? this.l : this.k;
    }

    private static int l(int i, int i2) {
        return i > 0 ? i : i2 <= 240 ? 48000 : 128000;
    }

    private final int m() {
        return aeez.b(this.z, this.t, this.u, k(), this.A);
    }

    private final afcp n(afcp[] afcpVarArr, long j) {
        int i = i();
        int m = m();
        afcp afcpVar = null;
        for (afcp afcpVar2 : afcpVarArr) {
            if (p(afcpVar2) && (q(afcpVar2, j) || h(this.i, afcpVar2, this.q, this.h, j))) {
                if (afcpVar2.b() <= i && afcpVar2.b() >= m) {
                    return afcpVar2;
                }
                if (afcpVar == null) {
                    afcpVar = afcpVar2;
                }
            }
        }
        return afcpVar;
    }

    private final afcp o(afcp[] afcpVarArr, long j) {
        int length;
        int min = Math.min(i(), this.e == avzr.VIDEO_QUALITY_SETTING_DATA_SAVER ? this.b.b() : Integer.MAX_VALUE);
        int length2 = afcpVarArr.length - 1;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = afcpVarArr.length;
            if (i2 >= length) {
                break;
            }
            if (afcpVarArr[i2].b() <= min) {
                length2 = i2;
                break;
            }
            i2++;
        }
        int m = m();
        while (true) {
            length--;
            if (length >= 0) {
                if (afcpVarArr[length].b() >= m) {
                    i = length;
                    break;
                }
            } else {
                break;
            }
        }
        if (length2 < i) {
            while (length2 <= i) {
                afcp afcpVar = afcpVarArr[length2];
                aquz aquzVar = this.h.c.e;
                if (aquzVar == null) {
                    aquzVar = aquz.b;
                }
                if (((aquzVar.aR && this.z.e()) || aeez.f(afcpVar.c(), afcpVar.b(), this.t, this.u, k())) && t(afcpVar, j) && aeez.e(afcpVar.a(), l(((Integer) this.j.get()).intValue(), afcpVar.b()), this.z, this.h, this.A, this.g.a()) && ((this.z.d() || this.z.c() || !this.y || s(afcpVar)) && ((avzr.VIDEO_QUALITY_SETTING_HIGHER_QUALITY.equals(this.e) || (!aeez.g(afcpVar.b(), this.g, this.n) && (this.z.d() || this.z.e() || aear.l(this.i, this.q, this.h, afcpVar)))) && p(afcpVar)))) {
                    return afcpVarArr[length2];
                }
                length2++;
            }
            return afcpVarArr[i];
        }
        return afcpVarArr[length2];
    }

    private final boolean p(afcp afcpVar) {
        return this.C ? !r(afcpVar) : afcpVar.b() < this.D || r(afcpVar);
    }

    private final boolean q(afcp afcpVar, long j) {
        return aear.k(this.i, afcpVar, this.q, this.h, this.m, j);
    }

    private static boolean r(afcp afcpVar) {
        return aaoq.r().contains(Integer.valueOf(ozv.a(afcpVar.d())));
    }

    private static boolean s(afcp afcpVar) {
        return ((Set) aaoq.bx.get()).contains(Integer.valueOf(ozv.a(afcpVar.d())));
    }

    private static boolean t(afcp afcpVar, long j) {
        return ((long) afcpVar.a()) <= j;
    }

    private final long u(long j, aeqp aeqpVar, long j2) {
        aquz aquzVar = this.h.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        if (!aquzVar.X) {
            return j;
        }
        if (j2 <= 0) {
            return 0L;
        }
        aquz aquzVar2 = this.h.c.e;
        if (aquzVar2 == null) {
            aquzVar2 = aquz.b;
        }
        if (!aquzVar2.Y) {
            long j3 = aeqpVar.a;
            return Math.max(0L, (j + j3) - ((j3 * aeqpVar.b()) / j2));
        }
        double d = j;
        double min = 1.0d - Math.min(j2 / aeqpVar.b(), 0.8d);
        Double.isNaN(d);
        return (long) Math.max(0.0d, d / min);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x042a, code lost:
    
        if (r11.b != r39.E) goto L208;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0451 A[Catch: all -> 0x04dd, TryCatch #1 {all -> 0x04dd, blocks: (B:21:0x004e, B:23:0x0057, B:25:0x0063, B:26:0x0079, B:28:0x008f, B:30:0x0099, B:33:0x00a4, B:37:0x00b6, B:39:0x00c0, B:41:0x00c8, B:44:0x00ce, B:46:0x00d6, B:47:0x00d8, B:53:0x0103, B:56:0x0119, B:61:0x0190, B:63:0x0196, B:65:0x019e, B:69:0x0329, B:73:0x0335, B:75:0x0343, B:77:0x0349, B:79:0x0352, B:80:0x0359, B:83:0x0397, B:84:0x0402, B:86:0x040a, B:88:0x040e, B:92:0x0435, B:94:0x0439, B:95:0x0440, B:97:0x0444, B:98:0x044b, B:100:0x0451, B:101:0x0457, B:102:0x04b7, B:105:0x041e, B:107:0x0426, B:109:0x042c, B:112:0x04c7, B:118:0x01af, B:122:0x02f4, B:127:0x0300, B:131:0x0312, B:137:0x01c6, B:140:0x01d5, B:142:0x01d9, B:146:0x01e2, B:149:0x020f, B:157:0x0258, B:158:0x021c, B:160:0x0238, B:161:0x023a, B:164:0x0240, B:165:0x0203, B:168:0x0274, B:171:0x0280, B:173:0x028d, B:174:0x028f, B:179:0x0298, B:182:0x02cc, B:184:0x02de, B:185:0x02e0, B:188:0x02e6, B:192:0x0136, B:194:0x0140, B:197:0x0156, B:199:0x015c, B:202:0x0165, B:204:0x0169, B:207:0x0174, B:209:0x0185, B:210:0x0187, B:214:0x014b, B:217:0x010d, B:218:0x00e8, B:219:0x03a0, B:221:0x03ac, B:223:0x03b0, B:225:0x03b6, B:227:0x03bc, B:228:0x03dd, B:231:0x03ed), top: B:20:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0185 A[Catch: all -> 0x04dd, TryCatch #1 {all -> 0x04dd, blocks: (B:21:0x004e, B:23:0x0057, B:25:0x0063, B:26:0x0079, B:28:0x008f, B:30:0x0099, B:33:0x00a4, B:37:0x00b6, B:39:0x00c0, B:41:0x00c8, B:44:0x00ce, B:46:0x00d6, B:47:0x00d8, B:53:0x0103, B:56:0x0119, B:61:0x0190, B:63:0x0196, B:65:0x019e, B:69:0x0329, B:73:0x0335, B:75:0x0343, B:77:0x0349, B:79:0x0352, B:80:0x0359, B:83:0x0397, B:84:0x0402, B:86:0x040a, B:88:0x040e, B:92:0x0435, B:94:0x0439, B:95:0x0440, B:97:0x0444, B:98:0x044b, B:100:0x0451, B:101:0x0457, B:102:0x04b7, B:105:0x041e, B:107:0x0426, B:109:0x042c, B:112:0x04c7, B:118:0x01af, B:122:0x02f4, B:127:0x0300, B:131:0x0312, B:137:0x01c6, B:140:0x01d5, B:142:0x01d9, B:146:0x01e2, B:149:0x020f, B:157:0x0258, B:158:0x021c, B:160:0x0238, B:161:0x023a, B:164:0x0240, B:165:0x0203, B:168:0x0274, B:171:0x0280, B:173:0x028d, B:174:0x028f, B:179:0x0298, B:182:0x02cc, B:184:0x02de, B:185:0x02e0, B:188:0x02e6, B:192:0x0136, B:194:0x0140, B:197:0x0156, B:199:0x015c, B:202:0x0165, B:204:0x0169, B:207:0x0174, B:209:0x0185, B:210:0x0187, B:214:0x014b, B:217:0x010d, B:218:0x00e8, B:219:0x03a0, B:221:0x03ac, B:223:0x03b0, B:225:0x03b6, B:227:0x03bc, B:228:0x03dd, B:231:0x03ed), top: B:20:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6 A[Catch: all -> 0x04dd, TRY_ENTER, TryCatch #1 {all -> 0x04dd, blocks: (B:21:0x004e, B:23:0x0057, B:25:0x0063, B:26:0x0079, B:28:0x008f, B:30:0x0099, B:33:0x00a4, B:37:0x00b6, B:39:0x00c0, B:41:0x00c8, B:44:0x00ce, B:46:0x00d6, B:47:0x00d8, B:53:0x0103, B:56:0x0119, B:61:0x0190, B:63:0x0196, B:65:0x019e, B:69:0x0329, B:73:0x0335, B:75:0x0343, B:77:0x0349, B:79:0x0352, B:80:0x0359, B:83:0x0397, B:84:0x0402, B:86:0x040a, B:88:0x040e, B:92:0x0435, B:94:0x0439, B:95:0x0440, B:97:0x0444, B:98:0x044b, B:100:0x0451, B:101:0x0457, B:102:0x04b7, B:105:0x041e, B:107:0x0426, B:109:0x042c, B:112:0x04c7, B:118:0x01af, B:122:0x02f4, B:127:0x0300, B:131:0x0312, B:137:0x01c6, B:140:0x01d5, B:142:0x01d9, B:146:0x01e2, B:149:0x020f, B:157:0x0258, B:158:0x021c, B:160:0x0238, B:161:0x023a, B:164:0x0240, B:165:0x0203, B:168:0x0274, B:171:0x0280, B:173:0x028d, B:174:0x028f, B:179:0x0298, B:182:0x02cc, B:184:0x02de, B:185:0x02e0, B:188:0x02e6, B:192:0x0136, B:194:0x0140, B:197:0x0156, B:199:0x015c, B:202:0x0165, B:204:0x0169, B:207:0x0174, B:209:0x0185, B:210:0x0187, B:214:0x014b, B:217:0x010d, B:218:0x00e8, B:219:0x03a0, B:221:0x03ac, B:223:0x03b0, B:225:0x03b6, B:227:0x03bc, B:228:0x03dd, B:231:0x03ed), top: B:20:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190 A[Catch: all -> 0x04dd, TryCatch #1 {all -> 0x04dd, blocks: (B:21:0x004e, B:23:0x0057, B:25:0x0063, B:26:0x0079, B:28:0x008f, B:30:0x0099, B:33:0x00a4, B:37:0x00b6, B:39:0x00c0, B:41:0x00c8, B:44:0x00ce, B:46:0x00d6, B:47:0x00d8, B:53:0x0103, B:56:0x0119, B:61:0x0190, B:63:0x0196, B:65:0x019e, B:69:0x0329, B:73:0x0335, B:75:0x0343, B:77:0x0349, B:79:0x0352, B:80:0x0359, B:83:0x0397, B:84:0x0402, B:86:0x040a, B:88:0x040e, B:92:0x0435, B:94:0x0439, B:95:0x0440, B:97:0x0444, B:98:0x044b, B:100:0x0451, B:101:0x0457, B:102:0x04b7, B:105:0x041e, B:107:0x0426, B:109:0x042c, B:112:0x04c7, B:118:0x01af, B:122:0x02f4, B:127:0x0300, B:131:0x0312, B:137:0x01c6, B:140:0x01d5, B:142:0x01d9, B:146:0x01e2, B:149:0x020f, B:157:0x0258, B:158:0x021c, B:160:0x0238, B:161:0x023a, B:164:0x0240, B:165:0x0203, B:168:0x0274, B:171:0x0280, B:173:0x028d, B:174:0x028f, B:179:0x0298, B:182:0x02cc, B:184:0x02de, B:185:0x02e0, B:188:0x02e6, B:192:0x0136, B:194:0x0140, B:197:0x0156, B:199:0x015c, B:202:0x0165, B:204:0x0169, B:207:0x0174, B:209:0x0185, B:210:0x0187, B:214:0x014b, B:217:0x010d, B:218:0x00e8, B:219:0x03a0, B:221:0x03ac, B:223:0x03b0, B:225:0x03b6, B:227:0x03bc, B:228:0x03dd, B:231:0x03ed), top: B:20:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0331 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0349 A[Catch: all -> 0x04dd, TryCatch #1 {all -> 0x04dd, blocks: (B:21:0x004e, B:23:0x0057, B:25:0x0063, B:26:0x0079, B:28:0x008f, B:30:0x0099, B:33:0x00a4, B:37:0x00b6, B:39:0x00c0, B:41:0x00c8, B:44:0x00ce, B:46:0x00d6, B:47:0x00d8, B:53:0x0103, B:56:0x0119, B:61:0x0190, B:63:0x0196, B:65:0x019e, B:69:0x0329, B:73:0x0335, B:75:0x0343, B:77:0x0349, B:79:0x0352, B:80:0x0359, B:83:0x0397, B:84:0x0402, B:86:0x040a, B:88:0x040e, B:92:0x0435, B:94:0x0439, B:95:0x0440, B:97:0x0444, B:98:0x044b, B:100:0x0451, B:101:0x0457, B:102:0x04b7, B:105:0x041e, B:107:0x0426, B:109:0x042c, B:112:0x04c7, B:118:0x01af, B:122:0x02f4, B:127:0x0300, B:131:0x0312, B:137:0x01c6, B:140:0x01d5, B:142:0x01d9, B:146:0x01e2, B:149:0x020f, B:157:0x0258, B:158:0x021c, B:160:0x0238, B:161:0x023a, B:164:0x0240, B:165:0x0203, B:168:0x0274, B:171:0x0280, B:173:0x028d, B:174:0x028f, B:179:0x0298, B:182:0x02cc, B:184:0x02de, B:185:0x02e0, B:188:0x02e6, B:192:0x0136, B:194:0x0140, B:197:0x0156, B:199:0x015c, B:202:0x0165, B:204:0x0169, B:207:0x0174, B:209:0x0185, B:210:0x0187, B:214:0x014b, B:217:0x010d, B:218:0x00e8, B:219:0x03a0, B:221:0x03ac, B:223:0x03b0, B:225:0x03b6, B:227:0x03bc, B:228:0x03dd, B:231:0x03ed), top: B:20:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0352 A[Catch: all -> 0x04dd, TryCatch #1 {all -> 0x04dd, blocks: (B:21:0x004e, B:23:0x0057, B:25:0x0063, B:26:0x0079, B:28:0x008f, B:30:0x0099, B:33:0x00a4, B:37:0x00b6, B:39:0x00c0, B:41:0x00c8, B:44:0x00ce, B:46:0x00d6, B:47:0x00d8, B:53:0x0103, B:56:0x0119, B:61:0x0190, B:63:0x0196, B:65:0x019e, B:69:0x0329, B:73:0x0335, B:75:0x0343, B:77:0x0349, B:79:0x0352, B:80:0x0359, B:83:0x0397, B:84:0x0402, B:86:0x040a, B:88:0x040e, B:92:0x0435, B:94:0x0439, B:95:0x0440, B:97:0x0444, B:98:0x044b, B:100:0x0451, B:101:0x0457, B:102:0x04b7, B:105:0x041e, B:107:0x0426, B:109:0x042c, B:112:0x04c7, B:118:0x01af, B:122:0x02f4, B:127:0x0300, B:131:0x0312, B:137:0x01c6, B:140:0x01d5, B:142:0x01d9, B:146:0x01e2, B:149:0x020f, B:157:0x0258, B:158:0x021c, B:160:0x0238, B:161:0x023a, B:164:0x0240, B:165:0x0203, B:168:0x0274, B:171:0x0280, B:173:0x028d, B:174:0x028f, B:179:0x0298, B:182:0x02cc, B:184:0x02de, B:185:0x02e0, B:188:0x02e6, B:192:0x0136, B:194:0x0140, B:197:0x0156, B:199:0x015c, B:202:0x0165, B:204:0x0169, B:207:0x0174, B:209:0x0185, B:210:0x0187, B:214:0x014b, B:217:0x010d, B:218:0x00e8, B:219:0x03a0, B:221:0x03ac, B:223:0x03b0, B:225:0x03b6, B:227:0x03bc, B:228:0x03dd, B:231:0x03ed), top: B:20:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x040a A[Catch: all -> 0x04dd, TryCatch #1 {all -> 0x04dd, blocks: (B:21:0x004e, B:23:0x0057, B:25:0x0063, B:26:0x0079, B:28:0x008f, B:30:0x0099, B:33:0x00a4, B:37:0x00b6, B:39:0x00c0, B:41:0x00c8, B:44:0x00ce, B:46:0x00d6, B:47:0x00d8, B:53:0x0103, B:56:0x0119, B:61:0x0190, B:63:0x0196, B:65:0x019e, B:69:0x0329, B:73:0x0335, B:75:0x0343, B:77:0x0349, B:79:0x0352, B:80:0x0359, B:83:0x0397, B:84:0x0402, B:86:0x040a, B:88:0x040e, B:92:0x0435, B:94:0x0439, B:95:0x0440, B:97:0x0444, B:98:0x044b, B:100:0x0451, B:101:0x0457, B:102:0x04b7, B:105:0x041e, B:107:0x0426, B:109:0x042c, B:112:0x04c7, B:118:0x01af, B:122:0x02f4, B:127:0x0300, B:131:0x0312, B:137:0x01c6, B:140:0x01d5, B:142:0x01d9, B:146:0x01e2, B:149:0x020f, B:157:0x0258, B:158:0x021c, B:160:0x0238, B:161:0x023a, B:164:0x0240, B:165:0x0203, B:168:0x0274, B:171:0x0280, B:173:0x028d, B:174:0x028f, B:179:0x0298, B:182:0x02cc, B:184:0x02de, B:185:0x02e0, B:188:0x02e6, B:192:0x0136, B:194:0x0140, B:197:0x0156, B:199:0x015c, B:202:0x0165, B:204:0x0169, B:207:0x0174, B:209:0x0185, B:210:0x0187, B:214:0x014b, B:217:0x010d, B:218:0x00e8, B:219:0x03a0, B:221:0x03ac, B:223:0x03b0, B:225:0x03b6, B:227:0x03bc, B:228:0x03dd, B:231:0x03ed), top: B:20:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0439 A[Catch: all -> 0x04dd, TryCatch #1 {all -> 0x04dd, blocks: (B:21:0x004e, B:23:0x0057, B:25:0x0063, B:26:0x0079, B:28:0x008f, B:30:0x0099, B:33:0x00a4, B:37:0x00b6, B:39:0x00c0, B:41:0x00c8, B:44:0x00ce, B:46:0x00d6, B:47:0x00d8, B:53:0x0103, B:56:0x0119, B:61:0x0190, B:63:0x0196, B:65:0x019e, B:69:0x0329, B:73:0x0335, B:75:0x0343, B:77:0x0349, B:79:0x0352, B:80:0x0359, B:83:0x0397, B:84:0x0402, B:86:0x040a, B:88:0x040e, B:92:0x0435, B:94:0x0439, B:95:0x0440, B:97:0x0444, B:98:0x044b, B:100:0x0451, B:101:0x0457, B:102:0x04b7, B:105:0x041e, B:107:0x0426, B:109:0x042c, B:112:0x04c7, B:118:0x01af, B:122:0x02f4, B:127:0x0300, B:131:0x0312, B:137:0x01c6, B:140:0x01d5, B:142:0x01d9, B:146:0x01e2, B:149:0x020f, B:157:0x0258, B:158:0x021c, B:160:0x0238, B:161:0x023a, B:164:0x0240, B:165:0x0203, B:168:0x0274, B:171:0x0280, B:173:0x028d, B:174:0x028f, B:179:0x0298, B:182:0x02cc, B:184:0x02de, B:185:0x02e0, B:188:0x02e6, B:192:0x0136, B:194:0x0140, B:197:0x0156, B:199:0x015c, B:202:0x0165, B:204:0x0169, B:207:0x0174, B:209:0x0185, B:210:0x0187, B:214:0x014b, B:217:0x010d, B:218:0x00e8, B:219:0x03a0, B:221:0x03ac, B:223:0x03b0, B:225:0x03b6, B:227:0x03bc, B:228:0x03dd, B:231:0x03ed), top: B:20:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0444 A[Catch: all -> 0x04dd, TryCatch #1 {all -> 0x04dd, blocks: (B:21:0x004e, B:23:0x0057, B:25:0x0063, B:26:0x0079, B:28:0x008f, B:30:0x0099, B:33:0x00a4, B:37:0x00b6, B:39:0x00c0, B:41:0x00c8, B:44:0x00ce, B:46:0x00d6, B:47:0x00d8, B:53:0x0103, B:56:0x0119, B:61:0x0190, B:63:0x0196, B:65:0x019e, B:69:0x0329, B:73:0x0335, B:75:0x0343, B:77:0x0349, B:79:0x0352, B:80:0x0359, B:83:0x0397, B:84:0x0402, B:86:0x040a, B:88:0x040e, B:92:0x0435, B:94:0x0439, B:95:0x0440, B:97:0x0444, B:98:0x044b, B:100:0x0451, B:101:0x0457, B:102:0x04b7, B:105:0x041e, B:107:0x0426, B:109:0x042c, B:112:0x04c7, B:118:0x01af, B:122:0x02f4, B:127:0x0300, B:131:0x0312, B:137:0x01c6, B:140:0x01d5, B:142:0x01d9, B:146:0x01e2, B:149:0x020f, B:157:0x0258, B:158:0x021c, B:160:0x0238, B:161:0x023a, B:164:0x0240, B:165:0x0203, B:168:0x0274, B:171:0x0280, B:173:0x028d, B:174:0x028f, B:179:0x0298, B:182:0x02cc, B:184:0x02de, B:185:0x02e0, B:188:0x02e6, B:192:0x0136, B:194:0x0140, B:197:0x0156, B:199:0x015c, B:202:0x0165, B:204:0x0169, B:207:0x0174, B:209:0x0185, B:210:0x0187, B:214:0x014b, B:217:0x010d, B:218:0x00e8, B:219:0x03a0, B:221:0x03ac, B:223:0x03b0, B:225:0x03b6, B:227:0x03bc, B:228:0x03dd, B:231:0x03ed), top: B:20:0x004e }] */
    @Override // defpackage.afcr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List r40, long r41, long r43, defpackage.afcp[] r45, defpackage.afco r46) {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdl.a(java.util.List, long, long, afcp[], afco):void");
    }

    @Override // defpackage.afcr
    public final void b(boolean z) {
        this.A = z;
    }

    @Override // defpackage.afcr
    public final void c() {
        this.C = true;
    }

    @Override // defpackage.afcr
    public final void d(float f) {
        this.x = f;
    }

    @Override // defpackage.afcr
    public final void e() {
        this.y = true;
    }

    @Override // defpackage.afcr
    public final void f(aeex aeexVar) {
        this.z = aeexVar;
    }

    @Override // defpackage.afcr
    public final void g(afkm afkmVar) {
        this.t = afkmVar.c;
        this.u = afkmVar.d;
    }

    final int i() {
        return aeez.a(this.z, this.t, this.u, k(), this.A);
    }
}
