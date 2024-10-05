package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pqz extends ppu {
    private static final Pattern a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean b;
    private final pra c;
    private Map d;
    private float e;
    private float f;

    public pqz() {
        this(null);
    }

    private static float r(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int s(long j, List list, List list2) {
        int i;
        ArrayList arrayList;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((Collection) list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    private static long t(String str) {
        Matcher matcher = a.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = pts.a;
        return (Long.parseLong(group) * 3600000000L) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024f A[Catch: RuntimeException -> 0x02dc, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x02dc, blocks: (B:51:0x01a9, B:53:0x01b7, B:54:0x01c6, B:56:0x01ca, B:58:0x01d0, B:60:0x01da, B:64:0x01f3, B:66:0x0200, B:67:0x024b, B:69:0x024f, B:71:0x0255, B:73:0x0282, B:75:0x0286, B:78:0x0297, B:80:0x029b, B:83:0x02ac, B:85:0x02b0, B:88:0x02c1, B:90:0x02c5, B:93:0x02d6, B:101:0x025e, B:104:0x01e3, B:107:0x0228), top: B:50:0x01a9, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0286 A[Catch: RuntimeException -> 0x02dc, TryCatch #1 {RuntimeException -> 0x02dc, blocks: (B:51:0x01a9, B:53:0x01b7, B:54:0x01c6, B:56:0x01ca, B:58:0x01d0, B:60:0x01da, B:64:0x01f3, B:66:0x0200, B:67:0x024b, B:69:0x024f, B:71:0x0255, B:73:0x0282, B:75:0x0286, B:78:0x0297, B:80:0x029b, B:83:0x02ac, B:85:0x02b0, B:88:0x02c1, B:90:0x02c5, B:93:0x02d6, B:101:0x025e, B:104:0x01e3, B:107:0x0228), top: B:50:0x01a9, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029b A[Catch: RuntimeException -> 0x02dc, TryCatch #1 {RuntimeException -> 0x02dc, blocks: (B:51:0x01a9, B:53:0x01b7, B:54:0x01c6, B:56:0x01ca, B:58:0x01d0, B:60:0x01da, B:64:0x01f3, B:66:0x0200, B:67:0x024b, B:69:0x024f, B:71:0x0255, B:73:0x0282, B:75:0x0286, B:78:0x0297, B:80:0x029b, B:83:0x02ac, B:85:0x02b0, B:88:0x02c1, B:90:0x02c5, B:93:0x02d6, B:101:0x025e, B:104:0x01e3, B:107:0x0228), top: B:50:0x01a9, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b0 A[Catch: RuntimeException -> 0x02dc, TryCatch #1 {RuntimeException -> 0x02dc, blocks: (B:51:0x01a9, B:53:0x01b7, B:54:0x01c6, B:56:0x01ca, B:58:0x01d0, B:60:0x01da, B:64:0x01f3, B:66:0x0200, B:67:0x024b, B:69:0x024f, B:71:0x0255, B:73:0x0282, B:75:0x0286, B:78:0x0297, B:80:0x029b, B:83:0x02ac, B:85:0x02b0, B:88:0x02c1, B:90:0x02c5, B:93:0x02d6, B:101:0x025e, B:104:0x01e3, B:107:0x0228), top: B:50:0x01a9, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c5 A[Catch: RuntimeException -> 0x02dc, TryCatch #1 {RuntimeException -> 0x02dc, blocks: (B:51:0x01a9, B:53:0x01b7, B:54:0x01c6, B:56:0x01ca, B:58:0x01d0, B:60:0x01da, B:64:0x01f3, B:66:0x0200, B:67:0x024b, B:69:0x024f, B:71:0x0255, B:73:0x0282, B:75:0x0286, B:78:0x0297, B:80:0x029b, B:83:0x02ac, B:85:0x02b0, B:88:0x02c1, B:90:0x02c5, B:93:0x02d6, B:101:0x025e, B:104:0x01e3, B:107:0x0228), top: B:50:0x01a9, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(defpackage.pth r26) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqz.u(pth):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:51|52|53|54|(2:55|56)|(5:(1:59)|60|61|62|63)(2:82|(1:84)(8:85|(1:66)|67|68|(1:70)(1:77)|71|(2:73|74)(1:76)|75))|64|(0)|67|68|(0)(0)|71|(0)(0)|75|49) */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x02a7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172 A[Catch: RuntimeException -> 0x0184, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0184, blocks: (B:68:0x0166, B:70:0x0172), top: B:67:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    @Override // defpackage.ppu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.ppw q(byte[] r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqz.q(byte[], int, boolean):ppw");
    }

    public pqz(List list) {
        super("SsaDecoder");
        this.e = -3.4028235E38f;
        this.f = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.b = false;
            this.c = null;
            return;
        }
        this.b = true;
        String E = pts.E((byte[]) list.get(0));
        pse.e(E.startsWith("Format:"));
        pra a2 = pra.a(E);
        pse.c(a2);
        this.c = a2;
        u(new pth((byte[]) list.get(1)));
    }
}
