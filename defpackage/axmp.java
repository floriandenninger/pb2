package defpackage;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmp extends axks {
    public List a;
    private int b;

    public axmp() {
        super("sgpd");
        this.a = new LinkedList();
        this.q = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axmp axmpVar = (axmp) obj;
        if (this.b != axmpVar.b) {
            return false;
        }
        List list = this.a;
        return list == null ? axmpVar.a == null : list.equals(axmpVar.a);
    }

    @Override // defpackage.axkq
    protected final long h() {
        long j = (s() == 1 ? 12L : 8L) + 4;
        for (axml axmlVar : this.a) {
            if (s() == 1 && this.b == 0) {
                j += 4;
            }
            j += axmlVar.d();
        }
        return j;
    }

    public final int hashCode() {
        int i = this.b * 31;
        List list = this.a;
        return i + (list != null ? list.hashCode() : 0);
    }

    @Override // defpackage.axkq
    protected final void i(ByteBuffer byteBuffer) {
        axml axniVar;
        u(byteBuffer);
        if (s() != 1) {
            throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
        }
        String am = did.am(byteBuffer);
        if (s() == 1) {
            this.b = awxt.g(did.ak(byteBuffer));
        }
        long ak = did.ak(byteBuffer);
        while (true) {
            long j = (-1) + ak;
            if (ak <= 0) {
                return;
            }
            int i = this.b;
            if (s() == 1) {
                if (this.b == 0) {
                    i = awxt.g(did.ak(byteBuffer));
                }
                int position = byteBuffer.position() + i;
                ByteBuffer slice = byteBuffer.slice();
                slice.limit(i);
                List list = this.a;
                if ("roll".equals(am)) {
                    axniVar = new axmo();
                } else if ("rash".equals(am)) {
                    axniVar = new axmn();
                } else if ("seig".equals(am)) {
                    axniVar = new axmk();
                } else if ("rap ".equals(am)) {
                    axniVar = new axmu();
                } else if ("tele".equals(am)) {
                    axniVar = new axms();
                } else if ("sync".equals(am)) {
                    axniVar = new axnj();
                } else if ("tscl".equals(am)) {
                    axniVar = new axnk();
                } else if ("tsas".equals(am)) {
                    axniVar = new axnl();
                } else {
                    axniVar = "stsa".equals(am) ? new axni() : new axmt(am);
                }
                axniVar.c(slice);
                list.add(axniVar);
                byteBuffer.position(position);
                ak = j;
            } else {
                throw new RuntimeException("This should be implemented");
            }
        }
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        byteBuffer.put(ddz.b(((axml) this.a.get(0)).a()));
        if (s() == 1) {
            did.aa(byteBuffer, this.b);
        }
        did.aa(byteBuffer, this.a.size());
        for (axml axmlVar : this.a) {
            if (s() == 1 && this.b == 0) {
                did.aa(byteBuffer, axmlVar.b().limit());
            }
            byteBuffer.put(axmlVar.b());
        }
    }

    public final String toString() {
        String a = this.a.size() > 0 ? ((axml) this.a.get(0)).a() : "????";
        int i = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(a.length() + 84 + String.valueOf(valueOf).length());
        sb.append("SampleGroupDescriptionBox{groupingType='");
        sb.append(a);
        sb.append("', defaultLength=");
        sb.append(i);
        sb.append(", groupEntries=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
