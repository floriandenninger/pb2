package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qjk implements qen {
    public final Object a;
    public final qla b;
    public final List c = new CopyOnWriteArrayList();
    public final List d = new CopyOnWriteArrayList();
    public final Map e;
    private final Handler f;
    private final qjb g;
    private final qio h;
    private qep i;

    static {
        String str = qla.e;
    }

    public qjk(qla qlaVar) {
        new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.a = new Object();
        this.f = new amcc(Looper.getMainLooper(), (byte[]) null);
        qjb qjbVar = new qjb(this);
        this.g = qjbVar;
        this.b = qlaVar;
        qlaVar.E = new qjj(this);
        qlaVar.c = qjbVar;
        if (qlaVar.c == null) {
            qlaVar.b();
        }
        this.h = new qio(this);
    }

    public static final void u(qjg qjgVar) {
        try {
            if (!qjgVar.c) {
                Iterator it = qjgVar.d.c.iterator();
                while (it.hasNext()) {
                    ((qjd) it.next()).e();
                }
                for (qip qipVar : qjgVar.d.d) {
                }
            }
            try {
                synchronized (qjgVar.d.a) {
                    qjgVar.b();
                }
            } catch (qkz unused) {
                qjgVar.n(qjg.d(new Status(2100)));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused2) {
            qjgVar.n(qjg.d(new Status(2100)));
        }
    }

    public static final qoi v() {
        qjc qjcVar = new qjc();
        qjcVar.n(qjc.b(new Status(17, null)));
        return qjcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f9 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:11:0x0099, B:16:0x00a4, B:18:0x00ac, B:20:0x00b4, B:21:0x00ba, B:25:0x00cb, B:27:0x00d7, B:28:0x00e4, B:30:0x00ea, B:32:0x00fb, B:33:0x0105, B:35:0x010b, B:39:0x0115, B:41:0x0121, B:43:0x0135, B:53:0x0171, B:55:0x0186, B:56:0x01a6, B:58:0x01ac, B:61:0x01b6, B:64:0x01bc, B:65:0x01c6, B:67:0x01cc, B:70:0x01d6, B:71:0x01e0, B:73:0x01e6, B:76:0x01f0, B:77:0x01fa, B:79:0x0200, B:94:0x020a, B:96:0x0216, B:98:0x0220, B:102:0x0226, B:103:0x022c, B:105:0x0232, B:107:0x0240, B:109:0x0244, B:110:0x0251, B:112:0x0257, B:116:0x025e, B:117:0x026d, B:119:0x0273, B:122:0x0283, B:124:0x028f, B:126:0x0299, B:127:0x02a8, B:129:0x02ae, B:132:0x02bc, B:134:0x02c8, B:136:0x02da, B:141:0x02f9, B:144:0x02fe, B:145:0x0312, B:147:0x0316, B:148:0x0322, B:150:0x0326, B:151:0x032f, B:153:0x0333, B:154:0x0339, B:156:0x033d, B:157:0x0340, B:159:0x0344, B:160:0x0347, B:162:0x034b, B:163:0x034e, B:165:0x0352, B:167:0x035c, B:168:0x0364, B:170:0x036a, B:172:0x0374, B:173:0x037c, B:175:0x0382, B:177:0x0389, B:179:0x038d, B:180:0x03a6, B:181:0x03ac, B:183:0x03b2, B:186:0x0303, B:187:0x02e5, B:189:0x02ed, B:193:0x0397), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0316 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:11:0x0099, B:16:0x00a4, B:18:0x00ac, B:20:0x00b4, B:21:0x00ba, B:25:0x00cb, B:27:0x00d7, B:28:0x00e4, B:30:0x00ea, B:32:0x00fb, B:33:0x0105, B:35:0x010b, B:39:0x0115, B:41:0x0121, B:43:0x0135, B:53:0x0171, B:55:0x0186, B:56:0x01a6, B:58:0x01ac, B:61:0x01b6, B:64:0x01bc, B:65:0x01c6, B:67:0x01cc, B:70:0x01d6, B:71:0x01e0, B:73:0x01e6, B:76:0x01f0, B:77:0x01fa, B:79:0x0200, B:94:0x020a, B:96:0x0216, B:98:0x0220, B:102:0x0226, B:103:0x022c, B:105:0x0232, B:107:0x0240, B:109:0x0244, B:110:0x0251, B:112:0x0257, B:116:0x025e, B:117:0x026d, B:119:0x0273, B:122:0x0283, B:124:0x028f, B:126:0x0299, B:127:0x02a8, B:129:0x02ae, B:132:0x02bc, B:134:0x02c8, B:136:0x02da, B:141:0x02f9, B:144:0x02fe, B:145:0x0312, B:147:0x0316, B:148:0x0322, B:150:0x0326, B:151:0x032f, B:153:0x0333, B:154:0x0339, B:156:0x033d, B:157:0x0340, B:159:0x0344, B:160:0x0347, B:162:0x034b, B:163:0x034e, B:165:0x0352, B:167:0x035c, B:168:0x0364, B:170:0x036a, B:172:0x0374, B:173:0x037c, B:175:0x0382, B:177:0x0389, B:179:0x038d, B:180:0x03a6, B:181:0x03ac, B:183:0x03b2, B:186:0x0303, B:187:0x02e5, B:189:0x02ed, B:193:0x0397), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0326 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:11:0x0099, B:16:0x00a4, B:18:0x00ac, B:20:0x00b4, B:21:0x00ba, B:25:0x00cb, B:27:0x00d7, B:28:0x00e4, B:30:0x00ea, B:32:0x00fb, B:33:0x0105, B:35:0x010b, B:39:0x0115, B:41:0x0121, B:43:0x0135, B:53:0x0171, B:55:0x0186, B:56:0x01a6, B:58:0x01ac, B:61:0x01b6, B:64:0x01bc, B:65:0x01c6, B:67:0x01cc, B:70:0x01d6, B:71:0x01e0, B:73:0x01e6, B:76:0x01f0, B:77:0x01fa, B:79:0x0200, B:94:0x020a, B:96:0x0216, B:98:0x0220, B:102:0x0226, B:103:0x022c, B:105:0x0232, B:107:0x0240, B:109:0x0244, B:110:0x0251, B:112:0x0257, B:116:0x025e, B:117:0x026d, B:119:0x0273, B:122:0x0283, B:124:0x028f, B:126:0x0299, B:127:0x02a8, B:129:0x02ae, B:132:0x02bc, B:134:0x02c8, B:136:0x02da, B:141:0x02f9, B:144:0x02fe, B:145:0x0312, B:147:0x0316, B:148:0x0322, B:150:0x0326, B:151:0x032f, B:153:0x0333, B:154:0x0339, B:156:0x033d, B:157:0x0340, B:159:0x0344, B:160:0x0347, B:162:0x034b, B:163:0x034e, B:165:0x0352, B:167:0x035c, B:168:0x0364, B:170:0x036a, B:172:0x0374, B:173:0x037c, B:175:0x0382, B:177:0x0389, B:179:0x038d, B:180:0x03a6, B:181:0x03ac, B:183:0x03b2, B:186:0x0303, B:187:0x02e5, B:189:0x02ed, B:193:0x0397), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0333 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:11:0x0099, B:16:0x00a4, B:18:0x00ac, B:20:0x00b4, B:21:0x00ba, B:25:0x00cb, B:27:0x00d7, B:28:0x00e4, B:30:0x00ea, B:32:0x00fb, B:33:0x0105, B:35:0x010b, B:39:0x0115, B:41:0x0121, B:43:0x0135, B:53:0x0171, B:55:0x0186, B:56:0x01a6, B:58:0x01ac, B:61:0x01b6, B:64:0x01bc, B:65:0x01c6, B:67:0x01cc, B:70:0x01d6, B:71:0x01e0, B:73:0x01e6, B:76:0x01f0, B:77:0x01fa, B:79:0x0200, B:94:0x020a, B:96:0x0216, B:98:0x0220, B:102:0x0226, B:103:0x022c, B:105:0x0232, B:107:0x0240, B:109:0x0244, B:110:0x0251, B:112:0x0257, B:116:0x025e, B:117:0x026d, B:119:0x0273, B:122:0x0283, B:124:0x028f, B:126:0x0299, B:127:0x02a8, B:129:0x02ae, B:132:0x02bc, B:134:0x02c8, B:136:0x02da, B:141:0x02f9, B:144:0x02fe, B:145:0x0312, B:147:0x0316, B:148:0x0322, B:150:0x0326, B:151:0x032f, B:153:0x0333, B:154:0x0339, B:156:0x033d, B:157:0x0340, B:159:0x0344, B:160:0x0347, B:162:0x034b, B:163:0x034e, B:165:0x0352, B:167:0x035c, B:168:0x0364, B:170:0x036a, B:172:0x0374, B:173:0x037c, B:175:0x0382, B:177:0x0389, B:179:0x038d, B:180:0x03a6, B:181:0x03ac, B:183:0x03b2, B:186:0x0303, B:187:0x02e5, B:189:0x02ed, B:193:0x0397), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x033d A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:11:0x0099, B:16:0x00a4, B:18:0x00ac, B:20:0x00b4, B:21:0x00ba, B:25:0x00cb, B:27:0x00d7, B:28:0x00e4, B:30:0x00ea, B:32:0x00fb, B:33:0x0105, B:35:0x010b, B:39:0x0115, B:41:0x0121, B:43:0x0135, B:53:0x0171, B:55:0x0186, B:56:0x01a6, B:58:0x01ac, B:61:0x01b6, B:64:0x01bc, B:65:0x01c6, B:67:0x01cc, B:70:0x01d6, B:71:0x01e0, B:73:0x01e6, B:76:0x01f0, B:77:0x01fa, B:79:0x0200, B:94:0x020a, B:96:0x0216, B:98:0x0220, B:102:0x0226, B:103:0x022c, B:105:0x0232, B:107:0x0240, B:109:0x0244, B:110:0x0251, B:112:0x0257, B:116:0x025e, B:117:0x026d, B:119:0x0273, B:122:0x0283, B:124:0x028f, B:126:0x0299, B:127:0x02a8, B:129:0x02ae, B:132:0x02bc, B:134:0x02c8, B:136:0x02da, B:141:0x02f9, B:144:0x02fe, B:145:0x0312, B:147:0x0316, B:148:0x0322, B:150:0x0326, B:151:0x032f, B:153:0x0333, B:154:0x0339, B:156:0x033d, B:157:0x0340, B:159:0x0344, B:160:0x0347, B:162:0x034b, B:163:0x034e, B:165:0x0352, B:167:0x035c, B:168:0x0364, B:170:0x036a, B:172:0x0374, B:173:0x037c, B:175:0x0382, B:177:0x0389, B:179:0x038d, B:180:0x03a6, B:181:0x03ac, B:183:0x03b2, B:186:0x0303, B:187:0x02e5, B:189:0x02ed, B:193:0x0397), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0344 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:11:0x0099, B:16:0x00a4, B:18:0x00ac, B:20:0x00b4, B:21:0x00ba, B:25:0x00cb, B:27:0x00d7, B:28:0x00e4, B:30:0x00ea, B:32:0x00fb, B:33:0x0105, B:35:0x010b, B:39:0x0115, B:41:0x0121, B:43:0x0135, B:53:0x0171, B:55:0x0186, B:56:0x01a6, B:58:0x01ac, B:61:0x01b6, B:64:0x01bc, B:65:0x01c6, B:67:0x01cc, B:70:0x01d6, B:71:0x01e0, B:73:0x01e6, B:76:0x01f0, B:77:0x01fa, B:79:0x0200, B:94:0x020a, B:96:0x0216, B:98:0x0220, B:102:0x0226, B:103:0x022c, B:105:0x0232, B:107:0x0240, B:109:0x0244, B:110:0x0251, B:112:0x0257, B:116:0x025e, B:117:0x026d, B:119:0x0273, B:122:0x0283, B:124:0x028f, B:126:0x0299, B:127:0x02a8, B:129:0x02ae, B:132:0x02bc, B:134:0x02c8, B:136:0x02da, B:141:0x02f9, B:144:0x02fe, B:145:0x0312, B:147:0x0316, B:148:0x0322, B:150:0x0326, B:151:0x032f, B:153:0x0333, B:154:0x0339, B:156:0x033d, B:157:0x0340, B:159:0x0344, B:160:0x0347, B:162:0x034b, B:163:0x034e, B:165:0x0352, B:167:0x035c, B:168:0x0364, B:170:0x036a, B:172:0x0374, B:173:0x037c, B:175:0x0382, B:177:0x0389, B:179:0x038d, B:180:0x03a6, B:181:0x03ac, B:183:0x03b2, B:186:0x0303, B:187:0x02e5, B:189:0x02ed, B:193:0x0397), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x034b A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:11:0x0099, B:16:0x00a4, B:18:0x00ac, B:20:0x00b4, B:21:0x00ba, B:25:0x00cb, B:27:0x00d7, B:28:0x00e4, B:30:0x00ea, B:32:0x00fb, B:33:0x0105, B:35:0x010b, B:39:0x0115, B:41:0x0121, B:43:0x0135, B:53:0x0171, B:55:0x0186, B:56:0x01a6, B:58:0x01ac, B:61:0x01b6, B:64:0x01bc, B:65:0x01c6, B:67:0x01cc, B:70:0x01d6, B:71:0x01e0, B:73:0x01e6, B:76:0x01f0, B:77:0x01fa, B:79:0x0200, B:94:0x020a, B:96:0x0216, B:98:0x0220, B:102:0x0226, B:103:0x022c, B:105:0x0232, B:107:0x0240, B:109:0x0244, B:110:0x0251, B:112:0x0257, B:116:0x025e, B:117:0x026d, B:119:0x0273, B:122:0x0283, B:124:0x028f, B:126:0x0299, B:127:0x02a8, B:129:0x02ae, B:132:0x02bc, B:134:0x02c8, B:136:0x02da, B:141:0x02f9, B:144:0x02fe, B:145:0x0312, B:147:0x0316, B:148:0x0322, B:150:0x0326, B:151:0x032f, B:153:0x0333, B:154:0x0339, B:156:0x033d, B:157:0x0340, B:159:0x0344, B:160:0x0347, B:162:0x034b, B:163:0x034e, B:165:0x0352, B:167:0x035c, B:168:0x0364, B:170:0x036a, B:172:0x0374, B:173:0x037c, B:175:0x0382, B:177:0x0389, B:179:0x038d, B:180:0x03a6, B:181:0x03ac, B:183:0x03b2, B:186:0x0303, B:187:0x02e5, B:189:0x02ed, B:193:0x0397), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0352 A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:11:0x0099, B:16:0x00a4, B:18:0x00ac, B:20:0x00b4, B:21:0x00ba, B:25:0x00cb, B:27:0x00d7, B:28:0x00e4, B:30:0x00ea, B:32:0x00fb, B:33:0x0105, B:35:0x010b, B:39:0x0115, B:41:0x0121, B:43:0x0135, B:53:0x0171, B:55:0x0186, B:56:0x01a6, B:58:0x01ac, B:61:0x01b6, B:64:0x01bc, B:65:0x01c6, B:67:0x01cc, B:70:0x01d6, B:71:0x01e0, B:73:0x01e6, B:76:0x01f0, B:77:0x01fa, B:79:0x0200, B:94:0x020a, B:96:0x0216, B:98:0x0220, B:102:0x0226, B:103:0x022c, B:105:0x0232, B:107:0x0240, B:109:0x0244, B:110:0x0251, B:112:0x0257, B:116:0x025e, B:117:0x026d, B:119:0x0273, B:122:0x0283, B:124:0x028f, B:126:0x0299, B:127:0x02a8, B:129:0x02ae, B:132:0x02bc, B:134:0x02c8, B:136:0x02da, B:141:0x02f9, B:144:0x02fe, B:145:0x0312, B:147:0x0316, B:148:0x0322, B:150:0x0326, B:151:0x032f, B:153:0x0333, B:154:0x0339, B:156:0x033d, B:157:0x0340, B:159:0x0344, B:160:0x0347, B:162:0x034b, B:163:0x034e, B:165:0x0352, B:167:0x035c, B:168:0x0364, B:170:0x036a, B:172:0x0374, B:173:0x037c, B:175:0x0382, B:177:0x0389, B:179:0x038d, B:180:0x03a6, B:181:0x03ac, B:183:0x03b2, B:186:0x0303, B:187:0x02e5, B:189:0x02ed, B:193:0x0397), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x038d A[Catch: JSONException -> 0x03bd, TryCatch #0 {JSONException -> 0x03bd, blocks: (B:3:0x000d, B:11:0x0099, B:16:0x00a4, B:18:0x00ac, B:20:0x00b4, B:21:0x00ba, B:25:0x00cb, B:27:0x00d7, B:28:0x00e4, B:30:0x00ea, B:32:0x00fb, B:33:0x0105, B:35:0x010b, B:39:0x0115, B:41:0x0121, B:43:0x0135, B:53:0x0171, B:55:0x0186, B:56:0x01a6, B:58:0x01ac, B:61:0x01b6, B:64:0x01bc, B:65:0x01c6, B:67:0x01cc, B:70:0x01d6, B:71:0x01e0, B:73:0x01e6, B:76:0x01f0, B:77:0x01fa, B:79:0x0200, B:94:0x020a, B:96:0x0216, B:98:0x0220, B:102:0x0226, B:103:0x022c, B:105:0x0232, B:107:0x0240, B:109:0x0244, B:110:0x0251, B:112:0x0257, B:116:0x025e, B:117:0x026d, B:119:0x0273, B:122:0x0283, B:124:0x028f, B:126:0x0299, B:127:0x02a8, B:129:0x02ae, B:132:0x02bc, B:134:0x02c8, B:136:0x02da, B:141:0x02f9, B:144:0x02fe, B:145:0x0312, B:147:0x0316, B:148:0x0322, B:150:0x0326, B:151:0x032f, B:153:0x0333, B:154:0x0339, B:156:0x033d, B:157:0x0340, B:159:0x0344, B:160:0x0347, B:162:0x034b, B:163:0x034e, B:165:0x0352, B:167:0x035c, B:168:0x0364, B:170:0x036a, B:172:0x0374, B:173:0x037c, B:175:0x0382, B:177:0x0389, B:179:0x038d, B:180:0x03a6, B:181:0x03ac, B:183:0x03b2, B:186:0x0303, B:187:0x02e5, B:189:0x02ed, B:193:0x0397), top: B:2:0x000d }] */
    @Override // defpackage.qen
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjk.a(java.lang.String, java.lang.String):void");
    }

    public final int b() {
        int i;
        synchronized (this.a) {
            qip.as("Must be called from the main thread.");
            MediaStatus e = e();
            i = e != null ? e.e : 1;
        }
        return i;
    }

    public final long c() {
        long j;
        MediaStatus mediaStatus;
        MediaLiveSeekableRange mediaLiveSeekableRange;
        synchronized (this.a) {
            qip.as("Must be called from the main thread.");
            qla qlaVar = this.b;
            MediaInfo h = qlaVar.h();
            j = 0;
            if (h != null && (mediaStatus = qlaVar.g) != null) {
                Long l = qlaVar.h;
                if (l != null) {
                    if (l.equals(4294967296000L)) {
                        if (qlaVar.g.u != null) {
                            long longValue = l.longValue();
                            MediaStatus mediaStatus2 = qlaVar.g;
                            if (mediaStatus2 != null && (mediaLiveSeekableRange = mediaStatus2.u) != null) {
                                long j2 = mediaLiveSeekableRange.b;
                                j = !mediaLiveSeekableRange.d ? qlaVar.e(1.0d, j2, -1L) : j2;
                            }
                            j = Math.min(longValue, j);
                        } else if (qlaVar.g() >= 0) {
                            j = Math.min(l.longValue(), qlaVar.g());
                        }
                    }
                    j = l.longValue();
                } else if (qlaVar.f != 0) {
                    double d = mediaStatus.d;
                    long j3 = mediaStatus.g;
                    int i = mediaStatus.e;
                    if (d != 0.0d && i == 2) {
                        j = qlaVar.e(d, j3, h.e);
                    }
                    j = j3;
                }
            }
        }
        return j;
    }

    public final MediaInfo d() {
        MediaInfo h;
        synchronized (this.a) {
            qip.as("Must be called from the main thread.");
            h = this.b.h();
        }
        return h;
    }

    public final MediaStatus e() {
        MediaStatus mediaStatus;
        synchronized (this.a) {
            qip.as("Must be called from the main thread.");
            mediaStatus = this.b.g;
        }
        return mediaStatus;
    }

    public final qoi f() {
        qip.as("Must be called from the main thread.");
        if (!l()) {
            return v();
        }
        qiw qiwVar = new qiw(this);
        u(qiwVar);
        return qiwVar;
    }

    public final qoi g() {
        qip.as("Must be called from the main thread.");
        if (!l()) {
            return v();
        }
        qix qixVar = new qix(this);
        u(qixVar);
        return qixVar;
    }

    public final String h() {
        qip.as("Must be called from the main thread.");
        return this.b.b;
    }

    public final void i() {
        qep qepVar = this.i;
        if (qepVar == null) {
            return;
        }
        qepVar.d(h(), this);
        qip.as("Must be called from the main thread.");
        if (!l()) {
            v();
        } else {
            u(new qir(this));
        }
    }

    public final void j(qep qepVar) {
        qep qepVar2 = this.i;
        if (qepVar2 == qepVar) {
            return;
        }
        if (qepVar2 != null) {
            this.b.b();
            this.h.b();
            qepVar2.c(h());
            this.g.a = null;
            this.f.removeCallbacksAndMessages(null);
        }
        this.i = qepVar;
        if (qepVar != null) {
            this.g.a = qepVar;
        }
    }

    public final void k() {
        qip.as("Must be called from the main thread.");
        int b = b();
        if (b == 4 || b == 2) {
            f();
        } else {
            g();
        }
    }

    public final boolean l() {
        return this.i != null;
    }

    public final boolean m() {
        qip.as("Must be called from the main thread.");
        if (n()) {
            return true;
        }
        qip.as("Must be called from the main thread.");
        MediaStatus e = e();
        return (e != null && e.e == 5) || r() || q() || p();
    }

    public final boolean n() {
        qip.as("Must be called from the main thread.");
        MediaStatus e = e();
        return e != null && e.e == 4;
    }

    public final boolean o() {
        qip.as("Must be called from the main thread.");
        MediaInfo d = d();
        return d != null && d.b == 2;
    }

    public final boolean p() {
        qip.as("Must be called from the main thread.");
        MediaStatus e = e();
        return (e == null || e.l == 0) ? false : true;
    }

    public final boolean q() {
        int i;
        qip.as("Must be called from the main thread.");
        MediaStatus e = e();
        if (e != null) {
            if (e.e == 3) {
                return true;
            }
            if (o()) {
                synchronized (this.a) {
                    qip.as("Must be called from the main thread.");
                    MediaStatus e2 = e();
                    i = e2 != null ? e2.f : 0;
                }
                if (i == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r() {
        qip.as("Must be called from the main thread.");
        MediaStatus e = e();
        return e != null && e.e == 2;
    }

    public final boolean s() {
        qip.as("Must be called from the main thread.");
        MediaStatus e = e();
        return e != null && e.r;
    }

    public final void t(qfi qfiVar) {
        qip.as("Must be called from the main thread.");
        if (!l()) {
            v();
        } else {
            u(new qiy(this, qfiVar));
        }
    }
}
