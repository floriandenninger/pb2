package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agdv implements agdt {
    private final zfe a;
    private final agdu b;
    private final agsm c;
    protected final shf d;
    public jkh e;
    private final aghp f;
    private final aaxn g;

    public agdv(shf shfVar, zfe zfeVar, aaxn aaxnVar, agdu agduVar, agsm agsmVar, aghp aghpVar, byte[] bArr, byte[] bArr2) {
        this.d = shfVar;
        this.a = zfeVar;
        this.g = aaxnVar;
        this.b = agduVar;
        this.c = agsmVar;
        this.f = aghpVar;
    }

    private static int b(shf shfVar, Collection collection) {
        Iterator it = collection.iterator();
        int i = Integer.MAX_VALUE;
        while (it.hasNext()) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(shfVar.c() - ((agnv) it.next()).g);
            if (seconds >= 0 && seconds < i) {
                i = seconds;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x0319, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0029, B:7:0x0031, B:9:0x0037, B:14:0x005b, B:17:0x0074, B:19:0x007f, B:20:0x008f, B:23:0x00a8, B:30:0x0045, B:33:0x0053, B:35:0x00ae, B:37:0x00b4, B:39:0x00b8, B:41:0x00cd, B:42:0x00ea, B:43:0x00ee, B:45:0x00f4, B:47:0x0100, B:50:0x0131, B:52:0x0152, B:53:0x0161, B:54:0x016c, B:56:0x0172, B:58:0x017d, B:60:0x0183, B:62:0x0187, B:63:0x0189, B:66:0x019a, B:68:0x01a8, B:71:0x01b5, B:72:0x01c5, B:73:0x01d8, B:75:0x01de, B:78:0x01e9, B:80:0x01ed, B:81:0x01ef, B:86:0x01f7, B:87:0x0201, B:89:0x0207, B:91:0x020d, B:93:0x0211, B:94:0x0213, B:97:0x0220, B:99:0x022a, B:102:0x0233, B:103:0x0240, B:104:0x024b, B:106:0x0251, B:109:0x025c, B:111:0x0260, B:112:0x0262, B:117:0x026a, B:118:0x0270, B:121:0x0276, B:124:0x027c, B:126:0x0280, B:127:0x0282, B:128:0x028d, B:130:0x0293, B:133:0x029f, B:138:0x02a3, B:144:0x02b1, B:145:0x02bd, B:147:0x02c3, B:150:0x02d2, B:153:0x02d8, B:159:0x02e0, B:161:0x02e4, B:165:0x02f0, B:168:0x02fa, B:170:0x030a, B:171:0x0314, B:173:0x030f, B:174:0x012b), top: B:3:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    @Override // defpackage.agdt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int a(java.lang.String r17, defpackage.agsn r18) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agdv.a(java.lang.String, agsn):int");
    }
}
