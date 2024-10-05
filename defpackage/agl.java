package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agl extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public String F;
    public float G;
    public float H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f49J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public String X;
    public int Y;
    public boolean Z;
    public int a;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public int ag;
    public int ah;
    public int ai;
    public int aj;
    public int ak;
    public int al;
    public float am;
    public int an;
    public int ao;
    public float ap;
    public afk aq;
    public boolean ar;
    public int b;
    public float c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public agl() {
        super(-2, -2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.q = 0.0f;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.w = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.x = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.y = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.z = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.A = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.B = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.C = 0;
        this.D = 0.5f;
        this.E = 0.5f;
        this.F = null;
        this.G = -1.0f;
        this.H = -1.0f;
        this.I = 0;
        this.f49J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = false;
        this.W = false;
        this.X = null;
        this.Y = 0;
        this.Z = true;
        this.aa = true;
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = -1;
        this.ah = -1;
        this.ai = -1;
        this.aj = -1;
        this.ak = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.al = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.am = 0.5f;
        this.aq = new afk();
        this.ar = false;
    }

    public final void a() {
        this.ac = false;
        this.Z = true;
        this.aa = true;
        if (this.width == -2 && this.V) {
            this.Z = false;
            if (this.K == 0) {
                this.K = 1;
            }
        }
        if (this.height == -2 && this.W) {
            this.aa = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        if (this.width == 0 || this.width == -1) {
            this.Z = false;
            if (this.width == 0 && this.K == 1) {
                this.width = -2;
                this.V = true;
            }
        }
        if (this.height == 0 || this.height == -1) {
            this.aa = false;
            if (this.height == 0 && this.L == 1) {
                this.height = -2;
                this.W = true;
            }
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.ac = true;
        this.Z = true;
        this.aa = true;
        if (!(this.aq instanceof afn)) {
            this.aq = new afn();
        }
        ((afn) this.aq).c(this.U);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agl.resolveLayoutDirection(int):void");
    }

    public agl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.q = 0.0f;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.w = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.x = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.y = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.z = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.A = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.B = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.C = 0;
        this.D = 0.5f;
        this.E = 0.5f;
        this.F = null;
        this.G = -1.0f;
        this.H = -1.0f;
        this.I = 0;
        this.f49J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = false;
        this.W = false;
        this.X = null;
        this.Y = 0;
        this.Z = true;
        this.aa = true;
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = -1;
        this.ah = -1;
        this.ai = -1;
        this.aj = -1;
        this.ak = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.al = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.am = 0.5f;
        this.aq = new afk();
        this.ar = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, agz.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = agk.a.get(index);
            switch (i2) {
                case 1:
                    this.U = obtainStyledAttributes.getInt(index, this.U);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.o);
                    this.o = resourceId;
                    if (resourceId == -1) {
                        this.o = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.p = obtainStyledAttributes.getDimensionPixelSize(index, this.p);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, this.q) % 360.0f;
                    this.q = f;
                    if (f < 0.0f) {
                        this.q = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                    break;
                case 6:
                    this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                    break;
                case 7:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.d);
                    this.d = resourceId2;
                    if (resourceId2 == -1) {
                        this.d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.e);
                    this.e = resourceId3;
                    if (resourceId3 == -1) {
                        this.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f);
                    this.f = resourceId4;
                    if (resourceId4 == -1) {
                        this.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.g);
                    this.g = resourceId5;
                    if (resourceId5 == -1) {
                        this.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.h);
                    this.h = resourceId6;
                    if (resourceId6 == -1) {
                        this.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.i);
                    this.i = resourceId7;
                    if (resourceId7 == -1) {
                        this.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId8;
                    if (resourceId8 == -1) {
                        this.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.k);
                    this.k = resourceId9;
                    if (resourceId9 == -1) {
                        this.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.l);
                    this.l = resourceId10;
                    if (resourceId10 == -1) {
                        this.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.r);
                    this.r = resourceId11;
                    if (resourceId11 == -1) {
                        this.r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.s);
                    this.s = resourceId12;
                    if (resourceId12 == -1) {
                        this.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.t);
                    this.t = resourceId13;
                    if (resourceId13 == -1) {
                        this.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.u);
                    this.u = resourceId14;
                    if (resourceId14 == -1) {
                        this.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                    break;
                case 22:
                    this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                    break;
                case 23:
                    this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                    break;
                case 24:
                    this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                    break;
                case 25:
                    this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                    break;
                case 26:
                    this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                    break;
                case 27:
                    this.V = obtainStyledAttributes.getBoolean(index, this.V);
                    break;
                case 28:
                    this.W = obtainStyledAttributes.getBoolean(index, this.W);
                    break;
                case 29:
                    this.D = obtainStyledAttributes.getFloat(index, this.D);
                    break;
                case 30:
                    this.E = obtainStyledAttributes.getFloat(index, this.E);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    this.K = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    this.L = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                            this.M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                            this.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    this.Q = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.Q));
                    this.K = 2;
                    break;
                case 36:
                    try {
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                            this.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                            this.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                    this.L = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            agv.f(this, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            this.G = obtainStyledAttributes.getFloat(index, this.G);
                            break;
                        case 46:
                            this.H = obtainStyledAttributes.getFloat(index, this.H);
                            break;
                        case 47:
                            this.I = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.f49J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.S = obtainStyledAttributes.getDimensionPixelOffset(index, this.S);
                            break;
                        case 50:
                            this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                            break;
                        case 51:
                            this.X = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, this.m);
                            this.m = resourceId15;
                            if (resourceId15 == -1) {
                                this.m = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, this.n);
                            this.n = resourceId16;
                            if (resourceId16 == -1) {
                                this.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                            break;
                        case 55:
                            this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    agv.e(this, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    agv.e(this, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public agl(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.q = 0.0f;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.w = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.x = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.y = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.z = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.A = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.B = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.C = 0;
        this.D = 0.5f;
        this.E = 0.5f;
        this.F = null;
        this.G = -1.0f;
        this.H = -1.0f;
        this.I = 0;
        this.f49J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = false;
        this.W = false;
        this.X = null;
        this.Y = 0;
        this.Z = true;
        this.aa = true;
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = -1;
        this.ah = -1;
        this.ai = -1;
        this.aj = -1;
        this.ak = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.al = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.am = 0.5f;
        this.aq = new afk();
        this.ar = false;
    }
}
