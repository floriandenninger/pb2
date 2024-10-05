package defpackage;

import android.util.Log;
import com.google.cardboard.sdk.R;
import java.nio.ByteBuffer;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pqj extends pqn {
    private final pth a = new pth();
    private final ptg d = new ptg();
    private int e = -1;
    private final int f;
    private final pqh[] g;
    private pqh h;
    private List i;
    private List j;
    private pqi k;
    private int l;

    public pqj(int i, List list) {
        this.f = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = psg.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.g = new pqh[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.g[i2] = new pqh();
        }
        this.h = this.g[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List l() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqj.l():java.util.List");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void m() {
        pqi pqiVar = this.k;
        if (pqiVar != null) {
            this.d.i(pqiVar.b, pqiVar.c);
            int i = 3;
            int d = this.d.d(3);
            int d2 = this.d.d(5);
            int i2 = 6;
            int i3 = 7;
            if (d == 7) {
                this.d.l(2);
                d = this.d.d(6);
                if (d < 7) {
                    StringBuilder sb = new StringBuilder(44);
                    sb.append("Invalid extended service number: ");
                    sb.append(d);
                    Log.w("Cea708Decoder", sb.toString());
                }
            }
            if (d2 == 0) {
                if (d != 0) {
                    StringBuilder sb2 = new StringBuilder(59);
                    sb2.append("serviceNumber is non-zero (");
                    sb2.append(d);
                    sb2.append(") when blockSize is 0");
                    Log.w("Cea708Decoder", sb2.toString());
                }
            } else if (d == this.f) {
                boolean z = false;
                while (this.d.a() > 0) {
                    int d3 = this.d.d(8);
                    if (d3 != 16) {
                        if (d3 > 31) {
                            if (d3 > 127) {
                                if (d3 <= 159) {
                                    switch (d3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            int i4 = d3 - 128;
                                            if (this.l != i4) {
                                                this.l = i4;
                                                this.h = this.g[i4];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            for (int i5 = 1; i5 <= 8; i5++) {
                                                if (this.d.n()) {
                                                    this.g[8 - i5].d();
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (this.d.n()) {
                                                    this.g[8 - i6].o = true;
                                                }
                                            }
                                            break;
                                        case 138:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (this.d.n()) {
                                                    this.g[8 - i7].o = false;
                                                }
                                            }
                                            break;
                                        case 139:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (this.d.n()) {
                                                    this.g[8 - i8].o = !r1.o;
                                                }
                                            }
                                            break;
                                        case 140:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (this.d.n()) {
                                                    this.g[8 - i9].e();
                                                }
                                            }
                                            break;
                                        case 141:
                                            this.d.l(8);
                                            break;
                                        case 142:
                                            i2 = 6;
                                            break;
                                        case 143:
                                            n();
                                            break;
                                        case 144:
                                            if (this.h.n) {
                                                this.d.d(4);
                                                this.d.d(2);
                                                this.d.d(2);
                                                boolean n = this.d.n();
                                                boolean n2 = this.d.n();
                                                this.d.d(3);
                                                this.d.d(3);
                                                this.h.g(n, n2);
                                                break;
                                            } else {
                                                this.d.l(16);
                                                break;
                                            }
                                        case 145:
                                            if (this.h.n) {
                                                int a = pqh.a(this.d.d(2), this.d.d(2), this.d.d(2), this.d.d(2));
                                                int a2 = pqh.a(this.d.d(2), this.d.d(2), this.d.d(2), this.d.d(2));
                                                this.d.l(2);
                                                pqh.j(this.d.d(2), this.d.d(2), this.d.d(2));
                                                this.h.h(a, a2);
                                                break;
                                            } else {
                                                this.d.l(24);
                                                break;
                                            }
                                        case 146:
                                            if (this.h.n) {
                                                this.d.l(4);
                                                int d4 = this.d.d(4);
                                                this.d.l(2);
                                                this.d.d(6);
                                                pqh pqhVar = this.h;
                                                if (pqhVar.A != d4) {
                                                    pqhVar.c('\n');
                                                }
                                                pqhVar.A = d4;
                                                break;
                                            } else {
                                                this.d.l(16);
                                                break;
                                            }
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            StringBuilder sb3 = new StringBuilder(31);
                                            sb3.append("Invalid C1 command: ");
                                            sb3.append(d3);
                                            Log.w("Cea708Decoder", sb3.toString());
                                            break;
                                        case 151:
                                            if (this.h.n) {
                                                int a3 = pqh.a(this.d.d(2), this.d.d(2), this.d.d(2), this.d.d(2));
                                                this.d.d(2);
                                                pqh.j(this.d.d(2), this.d.d(2), this.d.d(2));
                                                this.d.n();
                                                this.d.n();
                                                this.d.d(2);
                                                this.d.d(2);
                                                int d5 = this.d.d(2);
                                                this.d.l(8);
                                                this.h.i(a3, d5);
                                                break;
                                            } else {
                                                this.d.l(32);
                                                break;
                                            }
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i10 = d3 - 152;
                                            pqh pqhVar2 = this.g[i10];
                                            this.d.l(2);
                                            boolean n3 = this.d.n();
                                            boolean n4 = this.d.n();
                                            this.d.n();
                                            int d6 = this.d.d(i);
                                            boolean n5 = this.d.n();
                                            int d7 = this.d.d(i3);
                                            int d8 = this.d.d(8);
                                            int d9 = this.d.d(4);
                                            int d10 = this.d.d(4);
                                            this.d.l(2);
                                            this.d.d(i2);
                                            this.d.l(2);
                                            int d11 = this.d.d(i);
                                            int d12 = this.d.d(i);
                                            pqhVar2.n = true;
                                            pqhVar2.o = n3;
                                            pqhVar2.v = n4;
                                            pqhVar2.p = d6;
                                            pqhVar2.q = n5;
                                            pqhVar2.r = d7;
                                            pqhVar2.s = d8;
                                            pqhVar2.t = d9;
                                            int i11 = d10 + 1;
                                            if (pqhVar2.u != i11) {
                                                pqhVar2.u = i11;
                                                while (true) {
                                                    if ((n4 && pqhVar2.l.size() >= pqhVar2.u) || pqhVar2.l.size() >= 15) {
                                                        pqhVar2.l.remove(0);
                                                    }
                                                }
                                            }
                                            if (d11 != 0 && pqhVar2.x != d11) {
                                                pqhVar2.x = d11;
                                                int i12 = d11 - 1;
                                                int i13 = pqh.h[i12];
                                                boolean z2 = pqh.g[i12];
                                                int i14 = pqh.e[i12];
                                                int i15 = pqh.f[i12];
                                                pqhVar2.i(i13, pqh.d[i12]);
                                            }
                                            if (d12 != 0 && pqhVar2.y != d12) {
                                                pqhVar2.y = d12;
                                                int i16 = d12 - 1;
                                                int i17 = pqh.j[i16];
                                                int i18 = pqh.i[i16];
                                                pqhVar2.g(false, false);
                                                pqhVar2.h(pqh.a, pqh.k[i16]);
                                            }
                                            if (this.l != i10) {
                                                this.l = i10;
                                                this.h = this.g[i10];
                                                break;
                                            }
                                            break;
                                    }
                                } else if (d3 <= 255) {
                                    this.h.c((char) (d3 & PrivateKeyType.INVALID));
                                } else {
                                    StringBuilder sb4 = new StringBuilder(33);
                                    sb4.append("Invalid base command: ");
                                    sb4.append(d3);
                                    Log.w("Cea708Decoder", sb4.toString());
                                }
                                i = 3;
                                i2 = 6;
                                i3 = 7;
                            } else if (d3 == 127) {
                                this.h.c((char) 9835);
                            } else {
                                this.h.c((char) (d3 & PrivateKeyType.INVALID));
                            }
                            z = true;
                        } else if (d3 != 0) {
                            if (d3 == i) {
                                this.i = l();
                            } else if (d3 != 8) {
                                switch (d3) {
                                    case 12:
                                        n();
                                        break;
                                    case 13:
                                        this.h.c('\n');
                                        break;
                                    case 14:
                                        break;
                                    default:
                                        if (d3 < 17 || d3 > 23) {
                                            if (d3 < 24) {
                                                StringBuilder sb5 = new StringBuilder(31);
                                                sb5.append("Invalid C0 command: ");
                                                sb5.append(d3);
                                                Log.w("Cea708Decoder", sb5.toString());
                                                break;
                                            } else {
                                                StringBuilder sb6 = new StringBuilder(54);
                                                sb6.append("Currently unsupported COMMAND_P16 Command: ");
                                                sb6.append(d3);
                                                Log.w("Cea708Decoder", sb6.toString());
                                                this.d.l(16);
                                                break;
                                            }
                                        } else {
                                            StringBuilder sb7 = new StringBuilder(55);
                                            sb7.append("Currently unsupported COMMAND_EXT1 Command: ");
                                            sb7.append(d3);
                                            Log.w("Cea708Decoder", sb7.toString());
                                            this.d.l(8);
                                            break;
                                        }
                                        break;
                                }
                            } else {
                                pqh pqhVar3 = this.h;
                                int length = pqhVar3.m.length();
                                if (length > 0) {
                                    pqhVar3.m.delete(length - 1, length);
                                }
                            }
                        }
                        i = 3;
                        i2 = 6;
                        i3 = 7;
                    } else {
                        int d13 = this.d.d(8);
                        if (d13 <= 31) {
                            if (d13 > 7) {
                                if (d13 <= 15) {
                                    this.d.l(8);
                                } else if (d13 <= 23) {
                                    this.d.l(16);
                                } else {
                                    this.d.l(24);
                                }
                            }
                            i = 3;
                            i2 = 6;
                            i3 = 7;
                        } else {
                            if (d13 <= 127) {
                                if (d13 != 32) {
                                    if (d13 != 33) {
                                        if (d13 != 37) {
                                            if (d13 != 42) {
                                                if (d13 != 44) {
                                                    if (d13 != 63) {
                                                        if (d13 != 57) {
                                                            if (d13 != 58) {
                                                                if (d13 != 60) {
                                                                    if (d13 == 61) {
                                                                        this.h.c((char) 8480);
                                                                    } else {
                                                                        switch (d13) {
                                                                            case 48:
                                                                                this.h.c((char) 9608);
                                                                                break;
                                                                            case 49:
                                                                                this.h.c((char) 8216);
                                                                                break;
                                                                            case 50:
                                                                                this.h.c((char) 8217);
                                                                                break;
                                                                            case 51:
                                                                                this.h.c((char) 8220);
                                                                                break;
                                                                            case 52:
                                                                                this.h.c((char) 8221);
                                                                                break;
                                                                            case 53:
                                                                                this.h.c((char) 8226);
                                                                                break;
                                                                            default:
                                                                                switch (d13) {
                                                                                    case 118:
                                                                                        this.h.c((char) 8539);
                                                                                        break;
                                                                                    case 119:
                                                                                        this.h.c((char) 8540);
                                                                                        break;
                                                                                    case 120:
                                                                                        this.h.c((char) 8541);
                                                                                        break;
                                                                                    case 121:
                                                                                        this.h.c((char) 8542);
                                                                                        break;
                                                                                    case 122:
                                                                                        this.h.c((char) 9474);
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                                                                        this.h.c((char) 9488);
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                                                        this.h.c((char) 9492);
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                                                                        this.h.c((char) 9472);
                                                                                        break;
                                                                                    case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                                                                        this.h.c((char) 9496);
                                                                                        break;
                                                                                    case 127:
                                                                                        this.h.c((char) 9484);
                                                                                        break;
                                                                                    default:
                                                                                        StringBuilder sb8 = new StringBuilder(33);
                                                                                        sb8.append("Invalid G2 character: ");
                                                                                        sb8.append(d13);
                                                                                        Log.w("Cea708Decoder", sb8.toString());
                                                                                        break;
                                                                                }
                                                                        }
                                                                    }
                                                                } else {
                                                                    this.h.c((char) 339);
                                                                }
                                                            } else {
                                                                this.h.c((char) 353);
                                                            }
                                                        } else {
                                                            this.h.c((char) 8482);
                                                        }
                                                    } else {
                                                        this.h.c((char) 376);
                                                    }
                                                } else {
                                                    this.h.c((char) 338);
                                                }
                                            } else {
                                                this.h.c((char) 352);
                                            }
                                        } else {
                                            this.h.c((char) 8230);
                                        }
                                    } else {
                                        this.h.c((char) 160);
                                    }
                                } else {
                                    this.h.c(' ');
                                }
                            } else {
                                if (d13 <= 159) {
                                    if (d13 <= 135) {
                                        this.d.l(32);
                                    } else if (d13 <= 143) {
                                        this.d.l(40);
                                    } else {
                                        this.d.l(2);
                                        this.d.l(this.d.d(6) * 8);
                                    }
                                } else if (d13 > 255) {
                                    StringBuilder sb9 = new StringBuilder(37);
                                    sb9.append("Invalid extended command: ");
                                    sb9.append(d13);
                                    Log.w("Cea708Decoder", sb9.toString());
                                } else if (d13 == 160) {
                                    this.h.c((char) 13252);
                                } else {
                                    StringBuilder sb10 = new StringBuilder(33);
                                    sb10.append("Invalid G3 character: ");
                                    sb10.append(d13);
                                    Log.w("Cea708Decoder", sb10.toString());
                                    this.h.c('_');
                                }
                                i = 3;
                                i2 = 6;
                                i3 = 7;
                            }
                            i = 3;
                            i2 = 6;
                            i3 = 7;
                            z = true;
                        }
                    }
                }
                if (z) {
                    this.i = l();
                }
            }
            this.k = null;
        }
    }

    private final void n() {
        for (int i = 0; i < 8; i++) {
            this.g[i].e();
        }
    }

    @Override // defpackage.ast
    public final String c() {
        throw null;
    }

    @Override // defpackage.pqn, defpackage.ast
    public final void d() {
        super.d();
        this.i = null;
        this.j = null;
        this.l = 0;
        this.h = this.g[0];
        n();
        this.k = null;
    }

    @Override // defpackage.pqn, defpackage.ast
    public final /* bridge */ /* synthetic */ void f() {
    }

    @Override // defpackage.pqn
    protected final ppw h() {
        List list = this.i;
        this.j = list;
        pse.c(list);
        return new pqw(list, 1);
    }

    @Override // defpackage.pqn
    protected final void j(ppz ppzVar) {
        pqi pqiVar;
        ByteBuffer byteBuffer = ppzVar.b;
        pse.c(byteBuffer);
        this.a.E(byteBuffer.array(), byteBuffer.limit());
        while (this.a.a() >= 3) {
            int i = this.a.i() & 7;
            int i2 = i & 3;
            int i3 = i & 4;
            byte i4 = (byte) this.a.i();
            byte i5 = (byte) this.a.i();
            if (i2 != 2) {
                if (i2 == 3) {
                    i2 = 3;
                }
            }
            if (i3 == 4) {
                if (i2 == 3) {
                    m();
                    int i6 = (i4 & 192) >> 6;
                    int i7 = this.e;
                    if (i7 != -1 && i6 != (3 & (i7 + 1))) {
                        n();
                        int i8 = this.e;
                        StringBuilder sb = new StringBuilder(71);
                        sb.append("Sequence number discontinuity. previous=");
                        sb.append(i8);
                        sb.append(" current=");
                        sb.append(i6);
                        Log.w("Cea708Decoder", sb.toString());
                    }
                    this.e = i6;
                    int i9 = i4 & 63;
                    if (i9 == 0) {
                        i9 = 64;
                    }
                    pqiVar = new pqi(i9);
                    this.k = pqiVar;
                    byte[] bArr = pqiVar.b;
                    int i10 = pqiVar.c;
                    pqiVar.c = i10 + 1;
                    bArr[i10] = i5;
                } else {
                    pse.e(true);
                    pqiVar = this.k;
                    if (pqiVar == null) {
                        Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = pqiVar.b;
                        int i11 = pqiVar.c;
                        int i12 = i11 + 1;
                        pqiVar.c = i12;
                        bArr2[i11] = i4;
                        pqiVar.c = i12 + 1;
                        bArr2[i12] = i5;
                    }
                }
                int i13 = pqiVar.c;
                int i14 = pqiVar.a;
                if (i13 == (i14 + i14) - 1) {
                    m();
                }
            }
        }
    }

    @Override // defpackage.pqn
    protected final boolean k() {
        return this.i != this.j;
    }
}
