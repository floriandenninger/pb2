package defpackage;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axkz {
    public final axnb a = axnb.a;
    public Date b = new Date();
    public Date c = new Date();
    public final List d = new LinkedList();

    public static long a(long j, long j2) {
        return j2 == 0 ? j : a(j2, j % j2);
    }

    public final void b(axlc axlcVar) {
        axlc axlcVar2;
        long j = axlcVar.j().i;
        Iterator it = this.d.iterator();
        while (true) {
            if (it.hasNext()) {
                axlcVar2 = (axlc) it.next();
                if (axlcVar2.j().i == j) {
                    break;
                }
            } else {
                axlcVar2 = null;
                break;
            }
        }
        if (axlcVar2 != null) {
            axld j2 = axlcVar.j();
            long j3 = 0;
            for (axlc axlcVar3 : this.d) {
                if (j3 < axlcVar3.j().i) {
                    j3 = axlcVar3.j().i;
                }
            }
            j2.i = j3 + 1;
        }
        this.d.add(axlcVar);
    }

    public final String toString() {
        String str = "Movie{ ";
        for (axlc axlcVar : this.d) {
            String valueOf = String.valueOf(str);
            long j = axlcVar.j().i;
            String k = axlcVar.k();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(k).length());
            sb.append(valueOf);
            sb.append("track_");
            sb.append(j);
            sb.append(" (");
            sb.append(k);
            sb.append(") ");
            str = sb.toString();
        }
        String valueOf2 = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1);
        sb2.append(valueOf2);
        sb2.append("}");
        return sb2.toString();
    }
}
