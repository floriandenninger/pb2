package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ppd extends ppc {
    @Override // defpackage.ppc
    protected final Metadata b(ppz ppzVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        ptg ptgVar = new ptg(byteBuffer.array(), byteBuffer.limit());
        ptgVar.l(12);
        int b = (ptgVar.b() + ptgVar.d(12)) - 4;
        ptgVar.l(44);
        ptgVar.m(ptgVar.d(12));
        ptgVar.l(16);
        ArrayList arrayList = new ArrayList();
        while (ptgVar.b() < b) {
            ptgVar.l(48);
            int d = ptgVar.d(8);
            ptgVar.l(4);
            int b2 = ptgVar.b() + ptgVar.d(12);
            String str = null;
            String str2 = null;
            while (ptgVar.b() < b2) {
                int d2 = ptgVar.d(8);
                int d3 = ptgVar.d(8);
                int b3 = ptgVar.b() + d3;
                if (d2 == 2) {
                    int d4 = ptgVar.d(16);
                    ptgVar.l(8);
                    if (d4 != 3) {
                    }
                    while (ptgVar.b() < b3) {
                        str = ptgVar.e(ptgVar.d(8), amme.a);
                        int d5 = ptgVar.d(8);
                        for (int i = 0; i < d5; i++) {
                            ptgVar.m(ptgVar.d(8));
                        }
                    }
                } else if (d2 == 21) {
                    str2 = ptgVar.e(d3, amme.a);
                }
                ptgVar.j(b3 * 8);
            }
            ptgVar.j(b2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(d, str2.length() != 0 ? str.concat(str2) : new String(str)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
